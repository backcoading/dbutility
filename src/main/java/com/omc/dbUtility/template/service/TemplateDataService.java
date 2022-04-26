package com.omc.dbUtility.template.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;
import com.omc.dbUtility.rms.dto.DgResponseDTO;
import com.omc.dbUtility.rms.dto.DgResponseDTOs;
import com.omc.dbUtility.rms.dto.MinigridDTO;
import com.omc.dbUtility.rms.dto.MinigridDTO.MinigridLines1Data;
//import com.omc.dbUtility.rms.dto.MinigridDTO.MinigridLines2Data;
import com.omc.dbUtility.rms.dto.MinigridResponseDTO;
import com.omc.dbUtility.rms.dto.MinigridResponseDTOs;
import com.omc.dbUtility.rms.dto.SolarDatadto;
import com.omc.dbUtility.rms.dto.SolarDatadto.SolarData;
import com.omc.dbUtility.rms.dto.SolarDatadto.StringList;
import com.omc.dbUtility.rms.dto.SolarResponseDTO;
import com.omc.dbUtility.rms.dto.TelecomLoadResponseDTO;
import com.omc.dbUtility.rms.dto.TelecomLoaddto;
import com.omc.dbUtility.rms.dto.TelecomLoaddto.TowerLoadData;
import com.omc.dbUtility.rms.repository.PlantRepository;
import com.omc.dbUtility.template.entity.TemplateData;
import com.omc.dbUtility.template.entity.TemplateDgData;
import com.omc.dbUtility.template.entity.TemplateMinigridData;
import com.omc.dbUtility.template.entity.TemplateSolarData;
import com.omc.dbUtility.template.entity.TemplateTelecomloadData;
import com.omc.dbUtility.template.repository.TemplateDataRepository;
import com.omc.dbUtility.template.repository.TemplateDgDataRepository;
import com.omc.dbUtility.template.repository.TemplateMinigridDataRepository;
import com.omc.dbUtility.template.repository.TemplateSolarDataRepository;
import com.omc.dbUtility.template.repository.TemplateTelecomloadDataRepository;

@EnableAutoConfiguration
@Service
public class TemplateDataService {

	@Autowired
	private TemplateDataRepository templateDataRepository;
	
	@Autowired
	private TemplateTelecomloadDataRepository templateTelecomloadDataRepository;
	
	
	@Autowired
	private TemplateDgDataRepository templateDgDataRepository;
	
	@Autowired
	private TemplateSolarDataRepository templateSolarDataRepository;
	
	@Autowired
	private TemplateMinigridDataRepository templateMinigridDataRepository;
	
	@Autowired(required = true)
	private PlantRepository plantRepository;

	public List<TemplateData> getAllTemplateData() {
		return templateDataRepository.findAll();
	}
	// created by prashant
	public List<TemplateData> getAllTemplateDataByOmcSiteId(String omcId) {
		// return templateDataRepository.findAllByOmcSiteIdOrderByEventTimestamp(omcId);
		
		return templateDataRepository.findAllTemplateByOmcSiteId(omcId);
	}
	
	// created by prashant for template solar data
		public List<TemplateSolarData> getAllSolarTemplateDataByOmcId(int omcId) {
			// return templateDataRepository.findAllByOmcSiteIdOrderByEventTimestamp(omcId);
			
			return templateSolarDataRepository.findAllSolarTemplateByOmcId(omcId);
		}
		
//	@Autowired(required = true)
//	private Plant plant;
	
	

	public static final BigDecimal ZERO = new BigDecimal(0); 

	public TemplateData getTemplateDataFromDB(String omcId) {

		TemplateData templateData = templateDataRepository.findByOmcSiteId(omcId).get(0);
		return templateData;
	}

//	public TemplateDataService(Plant plant) {
//		super();
//		this.plant = plant;
//	}

	public List<TemplateData> getAllTemplateDataWhereCurrentDateIsGreater(Date date) {
		List<TemplateData> templateData = templateDataRepository.findAllByEventTimeStampGreaterThan(date);
		return templateData;
	}

	// solardata

	public SolarResponseDTO extractSolarDataFromTemplateData(TemplateData templateData, int plantId, BigDecimal previousTotalKw, BigDecimal previousTotalKwh) 
	{
		
		BigDecimal totalPowerKw = calculateTotalPowerKw(templateData);
		BigDecimal totalPowerKwh = calculateTotalPowerKwh(templateData);

		SolarResponseDTO solarResponseDTO = new SolarResponseDTO();
		SolarDatadto solardatadto = new SolarDatadto();     

		solarResponseDTO.setOmcId(Integer.valueOf(templateData.getOmcSiteId()));
		solarResponseDTO.setEventTimeStamp(templateData.getEventTimeStamp());  //==> Need to check 
		solarResponseDTO.setPlantId(plantId);     
		solarResponseDTO.setTotalSolarGenKw(totalPowerKw);  // 
		solarResponseDTO.setTotalSolarGenFactor(templateData.getSdTotalSolarGenInfactor() != null ? new BigDecimal(templateData.getSdTotalSolarGenInfactor()): ZERO);
		solarResponseDTO.setTotalSolarGenKwh(totalPowerKwh);
		                         
		solarResponseDTO.setAccumlatedSolarGenKw(totalPowerKw.add(previousTotalKw));  // current[accumalated] = current[totalkw]+ previous[accumulated] = 10 + 100 
		solarResponseDTO.setAccumlatedSolarGenKwh(totalPowerKwh.add(previousTotalKwh));

		List<SolarData> listSolar = new ArrayList<SolarDatadto.SolarData>();
		SolarData solarData1 = new SolarDatadto.SolarData();

		solarData1.setMppptName("MPPPT1");
		solarData1.setMppptVoltage(templateData.getSdMppt1Voltage());
		solarData1.setMpptPowerKw(templateData.getSdMppt1PowerInKw());
		solarData1.setMpptSolarGenKwh(templateData.getSdMppt1SolarGenInKwh());

		List<StringList> listStringData_solar1 = new ArrayList<>();
		StringList string1_solar1 = new SolarDatadto.StringList();
		string1_solar1.setStringName("String1");
		string1_solar1.setStringVoltage(templateData.getSdString1Voltage());
		string1_solar1.setStringCurrent(templateData.getSdString1Crrent());
		string1_solar1.setStringPowerKw(templateData.getSdString1PowerInKw());
		string1_solar1.setStringSolarGenKwh(templateData.getSdString1SolarGenInKwh());
		listStringData_solar1.add(string1_solar1);

		solarData1.setStringList(listStringData_solar1);
		// .....

		SolarData solarData2 = new SolarDatadto.SolarData();

		solarData2.setMppptName("MPPPT2");
		solarData2.setMppptVoltage(templateData.getSdMppt1Voltage());
		solarData2.setMpptPowerKw(templateData.getSdMppt1PowerInKw());
		solarData2.setMpptSolarGenKwh(templateData.getSdMppt1SolarGenInKwh());

		List<StringList> listStringData_solar2 = new ArrayList<>();
		StringList string2_solar2 = new SolarDatadto.StringList();
		string2_solar2.setStringName("String2");
		string2_solar2.setStringVoltage(templateData.getSdString2Voltage());
		string2_solar2.setStringCurrent(templateData.getSdString2Crrent());
		string2_solar2.setStringPowerKw(templateData.getSdString2PowerInKw());
		string2_solar2.setStringSolarGenKwh(templateData.getSdString2SolarGenInKwh());
		listStringData_solar2.add(string2_solar2);

		solarData2.setStringList(listStringData_solar2);

		listSolar.add(solarData1);
		listSolar.add(solarData2);
		
		solardatadto.setSolarData(listSolar);
		solarResponseDTO.setSolarData(solardatadto);
		return solarResponseDTO;

	}

	// created by Prashant
	public SolarResponseDTO extractSolarDataFromTemplateSolarData(TemplateSolarData templateData, int plantId) 
	{
		
//		BigDecimal totalPowerKw = calculateTotalPowerKw(templateData);
//		BigDecimal totalPowerKwh = calculateTotalPowerKwh(templateData);

		SolarResponseDTO solarResponseDTO = new SolarResponseDTO();
		SolarDatadto solardatadto = new SolarDatadto();     

		solarResponseDTO.setPlantId(templateData.getPlantId());
		solarResponseDTO.setOmcId(templateData.getOmcId());
		solarResponseDTO.setEventTimeStamp(templateData.getEventTimeStamp());  //==> Need to check 
		solarResponseDTO.setRsId(templateData.getId());  
		solarResponseDTO.setTotalSolarGenKw(templateData.getTotalSolarGenKwCurrentHour());  // 
		solarResponseDTO.setTotalSolarGenFactor(templateData.getSolarGenFactor() != null ? templateData.getSolarGenFactor(): ZERO);
		solarResponseDTO.setTotalSolarGenKwh(templateData.getTotalSolarGenKwhCurrentHour());
		                         
		solarResponseDTO.setAccumlatedSolarGenKw(templateData.getTotalSolarGenKwLifetime());  // current[accumalated] = current[totalkw]+ previous[accumulated] = 10 + 100 
		solarResponseDTO.setAccumlatedSolarGenKwh(templateData.getTotalSolarGenKwhLifetime());

		List<SolarData> listSolar = new ArrayList<SolarDatadto.SolarData>();
		SolarData solarData1 = new SolarDatadto.SolarData();

		solarData1.setSd_no_mppt(templateData.getSd_no_mppt());
		solarData1.setSdMppt1Voltage(templateData.getSdMppt1Voltage());
		solarData1.setSdMppt1Current(templateData.getSdMppt1Current());
		solarData1.setSdMppt1SolarGenInKwh(templateData.getSdMppt1SolarGenInKwh());
		solarData1.setSdMppt1PowerInKw(templateData.getSdMppt1PowerInKw());
		solarData1.setSdMppt2Voltage(templateData.getSdMppt2Voltage());
		solarData1.setSdMppt2Current(templateData.getSdMppt2Current());
		solarData1.setSdMppt2SolarGenInKwh(templateData.getSdMppt2SolarGenInKwh());
		solarData1.setSdMppt2PowerInKw(templateData.getSdMppt2PowerInKw());
		solarData1.setSdMppt3Voltage(templateData.getSdMppt3Voltage());
		solarData1.setSdMppt3Current(templateData.getSdMppt3Current());
		solarData1.setSdMppt3SolarGenInKwh(templateData.getSdMppt3SolarGenInKwh());
		solarData1.setSdMppt3PowerInKw(templateData.getSdMppt3PowerInKw());
		solarData1.setSdMppt4Voltage(templateData.getSdMppt4Voltage());
		solarData1.setSdMppt4Current(templateData.getSdMppt4Current());
		solarData1.setSdMppt4SolarGenInKwh(templateData.getSdMppt4SolarGenInKwh());
		solarData1.setSdMppt4PowerInKw(templateData.getSdMppt4PowerInKw());
		solarData1.setSdMppt5Voltage(templateData.getSdMpt5Voltage());
		solarData1.setSdMppt5Current(templateData.getSdMppt5Current());
		solarData1.setSdMppt5SolarGenInKwh(templateData.getSdMppt5SolarGenInKwh());
		solarData1.setSdMppt5PowerInKw(templateData.getSdMppt5PowerInKw());
		solarData1.setSdMppt6Voltage(templateData.getSdMppt6Voltage());
		solarData1.setSdMppt6Current(templateData.getSdMppt6Current());
		solarData1.setSdMppt6SolarGenInKwh(templateData.getSdMppt6SolarGenInKwh());
		solarData1.setSdMppt6PowerInKw(templateData.getSdMppt6PowerInKw());
		solarData1.setSdMppt7Voltage(templateData.getSdMppt7Voltage());
		solarData1.setSdMppt7Current(templateData.getSdMppt7Current());
		solarData1.setSdMppt7SolarGenInKwh(templateData.getSdMppt7SolarGenInKwh());
		solarData1.setSdMppt7PowerInKw(templateData.getSdMppt7PowerInKw());
		solarData1.setSdMppt8Voltage(templateData.getSdMppt8Voltage());
		solarData1.setSdMppt8Current(templateData.getSdMppt8Current());
		solarData1.setSdMppt8SolarGenInKwh(templateData.getSdMppt8SolarGenInKwh());
		solarData1.setSdMppt8PowerInKw(templateData.getSdMppt8PowerInKw());
		solarData1.setSdMppt9Voltage(templateData.getSdMppt9Voltage());
		solarData1.setSdMppt9Current(templateData.getSdMppt9Current());
		solarData1.setSdMppt9SolarGenInKwh(templateData.getSdMppt9SolarGenInKwh());
		solarData1.setSdMppt9PowerInKw(templateData.getSdMppt9PowerInKw());
		solarData1.setSdMppt10Voltage(templateData.getSdMppt10Voltage());
		solarData1.setSdMppt10Current(templateData.getSdMppt10Current());
		solarData1.setSdMppt10SolarGenInKwh(templateData.getSdMppt10SolarGenInKwh());
		solarData1.setSdMppt10PowerInKw(templateData.getSdMppt10PowerInKw());
		solarData1.setSdMppt11Voltage(templateData.getSdMppt11Voltage());
		solarData1.setSdMppt11Current(templateData.getSdMppt11Current());
		solarData1.setSdMppt11SolarGenInKwh(templateData.getSdMppt11SolarGenInKwh());
		solarData1.setSdMppt11PowerInKw(templateData.getSdMppt11PowerInKw());
		solarData1.setSdMppt12Voltage(templateData.getSdMppt12Voltage());
		solarData1.setSdMppt12Current(templateData.getSdMppt12Current());
		solarData1.setSdMppt12SolarGenInKwh(templateData.getSdMppt12SolarGenInKwh());
		solarData1.setSdMppt12PowerInKw(templateData.getSdMppt12PowerInKw());
		solarData1.setSdMppt13Voltage(templateData.getSdMppt13Voltage());
		solarData1.setSdMppt13Current(templateData.getSdMppt13Current());
		solarData1.setSdMppt13SolarGenInKwh(templateData.getSdMppt13SolarGenInKwh());
		solarData1.setSdMppt13PowerInKw(templateData.getSdMppt13PowerInKw());
		solarData1.setSdMppt14Voltage(templateData.getSdMppt14Voltage());
		solarData1.setSd_mppt14Current(templateData.getSd_mppt14Current());
		solarData1.setSdMppt14SolarGenInKwh(templateData.getSdMppt14SolarGenInKwh());
		solarData1.setSdMppt14PowerInKw(templateData.getSdMppt14PowerInKw());
		solarData1.setSdMppt15Voltage(templateData.getSdMppt15Voltage());
		solarData1.setSdMppt15Current(templateData.getSdMppt15Current());
		solarData1.setSdMppt15SolarGenInKwh(templateData.getSdMppt15SolarGenInKwh());
		solarData1.setSdMppt15PowerInKw(templateData.getSdMppt15PowerInKw());
		solarData1.setSdMppt16Voltage(templateData.getSdMppt16Voltage());
		solarData1.setSdMppt16Current(templateData.getSdMppt16Current());
		solarData1.setSdMppt16SolarGenInKwh(templateData.getSdMppt16SolarGenInKwh());
		solarData1.setSdMppt16PowerInKw(templateData.getSdMppt16PowerInKw());
		solarData1.setSdMppt17Voltage(templateData.getSdMppt17Voltage());
		solarData1.setSdMppt17Current(templateData.getSdMppt17Current());
		solarData1.setSdMppt17SolarGenInKwh(templateData.getSdMppt17SolarGenInKwh());
		solarData1.setSdMppt17PowerInKw(templateData.getSdMppt17PowerInKw());
		solarData1.setSdMppt18Voltage(templateData.getSdMppt18Voltage());
		solarData1.setSdMppt18Current(templateData.getSdMppt18Current());
		solarData1.setSdMppt18SolarGenInKwh(templateData.getSdMppt18SolarGenInKwh());
		solarData1.setSdMppt18PowerInKw(templateData.getSdMppt18PowerInKw());
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//		solarData1.setMppptName("MPPPT1");
//		solarData1.setMppptVoltage(templateData.getSdMppt1Voltage().toString());
//		solarData1.setMpptPowerKw(templateData.getSdMppt1PowerInKw().toString());
//		solarData1.setMpptSolarGenKwh(templateData.getSdMppt1SolarGenInKwh().toString());

		List<StringList> listStringData_solar1 = new ArrayList<>();
		StringList string1_solar1 = new SolarDatadto.StringList();
		
		string1_solar1.setSdMppt1String1Voltage(templateData.getSdMppt1String1Voltage());
		string1_solar1.setSdMppt1String1Current(templateData.getSdMppt1String1Current());
		string1_solar1.setSdMppt1String1PowerInKw(templateData.getSdMppt1String1PowerInKw());
		string1_solar1.setSdMppt1String1SolarGenInKwh(templateData.getSdMppt1String1SolarGenInKwh());
		
		string1_solar1.setSdMppt2String1Voltage(templateData.getSdMppt2String1Voltage());
		string1_solar1.setSdMppt2String1Current(templateData.getSdMppt2String1Current());
		string1_solar1.setSdMppt2String1PowerInKw(templateData.getSdMppt2String1PowerInKw());
		string1_solar1.setSdMppt2String1SolarGenInKwh(templateData.getSdMppt2String1SolarGenInKwh());
		string1_solar1.setSdMppt3String1Voltage(templateData.getSdMppt3String1Voltage());
		string1_solar1.setSdMppt3String1Current(templateData.getSdMppt3String1Current());
		string1_solar1.setSdMppt3String1PowerInKw(templateData.getSdMppt3String1PowerInKw());
		string1_solar1.setSdMppt3String1SolarGenInKwh(templateData.getSdMppt3String1SolarGenInKwh());
		string1_solar1.setSdMppt4String1Voltage(templateData.getSdMppt4String1Voltage());
		string1_solar1.setSdMppt4String1Current(templateData.getSdMppt4String1Current());
		string1_solar1.setSdMppt4String1PowerInKw(templateData.getSdMppt4String1PowerInKw());
		string1_solar1.setSdMppt4String1SolarGenInKwh(templateData.getSdMppt4String1SolarGenInKwh());
		string1_solar1.setSdMppt5String1Voltage(templateData.getSdMppt5String1Voltage());
		string1_solar1.setSdMppt5String1Current(templateData.getSdMppt5String1Current());
		string1_solar1.setSdMppt5String1PowerInKw(templateData.getSdMppt5String1PowerInKw());
		string1_solar1.setSdMppt5String1SolarGenInKwh(templateData.getSdMppt5String1SolarGenInKwh());
		string1_solar1.setSdMppt6String1Voltage(templateData.getSdMppt6String1Voltage());
		string1_solar1.setSdMppt6String1Current(templateData.getSdMppt6String1Current());
		string1_solar1.setSdMppt6String1PowerInKw(templateData.getSdMppt6String1PowerInKw());
		string1_solar1.setSdMppt6String1SolarGenInKwh(templateData.getSdMppt6String1SolarGenInKwh());
		string1_solar1.setSdMppt7String1Voltage(templateData.getSdMppt7String1Voltage());
		string1_solar1.setSdMppt7String1Current(templateData.getSdMppt7String1Current());
		string1_solar1.setSdMppt7String1PowerInKw(templateData.getSdMppt7String1PowerInKw());
		string1_solar1.setSdMppt7String1SolarGenInKwh(templateData.getSdMppt7String1SolarGenInKwh());
		string1_solar1.setSdMppt8String1Voltage(templateData.getSdMppt8String1Voltage());
		string1_solar1.setSdMppt8String1Current(templateData.getSdMppt8String1Current());
		string1_solar1.setSdMppt8String1PowerInKw(templateData.getSdMppt8String1PowerInKw());
		string1_solar1.setSdMppt8String1SolarGenInKwh(templateData.getSdMppt8String1SolarGenInKwh());
		string1_solar1.setSdMppt9String1Voltage(templateData.getSdMppt9String1Voltage());
		string1_solar1.setSdMppt9String1Current(templateData.getSdMppt9String1Current());
		string1_solar1.setSdMppt9String1PowerInKw(templateData.getSdMppt9String1PowerInKw());
		string1_solar1.setSdMppt9String1SolarGenInKwh(templateData.getSdMppt9String1SolarGenInKwh());
		string1_solar1.setSdMppt10String1Voltage(templateData.getSdMppt10String1Voltage());
		string1_solar1.setSdMppt10String1Current(templateData.getSdMppt10String1Current());
		string1_solar1.setSdMppt10String1PowerInKw(templateData.getSdMppt10String1PowerInKw());
		string1_solar1.setSdMppt10String1SolarGenInKwh(templateData.getSdMppt10String1SolarGenInKwh());
		string1_solar1.setSdMppt11String1Voltage(templateData.getSdMppt11String1Voltage());
		string1_solar1.setSdMppt11String1Current(templateData.getSdMppt11String1Current());
		string1_solar1.setSdMppt11String1PowerInKw(templateData.getSdMppt11String1PowerInKw());
		string1_solar1.setSdMppt11String1SolarGenInKwh(templateData.getSdMppt11String1SolarGenInKwh());
		string1_solar1.setSdMppt12String1Voltage(templateData.getSdMppt12String1Voltage());
		string1_solar1.setSdMppt12String1Current(templateData.getSdMppt12String1Current());
		string1_solar1.setSdMppt12String1PowerInKw(templateData.getSdMppt12String1PowerInKw());
		string1_solar1.setSdMppt12String1SolarGenInKwh(templateData.getSdMppt12String1SolarGenInKwh());
		string1_solar1.setSdMppt13String1Voltage(templateData.getSdMppt13String1Voltage());
		string1_solar1.setSdMppt13String1Current(templateData.getSdMppt13String1Current());
		string1_solar1.setSdMppt13String1PowerInKw(templateData.getSdMppt13String1PowerInKw());
		string1_solar1.setSdMppt13String1SolarGenInKwh(templateData.getSdMppt13String1SolarGenInKwh());
		string1_solar1.setSdMppt14String1Voltage(templateData.getSdMppt14String1Voltage());
		string1_solar1.setSdMppt14String1Current(templateData.getSdMppt14String1Current());
		string1_solar1.setSdMppt14String1PowerInKw(templateData.getSdMppt14String1PowerInKw());
		string1_solar1.setSd_mppt14String1SolarGenInKwh(templateData.getSd_mppt14String1SolarGenInKwh());
		string1_solar1.setSdMppt15String1Voltage(templateData.getSdMppt15String1Voltage());
		string1_solar1.setSdMppt15String1Current(templateData.getSdMppt15String1Current());
		string1_solar1.setSdMppt15String1PowerInKw(templateData.getSdMppt15String1PowerInKw());
		string1_solar1.setSdMppt15String1SolarGenInKwh(templateData.getSdMppt15String1SolarGenInKwh());
		string1_solar1.setSdMppt16String1Voltage(templateData.getSdMppt16String1Voltage());
		string1_solar1.setSdMppt16String1Current(templateData.getSdMppt16String1Current());
		string1_solar1.setSdMppt16String1PowerInKw(templateData.getSdMppt16String1PowerInKw());
		string1_solar1.setSdMppt16String1SolarGenInKwh(templateData.getSdMppt16String1SolarGenInKwh());
		string1_solar1.setSdMppt17String1Voltage(templateData.getSdMppt17String1Voltage());
		string1_solar1.setSdMppt17String1Current(templateData.getSdMppt17String1Current());
		string1_solar1.sdMppt17String1PowerInKw(templateData.sdMppt17String1PowerInKw());
		string1_solar1.setSdMppt17String1SolarGenInKwh(templateData.getSdMppt17String1SolarGenInKwh());
		string1_solar1.setSdMppt18String1Voltage(templateData.getSdMppt18String1Voltage());
		string1_solar1.setSdMppt18String1Current(templateData.getSdMppt18String1Current());
		string1_solar1.setSdMppt18String1PowerInKw(templateData.getSdMppt18String1PowerInKw());
		string1_solar1.setSdMppt18String1SolarGenInKwh(templateData.getSdMppt18String1SolarGenInKwh());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////
//		string1_solar1.setStringName("String1");
//		string1_solar1.setStringVoltage(templateData.getSdMppt1String1Voltage().toString());
//		string1_solar1.setStringCurrent(templateData.getSdMppt1String1Current().toString());
//		string1_solar1.setStringPowerKw(templateData.getSdMppt1String1PowerInKw().toString());
//		string1_solar1.setStringSolarGenKwh(templateData.getSdMppt1String1SolarGenInKwh().toString());
//		listStringData_solar1.add(string1_solar1);

		solarData1.setStringList(listStringData_solar1);
		// .....

		SolarData solarData2 = new SolarDatadto.SolarData();

		solarData2.setMppptName("MPPPT2");
//		solarData2.setMppptVoltage(templateData.getSdMppt1Voltage());
//		solarData2.setMpptPowerKw(templateData.getSdMppt1PowerInKw());
//		solarData2.setMpptSolarGenKwh(templateData.getSdMppt1SolarGenInKwh());

		List<StringList> listStringData_solar2 = new ArrayList<>();
		StringList string2_solar2 = new SolarDatadto.StringList();
		string2_solar2.setStringName("String2");
//		string2_solar2.setStringVoltage(templateData.getSdString2Voltage());
//		string2_solar2.setStringCurrent(templateData.getSdString2Crrent());
//		string2_solar2.setStringPowerKw(templateData.getSdString2PowerInKw());
//		string2_solar2.setStringSolarGenKwh(templateData.getSdString2SolarGenInKwh());
		listStringData_solar2.add(string2_solar2);

		solarData2.setStringList(listStringData_solar2);

		listSolar.add(solarData1);
		listSolar.add(solarData2);
		
		solardatadto.setSolarData(listSolar);
		solarResponseDTO.setSolarData(solardatadto);
		return solarResponseDTO;

	}

	public static BigDecimal calculateTotalPowerKwh(TemplateData templateData) {
		BigDecimal mppt1PowerKwh = templateData.getSdMppt1SolarGenInKwh()== null ? ZERO : new BigDecimal(templateData.getSdMppt1SolarGenInKwh());
		BigDecimal mppt2PowerKwh = templateData.getSdMppt2SolarGenInKwh()== null ? ZERO : new BigDecimal(templateData.getSdMppt2SolarGenInKwh());
		
		BigDecimal totalPowerKwh  = mppt1PowerKwh.add(mppt2PowerKwh);
		return totalPowerKwh;
	}

	public static BigDecimal calculateTotalPowerKw(TemplateData templateData) {
		BigDecimal mppt1PowerKw = templateData.getSdMppt1PowerInKw()== null ? ZERO : new BigDecimal(templateData.getSdMppt1PowerInKw());
		BigDecimal mppt2PowerKw = templateData.getSdMppt2PowerInKw()== null ? ZERO : new BigDecimal(templateData.getSdMppt2PowerInKw());
		
		BigDecimal totalPowerKw  = mppt1PowerKw.add(mppt2PowerKw);
		return totalPowerKw;
	}

	

	
	// minigrid
	
	public MinigridResponseDTO extractMinigridDataFromTemplateData(TemplateData templateData,Long plantId)
	{
		MinigridResponseDTO minigridResponseDTO = new MinigridResponseDTO();
		MinigridDTO minigriddto = new MinigridDTO();
		
		minigridResponseDTO.setOmcId(Integer.valueOf(templateData.getOmcSiteId()));
		minigridResponseDTO.setEventTimeStamp(templateData.getEventTimeStamp());
		//minigridResponseDTO.setPlantId(plantId);
		minigridResponseDTO.setTotalMgPlantVoltage(null);
		minigridResponseDTO.setTotalMgPlantCurrent(null);
		minigridResponseDTO.setTotalMgPlantPowerKw(null);
		minigridResponseDTO.setAvgPowerPlantKwh(null);
		minigridResponseDTO.setTotalMgFreqHz(null);
		minigridResponseDTO.setTotalMgPf(null);
		minigridResponseDTO.setTotalMgAvgPowerKw(null);
		minigridResponseDTO.setTotalMgPeakPowerKw(null);
		minigridResponseDTO.setTotalMgPowerCustomerKw(null);
		minigridResponseDTO.setTotalMgPowerCustomerKwh(ZERO);
		minigridResponseDTO.setTotalLossMgPrecentage(ZERO);
		minigridResponseDTO.setTotalOmcSupplyHourDay(ZERO);
		minigridResponseDTO.setTotalOmcSupplyHourNight(ZERO);
		minigridResponseDTO.setTotalOmcSupplyHourDayNight(ZERO);
		minigridResponseDTO.setCreated_on(null);
		minigridResponseDTO.setCreated_by(null);
		minigridResponseDTO.setAvgPowerPlantKw(null);
		minigridResponseDTO.setAvgPowerPlantKwh(ZERO);
		
		List<MinigridLines1Data> listMinigridlist = new ArrayList<MinigridDTO.MinigridLines1Data>();
		MinigridLines1Data minigridLines1Data = new MinigridDTO.MinigridLines1Data();
		
//		minigridLines1Data.setMinigridLoadLine1Id(templateData.getMinigridLoadLine1Id());
//		minigridLines1Data.setMinigridLoadLine1VoltagePlant(templateData.getMinigridLoadLine1VoltagePlant());
//		minigridLines1Data.setMinigridLoadLine1CurrentPlant(templateData.getMinigridLoadLine1CurrentPlant());
//		minigridLines1Data.setMinigridLoadLine1FrezInHzPlant(templateData.getMinigridLoadLine1FrezInHzPlant());
//		//minigridLines1Data.setMinigridLoadLine1PlantPowerKwh(templateData.getMinigridLoadLine1PlantPowerKwh());
//		minigridLines1Data.setMinigridLoadLine1PfPlant(templateData.getMinigridLoadLine1PfPlant());
//		minigridLines1Data.setMinigridLoadLine1VoltageLine1(templateData.getMinigridLoadLine1VoltageLine1());
//		minigridLines1Data.setMinigridLoadLine1CurrentLine1(templateData.getMinigridLoadLine1CurrentLine1());
//		minigridLines1Data.setMinigridLoadLine1AvgPowerInKwLine1(templateData.getMinigridLoadLine1AvgPowerInKwLine1());
//		minigridLines1Data.setMinigridLoadLine1PeakPowerInKwLine1(templateData.getMinigridLoadLine1PeakPowerInKwLine1());
//		minigridLines1Data.setMinigridLoadLine1TrLossInPercentageLine1(templateData.getMinigridLoadLine1TrLossInPercentageLine1());
//		minigridLines1Data.setMinigridLoadLine1OmcSuppliedHourDayLine1(templateData.getMinigridLoadLine1OmcSuppliedHourDayLine1());
//		minigridLines1Data.setMinigridLoadLine1OmcSuppliedHourNightLine1(templateData.getMinigridLoadLine1OmcSuppliedHourNightLine1());
//	//	minigridLines1Data.setMinigridLoadLine1OmcSuppliedHourDayNightLine1(templateData.getMinigridLoadLine1OmcSuppliedHourDayNightLine1());
//		
//		
//		List<MinigridLines2Data> minigridLines2Datalist = new ArrayList<>();
//		MinigridLines2Data minigridLines2Data = new MinigridDTO.MinigridLines2Data();
//		
//		minigridLines2Data.setMinigridLoadLine2Id(templateData.getMinigridLoadLine2Id());
//		minigridLines2Data.setMinigridLoadLine2VoltagePlant(templateData.getMinigridLoadLine2VoltagePlant());
//		minigridLines2Data.setMinigridLoadLine2CurrentPlant(templateData.getMinigridLoadLine2CurrentPlant());
//	//	minigridLines2Data.setMinigridLoadLine2PlantPowerKwh(templateData.getMinigridLoadLine2PlantPowerKwh());
//		minigridLines2Data.setMinigridLoadLine2FrezInHzPlant(templateData.getMinigridLoadLine2FrezInHzPlant());
//		minigridLines2Data.setMinigridLoadLine2PfPlant(templateData.getMinigridLoadLine2PfPlant());
//		minigridLines2Data.setMinigridLoadLine2VoltageLine2(templateData.getMinigridLoadLine2VoltageLine2());
//		minigridLines2Data.setMinigridLoadLine2CurrentLine2(templateData.getMinigridLoadLine2CurrentLine2());
//		minigridLines2Data.setMinigridLoadLine2AvgPowerInKwLine2(templateData.getMinigridLoadLine2AvgPowerInKwLine2());
//		minigridLines2Data.setMinigridLoadLine2PeakPowerInKwLine2(templateData.getMinigridLoadLine2PeakPowerInKwLine2());
//		minigridLines2Data.setMinigridLoadLine2TrLossInPercentageLine2(templateData.getMinigridLoadLine2TrLossInPercentageLine2());
//		minigridLines2Data.setMinigridLoadLine2OmcSuppliedHourDayLine2(templateData.getMinigridLoadLine2OmcSuppliedHourDayLine2());
//		minigridLines2Data.setMinigridLoadLine2OmcSuppliedHourNightLine2(templateData.getMinigridLoadLine2OmcSuppliedHourNightLine2());
//	//	minigridLines2Data.setMinigridLoadLine2OmcSuppliedHourDayNightLine2(templateData.getMinigridLoadLine2OmcSuppliedHourDayNightLine2());
//		
//		minigridLines1Data.setMinigridLines2Data(minigridLines2Datalist);
//		
		listMinigridlist.add(minigridLines1Data);
		
		BigDecimal totalMgPlantVoltage = calculateTotalPlantVoltage(templateData);
		BigDecimal totalMgPlantCurrent = calculateTotalPlantCurrennt(templateData);
		BigDecimal totalMgPlantPowerKw = calculateTotalPlantPowerKw(templateData);
		//BigDecimal totalMgPlantPowerKwh = calculateTotalPlantPowerKwh(templateData);
		BigDecimal totalMgFreqHz = calculateTotalMgFreqHz(templateData);
		BigDecimal totalMgPf = calculateTotalMgPf(templateData);
		BigDecimal totalMgAvgPowerKw = calculateMgAvgPowerKw(templateData);
		BigDecimal totalMgPeakPowerKw = calculateMgPeakPowerKw(templateData);
	    BigDecimal totalMgPowerCustomerKw = calculateTotalPowerCustomerKw(templateData);
		BigDecimal totalMgPowerCustomerKwh = calculateTotalPowerCustomerKwh(templateData);
		BigDecimal totalLossMgPrecentage = calculateTotalLossMgPercentage(templateData);
		BigDecimal totalOmcSupplyHourDay = calculateTotalOmcSupplyHourDay(templateData);
		BigDecimal totalOmcSupplyHourNight = calculateTotalOmcSupplyHourNight(templateData);
		//BigDecimal totalOmcSupplyHourDayNight = calculateTotalOmcSupplyHourDayNight(templateData);
		
		
		
		minigriddto.setMinigridLinesData(listMinigridlist);
		minigridResponseDTO.setMinigridLinesData(minigriddto);    
		return minigridResponseDTO;
		
	}

	public static BigDecimal calculateTotalPlantVoltage(TemplateData templateData)
	{
		
		BigDecimal minigridLoadLine1VoltagePlant=templateData.getMinigridLoadLine1VoltagePlant()== null ? ZERO : new BigDecimal(templateData.getMinigridLoadLine1VoltagePlant());
		BigDecimal minigridLoadLine2VoltagePlant=templateData.getMinigridLoadLine2VoltagePlant()== null ? ZERO : new BigDecimal(templateData.getMinigridLoadLine2VoltagePlant());
		
		BigDecimal totalMgPlantVoltage=minigridLoadLine1VoltagePlant.add(minigridLoadLine2VoltagePlant);
		return totalMgPlantVoltage;
		
	}
	
	public static BigDecimal calculateTotalPlantCurrennt(TemplateData templateData)
	{
		
		BigDecimal minigridLoadLine2CurrentPlant = templateData.getMinigridLoadLine2CurrentPlant()== null ? ZERO : new BigDecimal(templateData.getMinigridLoadLine2CurrentPlant());
		BigDecimal minigridLoadLine1CurrentLine1 = templateData.getMinigridLoadLine1CurrentPlant()== null ? ZERO : new BigDecimal(templateData.getMinigridLoadLine1CurrentPlant());
		
		BigDecimal totalMgPlantCurrent = minigridLoadLine1CurrentLine1.add(minigridLoadLine1CurrentLine1);
		return totalMgPlantCurrent;
		
	}
	
	public static BigDecimal calculateTotalPlantPowerKw(TemplateData templateData)
	{
		BigDecimal minigridLoadLine1AvgPowerInKwLine1 = templateData.getMinigridLoadLine1AvgPowerInKwLine1()== null ? ZERO : new BigDecimal(templateData.getMinigridLoadLine1AvgPowerInKwLine1());
		BigDecimal minigridLoadLine2AvgPowerInKwLine2 = templateData.getMinigridLoadLine2AvgPowerInKwLine2()== null ? ZERO : new  BigDecimal(templateData.getMinigridLoadLine2AvgPowerInKwLine2());
		
		BigDecimal totalMgPlantPowerKw = minigridLoadLine1AvgPowerInKwLine1.add(minigridLoadLine2AvgPowerInKwLine2);
		return totalMgPlantPowerKw;
		
	}
  
//	public static BigDecimal calculateTotalPlantPowerKwh(TemplateData templateData)
//	{
//		BigDecimal minigridLoadLine2PlantPowerKwh = templateData.getMinigridLoadLine2PlantPowerKwh()== null ? ZERO : new BigDecimal(templateData.getMinigridLoadLine2PlantPowerKwh());
//		BigDecimal minigridLoadLine1PlantPowerKwh = templateData.getMinigridLoadLine1PlantPowerKwh()== null ? ZERO : new BigDecimal(templateData.getMinigridLoadLine1PlantPowerKwh());
//		
//		BigDecimal totalMgPlantPowerKwh=minigridLoadLine1PlantPowerKwh.add(minigridLoadLine1PlantPowerKwh);
//		return totalMgPlantPowerKwh;
//		
//	}
	
	public static BigDecimal calculateTotalMgFreqHz(TemplateData templateData)
	{
		BigDecimal minigridLoadLine1FrezInHzPlant = templateData.getMinigridLoadLine1FrezInHzPlant() == null ? ZERO : new BigDecimal(templateData.getMinigridLoadLine1FrezInHzPlant());
		BigDecimal minigridLoadLine2FrezInHzPlant = templateData.getMinigridLoadLine2FrezInHzPlant() == null ? ZERO : new BigDecimal(templateData.getMinigridLoadLine2FrezInHzPlant());
		
		BigDecimal totalMgFreqHz = minigridLoadLine1FrezInHzPlant.add(minigridLoadLine2FrezInHzPlant);
		return totalMgFreqHz;
		
	}
	
	public static BigDecimal calculateTotalMgPf(TemplateData templateData)
	{
		
		BigDecimal minigridLoadLine1PfPlant = templateData.getMinigridLoadLine1PfPlant() == null ? ZERO : new BigDecimal(templateData.getMinigridLoadLine1PfPlant());
		BigDecimal minigridLoadLine2PfPlant = templateData.getMinigridLoadLine2PfPlant() == null ? ZERO : new BigDecimal(templateData.getMinigridLoadLine2PfPlant());
		
		BigDecimal totalMgPf = minigridLoadLine1PfPlant.add(minigridLoadLine2PfPlant);
		return totalMgPf;
		
	}
	
	public static BigDecimal calculateMgAvgPowerKw(TemplateData templateData)
	{
		BigDecimal minigridLoadLine1AvgPowerInKwLine1 = templateData.getMinigridLoadLine1AvgPowerInKwLine1() == null ? ZERO : new BigDecimal(templateData.getMinigridLoadLine1AvgPowerInKwLine1());
		BigDecimal minigridLoadLine2AvgPowerInKwLine2 = templateData.getMinigridLoadLine2AvgPowerInKwLine2() == null ? ZERO : new BigDecimal(templateData.getMinigridLoadLine2AvgPowerInKwLine2());
		
		BigDecimal totalMgAvgPowerKw = minigridLoadLine1AvgPowerInKwLine1.add(minigridLoadLine2AvgPowerInKwLine2);
		
		return totalMgAvgPowerKw;
		
	}
	
	public static BigDecimal calculateMgPeakPowerKw(TemplateData templateData)
	{
		BigDecimal minigridLoadLine1PeakPowerInKwLine1 = templateData.getMinigridLoadLine1PeakPowerInKwLine1() == null ? ZERO : new BigDecimal(templateData.getMinigridLoadLine1PeakPowerInKwLine1());
		BigDecimal minigridLoadLine2PeakPowerInKwLine2 = templateData.getMinigridLoadLine2PeakPowerInKwLine2() == null ? ZERO : new BigDecimal(templateData.getMinigridLoadLine2PeakPowerInKwLine2());
		BigDecimal totalMgPeakPowerKw = minigridLoadLine1PeakPowerInKwLine1.add(minigridLoadLine2PeakPowerInKwLine2);
		
		return totalMgPeakPowerKw;
		
	}
	
	public static BigDecimal calculateTotalPowerCustomerKw(TemplateData templateData)
	{
		//BigDecimal minigridLoadLine1AvgPowerInKwLine1 = templateData.getMinigridLoadLine1AvgPowerInKwLine1() == null ? ZERO : new BigDecimal(templateData.getMinigridLoadLine1AvgPowerInKwLine1());
		//BigDecimal minigridLoadLine2AvgPowerInKwLine2 = templateData.getMinigridLoadLine2AvgPowerInKwLine2() == null ? ZERO : new BigDecimal(templateData.getMinigridLoadLine2AvgPowerInKwLine2());
		
		 return null;
		
	}
	
	public static BigDecimal calculateTotalPowerCustomerKwh(TemplateData templateData)
	{
		
		//BigDecimal minigridLoadLine1AvgPowerInKwLine1 = templateData.getMinigridLoadLine1AvgPowerInKwLine1() == null ? ZERO : new BigDecimal(templateData.getMinigridLoadLine1AvgPowerInKwLine1());
		//BigDecimal minigridLoadLine2AvgPowerInKwLine2 = templateData.getMinigridLoadLine2AvgPowerInKwLine2() == null ? ZERO : new BigDecimal(templateData.getMinigridLoadLine2AvgPowerInKwLine2());
		return null;
		
	}
	
	public static BigDecimal calculateTotalLossMgPercentage(TemplateData templateData)
	{
		
		BigDecimal minigridLoadLine2TrLossInPercentageLine2 = templateData.getMinigridLoadLine2TrLossInPercentageLine2() == null ? ZERO : new BigDecimal(templateData.getMinigridLoadLine2TrLossInPercentageLine2());
		BigDecimal minigridLoadLine1TrLossInPercentageLine1 = templateData.getMinigridLoadLine1TrLossInPercentageLine1() == null ? ZERO : new BigDecimal(templateData.getMinigridLoadLine1TrLossInPercentageLine1());
		
		BigDecimal totalLossMgPrecentage = minigridLoadLine1TrLossInPercentageLine1.add(minigridLoadLine1TrLossInPercentageLine1);
		return totalLossMgPrecentage;
		
	}
	
	public static BigDecimal calculateTotalOmcSupplyHourDay(TemplateData templateData)
	{
		
		BigDecimal minigridLoadLine1OmcSuppliedHourDayLine1 = templateData.getMinigridLoadLine1OmcSuppliedHourDayLine1() == null ? ZERO : new BigDecimal(templateData.getMinigridLoadLine1TrLossInPercentageLine1());
		BigDecimal minigridLoadLine2OmcSuppliedHourDayLine2 = templateData.getMinigridLoadLine2OmcSuppliedHourDayLine2() == null ? ZERO : new BigDecimal(templateData.getMinigridLoadLine2OmcSuppliedHourDayLine2());
		
		BigDecimal totalOmcSupplyHourDay = minigridLoadLine1OmcSuppliedHourDayLine1.add(minigridLoadLine2OmcSuppliedHourDayLine2);
		return totalOmcSupplyHourDay;
		
	}
	
	public static BigDecimal calculateTotalOmcSupplyHourNight(TemplateData templateData)
	{
		BigDecimal minigridLoadLine1OmcSuppliedHourNightLine1 = templateData.getMinigridLoadLine1OmcSuppliedHourNightLine1() == null ? ZERO : new BigDecimal(templateData.getMinigridLoadLine1OmcSuppliedHourNightLine1());
		BigDecimal minigridLoadLine2OmcSuppliedHourNightLine2 = templateData.getMinigridLoadLine2OmcSuppliedHourNightLine2() == null ? ZERO : new BigDecimal(templateData.getMinigridLoadLine2OmcSuppliedHourNightLine2());
		
		BigDecimal totalOmcSupplyHourNight = minigridLoadLine1OmcSuppliedHourNightLine1.add(minigridLoadLine2OmcSuppliedHourNightLine2);
		return totalOmcSupplyHourNight;
		
	}
	
//	public static BigDecimal calculateTotalOmcSupplyHourDayNight(TemplateData templateData)
//	{
//		BigDecimal minigridLoadLine1OmcSuppliedHourDayNightLine1 = templateData.getMinigridLoadLine1OmcSuppliedHourDayNightLine1()== null ? ZERO : new BigDecimal(templateData.getMinigridLoadLine1OmcSuppliedHourDayNightLine1());
//		BigDecimal minigridLoadLine2OmcSuppliedHourDayNightLine2 = templateData.getMinigridLoadLine2OmcSuppliedHourDayNightLine2() == null ? ZERO : new BigDecimal(templateData.getMinigridLoadLine2OmcSuppliedHourDayNightLine2());
//		
//		BigDecimal totalOmcSupplyHourDayNight = minigridLoadLine1OmcSuppliedHourDayNightLine1.add(minigridLoadLine2OmcSuppliedHourDayNightLine2);
//		return totalOmcSupplyHourDayNight;
//		
//	}
	// telecom
	
	public TelecomLoadResponseDTO extractTelecomLoadDataFromTemplateData(TemplateData templateData,Long plantId)
	{
		 BigDecimal avgLoadDataPf = calculateAvgLoadDataPf(templateData);
		 BigDecimal avgLoadDataFreqHz = calculateAvgLoadDataFreqHz(templateData);
		BigDecimal avgLoadKw = calculateAvgLoadKw(templateData);
		BigDecimal avgPlantPowerKwh = calculateAvgPlantPowerKwh(templateData);
		BigDecimal avgTowerPowerKwh = calculateAvgTowerPowerKwh(templateData);
		BigDecimal avgPowerTowerKw = calculateavgPowerTowerKw(templateData);
		
		
		TelecomLoadResponseDTO telecomLoadResponseDTO = new TelecomLoadResponseDTO();
		TelecomLoaddto telecomLoadDataDTO = new TelecomLoaddto();
		
		
		telecomLoadResponseDTO.setOmcId(Integer.valueOf(templateData.getOmcSiteId()));
		telecomLoadResponseDTO.setEventTimeStamp(templateData.getEventTimeStamp());
		//telecomLoadResponseDTO.setPlantId(plantId);
		telecomLoadResponseDTO.setTelecomloadData(telecomLoadDataDTO);
		telecomLoadResponseDTO.setCreatedOn(null);
		telecomLoadResponseDTO.setCreatedBy(null);
		telecomLoadResponseDTO.setAvgLoadDataPf(ZERO);
		telecomLoadResponseDTO.setAvgLoadDataFreqHz(avgLoadDataFreqHz);
		telecomLoadResponseDTO.setAvgLoadKw(avgLoadKw);
		telecomLoadResponseDTO.setAvgPlantPowerKwh(avgPlantPowerKwh);
		telecomLoadResponseDTO.setAvgTowerPowerKwh(avgTowerPowerKwh);
		telecomLoadResponseDTO.setAvgPowerTowerKw(avgPowerTowerKw);
		telecomLoadResponseDTO.setTodayTowerPeakPowerKW(avgPowerTowerKw);
		telecomLoadResponseDTO.setTodayPlantPowerKW(avgPlantPowerKwh);
		
		
		
		List<TowerLoadData> towerLoadDataList = new ArrayList<TelecomLoaddto.TowerLoadData>();
		TowerLoadData TowerLoadData = new TelecomLoaddto.TowerLoadData();
//		TowerLoadData.setPlantVoltage(templateData.getTelecomDataLoadTower1VoltagePlant());
//		TowerLoadData.setPlantCurrent(templateData.getTelecomDataLoadTower1CrrentPlant());
//		TowerLoadData.setFreqHZ(templateData.getTelecomDataLoadTower1FrezInHz());
//		TowerLoadData.setPf(templateData.getTelecomDataLoadTower1Pf());
//		TowerLoadData.setTowerVoltage(templateData.getTelecomDataLoadTower1VoltageTower1());
//		TowerLoadData.setTowerCurrent(templateData.getTelecomDataLoadTower1CrrentTower1());
		//TowerLoadData.setTowerNumber(null);
		//TowerLoadData.setPlantPowerKW(null);
		//TowerLoadData.setPlantPowerKW(null);
		//TowerLoadData.setTowerAvgPowerKW(null);
		//TowerLoadData.setTowerPeakPowerKW(null);
		//TowerLoadData.setTowerPowerKW(null);
		//TowerLoadData.setTowerPowerKWH(null);
		//TowerLoadData.setTowerTrnsLossPercentage(null);
		//TowerLoadData.setTotalOmcSuppliedHours(null);
//		TowerLoadData.setOmcSuppliedDayHours(templateData.getTelecomDataLoadTower1OmcSupplyDayHour());
//		TowerLoadData.setOmcSuppliedNightHours(templateData.getTelecomDataLoadTower1OmcSupplyNightHour());
		
		telecomLoadDataDTO.setTowerLoadData(towerLoadDataList);
		telecomLoadResponseDTO.setTelecomloadData(telecomLoadDataDTO);
		return telecomLoadResponseDTO;
		
	}
	
	public static BigDecimal calculateAvgLoadDataPf(TemplateData templateData)
	{
		return null;
		
	}
	
	public static BigDecimal calculateAvgLoadDataFreqHz(TemplateData templateData)
	{
		return null;
		
	}
	
	public static BigDecimal calculateAvgLoadKw(TemplateData templateData)
	{
		return null;
		
	}
	
	public static BigDecimal calculateAvgPlantPowerKwh(TemplateData templateData)
	{
		return null;
		
	}
	
	public static BigDecimal calculateAvgTowerPowerKwh(TemplateData templateData)
	{
		return null;
		
	}
	
	public static BigDecimal calculateavgPowerTowerKw(TemplateData templateData)
	{
		return null;
		
	}
	
	// Dg data
	
	public DgResponseDTO extractDgDataFromTemplateData(TemplateData templateData,Long plantId)
	{
		DgResponseDTO  dgResponseDTO = new DgResponseDTO();
		
	//	dgResponseDTO.setPlantId(plantId);
		dgResponseDTO.setOmcId(templateData.getOmcSiteId());
		dgResponseDTO.setEventTimeStamp(templateData.getEventTimeStamp());
		dgResponseDTO.setCreatedBy(null);
		dgResponseDTO.setCreatedOn(null);
		dgResponseDTO.setDgPhase1BattCurrentAmp(templateData.getDgDataPhase1BatteryCurrent());
		dgResponseDTO.setDgPhase1BattPowerKw(null);
		dgResponseDTO.setDgPhase1BattTotalPowerKwh(null);
		dgResponseDTO.setDgPhase1BattVoltage(templateData.getDgDataPhase1BatteryVoltage());
		dgResponseDTO.setDgPhase1LoadCurrentAmp(templateData.getDgDataPhase1LoadCurrent());
		dgResponseDTO.setDgPhase1LoadVoltage(templateData.getDgDataPhase1LoadVoltage());
		dgResponseDTO.setDgPhase1LoadPowerKw(null);
		dgResponseDTO.setDgPhase1LoadTotalPowerKwh(null);
		dgResponseDTO.setDgPhase2BattCurrentAmp(templateData.getDgDataPhase2BatteryCurrent());
		dgResponseDTO.setDgPhase2BattVoltage(templateData.getDgDataPhase2BatteryVoltage());
		dgResponseDTO.setDgPhase2BattPowerKw(null);
		dgResponseDTO.setDgPhase2BattTotalPowerKwh(null);
		dgResponseDTO.setDgPhase2LoadCurrentAmp(templateData.getDgDataPhase2LoadCurrent());
		dgResponseDTO.setDgPhase2LoadVoltage(templateData.getDgDataPhase2LoadVoltage());
		dgResponseDTO.setDgPhase2LoadPowerKw(null);
		dgResponseDTO.setDgPhase2LoadTotalPowerKwh(null);
		dgResponseDTO.setDgPhase3BattCurrentAmp(templateData.getDgDataPhase3BatteryCurrent());
		dgResponseDTO.setDgPhase3BattVoltage(templateData.getDgDataPhase3BatteryVoltage());
		dgResponseDTO.setDgPhase3BattPowerKw(null);
		dgResponseDTO.setDgPhase3BattTotalPowerKwh(null);
		dgResponseDTO.setDgPhase3LoadCurrentAmp(templateData.getDgDataPhase3LoadCurrent());
		dgResponseDTO.setDgPhase3LoadVoltage(templateData.getDgDataPhase3LoadVoltage());
		dgResponseDTO.setDgPhase3LoadPowerKw(null);
		dgResponseDTO.setDgPhase3LoadTotalPowerKwh(null);
		dgResponseDTO.setOthBattVolatge(templateData.getDgOtherDgDataBattVoltage());
		dgResponseDTO.setOthCoolentLevel(templateData.getDgOtherDgDataCoolentLevel());
		dgResponseDTO.setOthDgType(null);
		dgResponseDTO.setOthDgrh(null);
		dgResponseDTO.setOthFuelLevelLtr(templateData.getDgOtherDgDataFuelLevelInLiter());
		dgResponseDTO.setOthOilPressure(templateData.getDgOtherDgDataOilPresure());
		dgResponseDTO.setOthPf(templateData.getDgOtherDgDataPf());
		dgResponseDTO.setOthRms(templateData.getDgOtherDgDataRms());
		dgResponseDTO.setTotalAllphaseDgPowerKwh(null);
		dgResponseDTO.setTotalConsolidatedKwh(null);
		dgResponseDTO.setDgCapKva(templateData.getDgCapInKva());
		dgResponseDTO.setAvgBattChgPowerKw(null);
		dgResponseDTO.setAvgBattDischgPowerKw(null);
		dgResponseDTO.setAvgBattChgPowerKwh(null);
		dgResponseDTO.setAvgBattDischgPowerKwh(null);
		dgResponseDTO.setDgAll3phaseLoadVoltage(templateData.getDgDataTotalAllPhase3LoadVoltage());
		dgResponseDTO.setDgAll3phaseLoadCurrentAmp(templateData.getDgDataTotalAllPhase3LoadCurrent());
		dgResponseDTO.setDgAll3phaseBattCurrentAmp(templateData.getDgDataTotalAllPhase3BateryCurrent());
		dgResponseDTO.setDgAll3phaseBattVoltage(templateData.getDgDataTotalAllPhase3BateryVoltage());
		dgResponseDTO.setDgAll3phaseBattPowerKw(null);
		dgResponseDTO.setDgAll3phaseBattPowerKwh(null);
		
		return dgResponseDTO;
		
	}
	public List<TemplateData> getAllLatestTemplateDataByOmcId(String omcId, Date latestEvent) {
		List<TemplateData> templateData = templateDataRepository.findAllLatestTemplateDataByOmcId(omcId,latestEvent);
		return templateData;
	}
	
	//created by vivek
	public List<TemplateDgData> getAllTemplateDataWhereCurrentDateIsGreater(Integer omcId) {
		
		return templateDgDataRepository.findAllDgTemplateByOmcId(omcId);
	}
	
	public List<TemplateDgData> getAllLatesTemplateDataWhereCurrentDateIsGreater(Integer omcId, Date latestEvent) {
		
		return templateDgDataRepository.findAllDgTemplateByOmcId(omcId);
	}
	
	//create by vivek for dg data
	public DgResponseDTOs extractDgDataFromTemplateDgData(TemplateDgData templateDgData, Integer plantId) {
		
		DgResponseDTOs dgResponseDTO= new DgResponseDTOs();
		
		dgResponseDTO.setId(templateDgData.getId());
		dgResponseDTO.setPlantId(templateDgData.getPlantId());
		dgResponseDTO.setOmcId(templateDgData.getOmcId());
		dgResponseDTO.setEventTimeStamp(templateDgData.getEventTimeStamp());
		dgResponseDTO.setCreatedOn(templateDgData.getCreatedOn());
		dgResponseDTO.setDgCompany(templateDgData.getDgCompany());
		dgResponseDTO.setDgPhase1BattVoltage(templateDgData.getDgPhase1BattVoltage());
		dgResponseDTO.setDgPhase1BattCurrentAmp(templateDgData.getDgPhase1BattCurrentAmp());
		dgResponseDTO.setDgPhase1BattPowerKw(templateDgData.getDgPhase1BattPowerKw());
		dgResponseDTO.setDgPhase1BattTotalPowerKwh(templateDgData.getDgPhase1BattTotalPowerKwh());
		dgResponseDTO.setDgPhase1LoadVoltage(templateDgData.getDgPhase1LoadVoltage());
		dgResponseDTO.setDgPhase1LoadCurrentAmp(templateDgData.getDgPhase1LoadCurrentAmp());
		dgResponseDTO.setDgPhase1LoadTotalPowerKwh(templateDgData.getDgPhase1LoadTotalPowerKwh());
		dgResponseDTO.setDgPhase1LoadPowerKw(templateDgData.getDgPhase1LoadPowerKw());
		dgResponseDTO.setDgPhase2BattVoltage(templateDgData.getDgPhase2BattVoltage());
		dgResponseDTO.setDgPhase2BattCurrentAmp(templateDgData.getDgPhase2BattCurrentAmp());
		dgResponseDTO.setDgPhase2BattPowerKw(templateDgData.getDgPhase2BattPowerKw());
		dgResponseDTO.setDgPhase2BattTotalPowerKwh(templateDgData.getDgPhase2BattTotalPowerKwh());
		dgResponseDTO.setDgPhase2LoadVoltage(templateDgData.getDgPhase2LoadVoltage());
		dgResponseDTO.setDgPhase2LoadCurrentAmp(templateDgData.getDgPhase2LoadCurrentAmp());
		dgResponseDTO.setDgPhase2LoadTotalPowerKwh(templateDgData.getDgPhase2LoadTotalPowerKwh());
		dgResponseDTO.setDgPhase2LoadPowerKw(templateDgData.getDgPhase2LoadPowerKw());
		dgResponseDTO.setDgPhase3BattVoltage(templateDgData.getDgPhase3BattVoltage());
		dgResponseDTO.setDgPhase3BattCurrentAmp(templateDgData.getDgPhase3BattCurrentAmp());
		dgResponseDTO.setDgPhase3BattPowerKw(templateDgData.getDgPhase3BattPowerKw());
		dgResponseDTO.setDgPhase3BattTotalPowerKwh(templateDgData.getDgPhase3BattTotalPowerKwh());
		dgResponseDTO.setDgPhase3LoadVoltage(templateDgData.getDgPhase3LoadVoltage());
		dgResponseDTO.setDgPhase3LoadCurrentAmp(templateDgData.getDgPhase3LoadCurrentAmp());
		dgResponseDTO.setDgPhase3LoadTotalPowerKwh(templateDgData.getDgPhase3LoadTotalPowerKwh());
		dgResponseDTO.setDgPhase3LoadPowerKw(templateDgData.getDgPhase3LoadPowerKw());
		dgResponseDTO.setTotalAllphaseDgPowerKwh(templateDgData.getTotalAllphaseDgPowerKwh());
		dgResponseDTO.setTotalConsolidatedKwh(templateDgData.getTotalConsolidatedKwh());
		dgResponseDTO.setOthFreqHz(templateDgData.getOthFreqHz());
		dgResponseDTO.setOthPf(templateDgData.getOthPf());
		dgResponseDTO.setOthBattVolatge(templateDgData.getOthBattVolatge());
		dgResponseDTO.setOthFuelLevelLtr(templateDgData.getOthFuelLevelLtr());
		dgResponseDTO.setOthRpm(templateDgData.getOthRpm());
		dgResponseDTO.setOthOilPressure(templateDgData.getOthOilPressure());
		dgResponseDTO.setOthCoolentLevel(templateDgData.getOthCoolentLevel());
		dgResponseDTO.setOthDgType(templateDgData.getOthDgType());
		dgResponseDTO.setOthDgrh(templateDgData.getOthDgrh());
		dgResponseDTO.setAvgBattChgPowerKw(templateDgData.getAvgBattChgPowerKw());
		dgResponseDTO.setAvgBattDischgPowerKw(templateDgData.getAvgBattDischgPowerKw());
		dgResponseDTO.setDgAll3phaseBattCurrentAmp(templateDgData.getDgAll3phaseBattCurrentAmp());
		dgResponseDTO.setDgAll3phaseBattPowerKw(templateDgData.getDgAll3phaseBattPowerKw());
		dgResponseDTO.setDgAll3phaseBattVoltage(templateDgData.getDgAll3phaseBattVoltage());
		dgResponseDTO.setDgAll3phaseBattPowerKwh(templateDgData.getDgAll3phaseBattPowerKwh());
		dgResponseDTO.setDgAll3phaseLoadCurrentAmp(templateDgData.getDgAll3phaseLoadCurrentAmp());
		dgResponseDTO.setDgAll3phaseLoadPowerKw(templateDgData.getDgAll3phaseLoadPowerKw());
		dgResponseDTO.setDgAll3phaseLoadVoltage(templateDgData.getDgAll3phaseLoadVoltage());
	//	dgResponseDTO.setDgAll3phaseLoadPowerKwh(templateData.getDgAll3phaseLoadPowerKwh());
		dgResponseDTO.setAvgBattChgPowerKwh(templateDgData.getAvgBattChgPowerKwh());
		dgResponseDTO.setAvgBattDischgPowerKwh(templateDgData.getAvgBattDischgPowerKwh());
		dgResponseDTO.setOthCoolentTemp(templateDgData.getOthCoolentTemp());
		dgResponseDTO.setDgrhToday(templateDgData.getDgrhToday());
		dgResponseDTO.setDgrhYesterday(templateDgData.getDgrhYesterday());
		dgResponseDTO.setDgrhOneWeek(templateDgData.getDgrhOneWeek());
		dgResponseDTO.setDgCurrentMeterReading(templateDgData.getDgCurrentMeterReading());
		return dgResponseDTO;
		

}
	// create by vivek for minigrid data
	public List<TemplateMinigridData> getAllTemplateMinigridDataWhereCurrentDateIsGreater(Integer omcId) {
		
		return templateMinigridDataRepository.findAllMinigridTemplateByOmcId(omcId);
	}
	
	public List<TemplateMinigridData> getAllLatestTemplateMinigridDataByOmcIdWhereCurrentDateIsGreater(Date latestEvent,
			Integer omcId) {
		
		return templateMinigridDataRepository.findAllLatestTemplateDataByOmcId(omcId,latestEvent);
	}
	
	
	public MinigridResponseDTOs extractMinigridDataFromTemplateMinigridData(TemplateMinigridData templateMinigridData,
			Integer plantId) {
		
		MinigridResponseDTOs minigridResponseDTOs= new MinigridResponseDTOs();
		MinigridDTO minigriddto = new MinigridDTO();
		
		minigridResponseDTOs.setPlantId(plantId);
		minigridResponseDTOs.setOmcId(templateMinigridData.getOmcId());
		minigridResponseDTOs.setEventTimeStamp(templateMinigridData.getEventTimeStamp());
		minigridResponseDTOs.setRmId(templateMinigridData.getRmId());
		minigridResponseDTOs.setTotalMgPlantVoltage(templateMinigridData.getTotalMgPlantVoltage());
		minigridResponseDTOs.setTotalMgPlantCurrent(templateMinigridData.getTotalMgPlantCurrent());
		minigridResponseDTOs.setTotalMgPlantPowerKw(templateMinigridData.getTotalMgPlantPowerKw());
		minigridResponseDTOs.setTotalMgPlantPowerKwh(templateMinigridData.getTotalMgPlantPowerKwh());
		minigridResponseDTOs.setTotalMgFreqHz(templateMinigridData.getTotalMgFreqHz());
		minigridResponseDTOs.setTotalMgPf(templateMinigridData.getTotalMgPf());
		minigridResponseDTOs.setTotalMgAvgPowerKw(templateMinigridData.getTotalMgAvgPowerKw());
		minigridResponseDTOs.setTotalMgPeakPowerKw(templateMinigridData.getTotalMgPeakPowerKw());
		minigridResponseDTOs.setTotalMgPowerCustomerKw(templateMinigridData.getTotalMgPowerCustomerKw());
		minigridResponseDTOs.setTotalMgPowerCustomerKwh(templateMinigridData.getTotalMgPowerCustomerKwh());
		minigridResponseDTOs.setTotalLossMgPrecentage(templateMinigridData.getTotalLossMgPrecentage());
		minigridResponseDTOs.setTotalOmcSupplyHourDay(templateMinigridData.getTotalOmcSupplyHourDay());
		minigridResponseDTOs.setTotal_omcSupplyHourNight(templateMinigridData.getTotal_omcSupplyHourNight());
		minigridResponseDTOs.setTotalOmcSupplyHourDayNight(templateMinigridData.getTotalOmcSupplyHourDayNight());
		minigridResponseDTOs.setCreatedOn(templateMinigridData.getCreatedOn());
		minigridResponseDTOs.setCreated_by(templateMinigridData.getCreated_by());
		minigridResponseDTOs.setAvgPowerPlantKw(templateMinigridData.getAvgPowerPlantKw());
		minigridResponseDTOs.setAvgPowerPlantKwh(templateMinigridData.getAvgPowerPlantKwh());
		minigridResponseDTOs.getMinigridLinesData();
		
		List<MinigridLines1Data> listMinigridlist = new ArrayList<MinigridDTO.MinigridLines1Data>();
		MinigridLines1Data minigridLines1Data = new MinigridDTO.MinigridLines1Data();
		
		minigridLines1Data.setMgl1Name("vivek");
		minigridLines1Data.setMgl1PlantVoltage(templateMinigridData.getMgl1PlantVoltage());
		minigridLines1Data.setMgl1PlantCurrent(templateMinigridData.getMgl1PlantCurrent());
		minigridLines1Data.setMgl1PlantPowerKW(templateMinigridData.getMgl1PlantPowerKW());
		minigridLines1Data.setMgl1PlantPowerKWH(templateMinigridData.getMgl1PlantPowerKWH());
		minigridLines1Data.setMgl1FreqHZ(templateMinigridData.getMgl1FreqHZ());
		minigridLines1Data.setMgl1Pf(templateMinigridData.getMgl1Pf());
		minigridLines1Data.setMgl1LineVoltage(templateMinigridData.getMgl1LineVoltage());
		minigridLines1Data.setMgl1LineCurrent(templateMinigridData.getMgl1LineCurrent());
		minigridLines1Data.setMgl1LineAvgPowerKW(templateMinigridData.getMgl1LineAvgPowerKW());
		minigridLines1Data.setMgl1LinePeakPowerKW(templateMinigridData.getMgl1LinePeakPowerKW());
		minigridLines1Data.setMgl1LinePowerKW(templateMinigridData.getMgl1LinePowerKW());
		minigridLines1Data.setMgl1LinePowerKWH(templateMinigridData.getMgl1LinePowerKWH());
		minigridLines1Data.setMgl1LineTrnsLossPercentage(templateMinigridData.getMgl1LineTrnsLossPercentage());
		minigridLines1Data.setMgl1OmcSuppliedDayHours(templateMinigridData.getMgl1OmcSuppliedDayHours());
		minigridLines1Data.setMgl1OmcSuppliedNightHours(templateMinigridData.getMgl1OmcSuppliedNightHours());
		minigridLines1Data.setMgl1TotalOmcSuppliedHours(templateMinigridData.getMgl1TotalOmcSuppliedHours());
		
		minigriddto.setMinigridLinesData(listMinigridlist);
		minigridResponseDTOs.setMinigridLinesData(minigriddto);    
		return minigridResponseDTOs;
	}
	
	// created by vivek for get data by omcId
	public List<TemplateTelecomloadData> getAllTemplateTeleloadDataWhereCurrentDateIsGreater(Integer omcId) {
	
		return templateTelecomloadDataRepository.findAllTelecomloadTemplateByOmcId(omcId);
	}
	public List<TemplateTelecomloadData> getAllTemplateTeleloadDataWhereCurrentDateIsGreater(int omcId,Date latestEvent) {
		
		return templateTelecomloadDataRepository.findAllLatestTemplateTelecomloadDataByOmcId(omcId, latestEvent);
	}
	public TelecomLoadResponseDTO extractTelecomLoadDataFromTemplateTeleloadData(TemplateTelecomloadData templateData,
			Integer plantId) {
		
		TelecomLoadResponseDTO telecomLoadResponseDTO = new TelecomLoadResponseDTO();
		TelecomLoaddto telecomLoadDataDTO = new TelecomLoaddto();
		
		telecomLoadResponseDTO.setRtId(templateData.getId());
		telecomLoadResponseDTO.setPlantId(templateData.getPlantId());
		telecomLoadResponseDTO.setOmcId(templateData.getOmcId());
		telecomLoadResponseDTO.setEventTimeStamp(templateData.getEventTimeStamp());
		telecomLoadResponseDTO.setCreatedOn(templateData.getCreatedOn());
		telecomLoadResponseDTO.setCreatedBy(templateData.getCreatedBy());
		telecomLoadResponseDTO.setAvgLoadDataPf(templateData.getAvgLoadDataPf());
		telecomLoadResponseDTO.setAvgLoadDataFreqHz(templateData.getAvgLoadDataFreqHz());
		telecomLoadResponseDTO.setAvgLoadKw(templateData.getAvgLoadKw());
		telecomLoadResponseDTO.setAvgPlantPowerKwh(templateData.getAvgPlantPowerKwh());
		telecomLoadResponseDTO.setAvgTowerPowerKwh(templateData.getAvgTowerPowerKwh());
		telecomLoadResponseDTO.setAvgPowerTowerKw(templateData.getAvgPowerTowerKw());
		telecomLoadResponseDTO.setTodayTowerPeakPowerKW(templateData.getTodayTowerPeakPowerKW());
		telecomLoadResponseDTO.setTodayPlantPowerKW(templateData.getTodayPlantPowerKW());
		telecomLoadResponseDTO.setTotalNumberTower(templateData.getTotalNumberTower());
		
		List<TowerLoadData> towerLoadDataList = new ArrayList<TelecomLoaddto.TowerLoadData>();
		TowerLoadData TowerLoadData = new TelecomLoaddto.TowerLoadData();
		
		TowerLoadData.setT1PlantVoltage(templateData.getT1PlantVoltage());
		templateData.setT1PlantCurrent(templateData.getT1PlantCurrent());
		templateData.setT1PlantPowerKW(templateData.getT1PlantPowerKW());
		templateData.setT1PlantPowerKWH(templateData.getT1PlantPowerKWH());
		templateData.setT1FreqHZ(templateData.getT1FreqHZ());
		templateData.setT1Pf(templateData.getT1Pf());
		templateData.setT1TowerVoltage(templateData.getT1TowerVoltage());
		templateData.setT1TowerCurrent(templateData.getT1TowerCurrent());
		templateData.setT1TowerAvgPowerKW(templateData.getT1TowerAvgPowerKW());
		templateData.setT1TowerPeakPowerKW(templateData.getT1TowerPeakPowerKW());
		templateData.setT1TowerPowerKWH(templateData.getT1TowerPowerKWH());
		templateData.setT1TowerPowerKW(templateData.getT1TowerPowerKW());
		templateData.setT1TowerTrnsLossPercentage(templateData.getT1TowerTrnsLossPercentage());
		templateData.setT1OmcSuppliedDayHours(templateData.getT1OmcSuppliedDayHours());
		templateData.setT1OmcSuppliedNightHours(templateData.getT1OmcSuppliedNightHours());
		templateData.setT1TotalOmcSuppliedHours(templateData.getT1TotalOmcSuppliedHours());
		telecomLoadDataDTO.setTowerLoadData(towerLoadDataList);
		telecomLoadResponseDTO.setTelecomloadData(telecomLoadDataDTO);
		return telecomLoadResponseDTO;
		
	}
	
	// created by vivek for solar data
	public List<TemplateSolarData> getAllLatestTemplateSolarDataByOmcId(Integer omcId, Date latestEvent) {
		
		return templateSolarDataRepository.findAllLatestTemplateSolarDataByOmcId(omcId,latestEvent);
	}
	
	


}