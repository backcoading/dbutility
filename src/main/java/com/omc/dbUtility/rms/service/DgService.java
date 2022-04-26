package com.omc.dbUtility.rms.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.omc.dbUtility.rms.dto.DgResponseDTO;
import com.omc.dbUtility.rms.dto.DgResponseDTOs;
import com.omc.dbUtility.rms.entity.Dg;
import com.omc.dbUtility.rms.repository.DgRepository;
import com.omc.dbUtility.template.entity.TemplateData;
import com.omc.dbUtility.template.entity.TemplateDgData;
import com.omc.dbUtility.template.service.TemplateDataService;

@Service
public class DgService {
	
	@Autowired
	private DgRepository dgRepository;
	
	@Autowired
	private TemplateDataService templateDataService;
	
	public void saveDg(DgResponseDTO dgRequest)throws JsonProcessingException
	{
		Dg dg = new Dg();
		dg.setCreatedBy(dgRequest.getCreatedBy());
		dg.setCreatedOn(dgRequest.getCreatedOn());
		dg.setPlantId(dgRequest.getPlantId());
		dg.setEventTimeStamp(dgRequest.getEventTimeStamp());
		dg.setOmcId(Integer.valueOf(dgRequest.getOmcId()));
		dg.setDgPhase1BattCurrentAmp(dgRequest.getDgPhase1BattCurrentAmp());
		dg.setDgPhase1BattVoltage(dgRequest.getDgPhase1BattVoltage());
		dg.setDgPhase1BattPowerKw(dgRequest.getDgPhase1BattPowerKw());
		dg.setDgPhase1BattTotalPowerKwh(dgRequest.getDgPhase1BattTotalPowerKwh());
		dg.setDgPhase1LoadCurrentAmp(dgRequest.getDgPhase1BattCurrentAmp());
		dg.setDgPhase1LoadVoltage(dgRequest.getDgPhase1BattVoltage());
		dg.setDgPhase1LoadPowerKw(dgRequest.getDgPhase1BattPowerKw());
		dg.setDgPhase1LoadTotalPowerKwh(dgRequest.getDgPhase1BattTotalPowerKwh());
		dg.setDgPhase2BattCurrentAmp(dgRequest.getDgPhase2BattCurrentAmp());
		dg.setDgPhase2BattVoltage(dgRequest.getDgPhase2BattVoltage());
		dg.setDgPhase2BattPowerKw(dgRequest.getDgPhase2BattPowerKw());
		dg.setDgPhase2BattTotalPowerKwh(dgRequest.getDgPhase2BattTotalPowerKwh());
		dg.setDgPhase2LoadCurrentAmp(dgRequest.getDgPhase2BattCurrentAmp());
		dg.setDgPhase2LoadVoltage(dgRequest.getDgPhase2BattVoltage());
		dg.setDgPhase2LoadPowerKw(dgRequest.getDgPhase2BattPowerKw());
		dg.setDgPhase2LoadTotalPowerKwh(dgRequest.getDgPhase2BattTotalPowerKwh());
		dg.setDgPhase3BattCurrentAmp(dgRequest.getDgPhase3BattCurrentAmp());
		dg.setDgPhase3BattVoltage(dgRequest.getDgPhase3BattVoltage());
		dg.setDgPhase3BattPowerKw(dgRequest.getDgPhase3BattPowerKw());
		dg.setDgPhase3BattTotalPowerKwh(dgRequest.getDgPhase3BattTotalPowerKwh());
		dg.setDgPhase3LoadCurrentAmp(dgRequest.getDgPhase3BattCurrentAmp());
		dg.setDgPhase3LoadVoltage(dgRequest.getDgPhase3BattVoltage());
		dg.setDgPhase3LoadPowerKw(dgRequest.getDgPhase3BattPowerKw());
		dg.setDgPhase3LoadTotalPowerKwh(dgRequest.getDgPhase3BattTotalPowerKwh());
		dg.setOthBattVolatge(dgRequest.getOthBattVolatge());
		dg.setOthCoolentLevel(dgRequest.getOthCoolentLevel());
		dg.setOthDgType(dgRequest.getOthDgType());
//		dg.setOthDgrh(dgRequest.getOthDgrh());
//		dg.setOthFreqHz(dgRequest.getOthFreqHz());
//		dg.setOthFuelLevelLtr(dgRequest.getOthFuelLevelLtr());
		dg.setOthOilPressure(dgRequest.getOthOilPressure());
		dg.setOthPf(dgRequest.getOthPf());
		dg.setOthRms(dgRequest.getOthRms());
		dg.setTotalAllphaseDgPowerKwh(dgRequest.getTotalAllphaseDgPowerKwh());
		dg.setTotalConsolidatedKwh(dgRequest.getTotalConsolidatedKwh());
		dg.setDgCapKva(dgRequest.getDgCapKva());
		dg.setAvgBattChgPowerKw(dgRequest.getAvgBattChgPowerKw());
		dg.setAvgBattDischgPowerKw(dgRequest.getAvgBattDischgPowerKw());
		dg.setAvgBattChgPowerKwh(dgRequest.getAvgBattChgPowerKw());
		dg.setAvgBattDischgPowerKwh(dgRequest.getAvgBattDischgPowerKw());
		dg.setDgAll3phaseBattCurrentAmp(dgRequest.getDgAll3phaseBattCurrentAmp());
		dg.setDgAll3phaseBattVoltage(dgRequest.getDgAll3phaseBattVoltage());
		dg.setDgAll3phaseBattPowerKw(dgRequest.getDgAll3phaseBattPowerKw());
		dg.setDgAll3phaseBattPowerKwh(dgRequest.getDgAll3phaseBattPowerKwh());
		dg.setDgAll3phaseLoadVoltage(dgRequest.getDgAll3phaseLoadVoltage());
		dg.setDgAll3phaseLoadCurrentAmp(dgRequest.getDgAll3phaseLoadCurrentAmp());
		dg.setDgAll3phaseLoadPowerKw(dgRequest.getDgAll3phaseLoadPowerKw());
		dgRepository.save(dg);
		
		
	}
	
	// created by vivelk
	
	public void saveDg(DgResponseDTOs dgRequest)throws JsonProcessingException
	{
		Dg dg = new Dg();
		
		dg.setRdId(dgRequest.getId());
		dg.setCreatedBy(dgRequest.getCreatedBy());
		dg.setCreatedOn(dgRequest.getCreatedOn());
		dg.setPlantId(dgRequest.getPlantId());
		dg.setEventTimeStamp(dgRequest.getEventTimeStamp());
		dg.setOmcId(Integer.valueOf(dgRequest.getOmcId()));
		dg.setDgPhase1BattCurrentAmp(dgRequest.getDgPhase1BattCurrentAmp());
		dg.setDgPhase1BattVoltage(dgRequest.getDgPhase1BattVoltage());
		dg.setDgPhase1BattPowerKw(dgRequest.getDgPhase1BattPowerKw());
		dg.setDgPhase1BattTotalPowerKwh(dgRequest.getDgPhase1BattTotalPowerKwh());
		dg.setDgPhase1LoadCurrentAmp(dgRequest.getDgPhase1BattCurrentAmp());
		dg.setDgPhase1LoadVoltage(dgRequest.getDgPhase1BattVoltage());
		dg.setDgPhase1LoadPowerKw(dgRequest.getDgPhase1BattPowerKw());
		dg.setDgPhase1LoadTotalPowerKwh(dgRequest.getDgPhase1BattTotalPowerKwh());
    	dg.setDgPhase2BattCurrentAmp(dgRequest.getDgPhase2BattCurrentAmp());
		dg.setDgPhase2BattVoltage(dgRequest.getDgPhase2BattVoltage());
		dg.setDgPhase2BattPowerKw(dgRequest.getDgPhase2BattPowerKw());
		dg.setDgPhase2BattTotalPowerKwh(dgRequest.getDgPhase2BattTotalPowerKwh());
		dg.setDgPhase2LoadCurrentAmp(dgRequest.getDgPhase2BattCurrentAmp());
		dg.setDgPhase2LoadVoltage(dgRequest.getDgPhase2BattVoltage());
		dg.setDgPhase2LoadPowerKw(dgRequest.getDgPhase2BattPowerKw());
		dg.setDgPhase2LoadTotalPowerKwh(dgRequest.getDgPhase2BattTotalPowerKwh());
		dg.setDgPhase3BattCurrentAmp(dgRequest.getDgPhase3BattCurrentAmp());
		dg.setDgPhase3BattVoltage(dgRequest.getDgPhase3BattVoltage());
		dg.setDgPhase3BattPowerKw(dgRequest.getDgPhase3BattPowerKw());
		dg.setDgPhase3BattTotalPowerKwh(dgRequest.getDgPhase3BattTotalPowerKwh());
		dg.setDgPhase3LoadCurrentAmp(dgRequest.getDgPhase3BattCurrentAmp());
		dg.setDgPhase3LoadVoltage(dgRequest.getDgPhase3BattVoltage());
		dg.setDgPhase3LoadPowerKw(dgRequest.getDgPhase3BattPowerKw());
		dg.setDgPhase3LoadTotalPowerKwh(dgRequest.getDgPhase3BattTotalPowerKwh());
		dg.setOthBattVolatge(dgRequest.getOthBattVolatge());
		dg.setOthCoolentLevel(dgRequest.getOthCoolentLevel());
		dg.setOthDgType(dgRequest.getOthDgType());
		dg.setOthDgrh(dgRequest.getOthDgrh());
		dg.setOthFreqHz(dgRequest.getOthFreqHz());
		dg.setOthFuelLevelLtr(dgRequest.getOthFuelLevelLtr());
		dg.setOthOilPressure(dgRequest.getOthOilPressure());
		dg.setOthPf(dgRequest.getOthPf());
		dg.setOthRms(null);
		dg.setTotalAllphaseDgPowerKwh(dgRequest.getTotalAllphaseDgPowerKwh());
		dg.setTotalConsolidatedKwh(dgRequest.getTotalConsolidatedKwh());
		dg.setDgCapKva(null);
		dg.setAvgBattChgPowerKw(dgRequest.getAvgBattChgPowerKw());
		dg.setAvgBattDischgPowerKw(dgRequest.getAvgBattDischgPowerKw());
		dg.setAvgBattChgPowerKwh(dgRequest.getAvgBattChgPowerKw());
		dg.setAvgBattDischgPowerKwh(dgRequest.getAvgBattDischgPowerKw());
		dg.setDgAll3phaseBattCurrentAmp(dgRequest.getDgAll3phaseBattCurrentAmp());
		dg.setDgAll3phaseBattVoltage(dgRequest.getDgAll3phaseBattVoltage());
		dg.setDgAll3phaseBattPowerKw(dgRequest.getDgAll3phaseBattPowerKw());
		dg.setDgAll3phaseBattPowerKwh(dgRequest.getDgAll3phaseBattPowerKwh());
		dg.setDgAll3phaseLoadVoltage(dgRequest.getDgAll3phaseLoadVoltage());
		dg.setDgAll3phaseLoadCurrentAmp(dgRequest.getDgAll3phaseLoadCurrentAmp());
		dg.setDgAll3phaseLoadPowerKw(dgRequest.getDgAll3phaseLoadPowerKw());
		dgRepository.save(dg);
	}
	
		public void updateDgData(Integer omcId, Long plantId)throws JsonProcessingException
		{
			Dg d = dgRepository.findTopByOmcIdOrderByEventTimeStampDesc(omcId);
		    Date latestEvent = d.getEventTimeStamp();
		    List<TemplateData> temp = templateDataService.getAllTemplateDataWhereCurrentDateIsGreater(latestEvent);
		    for (TemplateData templateData : temp)
		    {
		       DgResponseDTO dgRequest	=templateDataService.extractDgDataFromTemplateData(templateData,plantId);
		    	this.saveDg(dgRequest);
		    }
		    
		    
		
	 }

		//created by vivek 
		public void updateTemplateDgData(Integer omcId, Integer plantId) throws JsonProcessingException {
			
			Dg d = dgRepository.findTopByOmcIdOrderByEventTimeStampDesc(omcId);
			if(d==null)
			{
				List<TemplateDgData> temp = templateDataService.getAllTemplateDataWhereCurrentDateIsGreater(omcId);
     	    for (TemplateDgData templateDgData : temp)
			    {
			       DgResponseDTOs dgRequest	=templateDataService.extractDgDataFromTemplateDgData(templateDgData,plantId);
			    	this.saveDg(dgRequest);
			    }
			}
			else
			{
				    Date latestEvent = d.getEventTimeStamp();
				    List<TemplateDgData> temp = templateDataService.getAllLatesTemplateDataWhereCurrentDateIsGreater(omcId,latestEvent);
				    for (TemplateDgData templateData : temp)
				    {
				       DgResponseDTOs dgRequest	=templateDataService.extractDgDataFromTemplateDgData(templateData,plantId);
				    	this.saveDg(dgRequest);
				    }
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}


}