package com.omc.dbUtility.rms.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.omc.dbUtility.rms.dto.MinigridResponseDTOs;
import com.omc.dbUtility.rms.entity.Minigrid;
import com.omc.dbUtility.rms.repository.MinigridRepository;
import com.omc.dbUtility.template.entity.TemplateData;
import com.omc.dbUtility.template.entity.TemplateMinigridData;
import com.omc.dbUtility.template.service.TemplateDataService;

@Service
public class MinigridService {
	
	@Autowired
	private MinigridRepository minigridRepository;
	
	@Autowired
	private TemplateDataService templateDataService;
	
	public static final BigDecimal ZERO = new BigDecimal(0); 
	
	
	public void saveMinigrid(com.omc.dbUtility.rms.dto.MinigridResponseDTO minigridRequest) throws JsonProcessingException
	{
		Minigrid minigrid=new Minigrid();
		
		minigrid.setRmId(minigridRequest.getRmId());
		minigrid.setPlantId(minigridRequest.getPlantId());
		minigrid.setOmcId(minigridRequest.getOmcId());
		minigrid.setEventTimeStamp(minigridRequest.getEventTimeStamp());
		minigrid.setMinigridLinesData(new ObjectMapper().writeValueAsString(minigridRequest.getMinigridLinesData()));
		minigrid.setTotalMgPlantVoltage(minigridRequest.getTotalMgPlantVoltage());
		minigrid.setTotalMgPlantCurrent(minigridRequest.getTotalMgPlantCurrent());
		minigrid.setTotalMgPlantPowerKw(minigridRequest.getTotalMgPlantPowerKw());
		minigrid.setTotalMgPlantPowerKwh(minigridRequest.getTotalMgPlantPowerKwh());
		minigrid.setTotalMgFreqHz(minigridRequest.getTotalMgFreqHz());
		minigrid.setTotalMgPf(minigridRequest.getTotalMgPf());
		minigrid.setTotalMgAvgPowerKw(minigridRequest.getTotalMgAvgPowerKw());
		minigrid.setTotalMgPeakPowerKw(minigridRequest.getTotalMgPeakPowerKw());
		minigrid.setTotalMgPowerCustomerKw(minigridRequest.getTotalMgPowerCustomerKw());
		minigrid.setTotalMgPowerCustomerKwh(minigridRequest.getTotalMgPowerCustomerKwh());
		minigrid.setTotalLossMgPrecentage(minigridRequest.getTotalLossMgPrecentage());
		minigrid.setTotalOmcSupplyHourDay(minigridRequest.getTotalOmcSupplyHourDay());
		minigrid.setTotalOmcSupplyHourNight(minigridRequest.getTotalOmcSupplyHourNight());
		minigrid.setTotalOmcSupplyHourDayNight(minigridRequest.getTotalOmcSupplyHourDayNight());
		minigrid.setCreated_on(minigridRequest.getCreated_on());
		minigrid.setCreated_by(minigridRequest.getCreated_by());
		minigrid.setAvgPowerPlantKw(minigridRequest.getAvgPowerPlantKw());
		minigrid.setAvgPowerPlantKwh(minigridRequest.getAvgPowerPlantKwh());
		
		minigridRepository.save(minigrid);
	}

	public void updateMinigridData(Integer omcId, Long plantId)throws JsonProcessingException {
		
		Minigrid m= minigridRepository.findTopByOmcIdOrderByEventTimeStampDesc(omcId);
		Date latestEvent = m.getEventTimeStamp();
		
		// get all template data whose eventTime is still not provisioned
		List<TemplateData> temp = templateDataService.getAllTemplateDataWhereCurrentDateIsGreater(latestEvent);
		for (TemplateData templateData : temp) 
		{
			com.omc.dbUtility.rms.dto.MinigridResponseDTO minigridRequest=templateDataService.extractMinigridDataFromTemplateData(templateData,plantId);
            this.saveMinigrid(minigridRequest);
		}
		
		
	}

	// created by vivek
	
	public void saveMinigrid(MinigridResponseDTOs minigridRequest) throws JsonProcessingException
	{
		Minigrid minigrid=new Minigrid();
		
		minigrid.setRmId(minigridRequest.getRmId());
		minigrid.setPlantId(minigridRequest.getPlantId());
		minigrid.setOmcId(minigridRequest.getOmcId());
		minigrid.setEventTimeStamp(minigridRequest.getEventTimeStamp());
		minigrid.setMinigridLinesData(new ObjectMapper().writeValueAsString(minigridRequest.getMinigridLinesData()));
		minigrid.setTotalMgPlantVoltage(minigridRequest.getTotalMgPlantVoltage());
		minigrid.setTotalMgPlantCurrent(minigridRequest.getTotalMgPlantCurrent());
		minigrid.setTotalMgPlantPowerKw(minigridRequest.getTotalMgPlantPowerKw());
		minigrid.setTotalMgPlantPowerKwh(minigridRequest.getTotalMgPlantPowerKwh());
		minigrid.setTotalMgFreqHz(minigridRequest.getTotalMgFreqHz());
		minigrid.setTotalMgPf(minigridRequest.getTotalMgPf());
		minigrid.setTotalMgAvgPowerKw(minigridRequest.getTotalMgAvgPowerKw());
		minigrid.setTotalMgPeakPowerKw(minigridRequest.getTotalMgPeakPowerKw());
		minigrid.setTotalMgPowerCustomerKw(minigridRequest.getTotalMgPowerCustomerKw());
		minigrid.setTotalMgPowerCustomerKwh(minigridRequest.getTotalMgPowerCustomerKwh());
		minigrid.setTotalLossMgPrecentage(minigridRequest.getTotalLossMgPrecentage());
		minigrid.setTotalOmcSupplyHourDay(minigridRequest.getTotalOmcSupplyHourDay());
		minigrid.setTotalOmcSupplyHourNight(minigridRequest.getTotal_omcSupplyHourNight());
		minigrid.setTotalOmcSupplyHourDayNight(minigridRequest.getTotalOmcSupplyHourDayNight());
		minigrid.setCreated_on(minigridRequest.getCreatedOn());
		minigrid.setCreated_by(minigridRequest.getCreated_by());
		minigrid.setAvgPowerPlantKw(minigridRequest.getAvgPowerPlantKw());
		minigrid.setAvgPowerPlantKwh(minigridRequest.getAvgPowerPlantKwh());
		
		minigridRepository.save(minigrid);
	}

		private Long Integer(int plantId) {
		// TODO Auto-generated method stub
		return null;
	}

		public void updateTemplateMinigridData(Integer omcId, Integer plantId) throws JsonProcessingException {
		Minigrid m= minigridRepository.findTopByOmcIdOrderByEventTimeStampDesc(omcId);
		if(m==null)
		{
			List<TemplateMinigridData> temp = templateDataService.getAllTemplateMinigridDataWhereCurrentDateIsGreater(omcId);
			for (TemplateMinigridData templateMinigridData : temp) 
			{
				MinigridResponseDTOs minigridRequest=templateDataService.extractMinigridDataFromTemplateMinigridData(templateMinigridData,plantId);
	            this.saveMinigrid(minigridRequest);
			}	
		}
		else
		{
			 Date latestEvent = m.getEventTimeStamp();
			List<TemplateMinigridData> temp = templateDataService.getAllLatestTemplateMinigridDataByOmcIdWhereCurrentDateIsGreater(latestEvent,omcId);
			for (TemplateMinigridData templateMinigridData : temp) 
			{
				MinigridResponseDTOs minigridRequest=templateDataService.extractMinigridDataFromTemplateMinigridData(templateMinigridData,plantId);
	            this.saveMinigrid(minigridRequest);
			}	
		}
		
	}

}
