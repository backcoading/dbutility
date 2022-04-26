package com.omc.dbUtility.rms.dto;

import java.util.List;


public class PowerEnergyDTO {

	private List<PowerEnergy> powerEnergies;

	public class PowerEnergy {
		
		
		private String plantId;
		private String omcId;
		private String userId;
		private String userEmail;
		
		
		public String getPlantId() {
			return plantId;
		}
		public String getOmcId() {
			return omcId;
		}
		public String getUserId() {
			return userId;
		}
		public String getUserEmail() {
			return userEmail;
		}
		public void setPlantId(String plantId) {
			this.plantId = plantId;
		}
		public void setOmcId(String omcId) {
			this.omcId = omcId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public void setUserEmail(String userEmail) {
			this.userEmail = userEmail;
		}
		private String mainDG;
		private String mobileDG;

		private String solarPwKwh;

		private String telecomePlantPwKwh;
		private String telecomeTowerPwKwh;

		private String communityPwKwh;

		private String batteryChargePwKwh;
		private String batteryDisChargePwKwh;

		public String getMainDG() {
			return mainDG;
		}
		public String getMobileDG() {
			return mobileDG;
		}
		public String getSolarPwKwh() {
			return solarPwKwh;
		}
		public String getTelecomePlantPwKwh() {
			return telecomePlantPwKwh;
		}
		public String getTelecomeTowerPwKwh() {
			return telecomeTowerPwKwh;
		}
		public String getCommunityPwKwh() {
			return communityPwKwh;
		}
		public String getBatteryChargePwKwh() {
			return batteryChargePwKwh;
		}
		public String getBatteryDisChargePwKwh() {
			return batteryDisChargePwKwh;
		}
		public void setMainDG(String mainDG) {
			this.mainDG = mainDG;
		}
		public void setMobileDG(String mobileDG) {
			this.mobileDG = mobileDG;
		}
		public void setSolarPwKwh(String solarPwKwh) {
			this.solarPwKwh = solarPwKwh;
		}
		public void setTelecomePlantPwKwh(String telecomePlantPwKwh) {
			this.telecomePlantPwKwh = telecomePlantPwKwh;
		}
		public void setTelecomeTowerPwKwh(String telecomeTowerPwKwh) {
			this.telecomeTowerPwKwh = telecomeTowerPwKwh;
		}
		public void setCommunityPwKwh(String communityPwKwh) {
			this.communityPwKwh = communityPwKwh;
		}
		public void setBatteryChargePwKwh(String batteryChargePwKwh) {
			this.batteryChargePwKwh = batteryChargePwKwh;
		}
		public void setBatteryDisChargePwKwh(String batteryDisChargePwKwh) {
			this.batteryDisChargePwKwh = batteryDisChargePwKwh;
		}
	}

	public List<PowerEnergy> getPowerEnergies() {
		return powerEnergies;
	}

	public void setPowerEnergies(List<PowerEnergy> powerEnergies) {
		this.powerEnergies = powerEnergies;
	}

}
