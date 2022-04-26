package com.omc.dbUtility.rms.dto;

import java.util.List;

public class GraphDTO {

	private List<Graphs> graphs;

	public class Graphs {

		private String plantId;
		private String omcId;
		private String userId;
		private String userEmail;

		private List<SolarData> solarData;
		private List<BatteryData> batteryData;
		private List<DGData> dgData;
		private List<TelecomData> telecomData;

		public List<SolarData> getSolarData() {
			return solarData;
		}
		public List<BatteryData> getBatteryData() {
			return batteryData;
		}
		public List<DGData> getDgData() {
			return dgData;
		}
		public List<TelecomData> getTelecomData() {
			return telecomData;
		}
		public void setSolarData(List<SolarData> solarData) {
			this.solarData = solarData;
		}
		public void setBatteryData(List<BatteryData> batteryData) {
			this.batteryData = batteryData;
		}
		public void setDgData(List<DGData> dgData) {
			this.dgData = dgData;
		}
		public void setTelecomData(List<TelecomData> telecomData) {
			this.telecomData = telecomData;
		}

		public class SolarData {

			private String timestamp;
			private String solarGenKw;
			public String getTimestamp() {
				return timestamp;
			}
			public void setTimestamp(String timestamp) {
				this.timestamp = timestamp;
			}
			public String getSolarGenKw() {
				return solarGenKw;
			}
			public void setSolarGenKw(String solarGenKw) {
				this.solarGenKw = solarGenKw;
			}
		}

		public class BatteryData {

			private String timestamp;
			private String batteryChargePowerKw;
			public String getBatteryChargePowerKw() {
				return batteryChargePowerKw;
			}
			public String getBatteryDischargePowerKw() {
				return batteryDischargePowerKw;
			}
			public void setBatteryChargePowerKw(String batteryChargePowerKw) {
				this.batteryChargePowerKw = batteryChargePowerKw;
			}
			public void setBatteryDischargePowerKw(String batteryDischargePowerKw) {
				this.batteryDischargePowerKw = batteryDischargePowerKw;
			}
			private String batteryDischargePowerKw;
			public String getTimestamp() {
				return timestamp;
			}
			public void setTimestamp(String timestamp) {
				this.timestamp = timestamp;
			}
		}

		public class DGData {

			private String timestamp;
			public String getTotalAllPhasePower() {
				return totalAllPhasePower;
			}
			public void setTotalAllPhasePower(String totalAllPhasePower) {
				this.totalAllPhasePower = totalAllPhasePower;
			}
			private String totalAllPhasePower;
			public String getTimestamp() {
				return timestamp;
			}
			public void setTimestamp(String timestamp) {
				this.timestamp = timestamp;
			}
		}


		public class TelecomData {

			private String timestamp;
			private String plantPowerKw;
			public String getTimestamp() {
				return timestamp;
			}
			public void setTimestamp(String timestamp) {
				this.timestamp = timestamp;
			}
			public String getPlantPowerKw() {
				return plantPowerKw;
			}
			public void setPlantPowerKw(String plantPowerKw) {
				this.plantPowerKw = plantPowerKw;
			}
		}



		public String getUserId() {
			return userId;
		}
		public String getUserEmail() {
			return userEmail;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public void setUserEmail(String userEmail) {
			this.userEmail = userEmail;
		}

		public String getPlantId() {
			return plantId;
		}

		public String getOmcId() {
			return omcId;
		}


		public void setPlantId(String plantId) {
			this.plantId = plantId;
		}

		public void setOmcId(String omcId) {
			this.omcId = omcId;
		}

	}

	public List<Graphs> getGraphs() {
		return graphs;
	}

	public void setGraphs(List<Graphs> graphs) {
		this.graphs = graphs;
	}

}
