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
@Table(name="template_telecomload_data")
public class TemplateTelecomloadData {
	
    @Id
   	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 @Column(name = "rt_id")
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
 	
      @Column(name = "total_number_tower")
 	   private int totalNumberTower;
 	
 	 @Column(name = "avg_load_data_pf")
     private BigDecimal avgLoadDataPf;
 	 
 	 @Column(name = "avg_load_data_freq_hz")
     private BigDecimal avgLoadDataFreqHz;

     @Column(name = "avg_load_kw")
     private BigDecimal avgLoadKw;

     @Column(name = "avg_plant_power_kwh")
     private BigDecimal avgPlantPowerKwh;

     @Column(name = "avg_tower_power_kwh")
     private BigDecimal avgTowerPowerKwh;

     @Column(name = "avg_power_tower_kw")
     private BigDecimal avgPowerTowerKw;

     @Column(name = "today_plantPowerKW")
     private BigDecimal todayPlantPowerKW;

     @Column(name = "today_towerPeakPowerKW")
     private BigDecimal todayTowerPeakPowerKW;

     @Column(name = "t1_plantVoltage")
     private BigDecimal t1PlantVoltage;

     @Column(name = "t1_plantCurrent")
     private BigDecimal t1PlantCurrent;

     @Column(name = "t1_plantPowerKW")
     private BigDecimal t1PlantPowerKW;

     @Column(name = "t1_plantPowerKWH")
     private BigDecimal t1PlantPowerKWH;

     @Column(name = "t1_freqHZ")
     private BigDecimal t1FreqHZ;

     @Column(name = "t1_pf")
     private BigDecimal t1Pf;

     @Column(name = "t1_towerVoltage")
     private BigDecimal t1TowerVoltage;

     @Column(name = "t1_towerCurrent")
     private BigDecimal t1TowerCurrent;

     @Column(name = "t1_towerAvgPowerKW")
     private BigDecimal t1TowerAvgPowerKW;

     @Column(name = "t1_towerPeakPowerKW")
     private BigDecimal t1TowerPeakPowerKW;

     @Column(name = "t1_towerPowerKW")
     private BigDecimal t1TowerPowerKW;
     
  	@Column(name = "t1_towerPowerKWH")
  	private BigDecimal t1TowerPowerKWH;
  	
  	 @Column(name = "t1_towerTrnsLossPercentage")
      private BigDecimal t1TowerTrnsLossPercentage;

      @Column(name = "t1_omcSuppliedDayHours")
      private BigDecimal t1OmcSuppliedDayHours;

      @Column(name = "t1_omcSuppliedNightHours")
      private BigDecimal t1OmcSuppliedNightHours;

      @Column(name = "t1_totalOmcSuppliedHours")
      private BigDecimal t1TotalOmcSuppliedHours;
      
      @Column(name = "t2_plantVoltage")
      private BigDecimal t2PlantVoltage;

      @Column(name = "t2_plantCurrent")
      private BigDecimal t2PlantCurrent;

      @Column(name = "t2_plantPowerKW")
      private BigDecimal t2PlantPowerKW;

     @Column(name = "t2_plantPowerKWH")
     private BigDecimal t2PlantPowerKWH;

     @Column(name = "t2_freqHZ")
     private BigDecimal t2FreqHZ;

     @Column(name = "t2_pf")
     private BigDecimal t2Pf;

     @Column(name = "t2_towerVoltage")
     private BigDecimal t2TowerVoltage;

     @Column(name = "t2_towerCurrent")
     private BigDecimal t2TowerCurrent;

     @Column(name = "t2_towerAvgPowerKW")
     private BigDecimal t2TowerAvgPowerKW;

     @Column(name = "t2_towerPeakPowerKW")
     private BigDecimal t2TowerPeakPowerKW;

     @Column(name = "t2_towerPowerKW")
     private BigDecimal t2TowerPowerKW;

     @Column(name = "t2_towerPowerKWH")
     private BigDecimal t2TowerPowerKWH;

     @Column(name = "t2_towerTrnsLossPercentage")
     private BigDecimal t2TowerTrnsLossPercentage;

     @Column(name = "t2_omcSuppliedDayHours")
     private BigDecimal t2OmcSuppliedDayHours;

     @Column(name = "t2_omcSuppliedNightHours")
     private BigDecimal t2OmcSuppliedNightHours;

     @Column(name = "t2_totalOmcSuppliedHours")
     private BigDecimal t2TotalOmcSuppliedHours;

     @Column(name = "t3_plantVoltage")
     private BigDecimal t3PlantVoltage;

     @Column(name = "t3_plantCurrent")
     private BigDecimal t3PlantCurrent;

     @Column(name = "t3_plantPowerKW")
     private BigDecimal t3PlantPowerKW;

     @Column(name = "t3_plantPowerKWH")
     private BigDecimal t3PlantPowerKWH;

     @Column(name = "t3_freqHZ")
     private BigDecimal t3FreqHZ;

     @Column(name = "t3_pf")
     private BigDecimal t3Pf;

     @Column(name = "t3_towerVoltage")
     private BigDecimal t3TowerVoltage;

     @Column(name = "t3_towerCurrent")
     private BigDecimal t3TowerCurrent;

     @Column(name = "t3_towerAvgPowerKW")
     private BigDecimal t3TowerAvgPowerKW;
     
  	@Column(name = "t3_towerPeakPowerKW")
  	private BigDecimal t3TowerPeakPowerKW;
  	
  	 @Column(name = "t3_towerPowerKW")
      private BigDecimal t3TowerPowerKW;

      @Column(name = "t3_towerPowerKWH")
      private BigDecimal t3TowerPowerKWH;

      @Column(name = "t3_towerTrnsLossPercentage")
      private BigDecimal t3TowerTrnsLossPercentage;

      @Column(name = "t3_omcSuppliedDayHours")
      private BigDecimal t3OmcSuppliedDayHours;

      @Column(name = "t3_omcSuppliedNightHours")
      private BigDecimal t3OmcSuppliedNightHours;

      @Column(name = "t3_totalOmcSuppliedHours")
      private BigDecimal t3TotalOmcSuppliedHours;

      @Column(name = "t4_plantVoltage")
      private BigDecimal t4PlantVoltage;

      @Column(name = "t4_plantCurrent")
      private BigDecimal t4PlantCurrent;

      @Column(name = "t4_plantPowerKW")
      private BigDecimal t4PlantPowerKW;

      @Column(name = "t4_plantPowerKWH")
      private BigDecimal t4PlantPowerKWH;

      @Column(name = "t4_freqHZ")
      private BigDecimal t4FreqHZ;

      @Column(name = "t4_pf")
      private BigDecimal t4Pf;

      @Column(name = "t4_towerVoltage")
      private BigDecimal t4TowerVoltage;

      @Column(name = "t4_towerCurrent")
      private BigDecimal t4TowerCurrent;

      @Column(name = "t4_towerAvgPowerKW")
      private BigDecimal t4TowerAvgPowerKW;

      @Column(name = "t4_towerPeakPowerKW")
      private BigDecimal t4TowerPeakPowerKW;

      @Column(name = "t4_towerPowerKW")
      private BigDecimal t4TowerPowerKW;

      @Column(name = "t4_towerPowerKWH")
      private BigDecimal t4TowerPowerKWH;

      @Column(name = "t4_towerTrnsLossPercentage")
      private BigDecimal t4TowerTrnsLossPercentage;

      @Column(name = "t4_omcSuppliedDayHours")
      private BigDecimal t4OmcSuppliedDayHours;

      @Column(name = "t4_omcSuppliedNightHours")
      private BigDecimal t4OmcSuppliedNightHours;

      @Column(name = "t4_totalOmcSuppliedHours")
      private BigDecimal t4TotalOmcSuppliedHours;

	public TemplateTelecomloadData() {
		
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

	public int getTotalNumberTower() {
		return totalNumberTower;
	}

	public void setTotalNumberTower(int totalNumberTower) {
		this.totalNumberTower = totalNumberTower;
	}

	public BigDecimal getAvgLoadDataPf() {
		return avgLoadDataPf;
	}

	public void setAvgLoadDataPf(BigDecimal avgLoadDataPf) {
		this.avgLoadDataPf = avgLoadDataPf;
	}

	public BigDecimal getAvgLoadDataFreqHz() {
		return avgLoadDataFreqHz;
	}

	public void setAvgLoadDataFreqHz(BigDecimal avgLoadDataFreqHz) {
		this.avgLoadDataFreqHz = avgLoadDataFreqHz;
	}

	public BigDecimal getAvgLoadKw() {
		return avgLoadKw;
	}

	public void setAvgLoadKw(BigDecimal avgLoadKw) {
		this.avgLoadKw = avgLoadKw;
	}

	public BigDecimal getAvgPlantPowerKwh() {
		return avgPlantPowerKwh;
	}

	public void setAvgPlantPowerKwh(BigDecimal avgPlantPowerKwh) {
		this.avgPlantPowerKwh = avgPlantPowerKwh;
	}

	public BigDecimal getAvgTowerPowerKwh() {
		return avgTowerPowerKwh;
	}

	public void setAvgTowerPowerKwh(BigDecimal avgTowerPowerKwh) {
		this.avgTowerPowerKwh = avgTowerPowerKwh;
	}

	public BigDecimal getAvgPowerTowerKw() {
		return avgPowerTowerKw;
	}

	public void setAvgPowerTowerKw(BigDecimal avgPowerTowerKw) {
		this.avgPowerTowerKw = avgPowerTowerKw;
	}

	public BigDecimal getTodayPlantPowerKW() {
		return todayPlantPowerKW;
	}

	public void setTodayPlantPowerKW(BigDecimal todayPlantPowerKW) {
		this.todayPlantPowerKW = todayPlantPowerKW;
	}

	public BigDecimal getTodayTowerPeakPowerKW() {
		return todayTowerPeakPowerKW;
	}

	public void setTodayTowerPeakPowerKW(BigDecimal todayTowerPeakPowerKW) {
		this.todayTowerPeakPowerKW = todayTowerPeakPowerKW;
	}

	public BigDecimal getT1PlantVoltage() {
		return t1PlantVoltage;
	}

	public void setT1PlantVoltage(BigDecimal t1PlantVoltage) {
		this.t1PlantVoltage = t1PlantVoltage;
	}

	public BigDecimal getT1PlantCurrent() {
		return t1PlantCurrent;
	}

	public void setT1PlantCurrent(BigDecimal t1PlantCurrent) {
		this.t1PlantCurrent = t1PlantCurrent;
	}

	public BigDecimal getT1PlantPowerKW() {
		return t1PlantPowerKW;
	}

	public void setT1PlantPowerKW(BigDecimal t1PlantPowerKW) {
		this.t1PlantPowerKW = t1PlantPowerKW;
	}

	public BigDecimal getT1PlantPowerKWH() {
		return t1PlantPowerKWH;
	}

	public void setT1PlantPowerKWH(BigDecimal t1PlantPowerKWH) {
		this.t1PlantPowerKWH = t1PlantPowerKWH;
	}

	public BigDecimal getT1FreqHZ() {
		return t1FreqHZ;
	}

	public void setT1FreqHZ(BigDecimal t1FreqHZ) {
		this.t1FreqHZ = t1FreqHZ;
	}

	public BigDecimal getT1Pf() {
		return t1Pf;
	}

	public void setT1Pf(BigDecimal t1Pf) {
		this.t1Pf = t1Pf;
	}

	public BigDecimal getT1TowerVoltage() {
		return t1TowerVoltage;
	}

	public void setT1TowerVoltage(BigDecimal t1TowerVoltage) {
		this.t1TowerVoltage = t1TowerVoltage;
	}

	public BigDecimal getT1TowerCurrent() {
		return t1TowerCurrent;
	}

	public void setT1TowerCurrent(BigDecimal t1TowerCurrent) {
		this.t1TowerCurrent = t1TowerCurrent;
	}

	public BigDecimal getT1TowerAvgPowerKW() {
		return t1TowerAvgPowerKW;
	}

	public void setT1TowerAvgPowerKW(BigDecimal t1TowerAvgPowerKW) {
		this.t1TowerAvgPowerKW = t1TowerAvgPowerKW;
	}

	public BigDecimal getT1TowerPeakPowerKW() {
		return t1TowerPeakPowerKW;
	}

	public void setT1TowerPeakPowerKW(BigDecimal t1TowerPeakPowerKW) {
		this.t1TowerPeakPowerKW = t1TowerPeakPowerKW;
	}

	public BigDecimal getT1TowerPowerKW() {
		return t1TowerPowerKW;
	}

	public void setT1TowerPowerKW(BigDecimal t1TowerPowerKW) {
		this.t1TowerPowerKW = t1TowerPowerKW;
	}

	public BigDecimal getT1TowerPowerKWH() {
		return t1TowerPowerKWH;
	}

	public void setT1TowerPowerKWH(BigDecimal t1TowerPowerKWH) {
		this.t1TowerPowerKWH = t1TowerPowerKWH;
	}

	public BigDecimal getT1TowerTrnsLossPercentage() {
		return t1TowerTrnsLossPercentage;
	}

	public void setT1TowerTrnsLossPercentage(BigDecimal t1TowerTrnsLossPercentage) {
		this.t1TowerTrnsLossPercentage = t1TowerTrnsLossPercentage;
	}

	public BigDecimal getT1OmcSuppliedDayHours() {
		return t1OmcSuppliedDayHours;
	}

	public void setT1OmcSuppliedDayHours(BigDecimal t1OmcSuppliedDayHours) {
		this.t1OmcSuppliedDayHours = t1OmcSuppliedDayHours;
	}

	public BigDecimal getT1OmcSuppliedNightHours() {
		return t1OmcSuppliedNightHours;
	}

	public void setT1OmcSuppliedNightHours(BigDecimal t1OmcSuppliedNightHours) {
		this.t1OmcSuppliedNightHours = t1OmcSuppliedNightHours;
	}

	public BigDecimal getT1TotalOmcSuppliedHours() {
		return t1TotalOmcSuppliedHours;
	}

	public void setT1TotalOmcSuppliedHours(BigDecimal t1TotalOmcSuppliedHours) {
		this.t1TotalOmcSuppliedHours = t1TotalOmcSuppliedHours;
	}

	public BigDecimal getT2PlantVoltage() {
		return t2PlantVoltage;
	}

	public void setT2PlantVoltage(BigDecimal t2PlantVoltage) {
		this.t2PlantVoltage = t2PlantVoltage;
	}

	public BigDecimal getT2PlantCurrent() {
		return t2PlantCurrent;
	}

	public void setT2PlantCurrent(BigDecimal t2PlantCurrent) {
		this.t2PlantCurrent = t2PlantCurrent;
	}

	public BigDecimal getT2PlantPowerKW() {
		return t2PlantPowerKW;
	}

	public void setT2PlantPowerKW(BigDecimal t2PlantPowerKW) {
		this.t2PlantPowerKW = t2PlantPowerKW;
	}

	public BigDecimal getT2PlantPowerKWH() {
		return t2PlantPowerKWH;
	}

	public void setT2PlantPowerKWH(BigDecimal t2PlantPowerKWH) {
		this.t2PlantPowerKWH = t2PlantPowerKWH;
	}

	public BigDecimal getT2FreqHZ() {
		return t2FreqHZ;
	}

	public void setT2FreqHZ(BigDecimal t2FreqHZ) {
		this.t2FreqHZ = t2FreqHZ;
	}

	public BigDecimal getT2Pf() {
		return t2Pf;
	}

	public void setT2Pf(BigDecimal t2Pf) {
		this.t2Pf = t2Pf;
	}

	public BigDecimal getT2TowerVoltage() {
		return t2TowerVoltage;
	}

	public void setT2TowerVoltage(BigDecimal t2TowerVoltage) {
		this.t2TowerVoltage = t2TowerVoltage;
	}

	public BigDecimal getT2TowerCurrent() {
		return t2TowerCurrent;
	}

	public void setT2TowerCurrent(BigDecimal t2TowerCurrent) {
		this.t2TowerCurrent = t2TowerCurrent;
	}

	public BigDecimal getT2TowerAvgPowerKW() {
		return t2TowerAvgPowerKW;
	}

	public void setT2TowerAvgPowerKW(BigDecimal t2TowerAvgPowerKW) {
		this.t2TowerAvgPowerKW = t2TowerAvgPowerKW;
	}

	public BigDecimal getT2TowerPeakPowerKW() {
		return t2TowerPeakPowerKW;
	}

	public void setT2TowerPeakPowerKW(BigDecimal t2TowerPeakPowerKW) {
		this.t2TowerPeakPowerKW = t2TowerPeakPowerKW;
	}

	public BigDecimal getT2TowerPowerKW() {
		return t2TowerPowerKW;
	}

	public void setT2TowerPowerKW(BigDecimal t2TowerPowerKW) {
		this.t2TowerPowerKW = t2TowerPowerKW;
	}

	public BigDecimal getT2TowerPowerKWH() {
		return t2TowerPowerKWH;
	}

	public void setT2TowerPowerKWH(BigDecimal t2TowerPowerKWH) {
		this.t2TowerPowerKWH = t2TowerPowerKWH;
	}

	public BigDecimal getT2TowerTrnsLossPercentage() {
		return t2TowerTrnsLossPercentage;
	}

	public void setT2TowerTrnsLossPercentage(BigDecimal t2TowerTrnsLossPercentage) {
		this.t2TowerTrnsLossPercentage = t2TowerTrnsLossPercentage;
	}

	public BigDecimal getT2OmcSuppliedDayHours() {
		return t2OmcSuppliedDayHours;
	}

	public void setT2OmcSuppliedDayHours(BigDecimal t2OmcSuppliedDayHours) {
		this.t2OmcSuppliedDayHours = t2OmcSuppliedDayHours;
	}

	public BigDecimal getT2OmcSuppliedNightHours() {
		return t2OmcSuppliedNightHours;
	}

	public void setT2OmcSuppliedNightHours(BigDecimal t2OmcSuppliedNightHours) {
		this.t2OmcSuppliedNightHours = t2OmcSuppliedNightHours;
	}

	public BigDecimal getT2TotalOmcSuppliedHours() {
		return t2TotalOmcSuppliedHours;
	}

	public void setT2TotalOmcSuppliedHours(BigDecimal t2TotalOmcSuppliedHours) {
		this.t2TotalOmcSuppliedHours = t2TotalOmcSuppliedHours;
	}

	public BigDecimal getT3PlantVoltage() {
		return t3PlantVoltage;
	}

	public void setT3PlantVoltage(BigDecimal t3PlantVoltage) {
		this.t3PlantVoltage = t3PlantVoltage;
	}

	public BigDecimal getT3PlantCurrent() {
		return t3PlantCurrent;
	}

	public void setT3PlantCurrent(BigDecimal t3PlantCurrent) {
		this.t3PlantCurrent = t3PlantCurrent;
	}

	public BigDecimal getT3PlantPowerKW() {
		return t3PlantPowerKW;
	}

	public void setT3PlantPowerKW(BigDecimal t3PlantPowerKW) {
		this.t3PlantPowerKW = t3PlantPowerKW;
	}

	public BigDecimal getT3PlantPowerKWH() {
		return t3PlantPowerKWH;
	}

	public void setT3PlantPowerKWH(BigDecimal t3PlantPowerKWH) {
		this.t3PlantPowerKWH = t3PlantPowerKWH;
	}

	public BigDecimal getT3FreqHZ() {
		return t3FreqHZ;
	}

	public void setT3FreqHZ(BigDecimal t3FreqHZ) {
		this.t3FreqHZ = t3FreqHZ;
	}

	public BigDecimal getT3Pf() {
		return t3Pf;
	}

	public void setT3Pf(BigDecimal t3Pf) {
		this.t3Pf = t3Pf;
	}

	public BigDecimal getT3TowerVoltage() {
		return t3TowerVoltage;
	}

	public void setT3TowerVoltage(BigDecimal t3TowerVoltage) {
		this.t3TowerVoltage = t3TowerVoltage;
	}

	public BigDecimal getT3TowerCurrent() {
		return t3TowerCurrent;
	}

	public void setT3TowerCurrent(BigDecimal t3TowerCurrent) {
		this.t3TowerCurrent = t3TowerCurrent;
	}

	public BigDecimal getT3TowerAvgPowerKW() {
		return t3TowerAvgPowerKW;
	}

	public void setT3TowerAvgPowerKW(BigDecimal t3TowerAvgPowerKW) {
		this.t3TowerAvgPowerKW = t3TowerAvgPowerKW;
	}

	public BigDecimal getT3TowerPeakPowerKW() {
		return t3TowerPeakPowerKW;
	}

	public void setT3TowerPeakPowerKW(BigDecimal t3TowerPeakPowerKW) {
		this.t3TowerPeakPowerKW = t3TowerPeakPowerKW;
	}

	public BigDecimal getT3TowerPowerKW() {
		return t3TowerPowerKW;
	}

	public void setT3TowerPowerKW(BigDecimal t3TowerPowerKW) {
		this.t3TowerPowerKW = t3TowerPowerKW;
	}

	public BigDecimal getT3TowerPowerKWH() {
		return t3TowerPowerKWH;
	}

	public void setT3TowerPowerKWH(BigDecimal t3TowerPowerKWH) {
		this.t3TowerPowerKWH = t3TowerPowerKWH;
	}

	public BigDecimal getT3TowerTrnsLossPercentage() {
		return t3TowerTrnsLossPercentage;
	}

	public void setT3TowerTrnsLossPercentage(BigDecimal t3TowerTrnsLossPercentage) {
		this.t3TowerTrnsLossPercentage = t3TowerTrnsLossPercentage;
	}

	public BigDecimal getT3OmcSuppliedDayHours() {
		return t3OmcSuppliedDayHours;
	}

	public void setT3OmcSuppliedDayHours(BigDecimal t3OmcSuppliedDayHours) {
		this.t3OmcSuppliedDayHours = t3OmcSuppliedDayHours;
	}

	public BigDecimal getT3OmcSuppliedNightHours() {
		return t3OmcSuppliedNightHours;
	}

	public void setT3OmcSuppliedNightHours(BigDecimal t3OmcSuppliedNightHours) {
		this.t3OmcSuppliedNightHours = t3OmcSuppliedNightHours;
	}

	public BigDecimal getT3TotalOmcSuppliedHours() {
		return t3TotalOmcSuppliedHours;
	}

	public void setT3TotalOmcSuppliedHours(BigDecimal t3TotalOmcSuppliedHours) {
		this.t3TotalOmcSuppliedHours = t3TotalOmcSuppliedHours;
	}

	public BigDecimal getT4PlantVoltage() {
		return t4PlantVoltage;
	}

	public void setT4PlantVoltage(BigDecimal t4PlantVoltage) {
		this.t4PlantVoltage = t4PlantVoltage;
	}

	public BigDecimal getT4PlantCurrent() {
		return t4PlantCurrent;
	}

	public void setT4PlantCurrent(BigDecimal t4PlantCurrent) {
		this.t4PlantCurrent = t4PlantCurrent;
	}

	public BigDecimal getT4PlantPowerKW() {
		return t4PlantPowerKW;
	}

	public void setT4PlantPowerKW(BigDecimal t4PlantPowerKW) {
		this.t4PlantPowerKW = t4PlantPowerKW;
	}

	public BigDecimal getT4PlantPowerKWH() {
		return t4PlantPowerKWH;
	}

	public void setT4PlantPowerKWH(BigDecimal t4PlantPowerKWH) {
		this.t4PlantPowerKWH = t4PlantPowerKWH;
	}

	public BigDecimal getT4FreqHZ() {
		return t4FreqHZ;
	}

	public void setT4FreqHZ(BigDecimal t4FreqHZ) {
		this.t4FreqHZ = t4FreqHZ;
	}

	public BigDecimal getT4Pf() {
		return t4Pf;
	}

	public void setT4Pf(BigDecimal t4Pf) {
		this.t4Pf = t4Pf;
	}

	public BigDecimal getT4TowerVoltage() {
		return t4TowerVoltage;
	}

	public void setT4TowerVoltage(BigDecimal t4TowerVoltage) {
		this.t4TowerVoltage = t4TowerVoltage;
	}

	public BigDecimal getT4TowerCurrent() {
		return t4TowerCurrent;
	}

	public void setT4TowerCurrent(BigDecimal t4TowerCurrent) {
		this.t4TowerCurrent = t4TowerCurrent;
	}

	public BigDecimal getT4TowerAvgPowerKW() {
		return t4TowerAvgPowerKW;
	}

	public void setT4TowerAvgPowerKW(BigDecimal t4TowerAvgPowerKW) {
		this.t4TowerAvgPowerKW = t4TowerAvgPowerKW;
	}

	public BigDecimal getT4TowerPeakPowerKW() {
		return t4TowerPeakPowerKW;
	}

	public void setT4TowerPeakPowerKW(BigDecimal t4TowerPeakPowerKW) {
		this.t4TowerPeakPowerKW = t4TowerPeakPowerKW;
	}

	public BigDecimal getT4TowerPowerKW() {
		return t4TowerPowerKW;
	}

	public void setT4TowerPowerKW(BigDecimal t4TowerPowerKW) {
		this.t4TowerPowerKW = t4TowerPowerKW;
	}

	public BigDecimal getT4TowerPowerKWH() {
		return t4TowerPowerKWH;
	}

	public void setT4TowerPowerKWH(BigDecimal t4TowerPowerKWH) {
		this.t4TowerPowerKWH = t4TowerPowerKWH;
	}

	public BigDecimal getT4TowerTrnsLossPercentage() {
		return t4TowerTrnsLossPercentage;
	}

	public void setT4TowerTrnsLossPercentage(BigDecimal t4TowerTrnsLossPercentage) {
		this.t4TowerTrnsLossPercentage = t4TowerTrnsLossPercentage;
	}

	public BigDecimal getT4OmcSuppliedDayHours() {
		return t4OmcSuppliedDayHours;
	}

	public void setT4OmcSuppliedDayHours(BigDecimal t4OmcSuppliedDayHours) {
		this.t4OmcSuppliedDayHours = t4OmcSuppliedDayHours;
	}

	public BigDecimal getT4OmcSuppliedNightHours() {
		return t4OmcSuppliedNightHours;
	}

	public void setT4OmcSuppliedNightHours(BigDecimal t4OmcSuppliedNightHours) {
		this.t4OmcSuppliedNightHours = t4OmcSuppliedNightHours;
	}

	public BigDecimal getT4TotalOmcSuppliedHours() {
		return t4TotalOmcSuppliedHours;
	}

	public void setT4TotalOmcSuppliedHours(BigDecimal t4TotalOmcSuppliedHours) {
		this.t4TotalOmcSuppliedHours = t4TotalOmcSuppliedHours;
	}
      
	
      

}
