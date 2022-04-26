package com.omc.dbUtility.rms.dto;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;

public class MinigridDTO {

	public MinigridDTO() {
		super();
		
	}
	
    private List<MinigridLines1Data> minigridLinesData;
    
      public List<MinigridLines1Data> getMinigridLinesData() {
		return minigridLinesData;
	}

   public void setMinigridLinesData(List<MinigridLines1Data> minigridLinesData) {
		this.minigridLinesData = minigridLinesData;
	}

   public static class MinigridLines1Data
    {
	  
	       private String mgl1Name;
	   
	      private BigDecimal mgl1PlantVoltage;

	      private BigDecimal mgl1PlantCurrent;

	     private BigDecimal mgl1PlantPowerKW;

	     private BigDecimal mgl1PlantPowerKWH;

	     private BigDecimal mgl1FreqHZ;

	     private BigDecimal mgl1Pf;

	     private BigDecimal mgl1LineVoltage;

	     private BigDecimal mgl1LineCurrent;

	     private BigDecimal mgl1LineAvgPowerKW;

	     private BigDecimal mgl1LinePeakPowerKW;

	     private BigDecimal mgl1LinePowerKW;

	     private BigDecimal mgl1LinePowerKWH;

	     private BigDecimal mgl1LineTrnsLossPercentage;

	     private BigDecimal mgl1OmcSuppliedDayHours;

	     private BigDecimal mgl1OmcSuppliedNightHours;

	     private BigDecimal mgl1TotalOmcSuppliedHours;

		public String getMgl1Name() {
			return mgl1Name;
		}

		public void setMgl1Name(String mgl1Name) {
			this.mgl1Name = mgl1Name;
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
	     
	     

    }
   
   
   
}
