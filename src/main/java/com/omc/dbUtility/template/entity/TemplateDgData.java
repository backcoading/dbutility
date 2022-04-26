package com.omc.dbUtility.template.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="template_dg_data")
public class TemplateDgData {
	
	 @Column(name = "rd_id")
	 @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "omc_id")
    private int omcId;

    @Column(name = "plant_id")
    private int plantId;

   	@Temporal(TemporalType.TIMESTAMP)
      @Column(name="eventTimeStamp")
      private Date eventTimeStamp; 
 	
      @Column(name = "created_on")
      private Date createdOn;

      @Column(name = "created_by")
      private String createdBy;
 	
      @Column(name = "dg_company")
 	   private String dgCompany;
 	
 	 @Column(name = "dg_phase1_batt_voltage")
     private BigDecimal dgPhase1BattVoltage;
 	 
 	 @Column(name = "dg_current_meter_reading")
     private BigDecimal dgCurrentMeterReading;

     public BigDecimal getDgCurrentMeterReading() {
		return dgCurrentMeterReading;
	}

	public void setDgCurrentMeterReading(BigDecimal dgCurrentMeterReading) {
		this.dgCurrentMeterReading = dgCurrentMeterReading;
	}

	@Column(name = "dg_phase1_batt_current_amp")
     private BigDecimal dgPhase1BattCurrentAmp;

     @Column(name = "dg_phase1_batt_power_kw")
     private BigDecimal dgPhase1BattPowerKw;

     @Column(name = "dg_phase1_batt_total_power_kwh")
     private BigDecimal dgPhase1BattTotalPowerKwh;

     @Column(name = "dg_phase1_load_voltage")
     private BigDecimal dgPhase1LoadVoltage;

     @Column(name = "dg_phase1_load_current_amp")
     private BigDecimal dgPhase1LoadCurrentAmp;

     @Column(name = "dg_phase1_load_power_kw")
     private BigDecimal dgPhase1LoadPowerKw;

     @Column(name = "dg_phase1_load_total_power_kwh")
     private BigDecimal dgPhase1LoadTotalPowerKwh;

     @Column(name = "dg_phase2_batt_voltage")
     private BigDecimal dgPhase2BattVoltage;

     @Column(name = "dg_phase2_batt_current_amp")
     private BigDecimal dgPhase2BattCurrentAmp;

     @Column(name = "dg_phase2_batt_power_kw")
     private BigDecimal dgPhase2BattPowerKw;

     @Column(name = "dg_phase2_batt_total_power_kwh")
     private BigDecimal dgPhase2BattTotalPowerKwh;

     @Column(name = "dg_phase2_load_voltage")
     private BigDecimal dgPhase2LoadVoltage;

     @Column(name = "dg_phase2_load_current_amp")
     private BigDecimal dgPhase2LoadCurrentAmp;

     @Column(name = "dg_phase2_load_power_kw")
     private BigDecimal dgPhase2LoadPowerKw;

     @Column(name = "dg_phase2_load_total_power_kwh")
     private BigDecimal dgPhase2LoadTotalPowerKwh;

     @Column(name = "dg_phase3_batt_voltage")
     private BigDecimal dgPhase3BattVoltage;

     @Column(name = "dg_phase3_batt_current_amp")
     private BigDecimal dgPhase3BattCurrentAmp;

     @Column(name = "dg_phase3_batt_power_kw")
     private BigDecimal dgPhase3BattPowerKw;

     @Column(name = "dg_phase3_batt_total_power_kwh")
     private BigDecimal dgPhase3BattTotalPowerKwh;

     @Column(name = "dg_phase3_load_voltage")
     private BigDecimal dgPhase3LoadVoltage;

     @Column(name = "dg_phase3_load_current_amp")
     private BigDecimal dgPhase3LoadCurrentAmp;

     @Column(name = "dg_phase3_load_power_kw")
     private BigDecimal dgPhase3LoadPowerKw;
     
  	@Column(name = "dg_phase3_load_total_power_kwh")
  	private BigDecimal dgPhase3LoadTotalPowerKwh;
  	
  	 @Column(name = "total_allphase_dg_power_kwh")
      private BigDecimal totalAllphaseDgPowerKwh;

      @Column(name = "total_consolidated_kwh")
      private BigDecimal totalConsolidatedKwh;

      @Column(name = "oth_freq_hz")
      private BigDecimal othFreqHz;

      @Column(name = "oth_pf")
      private BigDecimal othPf;

      @Column(name = "oth_batt_volatge")
      private BigDecimal othBattVolatge;

      @Column(name = "oth_fuel_level_ltr")
      private String othFuelLevelLtr;

      @Column(name = "oth_rpm")
      private String othRpm;

      @Column(name = "oth_oil_pressure")
      private BigDecimal othOilPressure;

      @Column(name = "oth_coolent_level")
      private BigDecimal othCoolentLevel;

      @Column(name = "oth_dg_type")
      private String othDgType;

      @Column(name = "oth_dgrh")
      private BigDecimal othDgrh;

      @Column(name = "avg_batt_chg_power_kw")
      private BigDecimal avgBattChgPowerKw;

      @Column(name = "avg_batt_dischg_power_kw")
      private BigDecimal avgBattDischgPowerKw;

      @Column(name = "dg_all3phase_batt_voltage")
      private BigDecimal dgAll3phaseBattVoltage;

      @Column(name = "dg_all3phase_batt_current_amp")
      private BigDecimal dgAll3phaseBattCurrentAmp;

      @Column(name = "dg_all3phase_batt_power_kw")
      private BigDecimal dgAll3phaseBattPowerKw;

      @Column(name = "dg_all3phase_load_voltage")
      private BigDecimal dgAll3phaseLoadVoltage;

      @Column(name = "dg_all3phase_load_current_amp")
      private BigDecimal dgAll3phaseLoadCurrentAmp;

      @Column(name = "dg_all3phase_load_power_kw")
      private BigDecimal dgAll3phaseLoadPowerKw;

      @Column(name = "dg_all3phase_batt_power_kwh")
      private BigDecimal dgAll3phaseBattPowerKwh;

      @Column(name = "avg_batt_chg_power_kwh")
      private BigDecimal avgBattChgPowerKwh;

      @Column(name = "avg_batt_dischg_power_kwh")
      private BigDecimal avgBattDischgPowerKwh;

      @Column(name = "oth_coolent_temp")
      private BigDecimal othCoolentTemp;

      @Column(name = "dgrh_today")
      private BigDecimal dgrhToday;
      
    @Column(name = "dgrh_yesterday")
    private BigDecimal dgrhYesterday;
   	
   	 @Column(name = "dgrh_one_week")
       private BigDecimal dgrhOneWeek;

	public TemplateDgData() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getOmcId() {
		return omcId;
	}

	public void setOmcId(int omcId) {
		this.omcId = omcId;
	}

	public int getPlantId() {
		return plantId;
	}

	public void setPlantId(int plantId) {
		this.plantId = plantId;
	}

	public Date getEventTimeStamp() {
		return eventTimeStamp;
	}

	public void setEventTimeStamp(Date eventTimeStamp) {
		this.eventTimeStamp = eventTimeStamp;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getDgCompany() {
		return dgCompany;
	}

	public void setDgCompany(String dgCompany) {
		this.dgCompany = dgCompany;
	}

	public BigDecimal getDgPhase1BattVoltage() {
		return dgPhase1BattVoltage;
	}

	public void setDgPhase1BattVoltage(BigDecimal dgPhase1BattVoltage) {
		this.dgPhase1BattVoltage = dgPhase1BattVoltage;
	}

	public BigDecimal getDgPhase1BattCurrentAmp() {
		return dgPhase1BattCurrentAmp;
	}

	public void setDgPhase1BattCurrentAmp(BigDecimal dgPhase1BattCurrentAmp) {
		this.dgPhase1BattCurrentAmp = dgPhase1BattCurrentAmp;
	}

	public BigDecimal getDgPhase1BattPowerKw() {
		return dgPhase1BattPowerKw;
	}

	public void setDgPhase1BattPowerKw(BigDecimal dgPhase1BattPowerKw) {
		this.dgPhase1BattPowerKw = dgPhase1BattPowerKw;
	}

	public BigDecimal getDgPhase1BattTotalPowerKwh() {
		return dgPhase1BattTotalPowerKwh;
	}

	public void setDgPhase1BattTotalPowerKwh(BigDecimal dgPhase1BattTotalPowerKwh) {
		this.dgPhase1BattTotalPowerKwh = dgPhase1BattTotalPowerKwh;
	}

	public BigDecimal getDgPhase1LoadVoltage() {
		return dgPhase1LoadVoltage;
	}

	public void setDgPhase1LoadVoltage(BigDecimal dgPhase1LoadVoltage) {
		this.dgPhase1LoadVoltage = dgPhase1LoadVoltage;
	}

	public BigDecimal getDgPhase1LoadCurrentAmp() {
		return dgPhase1LoadCurrentAmp;
	}

	public void setDgPhase1LoadCurrentAmp(BigDecimal dgPhase1LoadCurrentAmp) {
		this.dgPhase1LoadCurrentAmp = dgPhase1LoadCurrentAmp;
	}

	public BigDecimal getDgPhase1LoadPowerKw() {
		return dgPhase1LoadPowerKw;
	}

	public void setDgPhase1LoadPowerKw(BigDecimal dgPhase1LoadPowerKw) {
		this.dgPhase1LoadPowerKw = dgPhase1LoadPowerKw;
	}

	public BigDecimal getDgPhase1LoadTotalPowerKwh() {
		return dgPhase1LoadTotalPowerKwh;
	}

	public void setDgPhase1LoadTotalPowerKwh(BigDecimal dgPhase1LoadTotalPowerKwh) {
		this.dgPhase1LoadTotalPowerKwh = dgPhase1LoadTotalPowerKwh;
	}

	public BigDecimal getDgPhase2BattVoltage() {
		return dgPhase2BattVoltage;
	}

	public void setDgPhase2BattVoltage(BigDecimal dgPhase2BattVoltage) {
		this.dgPhase2BattVoltage = dgPhase2BattVoltage;
	}

	public BigDecimal getDgPhase2BattCurrentAmp() {
		return dgPhase2BattCurrentAmp;
	}

	public void setDgPhase2BattCurrentAmp(BigDecimal dgPhase2BattCurrentAmp) {
		this.dgPhase2BattCurrentAmp = dgPhase2BattCurrentAmp;
	}

	public BigDecimal getDgPhase2BattPowerKw() {
		return dgPhase2BattPowerKw;
	}

	public void setDgPhase2BattPowerKw(BigDecimal dgPhase2BattPowerKw) {
		this.dgPhase2BattPowerKw = dgPhase2BattPowerKw;
	}

	public BigDecimal getDgPhase2BattTotalPowerKwh() {
		return dgPhase2BattTotalPowerKwh;
	}

	public void setDgPhase2BattTotalPowerKwh(BigDecimal dgPhase2BattTotalPowerKwh) {
		this.dgPhase2BattTotalPowerKwh = dgPhase2BattTotalPowerKwh;
	}

	public BigDecimal getDgPhase2LoadVoltage() {
		return dgPhase2LoadVoltage;
	}

	public void setDgPhase2LoadVoltage(BigDecimal dgPhase2LoadVoltage) {
		this.dgPhase2LoadVoltage = dgPhase2LoadVoltage;
	}

	public BigDecimal getDgPhase2LoadCurrentAmp() {
		return dgPhase2LoadCurrentAmp;
	}

	public void setDgPhase2LoadCurrentAmp(BigDecimal dgPhase2LoadCurrentAmp) {
		this.dgPhase2LoadCurrentAmp = dgPhase2LoadCurrentAmp;
	}

	public BigDecimal getDgPhase2LoadPowerKw() {
		return dgPhase2LoadPowerKw;
	}

	public void setDgPhase2LoadPowerKw(BigDecimal dgPhase2LoadPowerKw) {
		this.dgPhase2LoadPowerKw = dgPhase2LoadPowerKw;
	}

	public BigDecimal getDgPhase2LoadTotalPowerKwh() {
		return dgPhase2LoadTotalPowerKwh;
	}

	public void setDgPhase2LoadTotalPowerKwh(BigDecimal dgPhase2LoadTotalPowerKwh) {
		this.dgPhase2LoadTotalPowerKwh = dgPhase2LoadTotalPowerKwh;
	}

	public BigDecimal getDgPhase3BattVoltage() {
		return dgPhase3BattVoltage;
	}

	public void setDgPhase3BattVoltage(BigDecimal dgPhase3BattVoltage) {
		this.dgPhase3BattVoltage = dgPhase3BattVoltage;
	}

	public BigDecimal getDgPhase3BattCurrentAmp() {
		return dgPhase3BattCurrentAmp;
	}

	public void setDgPhase3BattCurrentAmp(BigDecimal dgPhase3BattCurrentAmp) {
		this.dgPhase3BattCurrentAmp = dgPhase3BattCurrentAmp;
	}

	public BigDecimal getDgPhase3BattPowerKw() {
		return dgPhase3BattPowerKw;
	}

	public void setDgPhase3BattPowerKw(BigDecimal dgPhase3BattPowerKw) {
		this.dgPhase3BattPowerKw = dgPhase3BattPowerKw;
	}

	public BigDecimal getDgPhase3BattTotalPowerKwh() {
		return dgPhase3BattTotalPowerKwh;
	}

	public void setDgPhase3BattTotalPowerKwh(BigDecimal dgPhase3BattTotalPowerKwh) {
		this.dgPhase3BattTotalPowerKwh = dgPhase3BattTotalPowerKwh;
	}

	public BigDecimal getDgPhase3LoadVoltage() {
		return dgPhase3LoadVoltage;
	}

	public void setDgPhase3LoadVoltage(BigDecimal dgPhase3LoadVoltage) {
		this.dgPhase3LoadVoltage = dgPhase3LoadVoltage;
	}

	public BigDecimal getDgPhase3LoadCurrentAmp() {
		return dgPhase3LoadCurrentAmp;
	}

	public void setDgPhase3LoadCurrentAmp(BigDecimal dgPhase3LoadCurrentAmp) {
		this.dgPhase3LoadCurrentAmp = dgPhase3LoadCurrentAmp;
	}

	public BigDecimal getDgPhase3LoadPowerKw() {
		return dgPhase3LoadPowerKw;
	}

	public void setDgPhase3LoadPowerKw(BigDecimal dgPhase3LoadPowerKw) {
		this.dgPhase3LoadPowerKw = dgPhase3LoadPowerKw;
	}

	public BigDecimal getDgPhase3LoadTotalPowerKwh() {
		return dgPhase3LoadTotalPowerKwh;
	}

	public void setDgPhase3LoadTotalPowerKwh(BigDecimal dgPhase3LoadTotalPowerKwh) {
		this.dgPhase3LoadTotalPowerKwh = dgPhase3LoadTotalPowerKwh;
	}

	public BigDecimal getTotalAllphaseDgPowerKwh() {
		return totalAllphaseDgPowerKwh;
	}

	public void setTotalAllphaseDgPowerKwh(BigDecimal totalAllphaseDgPowerKwh) {
		this.totalAllphaseDgPowerKwh = totalAllphaseDgPowerKwh;
	}

	public BigDecimal getTotalConsolidatedKwh() {
		return totalConsolidatedKwh;
	}

	public void setTotalConsolidatedKwh(BigDecimal totalConsolidatedKwh) {
		this.totalConsolidatedKwh = totalConsolidatedKwh;
	}

	public BigDecimal getOthFreqHz() {
		return othFreqHz;
	}

	public void setOthFreqHz(BigDecimal othFreqHz) {
		this.othFreqHz = othFreqHz;
	}

	public BigDecimal getOthPf() {
		return othPf;
	}

	public void setOthPf(BigDecimal othPf) {
		this.othPf = othPf;
	}

	public BigDecimal getOthBattVolatge() {
		return othBattVolatge;
	}

	public void setOthBattVolatge(BigDecimal othBattVolatge) {
		this.othBattVolatge = othBattVolatge;
	}

	public String getOthFuelLevelLtr() {
		return othFuelLevelLtr;
	}

	public void setOthFuelLevelLtr(String othFuelLevelLtr) {
		this.othFuelLevelLtr = othFuelLevelLtr;
	}

	public String getOthRpm() {
		return othRpm;
	}

	public void setOthRpm(String othRpm) {
		this.othRpm = othRpm;
	}

	public BigDecimal getOthOilPressure() {
		return othOilPressure;
	}

	public void setOthOilPressure(BigDecimal othOilPressure) {
		this.othOilPressure = othOilPressure;
	}

	public BigDecimal getOthCoolentLevel() {
		return othCoolentLevel;
	}

	public void setOthCoolentLevel(BigDecimal othCoolentLevel) {
		this.othCoolentLevel = othCoolentLevel;
	}

	public String getOthDgType() {
		return othDgType;
	}

	public void setOthDgType(String othDgType) {
		this.othDgType = othDgType;
	}

	public BigDecimal getOthDgrh() {
		return othDgrh;
	}

	public void setOthDgrh(BigDecimal othDgrh) {
		this.othDgrh = othDgrh;
	}

	public BigDecimal getAvgBattChgPowerKw() {
		return avgBattChgPowerKw;
	}

	public void setAvgBattChgPowerKw(BigDecimal avgBattChgPowerKw) {
		this.avgBattChgPowerKw = avgBattChgPowerKw;
	}

	public BigDecimal getAvgBattDischgPowerKw() {
		return avgBattDischgPowerKw;
	}

	public void setAvgBattDischgPowerKw(BigDecimal avgBattDischgPowerKw) {
		this.avgBattDischgPowerKw = avgBattDischgPowerKw;
	}

	public BigDecimal getDgAll3phaseBattVoltage() {
		return dgAll3phaseBattVoltage;
	}

	public void setDgAll3phaseBattVoltage(BigDecimal dgAll3phaseBattVoltage) {
		this.dgAll3phaseBattVoltage = dgAll3phaseBattVoltage;
	}

	public BigDecimal getDgAll3phaseBattCurrentAmp() {
		return dgAll3phaseBattCurrentAmp;
	}

	public void setDgAll3phaseBattCurrentAmp(BigDecimal dgAll3phaseBattCurrentAmp) {
		this.dgAll3phaseBattCurrentAmp = dgAll3phaseBattCurrentAmp;
	}

	public BigDecimal getDgAll3phaseBattPowerKw() {
		return dgAll3phaseBattPowerKw;
	}

	public void setDgAll3phaseBattPowerKw(BigDecimal dgAll3phaseBattPowerKw) {
		this.dgAll3phaseBattPowerKw = dgAll3phaseBattPowerKw;
	}

	public BigDecimal getDgAll3phaseLoadVoltage() {
		return dgAll3phaseLoadVoltage;
	}

	public void setDgAll3phaseLoadVoltage(BigDecimal dgAll3phaseLoadVoltage) {
		this.dgAll3phaseLoadVoltage = dgAll3phaseLoadVoltage;
	}

	public BigDecimal getDgAll3phaseLoadCurrentAmp() {
		return dgAll3phaseLoadCurrentAmp;
	}

	public void setDgAll3phaseLoadCurrentAmp(BigDecimal dgAll3phaseLoadCurrentAmp) {
		this.dgAll3phaseLoadCurrentAmp = dgAll3phaseLoadCurrentAmp;
	}

	public BigDecimal getDgAll3phaseLoadPowerKw() {
		return dgAll3phaseLoadPowerKw;
	}

	public void setDgAll3phaseLoadPowerKw(BigDecimal dgAll3phaseLoadPowerKw) {
		this.dgAll3phaseLoadPowerKw = dgAll3phaseLoadPowerKw;
	}

	public BigDecimal getDgAll3phaseBattPowerKwh() {
		return dgAll3phaseBattPowerKwh;
	}

	public void setDgAll3phaseBattPowerKwh(BigDecimal dgAll3phaseBattPowerKwh) {
		this.dgAll3phaseBattPowerKwh = dgAll3phaseBattPowerKwh;
	}

	public BigDecimal getAvgBattChgPowerKwh() {
		return avgBattChgPowerKwh;
	}

	public void setAvgBattChgPowerKwh(BigDecimal avgBattChgPowerKwh) {
		this.avgBattChgPowerKwh = avgBattChgPowerKwh;
	}

	public BigDecimal getAvgBattDischgPowerKwh() {
		return avgBattDischgPowerKwh;
	}

	public void setAvgBattDischgPowerKwh(BigDecimal avgBattDischgPowerKwh) {
		this.avgBattDischgPowerKwh = avgBattDischgPowerKwh;
	}

	public BigDecimal getOthCoolentTemp() {
		return othCoolentTemp;
	}

	public void setOthCoolentTemp(BigDecimal othCoolentTemp) {
		this.othCoolentTemp = othCoolentTemp;
	}

	public BigDecimal getDgrhToday() {
		return dgrhToday;
	}

	public void setDgrhToday(BigDecimal dgrhToday) {
		this.dgrhToday = dgrhToday;
	}

	public BigDecimal getDgrhYesterday() {
		return dgrhYesterday;
	}

	public void setDgrhYesterday(BigDecimal dgrhYesterday) {
		this.dgrhYesterday = dgrhYesterday;
	}

	public BigDecimal getDgrhOneWeek() {
		return dgrhOneWeek;
	}

	public void setDgrhOneWeek(BigDecimal dgrhOneWeek) {
		this.dgrhOneWeek = dgrhOneWeek;
	}
   	 
   	 

}
