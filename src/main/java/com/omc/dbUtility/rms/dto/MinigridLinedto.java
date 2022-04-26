package com.omc.dbUtility.rms.dto;

import java.util.List;

public class MinigridLinedto {
	
	public MinigridLinedto() {
		super();
	}

	public List<MinigridLine> getMinigridLine() {
		return MinigridLine;
	}

	public void setMinigridLine(List<MinigridLine> MinigridLine) {
		this.MinigridLine = MinigridLine;
	}

	private List<MinigridLine>  MinigridLine;

	public static class MinigridLine{
		
		private String lineId;// 1,
		private String lineName;
		private String plantVoltage;// 148,
		private String plantCurrent;// 102,
		private String plantPowerKW;// 10,
		private String plantPowerKWH;// 1,
		private String freqHZ;// 148,
		private String pf;// 102,
		private String lineVoltage;// 10,
		private String lineCurrent;// 1,
		private String lineAvgPowerKW;//10,
		private String linePeakPowerKW;//10,
		private String linePowerKW;//10,
		private String linePowerKWH;//10,
		private String lineTrnsLossPercentage;//10,
		private String omcSuppliedDayHours;//10,
		private String omcSuppliedNightHours;//10,
		private String totalOmcSuppliedHours;//10
		
		
		
		public MinigridLine() {
			super();
			// TODO Auto-generated constructor stub
		}




		public String getPlantVoltage() {
			return plantVoltage;
		}



		public void setPlantVoltage(String plantVoltage) {
			this.plantVoltage = plantVoltage;
		}



		public String getPlantCurrent() {
			return plantCurrent;
		}



		public void setPlantCurrent(String plantCurrent) {
			this.plantCurrent = plantCurrent;
		}



		public String getPlantPowerKW() {
			return plantPowerKW;
		}



		public void setPlantPowerKW(String plantPowerKW) {
			this.plantPowerKW = plantPowerKW;
		}



		public String getPlantPowerKWH() {
			return plantPowerKWH;
		}



		public void setPlantPowerKWH(String plantPowerKWH) {
			this.plantPowerKWH = plantPowerKWH;
		}



		public String getFreqHZ() {
			return freqHZ;
		}



		public void setFreqHZ(String freqHZ) {
			this.freqHZ = freqHZ;
		}



		public String getPf() {
			return pf;
		}



		public void setPf(String pf) {
			this.pf = pf;
		}



		public String getlineVoltage() {
			return lineVoltage;
		}



		public void setlineVoltage(String lineVoltage) {
			this.lineVoltage = lineVoltage;
		}



		public String getlineCurrent() {
			return lineCurrent;
		}



		public void setlineCurrent(String lineCurrent) {
			this.lineCurrent = lineCurrent;
		}



		public String getlineAvgPowerKW() {
			return lineAvgPowerKW;
		}



		public void setlineAvgPowerKW(String lineAvgPowerKW) {
			this.lineAvgPowerKW = lineAvgPowerKW;
		}



		public String getlinePeakPowerKW() {
			return linePeakPowerKW;
		}



		public void setlinePeakPowerKW(String linePeakPowerKW) {
			this.linePeakPowerKW = linePeakPowerKW;
		}



		public String getlinePowerKW() {
			return linePowerKW;
		}



		public void setlinePowerKW(String linePowerKW) {
			this.linePowerKW = linePowerKW;
		}



		public String getlinePowerKWH() {
			return linePowerKWH;
		}



		public void setlinePowerKWH(String linePowerKWH) {
			this.linePowerKWH = linePowerKWH;
		}



		public String getlineTrnsLossPercentage() {
			return lineTrnsLossPercentage;
		}



		public void setlineTrnsLossPercentage(String lineTrnsLossPercentage) {
			this.lineTrnsLossPercentage = lineTrnsLossPercentage;
		}



		public String getOmcSuppliedDayHours() {
			return omcSuppliedDayHours;
		}



		public void setOmcSuppliedDayHours(String omcSuppliedDayHours) {
			this.omcSuppliedDayHours = omcSuppliedDayHours;
		}



		public String getOmcSuppliedNightHours() {
			return omcSuppliedNightHours;
		}



		public void setOmcSuppliedNightHours(String omcSuppliedNightHours) {
			this.omcSuppliedNightHours = omcSuppliedNightHours;
		}



		public String getTotalOmcSuppliedHours() {
			return totalOmcSuppliedHours;
		}



		public void setTotalOmcSuppliedHours(String totalOmcSuppliedHours) {
			this.totalOmcSuppliedHours = totalOmcSuppliedHours;
		}



		public String getLineName() {
			return lineName;
		}



		public void setLineName(String lineName) {
			this.lineName = lineName;
		}



		public String getLineId() {
			return lineId;
		}



		public void setLineId(String lineId) {
			this.lineId = lineId;
		}
		

	}

}