package com.omc.dbUtility.rms.dto;

import java.util.List;

public class BatteryDatadto {

	public BatteryDatadto() {
		super();
	}

	private List<BatteryData>  batteryData;

	public List<BatteryData> getBatteryData() {
		return batteryData;
	}

	public void setBatteryData(List<BatteryData> batteryData) {
		this.batteryData = batteryData;
	}

	public static class BatteryData{

		private String batteryBankName;// 1,
		private String batteryBankChargeCurrent;// 148,
		private String batteryBankChargeVoltage;// 102,
		private String batteryBankChargePowerKw;// 10,
		private String batteryBankDischargeCurrent;
		private String batteryBankDischargeVoltage;// 102,
		private String batteryBankDischargePowerKw;// 10,

		private List<BatteryStringList> batteryStringList;// 1,

		public String getBatteryBankName() {
			return batteryBankName;
		}

		public String getBatteryBankChargeCurrent() {
			return batteryBankChargeCurrent;
		}

		public String getBatteryBankChargeVoltage() {
			return batteryBankChargeVoltage;
		}

		public String getBatteryBankChargePowerKw() {
			return batteryBankChargePowerKw;
		}

		public String getBatteryBankDischargeCurrent() {
			return batteryBankDischargeCurrent;
		}

		public String getBatteryBankDischargeVoltage() {
			return batteryBankDischargeVoltage;
		}

		public String getBatteryBankDischargePowerKw() {
			return batteryBankDischargePowerKw;
		}

		public void setBatteryBankName(String batteryBankName) {
			this.batteryBankName = batteryBankName;
		}

		public void setBatteryBankChargeCurrent(String batteryBankChargeCurrent) {
			this.batteryBankChargeCurrent = batteryBankChargeCurrent;
		}

		public void setBatteryBankChargeVoltage(String batteryBankChargeVoltage) {
			this.batteryBankChargeVoltage = batteryBankChargeVoltage;
		}

		public void setBatteryBankChargePowerKw(String batteryBankChargePowerKw) {
			this.batteryBankChargePowerKw = batteryBankChargePowerKw;
		}

		public void setBatteryBankDischargeCurrent(String batteryBankDischargeCurrent) {
			this.batteryBankDischargeCurrent = batteryBankDischargeCurrent;
		}

		public void setBatteryBankDischargeVoltage(String batteryBankDischargeVoltage) {
			this.batteryBankDischargeVoltage = batteryBankDischargeVoltage;
		}

		public void setBatteryBankDischargePowerKw(String batteryBankDischargePowerKw) {
			this.batteryBankDischargePowerKw = batteryBankDischargePowerKw;
		}


		public List<BatteryStringList> getBatteryStringList() {
			return batteryStringList;
		}

		public void setBatteryStringList(List<BatteryStringList> batteryStringList) {
			this.batteryStringList = batteryStringList;
		}




	}

	public static class BatteryStringList{

		private String batteryStringName;// 1,
		public String getBatteryStringName() {
			return batteryStringName;
		}
		public String getBatteryStringChargeCurrent() {
			return batteryStringChargeCurrent;
		}
		public String getBatteryStringChargeVoltage() {
			return batteryStringChargeVoltage;
		}
		public String getBatteryStringChargePowerKw() {
			return batteryStringChargePowerKw;
		}
		public String getBatteryStringDischargeCurrent() {
			return batteryStringDischargeCurrent;
		}
		public String getBatteryStringDischargeVoltage() {
			return batteryStringDischargeVoltage;
		}
		public String getBatteryStringDischargePowerKw() {
			return batteryStringDischargePowerKw;
		}
		public void setBatteryStringName(String batteryStringName) {
			this.batteryStringName = batteryStringName;
		}
		public void setBatteryStringChargeCurrent(String batteryStringChargeCurrent) {
			this.batteryStringChargeCurrent = batteryStringChargeCurrent;
		}
		public void setBatteryStringChargeVoltage(String batteryStringChargeVoltage) {
			this.batteryStringChargeVoltage = batteryStringChargeVoltage;
		}
		public void setBatteryStringChargePowerKw(String batteryStringChargePowerKw) {
			this.batteryStringChargePowerKw = batteryStringChargePowerKw;
		}
		public void setBatteryStringDischargeCurrent(String batteryStringDischargeCurrent) {
			this.batteryStringDischargeCurrent = batteryStringDischargeCurrent;
		}
		public void setBatteryStringDischargeVoltage(String batteryStringDischargeVoltage) {
			this.batteryStringDischargeVoltage = batteryStringDischargeVoltage;
		}
		public void setBatteryStringDischargePowerKw(String batteryStringDischargePowerKw) {
			this.batteryStringDischargePowerKw = batteryStringDischargePowerKw;
		}
		private String batteryStringChargeCurrent;// 148,
		private String batteryStringChargeVoltage;// 102,
		private String batteryStringChargePowerKw;// 10,
		private String batteryStringDischargeCurrent;// 1,
		private String batteryStringDischargeVoltage;// 10,
		private String batteryStringDischargePowerKw;// 1,




	}


}