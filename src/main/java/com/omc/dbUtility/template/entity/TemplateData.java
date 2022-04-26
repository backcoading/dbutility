package com.omc.dbUtility.template.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "template_data")
public class TemplateData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "serial_id")
    private Long serialId;

    @Column(name = "s_no")
    private String sNo;

    @Column(name = "omc_site_id")
    private String omcSiteId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date eventTimeStamp;

    public Date getEventTimeStamp() {
		return eventTimeStamp;
	}


	public void setEventTimeStamp(Date eventTimeStamp) {
		this.eventTimeStamp = eventTimeStamp;
	}


	@Column(name = "pd_site_name")
    private String siteName;

    @Column(name = "pd_abh_name")
    private String abhName;

    @Column(name = "pd_cbh_name")
    private String cbhName;

    @Column(name = "pd_fso_name")
    private String fsoName;

    @Column(name = "pd_plant_executive")
    private String plantExecutive;

    @Column(name = "iv_solar_cap_in_kwh")
    private String solarCapInKwh;

    @Column(name = "iv_inv_cap_in_kw")
    private String invCapInKw;

    @Column(name = "iv_rectifier_cap_in_kw")
    private String rectifierCapInKw;

    @Column(name = "iv_dg_cap_in_Kva")
    private BigDecimal dgCapInKva;

    @Column(name = "iv_batt_cap_in_kwh")
    private String battCapInKwh;

    @Column(name = "iv_no_of_sll")
    private String noOfSll;

    @Column(name = "iv_no_of_poles")
    private String noOfPoles;

    @Column(name = "iv_no_of_rccb")
    private String noOfRccb;

    @Column(name = "iv_no_of_kits")
    private String noOfKits;

    @Column(name = "iv_no_of_customer")
    private String noOfCustomer;

    @Column(name = "sd_mppt1_voltage")
    private String sdMppt1Voltage;

    @Column(name = "sd_mppt1_current")
    private String sdMppt1Crrent;

    @Column(name = "sd_mppt1_power_in_kw")
    private String sdMppt1PowerInKw;

    @Column(name = "sd_mppt1_solar_gen_in_kwh")
    private String sdMppt1SolarGenInKwh;

    @Column(name = "sd_mppt2_voltage")
    private String sdMppt2Voltage;

    @Column(name = "sd_mppt2_current")
    private String sdMppt2Crrent;

    @Column(name = "sd_mppt2_power_in_kw")
    private String sdMppt2PowerInKw;

    @Column(name = "sd_mppt2_solar_gen_in_kwh")
    private String sdMppt2SolarGenInKwh;

    @Column(name = "sd_string1_voltage")
    private String sdString1Voltage;

    @Column(name = "sd_string1_current")
    private String sdString1Crrent;

    @Column(name = "sd_string1_power_in_kw")
    private String sdString1PowerInKw;

    @Column(name = "sd_string1_solar_gen_in_kwh")
    private String sdString1SolarGenInKwh;

    @Column(name = "sd_string2_voltage")
    private String sdString2Voltage;

    @Column(name = "sd_string2_current")
    private String sdString2Crrent;

    @Column(name = "sd_string2_power_in_kw")
    private String sdString2PowerInKw;

    @Column(name = "sd_string2_solar_gen_in_kwh")
    private String sdString2SolarGenInKwh;

    @Column(name = "sd_total_solar_gen_in_kwh")
    private String sdTotalSolarGenInKwh;

    @Column(name = "sd_total_solar_gen_in_factor")
    private String sdTotalSolarGenInfactor;

    @Column(name = "bd_bank1_charge_current")
    private String bdBank1ChargeCurrent;

    @Column(name = "bd_bank1_charge_voltage")
    private String bdBank1ChargeVoltage;

    @Column(name = "bd_bank1_charge_power_in_kwh")
    private String bdBank1ChargePowerInKwh;

    @Column(name = "bd_bank1_discharge_current")
    private String bdBank1DisChargeCurrent;

    @Column(name = "bd_bank1_discharge_voltage")
    private String bdBank1DisChargeVoltage;

    @Column(name = "bd_bank1_discharge_power_in_kwh")
    private String bdBank1DisChargePowerInKwh;

    @Column(name = "bd_bank2_charge_current")
    private String bdBank2ChargeCurrent;

    @Column(name = "bd_bank2_charge_voltage")
    private String bdBank2ChargeVoltage;

    @Column(name = "bd_bank2_charge_power_in_kwh")
    private String bdBank2ChargePowerInKwh;

    @Column(name = "bd_bank2_discharge_current")
    private String bdBank2DisChargeCurrent;

    @Column(name = "bd_bank2_discharge_voltage")
    private String bdBank2DisChargeVoltage;

    @Column(name = "bd_bank2_discharge_power_in_kwh")
    private String bdBank2DisChargePowerInKwh;

    @Column(name = "bd_string1_charge_current")
    private String bdString1ChargeCurrent;

    @Column(name = "bd_string1_charge_voltage")
    private String bdString1ChargeVoltage;

    @Column(name = "bd_string1_charge_power_in_kwh")
    private String bdString1ChargePowerInKwh;

    @Column(name = "bd_string1_discharge_current")
    private String bdString1DisChargeCurrent;

    @Column(name = "bd_string1_discharge_voltage")
    private String bdString1DisChargeVoltage;

    @Column(name = "bd_string1_discharge_power_in_kwh")
    private String bdString1DisChargePowerInKwh;

    @Column(name = "bd_string2_charge_current")
    private String bdString2ChargeCurrent;

    @Column(name = "bd_string2_charge_voltage")
    private String bdString2ChargeVoltage;

    @Column(name = "bd_string2_charge_power_in_kwh")
    private String bdString2ChargePowerInKwh;

    @Column(name = "bd_string2_discharge_current")
    private String bdString2DisChargeCurrent;

    @Column(name = "bd_string2_discharge_voltage")
    private String bdString2DisChargeVoltage;

    @Column(name = "bd_string2_discharge_power_in_kwh")
    private String bdString2DisChargePowerInKwh;

    @Column(name = "bd_others_batt_soc_in_percent")
    private String bdOthersBattSocInPercentage;

    @Column(name = "bd_others_batt_blvd")
    private String bdOthersBattBlvd;

    @Column(name = "bd_others_temp_batt_room_cabinet")
    private String bdOthersTempBattRoom;

    @Column(name = "bd_others_humidity_batt_room_cabinet")
    private String bdOthersHumidityBattRoom;

    @Column(name = "dg_data_Phase1_battery_voltage")
    private BigDecimal dgDataPhase1BatteryVoltage;

    @Column(name = "dg_data_Phase1_battery_current")
    private BigDecimal dgDataPhase1BatteryCurrent;

    @Column(name = "dg_data_Phase1_load_voltage")
    private BigDecimal dgDataPhase1LoadVoltage;

    @Column(name = "dg_data_Phase1_load_current")
    private BigDecimal dgDataPhase1LoadCurrent;

    @Column(name = "dg_data_Phase2_battery_voltage")
    private BigDecimal dgDataPhase2BatteryVoltage;

    @Column(name = "dg_data_Phase2_battery_current")
    private BigDecimal dgDataPhase2BatteryCurrent;

    @Column(name = "dg_data_Phase2_load_voltage")
    private BigDecimal dgDataPhase2LoadVoltage;

    @Column(name = "dg_data_Phase2_load_current")
    private BigDecimal dgDataPhase2LoadCurrent;

    @Column(name = "dg_data_Phase3_battery_voltage")
    private BigDecimal dgDataPhase3BatteryVoltage;

    @Column(name = "dg_data_Phase3_battery_current")
    private BigDecimal dgDataPhase3BatteryCurrent;

    @Column(name = "dg_data_Phase3_load_voltage")
    private BigDecimal dgDataPhase3LoadVoltage;

    @Column(name = "dg_data_Phase3_load_current")
    private BigDecimal dgDataPhase3LoadCurrent;

    @Column(name = "dg_data_total_all_Phase3_battery_current")
    private BigDecimal dgDataTotalAllPhase3BateryCurrent;

    @Column(name = "dg_data_total_all_Phase3_battery_voltage")
    private BigDecimal dgDataTotalAllPhase3BateryVoltage;

    @Column(name = "dg_data_total_all_Phase3_load_current")
    private BigDecimal dgDataTotalAllPhase3LoadCurrent;

    @Column(name = "dg_data_total_all_Phase3_load_voltage")
    private BigDecimal dgDataTotalAllPhase3LoadVoltage;

    @Column(name = "dg_other_dg_data_frez_in_hz")
    private BigDecimal dgOtherDgDataFrezInHz;

    @Column(name = "dg_other_dg_data_pf")
    private BigDecimal dgOtherDgDataPf;

    @Column(name = "dg_other_dg_data_batt_voltage")
    private BigDecimal dgOtherDgDataBattVoltage;

    @Column(name = "dg_other_dg_data_fuel_level_in_liter")
    private BigDecimal dgOtherDgDataFuelLevelInLiter;

    @Column(name = "dg_other_dg_data_rms")
    private String dgOtherDgDataRms;

    @Column(name = "dg_other_dg_data_oil_presure")
    private BigDecimal dgOtherDgDataOilPresure;

    @Column(name = "dg_other_dg_data_coolent_level")
    private BigDecimal dgOtherDgDataCoolentLevel;

    @Column(name = "dg_other_dg_data_mobile_dg")
    private BigDecimal dgOtherDgDataMobileDg;

    @Column(name = "telecom_data_load_tower1_voltage_plant")
    private String telecomDataLoadTower1VoltagePlant;

    @Column(name = "telecom_data_load_tower1_current_plant")
    private String telecomDataLoadTower1CrrentPlant;

    @Column(name = "telecom_data_load_tower1_feez_in_hz")
    private String telecomDataLoadTower1FrezInHz;

    @Column(name = "telecom_data_load_tower1_pf")
    private String telecomDataLoadTower1Pf;

    @Column(name = "telecom_data_load_tower1_voltage_tower1")
    private String telecomDataLoadTower1VoltageTower1;

    @Column(name = "telecom_data_load_tower1_current_tower1")
    private String telecomDataLoadTower1CrrentTower1;

    @Column(name = "telecom_data_load_tower1_omc_supply_day_hour_tower1")
    private String telecomDataLoadTower1OmcSupplyDayHour;

    @Column(name = "telecom_data_load_tower1_omc_supply_night_hour_tower1")
    private String telecomDataLoadTower1OmcSupplyNightHour;

    @Column(name = "telecom_data_load_tower2_voltage_plant")
    private String telecomDataLoadTower2VoltagePlant;

    @Column(name = "telecom_data_load_tower2_current_plant")
    private String telecomDataLoadTower2CrrentPlant;

    @Column(name = "telecom_data_load_tower2_feez_in_hz")
    private String telecomDataLoadTower2FrezInHz;

    @Column(name = "telecom_data_load_tower2_pf")
    private String telecomDataLoadTower2Pf;

    @Column(name = "telecom_data_load_tower2_voltage_tower2")
    private String telecomDataLoadTower2VoltageTower2;

    @Column(name = "telecom_data_load_tower2_current_tower2")
    private String telecomDataLoadTower2CrrentTower2;

    @Column(name = "telecom_data_load_tower2_omc_supply_day_hour_tower2")
    private String telecomDataLoadTower2OmcSupplyDayHour;

    @Column(name = "telecom_data_load_tower2_omc_supply_night_hour_tower2")
    private String telecomDataLoadTower2OmcSupplyNightHour;

    @Column(name = "minigrid_load_line1_id")
    private String minigridLoadLine1Id;

    @Column(name = "minigrid_load_line1_voltage_plant")
    private String minigridLoadLine1VoltagePlant;

    @Column(name = "minigrid_load_line1_current_plant")
    private String minigridLoadLine1CurrentPlant;

    @Column(name = "minigrid_load_line1_frez_in_hz_plant")
    private String minigridLoadLine1FrezInHzPlant;

//    @Column(name ="minoigrid_load_line1_plant_power_kwh")
//    private String minigridLoadLine1PlantPowerKwh;
    
    @Column(name = "minigrid_load_line1_pf_plant")
    private String minigridLoadLine1PfPlant;

    @Column(name = "minigrid_load_line1_voltage_line1")
    private String minigridLoadLine1VoltageLine1;

    @Column(name = "minigrid_load_line1_current_line1")
    private String minigridLoadLine1CurrentLine1;

    @Column(name = "minigrid_load_line1_avg_power_in_kw_line1")
    private String minigridLoadLine1AvgPowerInKwLine1;

    @Column(name = "minigrid_load_line1_peak_power_in_kw_line1")
    private String minigridLoadLine1PeakPowerInKwLine1;

    @Column(name = "minigrid_load_line1_tr_loss_in_percent_line1")
    private String minigridLoadLine1TrLossInPercentageLine1;

    @Column(name = "minigrid_load_line1_omc_spplied_hour_day_line1")
    private String minigridLoadLine1OmcSuppliedHourDayLine1;

    @Column(name = "minigrid_load_line1_omc_spplied_hour_night_line1")
    private String minigridLoadLine1OmcSuppliedHourNightLine1;
    
//    @Column(name = "minigrid_load_line1_omc_spplied_hour_day_night_line1")
//    private String minigridLoadLine1OmcSuppliedHourDayNightLine1;

//    public String getMinigridLoadLine1OmcSuppliedHourDayNightLine1() {
//		return minigridLoadLine1OmcSuppliedHourDayNightLine1;
//	}


//	public void setMinigridLoadLine1OmcSuppliedHourDayNightLine1(String minigridLoadLine1OmcSuppliedHourDayNightLine1) {
////		this.minigridLoadLine1OmcSuppliedHourDayNightLine1 = minigridLoadLine1OmcSuppliedHourDayNightLine1;
//	}


//	public String getMinigridLoadLine2OmcSuppliedHourDayNightLine2() {
//		return minigridLoadLine2OmcSuppliedHourDayNightLine2;
//	}

//
//	public void setMinigridLoadLine2OmcSuppliedHourDayNightLine2(String minigridLoadLine2OmcSuppliedHourDayNightLine2) {
//		this.minigridLoadLine2OmcSuppliedHourDayNightLine2 = minigridLoadLine2OmcSuppliedHourDayNightLine2;
//	}


	@Column(name = "minigrid_load_line2_id")
    private String minigridLoadLine2Id;

//    @Column(name ="minoigrid_load_line2_plant_power_kwh")
//    private String minigridLoadLine2PlantPowerKwh;
    
//    public String getMinigridLoadLine1PlantPowerKwh() {
//		return minigridLoadLine1PlantPowerKwh;
//	}


//	public void setMinigridLoadLine1PlantPowerKwh(String minigridLoadLine1PlantPowerKwh) {
//		this.minigridLoadLine1PlantPowerKwh = minigridLoadLine1PlantPowerKwh;
//	}


//	public String getMinigridLoadLine2PlantPowerKwh() {
//		return minigridLoadLine2PlantPowerKwh;
//	}


//	public void setMinigridLoadLine2PlantPowerKwh(String minigridLoadLine2PlantPowerKwh) {
//		this.minigridLoadLine2PlantPowerKwh = minigridLoadLine2PlantPowerKwh;
//	}


	@Column(name = "minigrid_load_line2_voltage_plant")
    private String minigridLoadLine2VoltagePlant;

    @Column(name = "minigrid_load_line2_current_plant")
    private String minigridLoadLine2CurrentPlant;

    @Column(name = "minigrid_load_line2_frez_in_hz_plant")
    private String minigridLoadLine2FrezInHzPlant;

    @Column(name = "minigrid_load_line2_pf_plant")
    private String minigridLoadLine2PfPlant;

    @Column(name = "minigrid_load_line2_voltage_line2")
    private String minigridLoadLine2VoltageLine2;

    @Column(name = "minigrid_load_line2_current_line2")
    private String minigridLoadLine2CurrentLine2;

    @Column(name = "minigrid_load_line2_avg_power_in_kw_line2")
    private String minigridLoadLine2AvgPowerInKwLine2;

    @Column(name = "minigrid_load_line2_peak_power_in_kw_line2")
    private String minigridLoadLine2PeakPowerInKwLine2;

    @Column(name = "minigrid_load_line2_tr_loss_in_percent_line2")
    private String minigridLoadLine2TrLossInPercentageLine2;

    @Column(name = "minigrid_load_line2_omc_spplied_hour_day_line2")
    private String minigridLoadLine2OmcSuppliedHourDayLine2;

    @Column(name = "minigrid_load_line2_omc_spplied_hour_night_line2")
    private String minigridLoadLine2OmcSuppliedHourNightLine2;
    
//    @Column(name = "minigrid_load_line2_omc_spplied_hour_day_night_line2")
//    private String minigridLoadLine2OmcSuppliedHourDayNightLine2;
    
    @Column(name = "SL1_data_channel1_customer_id")
    private String SubscriberLoadLimiter1DataChannel1CustomerId;
     
    @Column(name = "SL1_data_channel1_voltage")
    private String SubscriberLoadLimiter1DataChannel1Voltage;

    @Column(name = "SL1_data_channel1_current")
    private String SubscriberLoadLimiter1DataChannel1Crrent;

    @Column(name = "SL1_data_channel1_pf")
    private String SubscriberLoadLimiter1DataChannel1Pf;

    @Column(name = "SL1_data_channel1_avg_power_in_kw")
    private String SubscriberLoadLimiter1DataChannel1AvgPowerInKw;

    @Column(name = "SL1_data_channel1_peak_power_in_kw")
    private String SubscriberLoadLimiter1DataChannel1PeakPowerInKw;

    @Column(name = "SL1_data_channel1_omc_supplied_hour_in_day")
    private String SubscriberLoadLimiter1DataChannel1OmcSuppliedHourInDay;

    @Column(name = "SL1_data_channel1_omc_supplied_hour_in_night")
    private String SubscriberLoadLimiter1DataChannel1OmcSuppliedHourInNight;

    @Column(name = "SL1_data_channel_n_customer_id")
    private String SubscriberLoadLimiter1DataChannelNCustomerId;

    @Column(name = "SL1_data_channel_n_voltage")
    private String SubscriberLoadLimiter1DataChannelNVoltage;

    @Column(name = "SL1_data_channel_n_current")
    private String SubscriberLoadLimiter1DataChannelNCrrent;

    @Column(name = "SL1_data_channel_n_pf")
    private String SubscriberLoadLimiter1DataChannelNPf;

    @Column(name = "SL1_data_channel_n_avg_power_in_kw")
    private String SubscriberLoadLimiter1DataChannelNAvgPowerInKw;

    @Column(name = "SL1_data_channel_n_peak_power_in_kw")
    private String SubscriberLoadLimiter1DataChannelNPeakPowerInKw;

    @Column(name = "SL1_data_channel_n_omc_supplied_hour_in_day")
    private String SubscriberLoadLimiter1DataChanneN1OmcSuppliedHourInDay;

    @Column(name = "SL1_data_channe_n_omc_supplied_hour_in_night")
    private String SubscriberLoadLimiter1DataChanneNOmcSuppliedHourInNight;

    @Column(name = "SL_n_data_channel1_customer_id")
    private String SubscriberLoadLimiterNDataChannel1CustomerId;

    @Column(name = "SL_n_data_channel1_voltage")
    private String SubscriberLoadLimiterNDataChannel1Voltage;

    @Column(name = "SL_n_data_channel1_current")
    private String SubscriberLoadLimiterNDataChannel1Crrent;

    @Column(name = "SL_n_data_channel1_pf")
    private String SubscriberLoadLimiterNDataChannel1Pf;

    @Column(name = "SL_n_data_channel1_avg_power_in_kw")
    private String SubscriberLoadLimiterNDataChannel1AvgPowerInKw;

    @Column(name = "SL_n_data_channel1_peak_power_in_kw")
    private String SubscriberLoadLimiterNDataChannel1PeakPowerInKw;

    @Column(name = "SL_n_data_channel1_omc_supplied_hour_in_day")
    private String SubscriberLoadLimiterNDataChannel1OmcSuppliedHourInDay;

    @Column(name = "SL_n_data_channel1_omc_supplied_hour_in_night")
    private String SubscriberLoadLimiterNDataChannel1OmcSuppliedHourInNight;

    @Column(name = "SL_n_data_channel_n_customer_id")
    private String SubscriberLoadLimiterNDataChannelNCustomerId;

    @Column(name = "SL_n_data_channel_n_voltage")
    private String SubscriberLoadLimiterNDataChannelNVoltage;

    @Column(name = "SL_n_data_channel_n_current")
    private String SubscriberLoadLimiterNDataChannelNCrrent;

    @Column(name = "SL_n_data_channel_n_pf")
    private String SubscriberLoadLimiterNDataChannelNPf;

    @Column(name = "SL_n_data_channel_n_avg_power_in_kw")
    private String SubscriberLoadLimiterNDataChannelNAvgPowerInKw;

    @Column(name = "SL_n_data_channel_n_peak_power_in_kw")
    private String SubscriberLoadLimiterNDataChannelNPeakPowerInKw;

    @Column(name = "SL_n_data_channel_n_omc_supplied_hour_in_day")
    private String SubscriberLoadLimiterNDataChanneN1OmcSuppliedHourInDay;

    @Column(name = "SL_n_data_channe_n_omc_supplied_hour_in_night")
    private String SubscriberLoadLimiterNDataChanneNOmcSuppliedHourInNight;

    @Column(name = "energy_meter_data_meter1_customer_id")
    private String energyMeterDataMeter1CustomerId;

    @Column(name = "energy_meter_data_meter1_voltage")
    private String energyMeterDataMeter1Voltage;

    @Column(name = "energy_meter_data_meter1_Current")
    private String energyMeterDataMeter1Current;

    @Column(name = "energy_meter_data_meter1_pf")
    private String energyMeterDataMeter1Pf;

    @Column(name = "energy_meter_data_meter1_avg_power_in_kw")
    private String energyMeterDataMeter1AvgPowerInKw;

    @Column(name = "energy_meter_data_meter1_peak_power_in_kw")
    private String energyMeterDataMeter1PeakPowerInKw;

    @Column(name = "energy_meter_data_meter1_omc_supplied_hour_in_day")
    private String energyMeterDataMeter1OmcsuppliedHourInDay;

    @Column(name = "energy_meter_data_meter1_omc_supplied_hour_in_night")
    private String energyMeterDataMeter1OmcsuppliedHourInNight;

    @Column(name = "energy_meter_data_meter_n_customer_id")
    private String energyMeterDataMeterNCustomerId;

    @Column(name = "energy_meter_data_meter_n_voltage")
    private String energyMeterDataMeterNVoltage;

    @Column(name = "energy_meter_data_meter_n_Current")
    private String energyMeterDataMeterNCurrent;

    @Column(name = "energy_meter_data_meter_n_pf")
    private String energyMeterDataMeterNPf;

    @Column(name = "energy_meter_data_meter_n_avg_power_in_kw")
    private String energyMeterDataMeterNAvgPowerInKw;

    @Column(name = "energy_meter_data_meter_n_peak_power_in_kw")
    private String energyMeterDataMeterNPeakPowerInKw;

    @Column(name = "energy_meter_data_meter_n_omc_supplied_hour_in_day")
    private String energyMeterDataMeterNOmcsuppliedHourInDay;

    @Column(name = "energy_meter_data_meter_n_omc_supplied_hour_in_night")
    private String energyMeterDataMeterNOmcsuppliedHourInNight;

    @Column(name = "parameter_setting_bulk_voltage")
    private String parameterSettingBulkVoltage;

    @Column(name = "parameter_setting_float_voltage")
    private String parameterSettingFloatVoltage;

    @Column(name = "parameter_setting_force_dg_start")
    private String parameterSettingForceDgstart;

    @Column(name = "parameter_setting_dg_run_time_hours")
    private String parameterSettingDgRunTimeHours;

    @Column(name = "parameter_setting_dg_start_voltage")
    private String parameterSettingDgStartVoltage;

    @Column(name = "parameter_setting_ac_charge_start_voltage")
    private String parameterSettingAcchargeStartVoltage;

    @Column(name = "parameter_setting_min_thresh_old_in_watt")
    private String parameterSettingMinThreshOldInWatt;

    @Column(name = "parameter_setting_max_power_in_watt")
    private String parameterSettingMaxPowerInWatt;

    @Column(name = "parameter_setting_solar")
    private String parameterSettingSolar;

    @Column(name = "parameter_setting_charging_current_dg")
    private String parameterSettingChargingCurrentDg;

    @Column(name = "parameter_setting_softBlvd")
    private String parameterSettingSoftBlvd;

    @Column(name = "parameter_setting_batt_cap_in_kwh")
    private String parameterSettingBattCapInKwh;

    @Column(name = "parameter_setting_absorb_time")
    private String parameterSettingAbsorbTime;

    @Column(name = "parameter_setting_absorb_voltage")
    private String parameterSettingAbsorbVoltage;

    @Column(name = "parameter_setting_force_minigrid_on_off_trigger")
    private String parameterSettingForceMinigridONOFFTrigger;

    @Column(name = "parameter_setting_others")
    private String parameterSettingOthers;


    public TemplateData() {
        super();
    }


    public Long getSerialId() {
        return serialId;
    }


    public void setSerialId(Long serialId) {
        this.serialId = serialId;
    }


    public String getsNo() {
        return sNo;
    }


    public void setsNo(String sNo) {
        this.sNo = sNo;
    }


    public String getOmcSiteId() {
        return omcSiteId;
    }


    public void setOmcSiteId(String omcSiteId) {
        this.omcSiteId = omcSiteId;
    }


    public String getSiteName() {
        return siteName;
    }


    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }


    public String getAbhName() {
        return abhName;
    }


    public void setAbhName(String abhName) {
        this.abhName = abhName;
    }


    public String getCbhName() {
        return cbhName;
    }


    public void setCbhName(String cbhName) {
        this.cbhName = cbhName;
    }


    public String getFsoName() {
        return fsoName;
    }


    public void setFsoName(String fsoName) {
        this.fsoName = fsoName;
    }


    public String getPlantExecutive() {
        return plantExecutive;
    }


    public void setPlantExecutive(String plantExecutive) {
        this.plantExecutive = plantExecutive;
    }


    public String getSolarCapInKwh() {
        return solarCapInKwh;
    }


    public void setSolarCapInKwh(String solarCapInKwh) {
        this.solarCapInKwh = solarCapInKwh;
    }


    public String getInvCapInKw() {
        return invCapInKw;
    }


    public void setInvCapInKw(String invCapInKw) {
        this.invCapInKw = invCapInKw;
    }


    public String getRectifierCapInKw() {
        return rectifierCapInKw;
    }


    public void setRectifierCapInKw(String rectifierCapInKw) {
        this.rectifierCapInKw = rectifierCapInKw;
    }


    public BigDecimal getDgCapInKva() {
        return dgCapInKva;
    }


    public void setDgCapInKva(BigDecimal dgCapInKva) {
        this.dgCapInKva = dgCapInKva;
    }


    public String getBattCapInKwh() {
        return battCapInKwh;
    }


    public void setBattCapInKwh(String battCapInKwh) {
        this.battCapInKwh = battCapInKwh;
    }


    public String getNoOfSll() {
        return noOfSll;
    }


    public void setNoOfSll(String noOfSll) {
        this.noOfSll = noOfSll;
    }


    public String getNoOfPoles() {
        return noOfPoles;
    }


    public void setNoOfPoles(String noOfPoles) {
        this.noOfPoles = noOfPoles;
    }


    public String getNoOfRccb() {
        return noOfRccb;
    }


    public void setNoOfRccb(String noOfRccb) {
        this.noOfRccb = noOfRccb;
    }


    public String getNoOfKits() {
        return noOfKits;
    }


    public void setNoOfKits(String noOfKits) {
        this.noOfKits = noOfKits;
    }


    public String getNoOfCustomer() {
        return noOfCustomer;
    }


    public void setNoOfCustomer(String noOfCustomer) {
        this.noOfCustomer = noOfCustomer;
    }


    public String getSdMppt1Voltage() {
        return sdMppt1Voltage;
    }


    public void setSdMppt1Voltage(String sdMppt1Voltage) {
        this.sdMppt1Voltage = sdMppt1Voltage;
    }


    public String getSdMppt1Crrent() {
        return sdMppt1Crrent;
    }


    public void setSdMppt1Crrent(String sdMppt1Crrent) {
        this.sdMppt1Crrent = sdMppt1Crrent;
    }


    public String getSdMppt1PowerInKw() {
        return sdMppt1PowerInKw;
    }


    public void setSdMppt1PowerInKw(String sdMppt1PowerInKw) {
        this.sdMppt1PowerInKw = sdMppt1PowerInKw;
    }


    public String getSdMppt1SolarGenInKwh() {
        return sdMppt1SolarGenInKwh;
    }


    public void setSdMppt1SolarGenInKwh(String sdMppt1SolarGenInKwh) {
        this.sdMppt1SolarGenInKwh = sdMppt1SolarGenInKwh;
    }


    public String getSdMppt2Voltage() {
        return sdMppt2Voltage;
    }


    public void setSdMppt2Voltage(String sdMppt2Voltage) {
        this.sdMppt2Voltage = sdMppt2Voltage;
    }


    public String getSdMppt2Crrent() {
        return sdMppt2Crrent;
    }


    public void setSdMppt2Crrent(String sdMppt2Crrent) {
        this.sdMppt2Crrent = sdMppt2Crrent;
    }


    public String getSdMppt2PowerInKw() {
        return sdMppt2PowerInKw;
    }


    public void setSdMppt2PowerInKw(String sdMppt2PowerInKw) {
        this.sdMppt2PowerInKw = sdMppt2PowerInKw;
    }


    public String getSdMppt2SolarGenInKwh() {
        return sdMppt2SolarGenInKwh;
    }


    public void setSdMppt2SolarGenInKwh(String sdMppt2SolarGenInKwh) {
        this.sdMppt2SolarGenInKwh = sdMppt2SolarGenInKwh;
    }


    public String getSdString1Voltage() {
        return sdString1Voltage;
    }


    public void setSdString1Voltage(String sdString1Voltage) {
        this.sdString1Voltage = sdString1Voltage;
    }


    public String getSdString1Crrent() {
        return sdString1Crrent;
    }


    public void setSdString1Crrent(String sdString1Crrent) {
        this.sdString1Crrent = sdString1Crrent;
    }


    public String getSdString1PowerInKw() {
        return sdString1PowerInKw;
    }


    public void setSdString1PowerInKw(String sdString1PowerInKw) {
        this.sdString1PowerInKw = sdString1PowerInKw;
    }


    public String getSdString1SolarGenInKwh() {
        return sdString1SolarGenInKwh;
    }


    public void setSdString1SolarGenInKwh(String sdString1SolarGenInKwh) {
        this.sdString1SolarGenInKwh = sdString1SolarGenInKwh;
    }


    public String getSdString2Voltage() {
        return sdString2Voltage;
    }


    public void setSdString2Voltage(String sdString2Voltage) {
        this.sdString2Voltage = sdString2Voltage;
    }


    public String getSdString2Crrent() {
        return sdString2Crrent;
    }


    public void setSdString2Crrent(String sdString2Crrent) {
        this.sdString2Crrent = sdString2Crrent;
    }


    public String getSdString2PowerInKw() {
        return sdString2PowerInKw;
    }


    public void setSdString2PowerInKw(String sdString2PowerInKw) {
        this.sdString2PowerInKw = sdString2PowerInKw;
    }


    public String getSdString2SolarGenInKwh() {
        return sdString2SolarGenInKwh;
    }


    public void setSdString2SolarGenInKwh(String sdString2SolarGenInKwh) {
        this.sdString2SolarGenInKwh = sdString2SolarGenInKwh;
    }


    public String getSdTotalSolarGenInKwh() {
        return sdTotalSolarGenInKwh;
    }


    public void setSdTotalSolarGenInKwh(String sdTotalSolarGenInKwh) {
        this.sdTotalSolarGenInKwh = sdTotalSolarGenInKwh;
    }


    public String getSdTotalSolarGenInfactor() {
        return sdTotalSolarGenInfactor;
    }


    public void setSdTotalSolarGenInfactor(String sdTotalSolarGenInfactor) {
        this.sdTotalSolarGenInfactor = sdTotalSolarGenInfactor;
    }


    public String getBdBank1ChargeCurrent() {
        return bdBank1ChargeCurrent;
    }


    public void setBdBank1ChargeCurrent(String bdBank1ChargeCurrent) {
        this.bdBank1ChargeCurrent = bdBank1ChargeCurrent;
    }


    public String getBdBank1ChargeVoltage() {
        return bdBank1ChargeVoltage;
    }


    public void setBdBank1ChargeVoltage(String bdBank1ChargeVoltage) {
        this.bdBank1ChargeVoltage = bdBank1ChargeVoltage;
    }


    public String getBdBank1ChargePowerInKwh() {
        return bdBank1ChargePowerInKwh;
    }


    public void setBdBank1ChargePowerInKwh(String bdBank1ChargePowerInKwh) {
        this.bdBank1ChargePowerInKwh = bdBank1ChargePowerInKwh;
    }


    public String getBdBank1DisChargeCurrent() {
        return bdBank1DisChargeCurrent;
    }


    public void setBdBank1DisChargeCurrent(String bdBank1DisChargeCurrent) {
        this.bdBank1DisChargeCurrent = bdBank1DisChargeCurrent;
    }


    public String getBdBank1DisChargeVoltage() {
        return bdBank1DisChargeVoltage;
    }


    public void setBdBank1DisChargeVoltage(String bdBank1DisChargeVoltage) {
        this.bdBank1DisChargeVoltage = bdBank1DisChargeVoltage;
    }


    public String getBdBank1DisChargePowerInKwh() {
        return bdBank1DisChargePowerInKwh;
    }


    public void setBdBank1DisChargePowerInKwh(String bdBank1DisChargePowerInKwh) {
        this.bdBank1DisChargePowerInKwh = bdBank1DisChargePowerInKwh;
    }


    public String getBdBank2ChargeCurrent() {
        return bdBank2ChargeCurrent;
    }


    public void setBdBank2ChargeCurrent(String bdBank2ChargeCurrent) {
        this.bdBank2ChargeCurrent = bdBank2ChargeCurrent;
    }


    public String getBdBank2ChargeVoltage() {
        return bdBank2ChargeVoltage;
    }


    public void setBdBank2ChargeVoltage(String bdBank2ChargeVoltage) {
        this.bdBank2ChargeVoltage = bdBank2ChargeVoltage;
    }


    public String getBdBank2ChargePowerInKwh() {
        return bdBank2ChargePowerInKwh;
    }


    public void setBdBank2ChargePowerInKwh(String bdBank2ChargePowerInKwh) {
        this.bdBank2ChargePowerInKwh = bdBank2ChargePowerInKwh;
    }


    public String getBdBank2DisChargeCurrent() {
        return bdBank2DisChargeCurrent;
    }


    public void setBdBank2DisChargeCurrent(String bdBank2DisChargeCurrent) {
        this.bdBank2DisChargeCurrent = bdBank2DisChargeCurrent;
    }


    public String getBdBank2DisChargeVoltage() {
        return bdBank2DisChargeVoltage;
    }


    public void setBdBank2DisChargeVoltage(String bdBank2DisChargeVoltage) {
        this.bdBank2DisChargeVoltage = bdBank2DisChargeVoltage;
    }


    public String getBdBank2DisChargePowerInKwh() {
        return bdBank2DisChargePowerInKwh;
    }


    public void setBdBank2DisChargePowerInKwh(String bdBank2DisChargePowerInKwh) {
        this.bdBank2DisChargePowerInKwh = bdBank2DisChargePowerInKwh;
    }


    public String getBdString1ChargeCurrent() {
        return bdString1ChargeCurrent;
    }


    public void setBdString1ChargeCurrent(String bdString1ChargeCurrent) {
        this.bdString1ChargeCurrent = bdString1ChargeCurrent;
    }


    public String getBdString1ChargeVoltage() {
        return bdString1ChargeVoltage;
    }


    public void setBdString1ChargeVoltage(String bdString1ChargeVoltage) {
        this.bdString1ChargeVoltage = bdString1ChargeVoltage;
    }


    public String getBdString1ChargePowerInKwh() {
        return bdString1ChargePowerInKwh;
    }


    public void setBdString1ChargePowerInKwh(String bdString1ChargePowerInKwh) {
        this.bdString1ChargePowerInKwh = bdString1ChargePowerInKwh;
    }


    public String getBdString1DisChargeCurrent() {
        return bdString1DisChargeCurrent;
    }


    public void setBdString1DisChargeCurrent(String bdString1DisChargeCurrent) {
        this.bdString1DisChargeCurrent = bdString1DisChargeCurrent;
    }


    public String getBdString1DisChargeVoltage() {
        return bdString1DisChargeVoltage;
    }


    public void setBdString1DisChargeVoltage(String bdString1DisChargeVoltage) {
        this.bdString1DisChargeVoltage = bdString1DisChargeVoltage;
    }


    public String getBdString1DisChargePowerInKwh() {
        return bdString1DisChargePowerInKwh;
    }


    public void setBdString1DisChargePowerInKwh(String bdString1DisChargePowerInKwh) {
        this.bdString1DisChargePowerInKwh = bdString1DisChargePowerInKwh;
    }


    public String getBdString2ChargeCurrent() {
        return bdString2ChargeCurrent;
    }


    public void setBdString2ChargeCurrent(String bdString2ChargeCurrent) {
        this.bdString2ChargeCurrent = bdString2ChargeCurrent;
    }


    public String getBdString2ChargeVoltage() {
        return bdString2ChargeVoltage;
    }


    public void setBdString2ChargeVoltage(String bdString2ChargeVoltage) {
        this.bdString2ChargeVoltage = bdString2ChargeVoltage;
    }


    public String getBdString2ChargePowerInKwh() {
        return bdString2ChargePowerInKwh;
    }


    public void setBdString2ChargePowerInKwh(String bdString2ChargePowerInKwh) {
        this.bdString2ChargePowerInKwh = bdString2ChargePowerInKwh;
    }


    public String getBdString2DisChargeCurrent() {
        return bdString2DisChargeCurrent;
    }


    public void setBdString2DisChargeCurrent(String bdString2DisChargeCurrent) {
        this.bdString2DisChargeCurrent = bdString2DisChargeCurrent;
    }


    public String getBdString2DisChargeVoltage() {
        return bdString2DisChargeVoltage;
    }


    public void setBdString2DisChargeVoltage(String bdString2DisChargeVoltage) {
        this.bdString2DisChargeVoltage = bdString2DisChargeVoltage;
    }


    public String getBdString2DisChargePowerInKwh() {
        return bdString2DisChargePowerInKwh;
    }


    public void setBdString2DisChargePowerInKwh(String bdString2DisChargePowerInKwh) {
        this.bdString2DisChargePowerInKwh = bdString2DisChargePowerInKwh;
    }


    public String getBdOthersBattSocInPercentage() {
        return bdOthersBattSocInPercentage;
    }


    public void setBdOthersBattSocInPercentage(String bdOthersBattSocInPercentage) {
        this.bdOthersBattSocInPercentage = bdOthersBattSocInPercentage;
    }


    public String getBdOthersBattBlvd() {
        return bdOthersBattBlvd;
    }


    public void setBdOthersBattBlvd(String bdOthersBattBlvd) {
        this.bdOthersBattBlvd = bdOthersBattBlvd;
    }


    public String getBdOthersTempBattRoom() {
        return bdOthersTempBattRoom;
    }


    public void setBdOthersTempBattRoom(String bdOthersTempBattRoom) {
        this.bdOthersTempBattRoom = bdOthersTempBattRoom;
    }


    public String getBdOthersHumidityBattRoom() {
        return bdOthersHumidityBattRoom;
    }


    public void setBdOthersHumidityBattRoom(String bdOthersHumidityBattRoom) {
        this.bdOthersHumidityBattRoom = bdOthersHumidityBattRoom;
    }


    public BigDecimal getDgDataPhase1BatteryVoltage() {
        return dgDataPhase1BatteryVoltage;
    }


    public void setDgDataPhase1BatteryVoltage(BigDecimal dgDataPhase1BatteryVoltage) {
        this.dgDataPhase1BatteryVoltage = dgDataPhase1BatteryVoltage;
    }


    public BigDecimal getDgDataPhase1BatteryCurrent() {
        return dgDataPhase1BatteryCurrent;
    }


    public void setDgDataPhase1BatteryCurrent(BigDecimal dgDataPhase1BatteryCurrent) {
        this.dgDataPhase1BatteryCurrent = dgDataPhase1BatteryCurrent;
    }


    public BigDecimal getDgDataPhase1LoadVoltage() {
        return dgDataPhase1LoadVoltage;
    }


    public void setDgDataPhase1LoadVoltage(BigDecimal dgDataPhase1LoadVoltage) {
        this.dgDataPhase1LoadVoltage = dgDataPhase1LoadVoltage;
    }


    public BigDecimal getDgDataPhase1LoadCurrent() {
        return dgDataPhase1LoadCurrent;
    }


    public void setDgDataPhase1LoadCurrent(BigDecimal dgDataPhase1LoadCurrent) {
        this.dgDataPhase1LoadCurrent = dgDataPhase1LoadCurrent;
    }


    public BigDecimal getDgDataPhase2BatteryVoltage() {
        return dgDataPhase2BatteryVoltage;
    }


    public void setDgDataPhase2BatteryVoltage(BigDecimal dgDataPhase2BatteryVoltage) {
        this.dgDataPhase2BatteryVoltage = dgDataPhase2BatteryVoltage;
    }


    public BigDecimal getDgDataPhase2BatteryCurrent() {
        return dgDataPhase2BatteryCurrent;
    }


    public void setDgDataPhase2BatteryCurrent(BigDecimal dgDataPhase2BatteryCurrent) {
        this.dgDataPhase2BatteryCurrent = dgDataPhase2BatteryCurrent;
    }


    public BigDecimal getDgDataPhase2LoadVoltage() {
        return dgDataPhase2LoadVoltage;
    }


    public void setDgDataPhase2LoadVoltage(BigDecimal dgDataPhase2LoadVoltage) {
        this.dgDataPhase2LoadVoltage = dgDataPhase2LoadVoltage;
    }


    public BigDecimal getDgDataPhase2LoadCurrent() {
        return dgDataPhase2LoadCurrent;
    }


    public void setDgDataPhase2LoadCurrent(BigDecimal dgDataPhase2LoadCurrent) {
        this.dgDataPhase2LoadCurrent = dgDataPhase2LoadCurrent;
    }


    public BigDecimal getDgDataPhase3BatteryVoltage() {
        return dgDataPhase3BatteryVoltage;
    }


    public void setDgDataPhase3BatteryVoltage(BigDecimal dgDataPhase3BatteryVoltage) {
        this.dgDataPhase3BatteryVoltage = dgDataPhase3BatteryVoltage;
    }


    public BigDecimal getDgDataPhase3BatteryCurrent() {
        return dgDataPhase3BatteryCurrent;
    }


    public void setDgDataPhase3BatteryCurrent(BigDecimal dgDataPhase3BatteryCurrent) {
        this.dgDataPhase3BatteryCurrent = dgDataPhase3BatteryCurrent;
    }


    public BigDecimal getDgDataPhase3LoadVoltage() {
        return dgDataPhase3LoadVoltage;
    }


    public void setDgDataPhase3LoadVoltage(BigDecimal dgDataPhase3LoadVoltage) {
        this.dgDataPhase3LoadVoltage = dgDataPhase3LoadVoltage;
    }


    public BigDecimal getDgDataPhase3LoadCurrent() {
        return dgDataPhase3LoadCurrent;
    }


    public void setDgDataPhase3LoadCurrent(BigDecimal dgDataPhase3LoadCurrent) {
        this.dgDataPhase3LoadCurrent = dgDataPhase3LoadCurrent;
    }


    public BigDecimal getDgDataTotalAllPhase3BateryCurrent() {
        return dgDataTotalAllPhase3BateryCurrent;
    }


    public void setDgDataTotalAllPhase3BateryCurrent(BigDecimal dgDataTotalAllPhase3BateryCurrent) {
        this.dgDataTotalAllPhase3BateryCurrent = dgDataTotalAllPhase3BateryCurrent;
    }


    public BigDecimal getDgDataTotalAllPhase3BateryVoltage() {
        return dgDataTotalAllPhase3BateryVoltage;
    }


    public void setDgDataTotalAllPhase3BateryVoltage(BigDecimal dgDataTotalAllPhase3BateryVoltage) {
        this.dgDataTotalAllPhase3BateryVoltage = dgDataTotalAllPhase3BateryVoltage;
    }


    public BigDecimal getDgDataTotalAllPhase3LoadCurrent() {
        return dgDataTotalAllPhase3LoadCurrent;
    }


    public void setDgDataTotalAllPhase3LoadCurrent(BigDecimal dgDataTotalAllPhase3LoadCurrent) {
        this.dgDataTotalAllPhase3LoadCurrent = dgDataTotalAllPhase3LoadCurrent;
    }


    public BigDecimal getDgDataTotalAllPhase3LoadVoltage() {
        return dgDataTotalAllPhase3LoadVoltage;
    }


    public void setDgDataTotalAllPhase3LoadVoltage(BigDecimal dgDataTotalAllPhase3LoadVoltage) {
        this.dgDataTotalAllPhase3LoadVoltage = dgDataTotalAllPhase3LoadVoltage;
    }


    public BigDecimal getDgOtherDgDataFrezInHz() {
        return dgOtherDgDataFrezInHz;
    }


    public void setDgOtherDgDataFrezInHz(BigDecimal dgOtherDgDataFrezInHz) {
        this.dgOtherDgDataFrezInHz = dgOtherDgDataFrezInHz;
    }


    public BigDecimal getDgOtherDgDataPf() {
        return dgOtherDgDataPf;
    }


    public void setDgOtherDgDataPf(BigDecimal dgOtherDgDataPf) {
        this.dgOtherDgDataPf = dgOtherDgDataPf;
    }


    public BigDecimal getDgOtherDgDataBattVoltage() {
        return dgOtherDgDataBattVoltage;
    }


    public void setDgOtherDgDataBattVoltage(BigDecimal dgOtherDgDataBattVoltage) {
        this.dgOtherDgDataBattVoltage = dgOtherDgDataBattVoltage;
    }


    public BigDecimal getDgOtherDgDataFuelLevelInLiter() {
        return dgOtherDgDataFuelLevelInLiter;
    }


    public void setDgOtherDgDataFuelLevelInLiter(BigDecimal dgOtherDgDataFuelLevelInLiter) {
        this.dgOtherDgDataFuelLevelInLiter = dgOtherDgDataFuelLevelInLiter;
    }


    public String getDgOtherDgDataRms() {
        return dgOtherDgDataRms;
    }


    public void setDgOtherDgDataRms(String dgOtherDgDataRms) {
        this.dgOtherDgDataRms = dgOtherDgDataRms;
    }


    public BigDecimal getDgOtherDgDataOilPresure() {
        return dgOtherDgDataOilPresure;
    }


    public void setDgOtherDgDataOilPresure(BigDecimal dgOtherDgDataOilPresure) {
        this.dgOtherDgDataOilPresure = dgOtherDgDataOilPresure;
    }


    public BigDecimal getDgOtherDgDataCoolentLevel() {
        return dgOtherDgDataCoolentLevel;
    }


    public void setDgOtherDgDataCoolentLevel(BigDecimal dgOtherDgDataCoolentLevel) {
        this.dgOtherDgDataCoolentLevel = dgOtherDgDataCoolentLevel;
    }


    public BigDecimal getDgOtherDgDataMobileDg() {
        return dgOtherDgDataMobileDg;
    }


    public void setDgOtherDgDataMobileDg(BigDecimal dgOtherDgDataMobileDg) {
        this.dgOtherDgDataMobileDg = dgOtherDgDataMobileDg;
    }


    public String getTelecomDataLoadTower1VoltagePlant() {
        return telecomDataLoadTower1VoltagePlant;
    }


    public void setTelecomDataLoadTower1VoltagePlant(String telecomDataLoadTower1VoltagePlant) {
        this.telecomDataLoadTower1VoltagePlant = telecomDataLoadTower1VoltagePlant;
    }


    public String getTelecomDataLoadTower1CrrentPlant() {
        return telecomDataLoadTower1CrrentPlant;
    }


    public void setTelecomDataLoadTower1CrrentPlant(String telecomDataLoadTower1CrrentPlant) {
        this.telecomDataLoadTower1CrrentPlant = telecomDataLoadTower1CrrentPlant;
    }


    public String getTelecomDataLoadTower1FrezInHz() {
        return telecomDataLoadTower1FrezInHz;
    }


    public void setTelecomDataLoadTower1FrezInHz(String telecomDataLoadTower1FrezInHz) {
        this.telecomDataLoadTower1FrezInHz = telecomDataLoadTower1FrezInHz;
    }


    public String getTelecomDataLoadTower1Pf() {
        return telecomDataLoadTower1Pf;
    }


    public void setTelecomDataLoadTower1Pf(String telecomDataLoadTower1Pf) {
        this.telecomDataLoadTower1Pf = telecomDataLoadTower1Pf;
    }


    public String getTelecomDataLoadTower1VoltageTower1() {
        return telecomDataLoadTower1VoltageTower1;
    }


    public void setTelecomDataLoadTower1VoltageTower1(String telecomDataLoadTower1VoltageTower1) {
        this.telecomDataLoadTower1VoltageTower1 = telecomDataLoadTower1VoltageTower1;
    }


    public String getTelecomDataLoadTower1CrrentTower1() {
        return telecomDataLoadTower1CrrentTower1;
    }


    public void setTelecomDataLoadTower1CrrentTower1(String telecomDataLoadTower1CrrentTower1) {
        this.telecomDataLoadTower1CrrentTower1 = telecomDataLoadTower1CrrentTower1;
    }


    public String getTelecomDataLoadTower1OmcSupplyDayHour() {
        return telecomDataLoadTower1OmcSupplyDayHour;
    }


    public void setTelecomDataLoadTower1OmcSupplyDayHour(String telecomDataLoadTower1OmcSupplyDayHour) {
        this.telecomDataLoadTower1OmcSupplyDayHour = telecomDataLoadTower1OmcSupplyDayHour;
    }


    public String getTelecomDataLoadTower1OmcSupplyNightHour() {
        return telecomDataLoadTower1OmcSupplyNightHour;
    }


    public void setTelecomDataLoadTower1OmcSupplyNightHour(String telecomDataLoadTower1OmcSupplyNightHour) {
        this.telecomDataLoadTower1OmcSupplyNightHour = telecomDataLoadTower1OmcSupplyNightHour;
    }


    public String getTelecomDataLoadTower2VoltagePlant() {
        return telecomDataLoadTower2VoltagePlant;
    }


    public void setTelecomDataLoadTower2VoltagePlant(String telecomDataLoadTower2VoltagePlant) {
        this.telecomDataLoadTower2VoltagePlant = telecomDataLoadTower2VoltagePlant;
    }


    public String getTelecomDataLoadTower2CrrentPlant() {
        return telecomDataLoadTower2CrrentPlant;
    }


    public void setTelecomDataLoadTower2CrrentPlant(String telecomDataLoadTower2CrrentPlant) {
        this.telecomDataLoadTower2CrrentPlant = telecomDataLoadTower2CrrentPlant;
    }


    public String getTelecomDataLoadTower2FrezInHz() {
        return telecomDataLoadTower2FrezInHz;
    }


    public void setTelecomDataLoadTower2FrezInHz(String telecomDataLoadTower2FrezInHz) {
        this.telecomDataLoadTower2FrezInHz = telecomDataLoadTower2FrezInHz;
    }


    public String getTelecomDataLoadTower2Pf() {
        return telecomDataLoadTower2Pf;
    }


    public void setTelecomDataLoadTower2Pf(String telecomDataLoadTower2Pf) {
        this.telecomDataLoadTower2Pf = telecomDataLoadTower2Pf;
    }


    public String getTelecomDataLoadTower2VoltageTower2() {
        return telecomDataLoadTower2VoltageTower2;
    }


    public void setTelecomDataLoadTower2VoltageTower2(String telecomDataLoadTower2VoltageTower2) {
        this.telecomDataLoadTower2VoltageTower2 = telecomDataLoadTower2VoltageTower2;
    }


    public String getTelecomDataLoadTower2CrrentTower2() {
        return telecomDataLoadTower2CrrentTower2;
    }


    public void setTelecomDataLoadTower2CrrentTower2(String telecomDataLoadTower2CrrentTower2) {
        this.telecomDataLoadTower2CrrentTower2 = telecomDataLoadTower2CrrentTower2;
    }


    public String getTelecomDataLoadTower2OmcSupplyDayHour() {
        return telecomDataLoadTower2OmcSupplyDayHour;
    }


    public void setTelecomDataLoadTower2OmcSupplyDayHour(String telecomDataLoadTower2OmcSupplyDayHour) {
        this.telecomDataLoadTower2OmcSupplyDayHour = telecomDataLoadTower2OmcSupplyDayHour;
    }


    public String getTelecomDataLoadTower2OmcSupplyNightHour() {
        return telecomDataLoadTower2OmcSupplyNightHour;
    }


    public void setTelecomDataLoadTower2OmcSupplyNightHour(String telecomDataLoadTower2OmcSupplyNightHour) {
        this.telecomDataLoadTower2OmcSupplyNightHour = telecomDataLoadTower2OmcSupplyNightHour;
    }


    public String getMinigridLoadLine1Id() {
        return minigridLoadLine1Id;
    }


    public void setMinigridLoadLine1Id(String minigridLoadLine1Id) {
        this.minigridLoadLine1Id = minigridLoadLine1Id;
    }


    public String getMinigridLoadLine1VoltagePlant() {
        return minigridLoadLine1VoltagePlant;
    }


    public void setMinigridLoadLine1VoltagePlant(String minigridLoadLine1VoltagePlant) {
        this.minigridLoadLine1VoltagePlant = minigridLoadLine1VoltagePlant;
    }


    public String getMinigridLoadLine1CurrentPlant() {
        return minigridLoadLine1CurrentPlant;
    }


    public void setMinigridLoadLine1CurrentPlant(String minigridLoadLine1CurrentPlant) {
        this.minigridLoadLine1CurrentPlant = minigridLoadLine1CurrentPlant;
    }


    public String getMinigridLoadLine1FrezInHzPlant() {
        return minigridLoadLine1FrezInHzPlant;
    }


    public void setMinigridLoadLine1FrezInHzPlant(String minigridLoadLine1FrezInHzPlant) {
        this.minigridLoadLine1FrezInHzPlant = minigridLoadLine1FrezInHzPlant;
    }


    public String getMinigridLoadLine1PfPlant() {
        return minigridLoadLine1PfPlant;
    }


    public void setMinigridLoadLine1PfPlant(String minigridLoadLine1PfPlant) {
        this.minigridLoadLine1PfPlant = minigridLoadLine1PfPlant;
    }


    public String getMinigridLoadLine1VoltageLine1() {
        return minigridLoadLine1VoltageLine1;
    }


    public void setMinigridLoadLine1VoltageLine1(String minigridLoadLine1VoltageLine1) {
        this.minigridLoadLine1VoltageLine1 = minigridLoadLine1VoltageLine1;
    }


    public String getMinigridLoadLine1CurrentLine1() {
        return minigridLoadLine1CurrentLine1;
    }


    public void setMinigridLoadLine1CurrentLine1(String minigridLoadLine1CurrentLine1) {
        this.minigridLoadLine1CurrentLine1 = minigridLoadLine1CurrentLine1;
    }


    public String getMinigridLoadLine1AvgPowerInKwLine1() {
        return minigridLoadLine1AvgPowerInKwLine1;
    }


    public void setMinigridLoadLine1AvgPowerInKwLine1(String minigridLoadLine1AvgPowerInKwLine1) {
        this.minigridLoadLine1AvgPowerInKwLine1 = minigridLoadLine1AvgPowerInKwLine1;
    }


    public String getMinigridLoadLine1PeakPowerInKwLine1() {
        return minigridLoadLine1PeakPowerInKwLine1;
    }


    public void setMinigridLoadLine1PeakPowerInKwLine1(String minigridLoadLine1PeakPowerInKwLine1) {
        this.minigridLoadLine1PeakPowerInKwLine1 = minigridLoadLine1PeakPowerInKwLine1;
    }


    public String getMinigridLoadLine1TrLossInPercentageLine1() {
        return minigridLoadLine1TrLossInPercentageLine1;
    }


    public void setMinigridLoadLine1TrLossInPercentageLine1(String minigridLoadLine1TrLossInPercentageLine1) {
        this.minigridLoadLine1TrLossInPercentageLine1 = minigridLoadLine1TrLossInPercentageLine1;
    }


    public String getMinigridLoadLine1OmcSuppliedHourDayLine1() {
        return minigridLoadLine1OmcSuppliedHourDayLine1;
    }


    public void setMinigridLoadLine1OmcSuppliedHourDayLine1(String minigridLoadLine1OmcSuppliedHourDayLine1) {
        this.minigridLoadLine1OmcSuppliedHourDayLine1 = minigridLoadLine1OmcSuppliedHourDayLine1;
    }


    public String getMinigridLoadLine1OmcSuppliedHourNightLine1() {
        return minigridLoadLine1OmcSuppliedHourNightLine1;
    }


    public void setMinigridLoadLine1OmcSuppliedHourNightLine1(String minigridLoadLine1OmcSuppliedHourNightLine1) {
        this.minigridLoadLine1OmcSuppliedHourNightLine1 = minigridLoadLine1OmcSuppliedHourNightLine1;
    }


    public String getMinigridLoadLine2Id() {
        return minigridLoadLine2Id;
    }


    public void setMinigridLoadLine2Id(String minigridLoadLine2Id) {
        this.minigridLoadLine2Id = minigridLoadLine2Id;
    }


    public String getMinigridLoadLine2VoltagePlant() {
        return minigridLoadLine2VoltagePlant;
    }


    public void setMinigridLoadLine2VoltagePlant(String minigridLoadLine2VoltagePlant) {
        this.minigridLoadLine2VoltagePlant = minigridLoadLine2VoltagePlant;
    }


    public String getMinigridLoadLine2CurrentPlant() {
        return minigridLoadLine2CurrentPlant;
    }


    public void setMinigridLoadLine2CurrentPlant(String minigridLoadLine2CurrentPlant) {
        this.minigridLoadLine2CurrentPlant = minigridLoadLine2CurrentPlant;
    }


    public String getMinigridLoadLine2FrezInHzPlant() {
        return minigridLoadLine2FrezInHzPlant;
    }


    public void setMinigridLoadLine2FrezInHzPlant(String minigridLoadLine2FrezInHzPlant) {
        this.minigridLoadLine2FrezInHzPlant = minigridLoadLine2FrezInHzPlant;
    }


    public String getMinigridLoadLine2PfPlant() {
        return minigridLoadLine2PfPlant;
    }


    public void setMinigridLoadLine2PfPlant(String minigridLoadLine2PfPlant) {
        this.minigridLoadLine2PfPlant = minigridLoadLine2PfPlant;
    }


    public String getMinigridLoadLine2VoltageLine2() {
        return minigridLoadLine2VoltageLine2;
    }


    public void setMinigridLoadLine2VoltageLine2(String minigridLoadLine2VoltageLine2) {
        this.minigridLoadLine2VoltageLine2 = minigridLoadLine2VoltageLine2;
    }


    public String getMinigridLoadLine2CurrentLine2() {
        return minigridLoadLine2CurrentLine2;
    }


    public void setMinigridLoadLine2CurrentLine2(String minigridLoadLine2CurrentLine2) {
        this.minigridLoadLine2CurrentLine2 = minigridLoadLine2CurrentLine2;
    }


    public String getMinigridLoadLine2AvgPowerInKwLine2() {
        return minigridLoadLine2AvgPowerInKwLine2;
    }


    public void setMinigridLoadLine2AvgPowerInKwLine2(String minigridLoadLine2AvgPowerInKwLine2) {
        this.minigridLoadLine2AvgPowerInKwLine2 = minigridLoadLine2AvgPowerInKwLine2;
    }


    public String getMinigridLoadLine2PeakPowerInKwLine2() {
        return minigridLoadLine2PeakPowerInKwLine2;
    }


    public void setMinigridLoadLine2PeakPowerInKwLine2(String minigridLoadLine2PeakPowerInKwLine2) {
        this.minigridLoadLine2PeakPowerInKwLine2 = minigridLoadLine2PeakPowerInKwLine2;
    }


    public String getMinigridLoadLine2TrLossInPercentageLine2() {
        return minigridLoadLine2TrLossInPercentageLine2;
    }


    public void setMinigridLoadLine2TrLossInPercentageLine2(String minigridLoadLine2TrLossInPercentageLine2) {
        this.minigridLoadLine2TrLossInPercentageLine2 = minigridLoadLine2TrLossInPercentageLine2;
    }


    public String getMinigridLoadLine2OmcSuppliedHourDayLine2() {
        return minigridLoadLine2OmcSuppliedHourDayLine2;
    }


    public void setMinigridLoadLine2OmcSuppliedHourDayLine2(String minigridLoadLine2OmcSuppliedHourDayLine2) {
        this.minigridLoadLine2OmcSuppliedHourDayLine2 = minigridLoadLine2OmcSuppliedHourDayLine2;
    }


    public String getMinigridLoadLine2OmcSuppliedHourNightLine2() {
        return minigridLoadLine2OmcSuppliedHourNightLine2;
    }


    public void setMinigridLoadLine2OmcSuppliedHourNightLine2(String minigridLoadLine2OmcSuppliedHourNightLine2) {
        this.minigridLoadLine2OmcSuppliedHourNightLine2 = minigridLoadLine2OmcSuppliedHourNightLine2;
    }


    public String getSubscriberLoadLimiter1DataChannel1CustomerId() {
        return SubscriberLoadLimiter1DataChannel1CustomerId;
    }


    public void setSubscriberLoadLimiter1DataChannel1CustomerId(String subscriberLoadLimiter1DataChannel1CustomerId) {
        SubscriberLoadLimiter1DataChannel1CustomerId = subscriberLoadLimiter1DataChannel1CustomerId;
    }


    public String getSubscriberLoadLimiter1DataChannel1Voltage() {
        return SubscriberLoadLimiter1DataChannel1Voltage;
    }


    public void setSubscriberLoadLimiter1DataChannel1Voltage(String subscriberLoadLimiter1DataChannel1Voltage) {
        SubscriberLoadLimiter1DataChannel1Voltage = subscriberLoadLimiter1DataChannel1Voltage;
    }


    public String getSubscriberLoadLimiter1DataChannel1Crrent() {
        return SubscriberLoadLimiter1DataChannel1Crrent;
    }


    public void setSubscriberLoadLimiter1DataChannel1Crrent(String subscriberLoadLimiter1DataChannel1Crrent) {
        SubscriberLoadLimiter1DataChannel1Crrent = subscriberLoadLimiter1DataChannel1Crrent;
    }


    public String getSubscriberLoadLimiter1DataChannel1Pf() {
        return SubscriberLoadLimiter1DataChannel1Pf;
    }


    public void setSubscriberLoadLimiter1DataChannel1Pf(String subscriberLoadLimiter1DataChannel1Pf) {
        SubscriberLoadLimiter1DataChannel1Pf = subscriberLoadLimiter1DataChannel1Pf;
    }


    public String getSubscriberLoadLimiter1DataChannel1AvgPowerInKw() {
        return SubscriberLoadLimiter1DataChannel1AvgPowerInKw;
    }


    public void setSubscriberLoadLimiter1DataChannel1AvgPowerInKw(String subscriberLoadLimiter1DataChannel1AvgPowerInKw) {
        SubscriberLoadLimiter1DataChannel1AvgPowerInKw = subscriberLoadLimiter1DataChannel1AvgPowerInKw;
    }


    public String getSubscriberLoadLimiter1DataChannel1PeakPowerInKw() {
        return SubscriberLoadLimiter1DataChannel1PeakPowerInKw;
    }


    public void setSubscriberLoadLimiter1DataChannel1PeakPowerInKw(String subscriberLoadLimiter1DataChannel1PeakPowerInKw) {
        SubscriberLoadLimiter1DataChannel1PeakPowerInKw = subscriberLoadLimiter1DataChannel1PeakPowerInKw;
    }


    public String getSubscriberLoadLimiter1DataChannel1OmcSuppliedHourInDay() {
        return SubscriberLoadLimiter1DataChannel1OmcSuppliedHourInDay;
    }


    public void setSubscriberLoadLimiter1DataChannel1OmcSuppliedHourInDay(String subscriberLoadLimiter1DataChannel1OmcSuppliedHourInDay) {
        SubscriberLoadLimiter1DataChannel1OmcSuppliedHourInDay = subscriberLoadLimiter1DataChannel1OmcSuppliedHourInDay;
    }


    public String getSubscriberLoadLimiter1DataChannel1OmcSuppliedHourInNight() {
        return SubscriberLoadLimiter1DataChannel1OmcSuppliedHourInNight;
    }


    public void setSubscriberLoadLimiter1DataChannel1OmcSuppliedHourInNight(String subscriberLoadLimiter1DataChannel1OmcSuppliedHourInNight) {
        SubscriberLoadLimiter1DataChannel1OmcSuppliedHourInNight = subscriberLoadLimiter1DataChannel1OmcSuppliedHourInNight;
    }


    public String getSubscriberLoadLimiter1DataChannelNCustomerId() {
        return SubscriberLoadLimiter1DataChannelNCustomerId;
    }


    public void setSubscriberLoadLimiter1DataChannelNCustomerId(String subscriberLoadLimiter1DataChannelNCustomerId) {
        SubscriberLoadLimiter1DataChannelNCustomerId = subscriberLoadLimiter1DataChannelNCustomerId;
    }


    public String getSubscriberLoadLimiter1DataChannelNVoltage() {
        return SubscriberLoadLimiter1DataChannelNVoltage;
    }


    public void setSubscriberLoadLimiter1DataChannelNVoltage(String subscriberLoadLimiter1DataChannelNVoltage) {
        SubscriberLoadLimiter1DataChannelNVoltage = subscriberLoadLimiter1DataChannelNVoltage;
    }


    public String getSubscriberLoadLimiter1DataChannelNCrrent() {
        return SubscriberLoadLimiter1DataChannelNCrrent;
    }


    public void setSubscriberLoadLimiter1DataChannelNCrrent(String subscriberLoadLimiter1DataChannelNCrrent) {
        SubscriberLoadLimiter1DataChannelNCrrent = subscriberLoadLimiter1DataChannelNCrrent;
    }


    public String getSubscriberLoadLimiter1DataChannelNPf() {
        return SubscriberLoadLimiter1DataChannelNPf;
    }


    public void setSubscriberLoadLimiter1DataChannelNPf(String subscriberLoadLimiter1DataChannelNPf) {
        SubscriberLoadLimiter1DataChannelNPf = subscriberLoadLimiter1DataChannelNPf;
    }


    public String getSubscriberLoadLimiter1DataChannelNAvgPowerInKw() {
        return SubscriberLoadLimiter1DataChannelNAvgPowerInKw;
    }


    public void setSubscriberLoadLimiter1DataChannelNAvgPowerInKw(String subscriberLoadLimiter1DataChannelNAvgPowerInKw) {
        SubscriberLoadLimiter1DataChannelNAvgPowerInKw = subscriberLoadLimiter1DataChannelNAvgPowerInKw;
    }


    public String getSubscriberLoadLimiter1DataChannelNPeakPowerInKw() {
        return SubscriberLoadLimiter1DataChannelNPeakPowerInKw;
    }


    public void setSubscriberLoadLimiter1DataChannelNPeakPowerInKw(String subscriberLoadLimiter1DataChannelNPeakPowerInKw) {
        SubscriberLoadLimiter1DataChannelNPeakPowerInKw = subscriberLoadLimiter1DataChannelNPeakPowerInKw;
    }


    public String getSubscriberLoadLimiter1DataChanneN1OmcSuppliedHourInDay() {
        return SubscriberLoadLimiter1DataChanneN1OmcSuppliedHourInDay;
    }


    public void setSubscriberLoadLimiter1DataChanneN1OmcSuppliedHourInDay(String subscriberLoadLimiter1DataChanneN1OmcSuppliedHourInDay) {
        SubscriberLoadLimiter1DataChanneN1OmcSuppliedHourInDay = subscriberLoadLimiter1DataChanneN1OmcSuppliedHourInDay;
    }


    public String getSubscriberLoadLimiter1DataChanneNOmcSuppliedHourInNight() {
        return SubscriberLoadLimiter1DataChanneNOmcSuppliedHourInNight;
    }


    public void setSubscriberLoadLimiter1DataChanneNOmcSuppliedHourInNight(String subscriberLoadLimiter1DataChanneNOmcSuppliedHourInNight) {
        SubscriberLoadLimiter1DataChanneNOmcSuppliedHourInNight = subscriberLoadLimiter1DataChanneNOmcSuppliedHourInNight;
    }


    public String getSubscriberLoadLimiterNDataChannel1CustomerId() {
        return SubscriberLoadLimiterNDataChannel1CustomerId;
    }


    public void setSubscriberLoadLimiterNDataChannel1CustomerId(String subscriberLoadLimiterNDataChannel1CustomerId) {
        SubscriberLoadLimiterNDataChannel1CustomerId = subscriberLoadLimiterNDataChannel1CustomerId;
    }


    public String getSubscriberLoadLimiterNDataChannel1Voltage() {
        return SubscriberLoadLimiterNDataChannel1Voltage;
    }


    public void setSubscriberLoadLimiterNDataChannel1Voltage(String subscriberLoadLimiterNDataChannel1Voltage) {
        SubscriberLoadLimiterNDataChannel1Voltage = subscriberLoadLimiterNDataChannel1Voltage;
    }


    public String getSubscriberLoadLimiterNDataChannel1Crrent() {
        return SubscriberLoadLimiterNDataChannel1Crrent;
    }


    public void setSubscriberLoadLimiterNDataChannel1Crrent(String subscriberLoadLimiterNDataChannel1Crrent) {
        SubscriberLoadLimiterNDataChannel1Crrent = subscriberLoadLimiterNDataChannel1Crrent;
    }


    public String getSubscriberLoadLimiterNDataChannel1Pf() {
        return SubscriberLoadLimiterNDataChannel1Pf;
    }


    public void setSubscriberLoadLimiterNDataChannel1Pf(String subscriberLoadLimiterNDataChannel1Pf) {
        SubscriberLoadLimiterNDataChannel1Pf = subscriberLoadLimiterNDataChannel1Pf;
    }


    public String getSubscriberLoadLimiterNDataChannel1AvgPowerInKw() {
        return SubscriberLoadLimiterNDataChannel1AvgPowerInKw;
    }


    public void setSubscriberLoadLimiterNDataChannel1AvgPowerInKw(String subscriberLoadLimiterNDataChannel1AvgPowerInKw) {
        SubscriberLoadLimiterNDataChannel1AvgPowerInKw = subscriberLoadLimiterNDataChannel1AvgPowerInKw;
    }


    public String getSubscriberLoadLimiterNDataChannel1PeakPowerInKw() {
        return SubscriberLoadLimiterNDataChannel1PeakPowerInKw;
    }


    public void setSubscriberLoadLimiterNDataChannel1PeakPowerInKw(String subscriberLoadLimiterNDataChannel1PeakPowerInKw) {
        SubscriberLoadLimiterNDataChannel1PeakPowerInKw = subscriberLoadLimiterNDataChannel1PeakPowerInKw;
    }


    public String getSubscriberLoadLimiterNDataChannel1OmcSuppliedHourInDay() {
        return SubscriberLoadLimiterNDataChannel1OmcSuppliedHourInDay;
    }


    public void setSubscriberLoadLimiterNDataChannel1OmcSuppliedHourInDay(String subscriberLoadLimiterNDataChannel1OmcSuppliedHourInDay) {
        SubscriberLoadLimiterNDataChannel1OmcSuppliedHourInDay = subscriberLoadLimiterNDataChannel1OmcSuppliedHourInDay;
    }


    public String getSubscriberLoadLimiterNDataChannel1OmcSuppliedHourInNight() {
        return SubscriberLoadLimiterNDataChannel1OmcSuppliedHourInNight;
    }


    public void setSubscriberLoadLimiterNDataChannel1OmcSuppliedHourInNight(String subscriberLoadLimiterNDataChannel1OmcSuppliedHourInNight) {
        SubscriberLoadLimiterNDataChannel1OmcSuppliedHourInNight = subscriberLoadLimiterNDataChannel1OmcSuppliedHourInNight;
    }


    public String getSubscriberLoadLimiterNDataChannelNCustomerId() {
        return SubscriberLoadLimiterNDataChannelNCustomerId;
    }


    public void setSubscriberLoadLimiterNDataChannelNCustomerId(String subscriberLoadLimiterNDataChannelNCustomerId) {
        SubscriberLoadLimiterNDataChannelNCustomerId = subscriberLoadLimiterNDataChannelNCustomerId;
    }


    public String getSubscriberLoadLimiterNDataChannelNVoltage() {
        return SubscriberLoadLimiterNDataChannelNVoltage;
    }


    public void setSubscriberLoadLimiterNDataChannelNVoltage(String subscriberLoadLimiterNDataChannelNVoltage) {
        SubscriberLoadLimiterNDataChannelNVoltage = subscriberLoadLimiterNDataChannelNVoltage;
    }


    public String getSubscriberLoadLimiterNDataChannelNCrrent() {
        return SubscriberLoadLimiterNDataChannelNCrrent;
    }


    public void setSubscriberLoadLimiterNDataChannelNCrrent(String subscriberLoadLimiterNDataChannelNCrrent) {
        SubscriberLoadLimiterNDataChannelNCrrent = subscriberLoadLimiterNDataChannelNCrrent;
    }


    public String getSubscriberLoadLimiterNDataChannelNPf() {
        return SubscriberLoadLimiterNDataChannelNPf;
    }


    public void setSubscriberLoadLimiterNDataChannelNPf(String subscriberLoadLimiterNDataChannelNPf) {
        SubscriberLoadLimiterNDataChannelNPf = subscriberLoadLimiterNDataChannelNPf;
    }


    public String getSubscriberLoadLimiterNDataChannelNAvgPowerInKw() {
        return SubscriberLoadLimiterNDataChannelNAvgPowerInKw;
    }


    public void setSubscriberLoadLimiterNDataChannelNAvgPowerInKw(String subscriberLoadLimiterNDataChannelNAvgPowerInKw) {
        SubscriberLoadLimiterNDataChannelNAvgPowerInKw = subscriberLoadLimiterNDataChannelNAvgPowerInKw;
    }


    public String getSubscriberLoadLimiterNDataChannelNPeakPowerInKw() {
        return SubscriberLoadLimiterNDataChannelNPeakPowerInKw;
    }


    public void setSubscriberLoadLimiterNDataChannelNPeakPowerInKw(String subscriberLoadLimiterNDataChannelNPeakPowerInKw) {
        SubscriberLoadLimiterNDataChannelNPeakPowerInKw = subscriberLoadLimiterNDataChannelNPeakPowerInKw;
    }


    public String getSubscriberLoadLimiterNDataChanneN1OmcSuppliedHourInDay() {
        return SubscriberLoadLimiterNDataChanneN1OmcSuppliedHourInDay;
    }


    public void setSubscriberLoadLimiterNDataChanneN1OmcSuppliedHourInDay(String subscriberLoadLimiterNDataChanneN1OmcSuppliedHourInDay) {
        SubscriberLoadLimiterNDataChanneN1OmcSuppliedHourInDay = subscriberLoadLimiterNDataChanneN1OmcSuppliedHourInDay;
    }


    public String getSubscriberLoadLimiterNDataChanneNOmcSuppliedHourInNight() {
        return SubscriberLoadLimiterNDataChanneNOmcSuppliedHourInNight;
    }


    public void setSubscriberLoadLimiterNDataChanneNOmcSuppliedHourInNight(String subscriberLoadLimiterNDataChanneNOmcSuppliedHourInNight) {
        SubscriberLoadLimiterNDataChanneNOmcSuppliedHourInNight = subscriberLoadLimiterNDataChanneNOmcSuppliedHourInNight;
    }


    public String getEnergyMeterDataMeter1CustomerId() {
        return energyMeterDataMeter1CustomerId;
    }


    public void setEnergyMeterDataMeter1CustomerId(String energyMeterDataMeter1CustomerId) {
        this.energyMeterDataMeter1CustomerId = energyMeterDataMeter1CustomerId;
    }


    public String getEnergyMeterDataMeter1Voltage() {
        return energyMeterDataMeter1Voltage;
    }


    public void setEnergyMeterDataMeter1Voltage(String energyMeterDataMeter1Voltage) {
        this.energyMeterDataMeter1Voltage = energyMeterDataMeter1Voltage;
    }


    public String getEnergyMeterDataMeter1Current() {
        return energyMeterDataMeter1Current;
    }


    public void setEnergyMeterDataMeter1Current(String energyMeterDataMeter1Current) {
        this.energyMeterDataMeter1Current = energyMeterDataMeter1Current;
    }


    public String getEnergyMeterDataMeter1Pf() {
        return energyMeterDataMeter1Pf;
    }


    public void setEnergyMeterDataMeter1Pf(String energyMeterDataMeter1Pf) {
        this.energyMeterDataMeter1Pf = energyMeterDataMeter1Pf;
    }


    public String getEnergyMeterDataMeter1AvgPowerInKw() {
        return energyMeterDataMeter1AvgPowerInKw;
    }


    public void setEnergyMeterDataMeter1AvgPowerInKw(String energyMeterDataMeter1AvgPowerInKw) {
        this.energyMeterDataMeter1AvgPowerInKw = energyMeterDataMeter1AvgPowerInKw;
    }


    public String getEnergyMeterDataMeter1PeakPowerInKw() {
        return energyMeterDataMeter1PeakPowerInKw;
    }


    public void setEnergyMeterDataMeter1PeakPowerInKw(String energyMeterDataMeter1PeakPowerInKw) {
        this.energyMeterDataMeter1PeakPowerInKw = energyMeterDataMeter1PeakPowerInKw;
    }


    public String getEnergyMeterDataMeter1OmcsuppliedHourInDay() {
        return energyMeterDataMeter1OmcsuppliedHourInDay;
    }


    public void setEnergyMeterDataMeter1OmcsuppliedHourInDay(String energyMeterDataMeter1OmcsuppliedHourInDay) {
        this.energyMeterDataMeter1OmcsuppliedHourInDay = energyMeterDataMeter1OmcsuppliedHourInDay;
    }


    public String getEnergyMeterDataMeter1OmcsuppliedHourInNight() {
        return energyMeterDataMeter1OmcsuppliedHourInNight;
    }


    public void setEnergyMeterDataMeter1OmcsuppliedHourInNight(String energyMeterDataMeter1OmcsuppliedHourInNight) {
        this.energyMeterDataMeter1OmcsuppliedHourInNight = energyMeterDataMeter1OmcsuppliedHourInNight;
    }


    public String getEnergyMeterDataMeterNCustomerId() {
        return energyMeterDataMeterNCustomerId;
    }


    public void setEnergyMeterDataMeterNCustomerId(String energyMeterDataMeterNCustomerId) {
        this.energyMeterDataMeterNCustomerId = energyMeterDataMeterNCustomerId;
    }


    public String getEnergyMeterDataMeterNVoltage() {
        return energyMeterDataMeterNVoltage;
    }


    public void setEnergyMeterDataMeterNVoltage(String energyMeterDataMeterNVoltage) {
        this.energyMeterDataMeterNVoltage = energyMeterDataMeterNVoltage;
    }


    public String getEnergyMeterDataMeterNCurrent() {
        return energyMeterDataMeterNCurrent;
    }


    public void setEnergyMeterDataMeterNCurrent(String energyMeterDataMeterNCurrent) {
        this.energyMeterDataMeterNCurrent = energyMeterDataMeterNCurrent;
    }


    public String getEnergyMeterDataMeterNPf() {
        return energyMeterDataMeterNPf;
    }


    public void setEnergyMeterDataMeterNPf(String energyMeterDataMeterNPf) {
        this.energyMeterDataMeterNPf = energyMeterDataMeterNPf;
    }


    public String getEnergyMeterDataMeterNAvgPowerInKw() {
        return energyMeterDataMeterNAvgPowerInKw;
    }


    public void setEnergyMeterDataMeterNAvgPowerInKw(String energyMeterDataMeterNAvgPowerInKw) {
        this.energyMeterDataMeterNAvgPowerInKw = energyMeterDataMeterNAvgPowerInKw;
    }


    public String getEnergyMeterDataMeterNPeakPowerInKw() {
        return energyMeterDataMeterNPeakPowerInKw;
    }


    public void setEnergyMeterDataMeterNPeakPowerInKw(String energyMeterDataMeterNPeakPowerInKw) {
        this.energyMeterDataMeterNPeakPowerInKw = energyMeterDataMeterNPeakPowerInKw;
    }


    public String getEnergyMeterDataMeterNOmcsuppliedHourInDay() {
        return energyMeterDataMeterNOmcsuppliedHourInDay;
    }


    public void setEnergyMeterDataMeterNOmcsuppliedHourInDay(String energyMeterDataMeterNOmcsuppliedHourInDay) {
        this.energyMeterDataMeterNOmcsuppliedHourInDay = energyMeterDataMeterNOmcsuppliedHourInDay;
    }


    public String getEnergyMeterDataMeterNOmcsuppliedHourInNight() {
        return energyMeterDataMeterNOmcsuppliedHourInNight;
    }


    public void setEnergyMeterDataMeterNOmcsuppliedHourInNight(String energyMeterDataMeterNOmcsuppliedHourInNight) {
        this.energyMeterDataMeterNOmcsuppliedHourInNight = energyMeterDataMeterNOmcsuppliedHourInNight;
    }


    public String getParameterSettingBulkVoltage() {
        return parameterSettingBulkVoltage;
    }


    public void setParameterSettingBulkVoltage(String parameterSettingBulkVoltage) {
        this.parameterSettingBulkVoltage = parameterSettingBulkVoltage;
    }


    public String getParameterSettingFloatVoltage() {
        return parameterSettingFloatVoltage;
    }


    public void setParameterSettingFloatVoltage(String parameterSettingFloatVoltage) {
        this.parameterSettingFloatVoltage = parameterSettingFloatVoltage;
    }


    public String getParameterSettingForceDgstart() {
        return parameterSettingForceDgstart;
    }


    public void setParameterSettingForceDgstart(String parameterSettingForceDgstart) {
        this.parameterSettingForceDgstart = parameterSettingForceDgstart;
    }


    public String getParameterSettingDgRunTimeHours() {
        return parameterSettingDgRunTimeHours;
    }


    public void setParameterSettingDgRunTimeHours(String parameterSettingDgRunTimeHours) {
        this.parameterSettingDgRunTimeHours = parameterSettingDgRunTimeHours;
    }


    public String getParameterSettingDgStartVoltage() {
        return parameterSettingDgStartVoltage;
    }


    public void setParameterSettingDgStartVoltage(String parameterSettingDgStartVoltage) {
        this.parameterSettingDgStartVoltage = parameterSettingDgStartVoltage;
    }


    public String getParameterSettingAcchargeStartVoltage() {
        return parameterSettingAcchargeStartVoltage;
    }


    public void setParameterSettingAcchargeStartVoltage(String parameterSettingAcchargeStartVoltage) {
        this.parameterSettingAcchargeStartVoltage = parameterSettingAcchargeStartVoltage;
    }


    public String getParameterSettingMinThreshOldInWatt() {
        return parameterSettingMinThreshOldInWatt;
    }


    public void setParameterSettingMinThreshOldInWatt(String parameterSettingMinThreshOldInWatt) {
        this.parameterSettingMinThreshOldInWatt = parameterSettingMinThreshOldInWatt;
    }


    public String getParameterSettingMaxPowerInWatt() {
        return parameterSettingMaxPowerInWatt;
    }


    public void setParameterSettingMaxPowerInWatt(String parameterSettingMaxPowerInWatt) {
        this.parameterSettingMaxPowerInWatt = parameterSettingMaxPowerInWatt;
    }


    public String getParameterSettingSolar() {
        return parameterSettingSolar;
    }


    public void setParameterSettingSolar(String parameterSettingSolar) {
        this.parameterSettingSolar = parameterSettingSolar;
    }


    public String getParameterSettingChargingCurrentDg() {
        return parameterSettingChargingCurrentDg;
    }


    public void setParameterSettingChargingCurrentDg(String parameterSettingChargingCurrentDg) {
        this.parameterSettingChargingCurrentDg = parameterSettingChargingCurrentDg;
    }


    public String getParameterSettingSoftBlvd() {
        return parameterSettingSoftBlvd;
    }


    public void setParameterSettingSoftBlvd(String parameterSettingSoftBlvd) {
        this.parameterSettingSoftBlvd = parameterSettingSoftBlvd;
    }


    public String getParameterSettingBattCapInKwh() {
        return parameterSettingBattCapInKwh;
    }


    public void setParameterSettingBattCapInKwh(String parameterSettingBattCapInKwh) {
        this.parameterSettingBattCapInKwh = parameterSettingBattCapInKwh;
    }


    public String getParameterSettingAbsorbTime() {
        return parameterSettingAbsorbTime;
    }


    public void setParameterSettingAbsorbTime(String parameterSettingAbsorbTime) {
        this.parameterSettingAbsorbTime = parameterSettingAbsorbTime;
    }


    public String getParameterSettingAbsorbVoltage() {
        return parameterSettingAbsorbVoltage;
    }


    public void setParameterSettingAbsorbVoltage(String parameterSettingAbsorbVoltage) {
        this.parameterSettingAbsorbVoltage = parameterSettingAbsorbVoltage;
    }


    public String getParameterSettingForceMinigridONOFFTrigger() {
        return parameterSettingForceMinigridONOFFTrigger;
    }


    public void setParameterSettingForceMinigridONOFFTrigger(String parameterSettingForceMinigridONOFFTrigger) {
        this.parameterSettingForceMinigridONOFFTrigger = parameterSettingForceMinigridONOFFTrigger;
    }


    public String getParameterSettingOthers() {
        return parameterSettingOthers;
    }


    public void setParameterSettingOthers(String parameterSettingOthers) {
        this.parameterSettingOthers = parameterSettingOthers;
    }


    @Override
    public String toString() {
        return "TemplateData [serialId=" + serialId + ", sNo=" + sNo + ", omcSiteId=" + omcSiteId + ", siteName=" + siteName + ", abhName=" + abhName
                + ", cbhName=" + cbhName + ", fsoName=" + fsoName + ", plantExecutive=" + plantExecutive + ", solarCapInKwh=" + solarCapInKwh + ", invCapInKw="
                + invCapInKw + ", rectifierCapInKw=" + rectifierCapInKw + ", dgCapInKva=" + dgCapInKva + ", battCapInKwh=" + battCapInKwh + ", noOfSll="
                + noOfSll + ", noOfPoles=" + noOfPoles + ", noOfRccb=" + noOfRccb + ", noOfKits=" + noOfKits + ", noOfCustomer=" + noOfCustomer
                + ", sdMppt1Voltage=" + sdMppt1Voltage + ", sdMppt1Crrent=" + sdMppt1Crrent + ", sdMppt1PowerInKw=" + sdMppt1PowerInKw
                + ", sdMppt1SolarGenInKwh=" + sdMppt1SolarGenInKwh + ", sdMppt2Voltage=" + sdMppt2Voltage + ", sdMppt2Crrent=" + sdMppt2Crrent
                + ", sdMppt2PowerInKw=" + sdMppt2PowerInKw + ", sdMppt2SolarGenInKwh=" + sdMppt2SolarGenInKwh + ", sdString1Voltage=" + sdString1Voltage
                + ", sdString1Crrent=" + sdString1Crrent + ", sdString1PowerInKw=" + sdString1PowerInKw + ", sdString1SolarGenInKwh=" + sdString1SolarGenInKwh
                + ", sdString2Voltage=" + sdString2Voltage + ", sdString2Crrent=" + sdString2Crrent + ", sdString2PowerInKw=" + sdString2PowerInKw
                + ", sdString2SolarGenInKwh=" + sdString2SolarGenInKwh + ", sdTotalSolarGenInKwh=" + sdTotalSolarGenInKwh + ", sdTotalSolarGenInfactor="
                + sdTotalSolarGenInfactor + ", bdBank1ChargeCurrent=" + bdBank1ChargeCurrent + ", bdBank1ChargeVoltage=" + bdBank1ChargeVoltage
                + ", bdBank1ChargePowerInKwh=" + bdBank1ChargePowerInKwh + ", bdBank1DisChargeCurrent=" + bdBank1DisChargeCurrent + ", bdBank1DisChargeVoltage="
                + bdBank1DisChargeVoltage + ", bdBank1DisChargePowerInKwh=" + bdBank1DisChargePowerInKwh + ", bdBank2ChargeCurrent=" + bdBank2ChargeCurrent
                + ", bdBank2ChargeVoltage=" + bdBank2ChargeVoltage + ", bdBank2ChargePowerInKwh=" + bdBank2ChargePowerInKwh + ", bdBank2DisChargeCurrent="
                + bdBank2DisChargeCurrent + ", bdBank2DisChargeVoltage=" + bdBank2DisChargeVoltage + ", bdBank2DisChargePowerInKwh="
                + bdBank2DisChargePowerInKwh + ", bdString1ChargeCurrent=" + bdString1ChargeCurrent + ", bdString1ChargeVoltage=" + bdString1ChargeVoltage
                + ", bdString1ChargePowerInKwh=" + bdString1ChargePowerInKwh + ", bdString1DisChargeCurrent=" + bdString1DisChargeCurrent
                + ", bdString1DisChargeVoltage=" + bdString1DisChargeVoltage + ", bdString1DisChargePowerInKwh=" + bdString1DisChargePowerInKwh
                + ", bdString2ChargeCurrent=" + bdString2ChargeCurrent + ", bdString2ChargeVoltage=" + bdString2ChargeVoltage + ", bdString2ChargePowerInKwh="
                + bdString2ChargePowerInKwh + ", bdString2DisChargeCurrent=" + bdString2DisChargeCurrent + ", bdString2DisChargeVoltage="
                + bdString2DisChargeVoltage + ", bdString2DisChargePowerInKwh=" + bdString2DisChargePowerInKwh + ", bdOthersBattSocInPercentage="
                + bdOthersBattSocInPercentage + ", bdOthersBattBlvd=" + bdOthersBattBlvd + ", bdOthersTempBattRoom=" + bdOthersTempBattRoom
                + ", bdOthersHumidityBattRoom=" + bdOthersHumidityBattRoom + ", dgDataPhase1BatteryVoltage=" + dgDataPhase1BatteryVoltage
                + ", dgDataPhase1BatteryCurrent=" + dgDataPhase1BatteryCurrent + ", dgDataPhase1LoadVoltage=" + dgDataPhase1LoadVoltage
                + ", dgDataPhase1LoadCurrent=" + dgDataPhase1LoadCurrent + ", dgDataPhase2BatteryVoltage=" + dgDataPhase2BatteryVoltage
                + ", dgDataPhase2BatteryCurrent=" + dgDataPhase2BatteryCurrent + ", dgDataPhase2LoadVoltage=" + dgDataPhase2LoadVoltage
                + ", dgDataPhase2LoadCurrent=" + dgDataPhase2LoadCurrent + ", dgDataPhase3BatteryVoltage=" + dgDataPhase3BatteryVoltage
                + ", dgDataPhase3BatteryCurrent=" + dgDataPhase3BatteryCurrent + ", dgDataPhase3LoadVoltage=" + dgDataPhase3LoadVoltage
                + ", dgDataPhase3LoadCurrent=" + dgDataPhase3LoadCurrent + ", dgDataTotalAllPhase3BateryCurrent=" + dgDataTotalAllPhase3BateryCurrent
                + ", dgDataTotalAllPhase3BateryVoltage=" + dgDataTotalAllPhase3BateryVoltage + ", dgDataTotalAllPhase3LoadCurrent="
                + dgDataTotalAllPhase3LoadCurrent + ", dgDataTotalAllPhase3LoadVoltage=" + dgDataTotalAllPhase3LoadVoltage + ", dgOtherDgDataFrezInHz="
                + dgOtherDgDataFrezInHz + ", dgOtherDgDataPf=" + dgOtherDgDataPf + ", dgOtherDgDataBattVoltage=" + dgOtherDgDataBattVoltage
                + ", dgOtherDgDataFuelLevelInLiter=" + dgOtherDgDataFuelLevelInLiter + ", dgOtherDgDataRms=" + dgOtherDgDataRms + ", dgOtherDgDataOilPresure="
                + dgOtherDgDataOilPresure + ", dgOtherDgDataCoolentLevel=" + dgOtherDgDataCoolentLevel + ", dgOtherDgDataMobileDg=" + dgOtherDgDataMobileDg
                + ", telecomDataLoadTower1VoltagePlant=" + telecomDataLoadTower1VoltagePlant + ", telecomDataLoadTower1CrrentPlant="
                + telecomDataLoadTower1CrrentPlant + ", telecomDataLoadTower1FrezInHz=" + telecomDataLoadTower1FrezInHz + ", telecomDataLoadTower1Pf="
                + telecomDataLoadTower1Pf + ", telecomDataLoadTower1VoltageTower1=" + telecomDataLoadTower1VoltageTower1
                + ", telecomDataLoadTower1CrrentTower1=" + telecomDataLoadTower1CrrentTower1 + ", telecomDataLoadTower1OmcSupplyDayHour="
                + telecomDataLoadTower1OmcSupplyDayHour + ", telecomDataLoadTower1OmcSupplyNightHour=" + telecomDataLoadTower1OmcSupplyNightHour
                + ", telecomDataLoadTower2VoltagePlant=" + telecomDataLoadTower2VoltagePlant + ", telecomDataLoadTower2CrrentPlant="
                + telecomDataLoadTower2CrrentPlant + ", telecomDataLoadTower2FrezInHz=" + telecomDataLoadTower2FrezInHz + ", telecomDataLoadTower2Pf="
                + telecomDataLoadTower2Pf + ", telecomDataLoadTower2VoltageTower2=" + telecomDataLoadTower2VoltageTower2
                + ", telecomDataLoadTower2CrrentTower2=" + telecomDataLoadTower2CrrentTower2 + ", telecomDataLoadTower2OmcSupplyDayHour="
                + telecomDataLoadTower2OmcSupplyDayHour + ", telecomDataLoadTower2OmcSupplyNightHour=" + telecomDataLoadTower2OmcSupplyNightHour
                + ", minigridLoadLine1Id=" + minigridLoadLine1Id + ", minigridLoadLine1VoltagePlant=" + minigridLoadLine1VoltagePlant
                + ", minigridLoadLine1CurrentPlant=" + minigridLoadLine1CurrentPlant + ", minigridLoadLine1FrezInHzPlant=" + minigridLoadLine1FrezInHzPlant
                + ", minigridLoadLine1PfPlant=" + minigridLoadLine1PfPlant + ", minigridLoadLine1VoltageLine1=" + minigridLoadLine1VoltageLine1
                + ", minigridLoadLine1CurrentLine1=" + minigridLoadLine1CurrentLine1 + ", minigridLoadLine1AvgPowerInKwLine1="
                + minigridLoadLine1AvgPowerInKwLine1 + ", minigridLoadLine1PeakPowerInKwLine1=" + minigridLoadLine1PeakPowerInKwLine1
                + ", minigridLoadLine1TrLossInPercentageLine1=" + minigridLoadLine1TrLossInPercentageLine1 + ", minigridLoadLine1OmcSuppliedHourDayLine1="
                + minigridLoadLine1OmcSuppliedHourDayLine1 + ", minigridLoadLine1OmcSuppliedHourNightLine1=" + minigridLoadLine1OmcSuppliedHourNightLine1
                + ", minigridLoadLine2Id=" + minigridLoadLine2Id + ", minigridLoadLine2VoltagePlant=" + minigridLoadLine2VoltagePlant
                + ", minigridLoadLine2CurrentPlant=" + minigridLoadLine2CurrentPlant + ", minigridLoadLine2FrezInHzPlant=" + minigridLoadLine2FrezInHzPlant
                + ", minigridLoadLine2PfPlant=" + minigridLoadLine2PfPlant + ", minigridLoadLine2VoltageLine2=" + minigridLoadLine2VoltageLine2
                + ", minigridLoadLine2CurrentLine2=" + minigridLoadLine2CurrentLine2 + ", minigridLoadLine2AvgPowerInKwLine2="
                + minigridLoadLine2AvgPowerInKwLine2 + ", minigridLoadLine2PeakPowerInKwLine2=" + minigridLoadLine2PeakPowerInKwLine2
                + ", minigridLoadLine2TrLossInPercentageLine2=" + minigridLoadLine2TrLossInPercentageLine2 + ", minigridLoadLine2OmcSuppliedHourDayLine2="
                + minigridLoadLine2OmcSuppliedHourDayLine2 + ", minigridLoadLine2OmcSuppliedHourNightLine2=" + minigridLoadLine2OmcSuppliedHourNightLine2
                + ", SubscriberLoadLimiter1DataChannel1CustomerId=" + SubscriberLoadLimiter1DataChannel1CustomerId
                + ", SubscriberLoadLimiter1DataChannel1Voltage=" + SubscriberLoadLimiter1DataChannel1Voltage + ", SubscriberLoadLimiter1DataChannel1Crrent="
                + SubscriberLoadLimiter1DataChannel1Crrent + ", SubscriberLoadLimiter1DataChannel1Pf=" + SubscriberLoadLimiter1DataChannel1Pf
                + ", SubscriberLoadLimiter1DataChannel1AvgPowerInKw=" + SubscriberLoadLimiter1DataChannel1AvgPowerInKw
                + ", SubscriberLoadLimiter1DataChannel1PeakPowerInKw=" + SubscriberLoadLimiter1DataChannel1PeakPowerInKw
                + ", SubscriberLoadLimiter1DataChannel1OmcSuppliedHourInDay=" + SubscriberLoadLimiter1DataChannel1OmcSuppliedHourInDay
                + ", SubscriberLoadLimiter1DataChannel1OmcSuppliedHourInNight=" + SubscriberLoadLimiter1DataChannel1OmcSuppliedHourInNight
                + ", SubscriberLoadLimiter1DataChannelNCustomerId=" + SubscriberLoadLimiter1DataChannelNCustomerId
                + ", SubscriberLoadLimiter1DataChannelNVoltage=" + SubscriberLoadLimiter1DataChannelNVoltage + ", SubscriberLoadLimiter1DataChannelNCrrent="
                + SubscriberLoadLimiter1DataChannelNCrrent + ", SubscriberLoadLimiter1DataChannelNPf=" + SubscriberLoadLimiter1DataChannelNPf
                + ", SubscriberLoadLimiter1DataChannelNAvgPowerInKw=" + SubscriberLoadLimiter1DataChannelNAvgPowerInKw
                + ", SubscriberLoadLimiter1DataChannelNPeakPowerInKw=" + SubscriberLoadLimiter1DataChannelNPeakPowerInKw
                + ", SubscriberLoadLimiter1DataChanneN1OmcSuppliedHourInDay=" + SubscriberLoadLimiter1DataChanneN1OmcSuppliedHourInDay
                + ", SubscriberLoadLimiter1DataChanneNOmcSuppliedHourInNight=" + SubscriberLoadLimiter1DataChanneNOmcSuppliedHourInNight
                + ", SubscriberLoadLimiterNDataChannel1CustomerId=" + SubscriberLoadLimiterNDataChannel1CustomerId
                + ", SubscriberLoadLimiterNDataChannel1Voltage=" + SubscriberLoadLimiterNDataChannel1Voltage + ", SubscriberLoadLimiterNDataChannel1Crrent="
                + SubscriberLoadLimiterNDataChannel1Crrent + ", SubscriberLoadLimiterNDataChannel1Pf=" + SubscriberLoadLimiterNDataChannel1Pf
                + ", SubscriberLoadLimiterNDataChannel1AvgPowerInKw=" + SubscriberLoadLimiterNDataChannel1AvgPowerInKw
                + ", SubscriberLoadLimiterNDataChannel1PeakPowerInKw=" + SubscriberLoadLimiterNDataChannel1PeakPowerInKw
                + ", SubscriberLoadLimiterNDataChannel1OmcSuppliedHourInDay=" + SubscriberLoadLimiterNDataChannel1OmcSuppliedHourInDay
                + ", SubscriberLoadLimiterNDataChannel1OmcSuppliedHourInNight=" + SubscriberLoadLimiterNDataChannel1OmcSuppliedHourInNight
                + ", SubscriberLoadLimiterNDataChannelNCustomerId=" + SubscriberLoadLimiterNDataChannelNCustomerId
                + ", SubscriberLoadLimiterNDataChannelNVoltage=" + SubscriberLoadLimiterNDataChannelNVoltage + ", SubscriberLoadLimiterNDataChannelNCrrent="
                + SubscriberLoadLimiterNDataChannelNCrrent + ", SubscriberLoadLimiterNDataChannelNPf=" + SubscriberLoadLimiterNDataChannelNPf
                + ", SubscriberLoadLimiterNDataChannelNAvgPowerInKw=" + SubscriberLoadLimiterNDataChannelNAvgPowerInKw
                + ", SubscriberLoadLimiterNDataChannelNPeakPowerInKw=" + SubscriberLoadLimiterNDataChannelNPeakPowerInKw
                + ", SubscriberLoadLimiterNDataChanneN1OmcSuppliedHourInDay=" + SubscriberLoadLimiterNDataChanneN1OmcSuppliedHourInDay
                + ", SubscriberLoadLimiterNDataChanneNOmcSuppliedHourInNight=" + SubscriberLoadLimiterNDataChanneNOmcSuppliedHourInNight
                + ", energyMeterDataMeter1CustomerId=" + energyMeterDataMeter1CustomerId + ", energyMeterDataMeter1Voltage=" + energyMeterDataMeter1Voltage
                + ", energyMeterDataMeter1Current=" + energyMeterDataMeter1Current + ", energyMeterDataMeter1Pf=" + energyMeterDataMeter1Pf
                + ", energyMeterDataMeter1AvgPowerInKw=" + energyMeterDataMeter1AvgPowerInKw + ", energyMeterDataMeter1PeakPowerInKw="
                + energyMeterDataMeter1PeakPowerInKw + ", energyMeterDataMeter1OmcsuppliedHourInDay=" + energyMeterDataMeter1OmcsuppliedHourInDay
                + ", energyMeterDataMeter1OmcsuppliedHourInNight=" + energyMeterDataMeter1OmcsuppliedHourInNight + ", energyMeterDataMeterNCustomerId="
                + energyMeterDataMeterNCustomerId + ", energyMeterDataMeterNVoltage=" + energyMeterDataMeterNVoltage + ", energyMeterDataMeterNCurrent="
                + energyMeterDataMeterNCurrent + ", energyMeterDataMeterNPf=" + energyMeterDataMeterNPf + ", energyMeterDataMeterNAvgPowerInKw="
                + energyMeterDataMeterNAvgPowerInKw + ", energyMeterDataMeterNPeakPowerInKw=" + energyMeterDataMeterNPeakPowerInKw
                + ", energyMeterDataMeterNOmcsuppliedHourInDay=" + energyMeterDataMeterNOmcsuppliedHourInDay + ", energyMeterDataMeterNOmcsuppliedHourInNight="
                + energyMeterDataMeterNOmcsuppliedHourInNight + ", parameterSettingBulkVoltage=" + parameterSettingBulkVoltage
                + ", parameterSettingFloatVoltage=" + parameterSettingFloatVoltage + ", parameterSettingForceDgstart=" + parameterSettingForceDgstart
                + ", parameterSettingDgRunTimeHours=" + parameterSettingDgRunTimeHours + ", parameterSettingDgStartVoltage=" + parameterSettingDgStartVoltage
                + ", parameterSettingAcchargeStartVoltage=" + parameterSettingAcchargeStartVoltage + ", parameterSettingMinThreshOldInWatt="
                + parameterSettingMinThreshOldInWatt + ", parameterSettingMaxPowerInWatt=" + parameterSettingMaxPowerInWatt + ", parameterSettingSolar="
                + parameterSettingSolar + ", parameterSettingChargingCurrentDg=" + parameterSettingChargingCurrentDg + ", parameterSettingSoftBlvd="
                + parameterSettingSoftBlvd + ", parameterSettingBattCapInKwh=" + parameterSettingBattCapInKwh + ", parameterSettingAbsorbTime="
                + parameterSettingAbsorbTime + ", parameterSettingAbsorbVoltage=" + parameterSettingAbsorbVoltage
                + ", parameterSettingForceMinigridONOFFTrigger=" + parameterSettingForceMinigridONOFFTrigger + ", parameterSettingOthers="
                + parameterSettingOthers + "]";
    }

}
