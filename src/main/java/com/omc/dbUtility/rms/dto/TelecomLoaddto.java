package com.omc.dbUtility.rms.dto;

import java.math.BigDecimal;
import java.util.List;


public class TelecomLoaddto {
	
	public TelecomLoaddto() {
		super();
	}

	public List<TowerLoadData> getTowerLoadData() {
		return towerLoadData;
	}

	public void setTowerLoadData(List<TowerLoadData> towerLoadData) {
		this.towerLoadData = towerLoadData;
	}

	private List<TowerLoadData>  towerLoadData;

	public static class TowerLoadData{
		
	     private BigDecimal t1PlantVoltage;

	     private BigDecimal t1PlantCurrent;

	     private BigDecimal t1PlantPowerKW;

	     private BigDecimal t1PlantPowerKWH;

	     private BigDecimal t1FreqHZ;

	     private BigDecimal t1Pf;

	     private BigDecimal t1TowerVoltage;

	     private BigDecimal t1TowerCurrent;

	     private BigDecimal t1TowerAvgPowerKW;

	     private BigDecimal t1TowerPeakPowerKW;

	     private BigDecimal t1TowerPowerKW;

	     private BigDecimal t1TowerPowerKWH;

	     private BigDecimal t1TowerTrnsLossPercentage;

	     private BigDecimal t1OmcSuppliedDayHours;

	     private BigDecimal t1OmcSuppliedNightHours;

	     private BigDecimal t1TotalOmcSuppliedHours;

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
	     
	     
		
		
		}
}