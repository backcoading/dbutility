package com.omc.dbUtility.rms.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.omc.dbUtility.rms.dto.SolarResponseDTO;
import com.omc.dbUtility.rms.entity.Solar;
import com.omc.dbUtility.rms.repository.SolarRepository;
import com.omc.dbUtility.template.entity.TemplateData;
import com.omc.dbUtility.template.entity.TemplateSolarData;
import com.omc.dbUtility.template.service.TemplateDataService;

@Service
public class SolarService  
{
	
	@Autowired
	private SolarRepository solarRepository;
	
	@Autowired
	private TemplateDataService templateDataService;
	
	public static final BigDecimal ZERO = new BigDecimal(0); 
	
	

	public void saveSolar(SolarResponseDTO solarRequest) throws JsonProcessingException {
		
		Solar solar = new Solar();
		
		solar.setRsId(solarRequest.getRsId());
		solar.setPlantId(solarRequest.getPlantId());
		solar.setOmcId(solarRequest.getOmcId());
		solar.setEventTimeStamp(solarRequest.getEventTimeStamp());
		solar.setSolarData(new ObjectMapper().writeValueAsString(solarRequest.getSolarData()));
		solar.setTotalSolarGenKw(solarRequest.getTotalSolarGenKw());
		solar.setTotalSolarGenKwh(solarRequest.getTotalSolarGenKwh());
		solar.setTotalSolarGenFactor(solarRequest.getTotalSolarGenFactor());
		solar.setIsActive(Byte.valueOf("1"));
		solar.setCreatedOn(new Date());
		solar.setCreatedBy(solarRequest.getCreatedBy());
		solar.setAccumltedSolarGenKw(solarRequest.getAccumlatedSolarGenKw());
		solar.setAccumltedSolarGenKwh(solarRequest.getAccumlatedSolarGenKwh());
		solar.setAvgMpptPowerKw(solarRequest.getAvgMpptPowerKw());		
		solarRepository.save(solar);
	}

	
	public void updateSolarData(Integer omcId, int plantId) throws JsonProcessingException 
	{
		Solar s = solarRepository.findTopByOmcIdOrderByEventTimeStampDesc(omcId);
	//	Solar s = solarRepository.findLatestByOmcIdOrderByEventTimeStampDesc(omcId).get(0);
	   if(s==null)
	   {
		   // List<TemplateData> temp = templateDataService.getAllTemplateData(); 
		   List<TemplateData> temp = templateDataService.getAllTemplateDataByOmcSiteId(omcId.toString());
		   
		   for (TemplateData templateData : temp) 
			{
			    BigDecimal totalPowerKw = TemplateDataService.calculateTotalPowerKw(templateData);
			//	BigDecimal cummulatedPowerKw = previousTotalKw.add(totalPowerKw);
				BigDecimal totalPowerKwh = TemplateDataService. calculateTotalPowerKwh(templateData);
			//	BigDecimal cummulatedPowerKwh = previousTotalKwh.add(totalPowerKwh);
				SolarResponseDTO solarRequest = templateDataService.extractSolarDataFromTemplateData(templateData,plantId, totalPowerKwh, totalPowerKwh);
			//	previousTotalKw = cummulatedPowerKw;
			//	previousTotalKwh = cummulatedPowerKwh;
				this.saveSolar(solarRequest);
			}
	   }
	   else
	   {
		   Date latestEvent = s.getEventTimeStamp();
			BigDecimal previousTotalKw = s.getAccumltedSolarGenKw();
			BigDecimal previousTotalKwh = s.getAccumltedSolarGenKwh();
			// get all template data whose eventTime is still not provisioned
		//	List<TemplateData> temp = templateDataService.getAllTemplateDataWhereCurrentDateIsGreater(latestEvent);
			List<TemplateData> temp = templateDataService.getAllLatestTemplateDataByOmcId(omcId.toString(),latestEvent);
			for (TemplateData templateData : temp) 
			{
				BigDecimal totalPowerKw = TemplateDataService.calculateTotalPowerKw(templateData);
				BigDecimal cummulatedPowerKw = previousTotalKw.add(totalPowerKw);
				BigDecimal totalPowerKwh = TemplateDataService. calculateTotalPowerKwh(templateData);
				BigDecimal cummulatedPowerKwh = previousTotalKwh.add(totalPowerKwh);
				SolarResponseDTO solarRequest = templateDataService.extractSolarDataFromTemplateData(templateData,plantId, cummulatedPowerKw, cummulatedPowerKwh);
				previousTotalKw = cummulatedPowerKw;
				previousTotalKwh = cummulatedPowerKwh;
				this.saveSolar(solarRequest);
			}
		
	   }
		
     }
// created by vivek

	public void updateSolarTemplateData(Integer omcId, int plantId) throws JsonProcessingException 
	{
		Solar s = solarRepository.findTopByOmcIdOrderByEventTimeStampDesc(omcId);
	//	Solar s = solarRepository.findLatestByOmcIdOrderByEventTimeStampDesc(omcId).get(0);
	   if(s==null)
	   {
		   // List<TemplateData> temp = templateDataService.getAllTemplateData(); 
		   List<TemplateSolarData> temp = templateDataService.getAllSolarTemplateDataByOmcId(omcId);
		   
		   for (TemplateSolarData templateData : temp) 
			{
			   SolarResponseDTO solarRequest = templateDataService.extractSolarDataFromTemplateSolarData(templateData,plantId);
				this.saveSolar(solarRequest);
			}
	   }
	   else
	   {
		   Date latestEvent = s.getEventTimeStamp();
//			BigDecimal previousTotalKw = s.getAccumltedSolarGenKw();
//			BigDecimal previousTotalKwh = s.getAccumltedSolarGenKwh();
			List<TemplateSolarData> temp = templateDataService.getAllLatestTemplateSolarDataByOmcId(omcId,latestEvent);
			for (TemplateSolarData templateData : temp) 
			{
//				BigDecimal totalPowerKw = TemplateDataService.calculateTotalPowerKw(templateData);
//				BigDecimal cummulatedPowerKw = previousTotalKw.add(totalPowerKw);
//				BigDecimal totalPowerKwh = TemplateDataService. calculateTotalPowerKwh(templateData);
//				BigDecimal cummulatedPowerKwh = previousTotalKwh.add(totalPowerKwh);
				SolarResponseDTO solarRequest = templateDataService.extractSolarDataFromTemplateSolarData(templateData,plantId);
//				previousTotalKw = cummulatedPowerKw;
//				previousTotalKwh = cummulatedPowerKwh;
				this.saveSolar(solarRequest);
			}
		
	   }
		
     }

	
	
}
