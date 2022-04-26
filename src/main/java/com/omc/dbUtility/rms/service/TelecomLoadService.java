package com.omc.dbUtility.rms.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.omc.dbUtility.rms.dto.TelecomLoadResponseDTO;
import com.omc.dbUtility.rms.entity.TelecomLoad;
import com.omc.dbUtility.rms.repository.TelecomLoadRepository;
import com.omc.dbUtility.template.entity.TemplateData;
import com.omc.dbUtility.template.entity.TemplateTelecomloadData;
import com.omc.dbUtility.template.service.TemplateDataService;

@Service
public class TelecomLoadService {
	
	@Autowired
	private TelecomLoadRepository telecomLoadRepository;
	
	@Autowired
	private TemplateDataService templateDataService;
	
	public static final BigDecimal ZERO = new BigDecimal(0); 
	
	public void saveTelecomLoad(TelecomLoadResponseDTO telecomLoadResponseDTO) throws JsonProcessingException
	{
		TelecomLoad telecomLoad = new TelecomLoad();
		
		telecomLoad.setRtId(telecomLoadResponseDTO.getId());
		//telecomLoad.setPlantId(telecomLoadResponseDTO.getPlantId());
		telecomLoad.setOmcId(telecomLoadResponseDTO.getOmcId());
		telecomLoad.setEventTimeStamp(telecomLoadResponseDTO.getEventTimeStamp());
		telecomLoad.setTelecomloadData(new ObjectMapper().writeValueAsString(telecomLoadResponseDTO.getTelecomloadData()));
		telecomLoad.setCreatedOn(telecomLoadResponseDTO.getCreatedOn());
		telecomLoad.setCreatedBy(telecomLoadResponseDTO.getCreatedBy());
		telecomLoad.setAvgLoadDataPf(telecomLoadResponseDTO.getAvgLoadDataPf());
		telecomLoad.setAvgLoadDataFreqHz(telecomLoadResponseDTO.getAvgLoadDataFreqHz());
		telecomLoad.setAvgLoadKw(telecomLoadResponseDTO.getAvgLoadKw());
		telecomLoad.setAvgPlantPowerKwh(telecomLoadResponseDTO.getAvgPlantPowerKwh());
		telecomLoad.setAvgTowerPowerKwh(telecomLoadResponseDTO.getAvgTowerPowerKwh());
		telecomLoad.setAvgPowerTowerKw(telecomLoadResponseDTO.getAvgPowerTowerKw());
		telecomLoad.setTodayPlantPowerKW(telecomLoadResponseDTO.getTodayPlantPowerKW());
		telecomLoad.setTodayTowerPeakPowerKW(telecomLoadResponseDTO.getTodayTowerPeakPowerKW());
		telecomLoadRepository.save(telecomLoad);
		
		
	}

	public void updateTelecomData(Integer omcId, Long plantId)throws JsonProcessingException {
		
		TelecomLoad t=telecomLoadRepository.findTopByOmcIdOrderByEventTimeStampDesc(omcId);
		Date latestEvent = t.getEventTimeStamp();
		// get all template data whose eventTime is still not provisioned
		List<TemplateData> temp = templateDataService.getAllTemplateDataWhereCurrentDateIsGreater(latestEvent);
		for (TemplateData templateData : temp)
		{
			TelecomLoadResponseDTO telecomLoadResponseDTO = templateDataService.extractTelecomLoadDataFromTemplateData(templateData,plantId);
			this.saveTelecomLoad(telecomLoadResponseDTO);
	     }
	}

	//created by vivek
	
	public void saveTelecomLoads(TelecomLoadResponseDTO telecomLoadResponseDTO) throws JsonProcessingException
	{
		TelecomLoad telecomLoad = new TelecomLoad();
		
		telecomLoad.setRtId(telecomLoadResponseDTO.getId());
		telecomLoad.setPlantId(telecomLoadResponseDTO.getPlantId());
		telecomLoad.setOmcId(telecomLoadResponseDTO.getOmcId());
		telecomLoad.setEventTimeStamp(telecomLoadResponseDTO.getEventTimeStamp());
		telecomLoad.setTelecomloadData(new ObjectMapper().writeValueAsString(telecomLoadResponseDTO.getTelecomloadData()));
		telecomLoad.setCreatedOn(telecomLoadResponseDTO.getCreatedOn());
		telecomLoad.setCreatedBy(telecomLoadResponseDTO.getCreatedBy());
		telecomLoad.setAvgLoadDataPf(telecomLoadResponseDTO.getAvgLoadDataPf());
		telecomLoad.setAvgLoadDataFreqHz(telecomLoadResponseDTO.getAvgLoadDataFreqHz());
		telecomLoad.setAvgLoadKw(telecomLoadResponseDTO.getAvgLoadKw());
		telecomLoad.setAvgPlantPowerKwh(telecomLoadResponseDTO.getAvgPlantPowerKwh());
		telecomLoad.setAvgTowerPowerKwh(telecomLoadResponseDTO.getAvgTowerPowerKwh());
		telecomLoad.setAvgPowerTowerKw(telecomLoadResponseDTO.getAvgPowerTowerKw());
		telecomLoad.setTodayPlantPowerKW(telecomLoadResponseDTO.getTodayPlantPowerKW());
		telecomLoad.setTodayTowerPeakPowerKW(telecomLoadResponseDTO.getTodayTowerPeakPowerKW());
		telecomLoadRepository.save(telecomLoad);
		
		
	}
	public void updateTemplateTelecomloadData(Integer omcId, Integer plantId) throws JsonProcessingException {
	
		TelecomLoad t=telecomLoadRepository.findTopByOmcIdOrderByEventTimeStampDesc(omcId);
		
		if(t==null)
		{
			List<TemplateTelecomloadData> temp = templateDataService.getAllTemplateTeleloadDataWhereCurrentDateIsGreater(omcId);
			for (TemplateTelecomloadData templateData : temp)
			{
				TelecomLoadResponseDTO telecomLoadResponseDTO = templateDataService.extractTelecomLoadDataFromTemplateTeleloadData(templateData,plantId);
				this.saveTelecomLoads(telecomLoadResponseDTO);
		     }
		}
		else
		{
			Date latestEvent = t.getEventTimeStamp();
			// get all template data whose eventTime is still not provisioned
			List<TemplateTelecomloadData> temp = templateDataService.getAllTemplateTeleloadDataWhereCurrentDateIsGreater(omcId,latestEvent);
			for (TemplateTelecomloadData templateData : temp)
			{
				TelecomLoadResponseDTO telecomLoadResponseDTO = templateDataService.extractTelecomLoadDataFromTemplateTeleloadData(templateData,plantId);
				this.saveTelecomLoads(telecomLoadResponseDTO);
		     }
		}
	}

	
}
