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
@Table(name="template_minigrid_data")
public class TemplateMinigridData {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "rm_id")
    private Long rmId;

    @Column(name = "plant_id")
    private int plantId;

 	@Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date eventTimeStamp;    

    @Column(name = "omc_id")
    private int omcId;
    
    @Column(name = "total_mg_plant_voltage")
    private BigDecimal totalMgPlantVoltage;

    @Column(name = "total_mg_plant_current")
    private BigDecimal totalMgPlantCurrent;

    @Column(name = "total_mg_plant_power_kw")
    private BigDecimal totalMgPlantPowerKw;

    @Column(name = "total_mg_plant_power_kwh")
    private BigDecimal totalMgPlantPowerKwh;

    @Column(name = "total_mg_freq_hz")
    private BigDecimal totalMgFreqHz;

    @Column(name = "total_mg_pf")
	    private BigDecimal totalMgPf;

	     @Column(name = "total_mg_avg_power_kw")
	    private BigDecimal totalMgAvgPowerKw;

    @Column(name = "total_mg_peak_power_kw")
	    private BigDecimal totalMgPeakPowerKw;

    @Column(name = "total_mg_power_customer_kw")
	    private BigDecimal totalMgPowerCustomerKw;

    @Column(name = "total_mg_power_customer_kwh")
	    private BigDecimal totalMgPowerCustomerKwh;

    @Column(name = "total_loss_mg_precentage")
	    private BigDecimal totalLossMgPrecentage;

       @Column(name = "total_omc_supply_hour_day")
	    private BigDecimal totalOmcSupplyHourDay;


	    @Column(name = "total_omc_supply_hour_night")
	    private BigDecimal total_omcSupplyHourNight;

  
	    @Column(name = "total_omc_supply_hour_day_night")
	    private BigDecimal totalOmcSupplyHourDayNight;

	    @Column(name = "created_on")
	    private Date createdOn;


	    @Column(name = "created_by")
	    private String created_by;
	    
	    @Column(name = "avg_power_plant_kw")
	    private BigDecimal avgPowerPlantKw;

       @Column(name = "avg_power_plant_kwh")
	   private BigDecimal avgPowerPlantKwh;

      @Column(name = "mgl1_plantVoltage")
      private BigDecimal mgl1PlantVoltage;

      @Column(name = "mgl1_plantCurrent")
     private BigDecimal mgl1PlantCurrent;

      @Column(name = "mgl1_plantPowerKW")
    private BigDecimal mgl1PlantPowerKW;

    @Column(name = "mgl1_plantPowerKWH")
    private BigDecimal mgl1PlantPowerKWH;

    @Column(name = "mgl1_freqHZ")
    private BigDecimal mgl1FreqHZ;

    @Column(name = "mgl1_pf")
    private BigDecimal mgl1Pf;

    @Column(name = "mgl1_lineVoltage")
    private BigDecimal mgl1LineVoltage;

    @Column(name = "mgl1_lineCurrent")
    private BigDecimal mgl1LineCurrent;


    @Column(name = "mgl1_lineAvgPowerKW")
    private BigDecimal mgl1LineAvgPowerKW;


    @Column(name = "mgl1_linePeakPowerKW")
    private BigDecimal mgl1LinePeakPowerKW;

    @Column(name = "mgl1_linePowerKW")
    private BigDecimal mgl1LinePowerKW;


    @Column(name = "mgl1_linePowerKWH")
    private BigDecimal mgl1LinePowerKWH;


    @Column(name = "mgl1_lineTrnsLossPercentage")
    private BigDecimal mgl1LineTrnsLossPercentage;


    @Column(name = "mgl1_omcSuppliedDayHours")
    private BigDecimal mgl1OmcSuppliedDayHours;


    @Column(name = "mgl1_omcSuppliedNightHours")
    private BigDecimal mgl1OmcSuppliedNightHours;


    @Column(name = "mgl1_totalOmcSuppliedHours")
    private BigDecimal mgl1TotalOmcSuppliedHours;


    @Column(name = "mgl2_plantVoltage")
    private BigDecimal mgl2PlantVoltage;

    @Column(name = "mgl2_plantCurrent")
    private BigDecimal mgl2PlantCurrent;

    @Column(name = "mgl2_plantPowerKW")
    private BigDecimal mgl2PlantPowerKW;

    @Column(name = "mgl2_plantPowerKWH")
    private BigDecimal mgl2PlantPowerKWH;

    @Column(name = "mgl2_freqHZ")
    private BigDecimal mgl2FreqHZ;

    @Column(name = "mgl2_pf")
    private BigDecimal mgl2Pf;

    @Column(name = "mgl2_lineVoltage")
    private BigDecimal mgl2LineVoltage;

    @Column(name = "mgl2_lineCurrent")
    private BigDecimal mgl2LineCurrent;

    @Column(name = "mgl2_lineAvgPowerKW")
    private BigDecimal mgl2LineAvgPowerKW;

    @Column(name = "mgl2_linePeakPowerKW")
    private BigDecimal mgl2LinePeakPowerKW;

    @Column(name = "mgl2_linePowerKW")
    private BigDecimal mgl2LinePowerKW;

	    @Column(name = "mgl2_linePowerKWH")
	    private BigDecimal mgl2LinePowerKWH;

        @Column(name = "mgl2_lineTrnsLossPercentage")
	    private BigDecimal mgl2LineTrnsLossPercentage;

        @Column(name = "mgl2_omcSuppliedDayHours")
	    private BigDecimal mgl2OmcSuppliedDayHours;

       @Column(name = "mgl2_omcSuppliedNightHours")
	    private BigDecimal mgl2OmcSuppliedNightHours;

        @Column(name = "mgl2_totalOmcSuppliedHours")
	    private BigDecimal mgl2TotalOmcSuppliedHours;

       @Column(name = "mgl3_plantVoltage")
	    private BigDecimal mgl3PlantVoltage;


	    @Column(name = "mgl3_plantCurrent")
	    private BigDecimal mgl3PlantCurrent;

  
	    @Column(name = "mgl3_plantPowerKW")
	    private BigDecimal mgl3PlantPowerKW;

	    @Column(name = "mgl3_plantPowerKWH")
	    private BigDecimal mgl3PlantPowerKWH;

        @Column(name = "mgl3_freqHZ")
	    private BigDecimal mgl3FreqHZ;

        @Column(name = "mgl3_pf")
	    private BigDecimal mgl3Pf;

        @Column(name = "mgl3_lineVoltage")
	    private BigDecimal mgl3LineVoltage;

        @Column(name = "mgl3_lineAvgPowerKW")
	    private BigDecimal mgl3LineAvgPowerKW;

        @Column(name = "mgl3_linePeakPowerKW")
	    private BigDecimal mgl3LinePeakPowerKW;

        @Column(name = "mgl3_linePowerKWH")
	    private BigDecimal mgl3LinePowerKWH;

        @Column(name = "mgl3_lineTrnsLossPercentage")
	    private BigDecimal mgl3LineTrnsLossPercentage;

        @Column(name = "mgl3_omcSuppliedDayHours")
	    private BigDecimal mgl3OmcSuppliedDayHours;

        @Column(name = "mgl3_omcSuppliedNightHours")
	    private BigDecimal mgl3OmcSuppliedNightHours;

        @Column(name = "mgl3_totalOmcSuppliedHours")
	    private BigDecimal mgl3TotalOmcSuppliedHours;

        

		public TemplateMinigridData() {
			super();
		}

		public Long getRmId() {
			return rmId;
		}

		public void setRmId(Long rmId) {
			this.rmId = rmId;
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

		public int getOmcId() {
			return omcId;
		}

		public void setOmcId(int omcId) {
			this.omcId = omcId;
		}

		public BigDecimal getMgl1PlantVoltage() {
			return mgl1PlantVoltage;
		}

		public void setMgl1PlantVoltage(BigDecimal mgl1PlantVoltage) {
			this.mgl1PlantVoltage = mgl1PlantVoltage;
		}

		public BigDecimal getMgl1PlantCurrent() {
			return mgl1PlantCurrent;
		}

		public void setMgl1PlantCurrent(BigDecimal mgl1PlantCurrent) {
			this.mgl1PlantCurrent = mgl1PlantCurrent;
		}

		public BigDecimal getMgl1PlantPowerKW() {
			return mgl1PlantPowerKW;
		}

		public void setMgl1PlantPowerKW(BigDecimal mgl1PlantPowerKW) {
			this.mgl1PlantPowerKW = mgl1PlantPowerKW;
		}

		public BigDecimal getMgl1PlantPowerKWH() {
			return mgl1PlantPowerKWH;
		}

		public void setMgl1PlantPowerKWH(BigDecimal mgl1PlantPowerKWH) {
			this.mgl1PlantPowerKWH = mgl1PlantPowerKWH;
		}

		public BigDecimal getMgl1FreqHZ() {
			return mgl1FreqHZ;
		}

		public void setMgl1FreqHZ(BigDecimal mgl1FreqHZ) {
			this.mgl1FreqHZ = mgl1FreqHZ;
		}

		public BigDecimal getMgl1Pf() {
			return mgl1Pf;
		}

		public void setMgl1Pf(BigDecimal mgl1Pf) {
			this.mgl1Pf = mgl1Pf;
		}

		public BigDecimal getMgl1LineVoltage() {
			return mgl1LineVoltage;
		}

		public void setMgl1LineVoltage(BigDecimal mgl1LineVoltage) {
			this.mgl1LineVoltage = mgl1LineVoltage;
		}

		public BigDecimal getMgl1LineCurrent() {
			return mgl1LineCurrent;
		}

		public void setMgl1LineCurrent(BigDecimal mgl1LineCurrent) {
			this.mgl1LineCurrent = mgl1LineCurrent;
		}

		public BigDecimal getMgl1LineAvgPowerKW() {
			return mgl1LineAvgPowerKW;
		}

		public void setMgl1LineAvgPowerKW(BigDecimal mgl1LineAvgPowerKW) {
			this.mgl1LineAvgPowerKW = mgl1LineAvgPowerKW;
		}

		public BigDecimal getMgl1LinePeakPowerKW() {
			return mgl1LinePeakPowerKW;
		}

		public void setMgl1LinePeakPowerKW(BigDecimal mgl1LinePeakPowerKW) {
			this.mgl1LinePeakPowerKW = mgl1LinePeakPowerKW;
		}

		public BigDecimal getMgl1LinePowerKW() {
			return mgl1LinePowerKW;
		}

		public void setMgl1LinePowerKW(BigDecimal mgl1LinePowerKW) {
			this.mgl1LinePowerKW = mgl1LinePowerKW;
		}

		public BigDecimal getMgl1LinePowerKWH() {
			return mgl1LinePowerKWH;
		}

		public void setMgl1LinePowerKWH(BigDecimal mgl1LinePowerKWH) {
			this.mgl1LinePowerKWH = mgl1LinePowerKWH;
		}

		public BigDecimal getMgl1LineTrnsLossPercentage() {
			return mgl1LineTrnsLossPercentage;
		}

		public void setMgl1LineTrnsLossPercentage(BigDecimal mgl1LineTrnsLossPercentage) {
			this.mgl1LineTrnsLossPercentage = mgl1LineTrnsLossPercentage;
		}

		public BigDecimal getMgl1OmcSuppliedDayHours() {
			return mgl1OmcSuppliedDayHours;
		}

		public void setMgl1OmcSuppliedDayHours(BigDecimal mgl1OmcSuppliedDayHours) {
			this.mgl1OmcSuppliedDayHours = mgl1OmcSuppliedDayHours;
		}

		public BigDecimal getMgl1OmcSuppliedNightHours() {
			return mgl1OmcSuppliedNightHours;
		}

		public void setMgl1OmcSuppliedNightHours(BigDecimal mgl1OmcSuppliedNightHours) {
			this.mgl1OmcSuppliedNightHours = mgl1OmcSuppliedNightHours;
		}

		public BigDecimal getMgl1TotalOmcSuppliedHours() {
			return mgl1TotalOmcSuppliedHours;
		}

		public void setMgl1TotalOmcSuppliedHours(BigDecimal mgl1TotalOmcSuppliedHours) {
			this.mgl1TotalOmcSuppliedHours = mgl1TotalOmcSuppliedHours;
		}

		public BigDecimal getMgl2PlantVoltage() {
			return mgl2PlantVoltage;
		}

		public void setMgl2PlantVoltage(BigDecimal mgl2PlantVoltage) {
			this.mgl2PlantVoltage = mgl2PlantVoltage;
		}

		public BigDecimal getMgl2PlantCurrent() {
			return mgl2PlantCurrent;
		}

		public void setMgl2PlantCurrent(BigDecimal mgl2PlantCurrent) {
			this.mgl2PlantCurrent = mgl2PlantCurrent;
		}

		public BigDecimal getMgl2PlantPowerKW() {
			return mgl2PlantPowerKW;
		}

		public void setMgl2PlantPowerKW(BigDecimal mgl2PlantPowerKW) {
			this.mgl2PlantPowerKW = mgl2PlantPowerKW;
		}

		public BigDecimal getMgl2PlantPowerKWH() {
			return mgl2PlantPowerKWH;
		}

		public void setMgl2PlantPowerKWH(BigDecimal mgl2PlantPowerKWH) {
			this.mgl2PlantPowerKWH = mgl2PlantPowerKWH;
		}

		public BigDecimal getMgl2FreqHZ() {
			return mgl2FreqHZ;
		}

		public void setMgl2FreqHZ(BigDecimal mgl2FreqHZ) {
			this.mgl2FreqHZ = mgl2FreqHZ;
		}

		public BigDecimal getMgl2Pf() {
			return mgl2Pf;
		}

		public void setMgl2Pf(BigDecimal mgl2Pf) {
			this.mgl2Pf = mgl2Pf;
		}

		public BigDecimal getMgl2LineVoltage() {
			return mgl2LineVoltage;
		}

		public void setMgl2LineVoltage(BigDecimal mgl2LineVoltage) {
			this.mgl2LineVoltage = mgl2LineVoltage;
		}

		public BigDecimal getMgl2LineCurrent() {
			return mgl2LineCurrent;
		}

		public void setMgl2LineCurrent(BigDecimal mgl2LineCurrent) {
			this.mgl2LineCurrent = mgl2LineCurrent;
		}

		public BigDecimal getMgl2LineAvgPowerKW() {
			return mgl2LineAvgPowerKW;
		}

		public void setMgl2LineAvgPowerKW(BigDecimal mgl2LineAvgPowerKW) {
			this.mgl2LineAvgPowerKW = mgl2LineAvgPowerKW;
		}

		public BigDecimal getMgl2LinePeakPowerKW() {
			return mgl2LinePeakPowerKW;
		}

		public void setMgl2LinePeakPowerKW(BigDecimal mgl2LinePeakPowerKW) {
			this.mgl2LinePeakPowerKW = mgl2LinePeakPowerKW;
		}

		public BigDecimal getMgl2LinePowerKW() {
			return mgl2LinePowerKW;
		}

		public void setMgl2LinePowerKW(BigDecimal mgl2LinePowerKW) {
			this.mgl2LinePowerKW = mgl2LinePowerKW;
		}

		public BigDecimal getMgl2LinePowerKWH() {
			return mgl2LinePowerKWH;
		}

		public void setMgl2LinePowerKWH(BigDecimal mgl2LinePowerKWH) {
			this.mgl2LinePowerKWH = mgl2LinePowerKWH;
		}

		public BigDecimal getMgl2LineTrnsLossPercentage() {
			return mgl2LineTrnsLossPercentage;
		}

		public void setMgl2LineTrnsLossPercentage(BigDecimal mgl2LineTrnsLossPercentage) {
			this.mgl2LineTrnsLossPercentage = mgl2LineTrnsLossPercentage;
		}

		public BigDecimal getMgl2OmcSuppliedDayHours() {
			return mgl2OmcSuppliedDayHours;
		}

		public void setMgl2OmcSuppliedDayHours(BigDecimal mgl2OmcSuppliedDayHours) {
			this.mgl2OmcSuppliedDayHours = mgl2OmcSuppliedDayHours;
		}

		public BigDecimal getMgl2OmcSuppliedNightHours() {
			return mgl2OmcSuppliedNightHours;
		}

		public void setMgl2OmcSuppliedNightHours(BigDecimal mgl2OmcSuppliedNightHours) {
			this.mgl2OmcSuppliedNightHours = mgl2OmcSuppliedNightHours;
		}

		public BigDecimal getMgl2TotalOmcSuppliedHours() {
			return mgl2TotalOmcSuppliedHours;
		}

		public void setMgl2TotalOmcSuppliedHours(BigDecimal mgl2TotalOmcSuppliedHours) {
			this.mgl2TotalOmcSuppliedHours = mgl2TotalOmcSuppliedHours;
		}

		public BigDecimal getMgl3PlantVoltage() {
			return mgl3PlantVoltage;
		}

		public void setMgl3PlantVoltage(BigDecimal mgl3PlantVoltage) {
			this.mgl3PlantVoltage = mgl3PlantVoltage;
		}

		public BigDecimal getMgl3PlantCurrent() {
			return mgl3PlantCurrent;
		}

		public void setMgl3PlantCurrent(BigDecimal mgl3PlantCurrent) {
			this.mgl3PlantCurrent = mgl3PlantCurrent;
		}

		public BigDecimal getMgl3PlantPowerKW() {
			return mgl3PlantPowerKW;
		}

		public void setMgl3PlantPowerKW(BigDecimal mgl3PlantPowerKW) {
			this.mgl3PlantPowerKW = mgl3PlantPowerKW;
		}

		public BigDecimal getMgl3PlantPowerKWH() {
			return mgl3PlantPowerKWH;
		}

		public void setMgl3PlantPowerKWH(BigDecimal mgl3PlantPowerKWH) {
			this.mgl3PlantPowerKWH = mgl3PlantPowerKWH;
		}

		public BigDecimal getMgl3FreqHZ() {
			return mgl3FreqHZ;
		}

		public void setMgl3FreqHZ(BigDecimal mgl3FreqHZ) {
			this.mgl3FreqHZ = mgl3FreqHZ;
		}

		public BigDecimal getMgl3Pf() {
			return mgl3Pf;
		}

		public void setMgl3Pf(BigDecimal mgl3Pf) {
			this.mgl3Pf = mgl3Pf;
		}

		public BigDecimal getMgl3LineVoltage() {
			return mgl3LineVoltage;
		}

		public void setMgl3LineVoltage(BigDecimal mgl3LineVoltage) {
			this.mgl3LineVoltage = mgl3LineVoltage;
		}

		public BigDecimal getMgl3LineAvgPowerKW() {
			return mgl3LineAvgPowerKW;
		}

		public void setMgl3LineAvgPowerKW(BigDecimal mgl3LineAvgPowerKW) {
			this.mgl3LineAvgPowerKW = mgl3LineAvgPowerKW;
		}

		public BigDecimal getMgl3LinePeakPowerKW() {
			return mgl3LinePeakPowerKW;
		}

		public void setMgl3LinePeakPowerKW(BigDecimal mgl3LinePeakPowerKW) {
			this.mgl3LinePeakPowerKW = mgl3LinePeakPowerKW;
		}

		public BigDecimal getMgl3LinePowerKWH() {
			return mgl3LinePowerKWH;
		}

		public void setMgl3LinePowerKWH(BigDecimal mgl3LinePowerKWH) {
			this.mgl3LinePowerKWH = mgl3LinePowerKWH;
		}

		public BigDecimal getMgl3LineTrnsLossPercentage() {
			return mgl3LineTrnsLossPercentage;
		}

		public void setMgl3LineTrnsLossPercentage(BigDecimal mgl3LineTrnsLossPercentage) {
			this.mgl3LineTrnsLossPercentage = mgl3LineTrnsLossPercentage;
		}

		public BigDecimal getMgl3OmcSuppliedDayHours() {
			return mgl3OmcSuppliedDayHours;
		}

		public void setMgl3OmcSuppliedDayHours(BigDecimal mgl3OmcSuppliedDayHours) {
			this.mgl3OmcSuppliedDayHours = mgl3OmcSuppliedDayHours;
		}

		public BigDecimal getMgl3OmcSuppliedNightHours() {
			return mgl3OmcSuppliedNightHours;
		}

		public void setMgl3OmcSuppliedNightHours(BigDecimal mgl3OmcSuppliedNightHours) {
			this.mgl3OmcSuppliedNightHours = mgl3OmcSuppliedNightHours;
		}

		public BigDecimal getMgl3TotalOmcSuppliedHours() {
			return mgl3TotalOmcSuppliedHours;
		}

		public void setMgl3TotalOmcSuppliedHours(BigDecimal mgl3TotalOmcSuppliedHours) {
			this.mgl3TotalOmcSuppliedHours = mgl3TotalOmcSuppliedHours;
		}

		public BigDecimal getTotalMgPlantVoltage() {
			return totalMgPlantVoltage;
		}

		public void setTotalMgPlantVoltage(BigDecimal totalMgPlantVoltage) {
			this.totalMgPlantVoltage = totalMgPlantVoltage;
		}

		public BigDecimal getTotalMgPlantCurrent() {
			return totalMgPlantCurrent;
		}

		public void setTotalMgPlantCurrent(BigDecimal totalMgPlantCurrent) {
			this.totalMgPlantCurrent = totalMgPlantCurrent;
		}

		public BigDecimal getTotalMgPlantPowerKw() {
			return totalMgPlantPowerKw;
		}

		public void setTotalMgPlantPowerKw(BigDecimal totalMgPlantPowerKw) {
			this.totalMgPlantPowerKw = totalMgPlantPowerKw;
		}

		public BigDecimal getTotalMgPlantPowerKwh() {
			return totalMgPlantPowerKwh;
		}

		public void setTotalMgPlantPowerKwh(BigDecimal totalMgPlantPowerKwh) {
			this.totalMgPlantPowerKwh = totalMgPlantPowerKwh;
		}

		public BigDecimal getTotalMgFreqHz() {
			return totalMgFreqHz;
		}

		public void setTotalMgFreqHz(BigDecimal totalMgFreqHz) {
			this.totalMgFreqHz = totalMgFreqHz;
		}

		public BigDecimal getTotalMgPf() {
			return totalMgPf;
		}

		public void setTotalMgPf(BigDecimal totalMgPf) {
			this.totalMgPf = totalMgPf;
		}

		public BigDecimal getTotalMgAvgPowerKw() {
			return totalMgAvgPowerKw;
		}

		public void setTotalMgAvgPowerKw(BigDecimal totalMgAvgPowerKw) {
			this.totalMgAvgPowerKw = totalMgAvgPowerKw;
		}

		public BigDecimal getTotalMgPeakPowerKw() {
			return totalMgPeakPowerKw;
		}

		public void setTotalMgPeakPowerKw(BigDecimal totalMgPeakPowerKw) {
			this.totalMgPeakPowerKw = totalMgPeakPowerKw;
		}

		public BigDecimal getTotalMgPowerCustomerKw() {
			return totalMgPowerCustomerKw;
		}

		public void setTotalMgPowerCustomerKw(BigDecimal totalMgPowerCustomerKw) {
			this.totalMgPowerCustomerKw = totalMgPowerCustomerKw;
		}

		public BigDecimal getTotalMgPowerCustomerKwh() {
			return totalMgPowerCustomerKwh;
		}

		public void setTotalMgPowerCustomerKwh(BigDecimal totalMgPowerCustomerKwh) {
			this.totalMgPowerCustomerKwh = totalMgPowerCustomerKwh;
		}

		public BigDecimal getTotalLossMgPrecentage() {
			return totalLossMgPrecentage;
		}

		public void setTotalLossMgPrecentage(BigDecimal totalLossMgPrecentage) {
			this.totalLossMgPrecentage = totalLossMgPrecentage;
		}

		public BigDecimal getTotalOmcSupplyHourDay() {
			return totalOmcSupplyHourDay;
		}

		public void setTotalOmcSupplyHourDay(BigDecimal totalOmcSupplyHourDay) {
			this.totalOmcSupplyHourDay = totalOmcSupplyHourDay;
		}

		public BigDecimal getTotal_omcSupplyHourNight() {
			return total_omcSupplyHourNight;
		}

		public void setTotal_omcSupplyHourNight(BigDecimal total_omcSupplyHourNight) {
			this.total_omcSupplyHourNight = total_omcSupplyHourNight;
		}

		public BigDecimal getTotalOmcSupplyHourDayNight() {
			return totalOmcSupplyHourDayNight;
		}

		public void setTotalOmcSupplyHourDayNight(BigDecimal totalOmcSupplyHourDayNight) {
			this.totalOmcSupplyHourDayNight = totalOmcSupplyHourDayNight;
		}

		public Date getCreatedOn() {
			return createdOn;
		}

		public void setCreatedOn(Date createdOn) {
			this.createdOn = createdOn;
		}

		public String getCreated_by() {
			return created_by;
		}

		public void setCreated_by(String created_by) {
			this.created_by = created_by;
		}

		public BigDecimal getAvgPowerPlantKw() {
			return avgPowerPlantKw;
		}

		public void setAvgPowerPlantKw(BigDecimal avgPowerPlantKw) {
			this.avgPowerPlantKw = avgPowerPlantKw;
		}

		public BigDecimal getAvgPowerPlantKwh() {
			return avgPowerPlantKwh;
		}

		public void setAvgPowerPlantKwh(BigDecimal avgPowerPlantKwh) {
			this.avgPowerPlantKwh = avgPowerPlantKwh;
		}

}
