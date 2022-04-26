package com.omc.dbUtility.dto;

import java.util.List;

public class SolarDatadto {
	
	public SolarDatadto() {
		super();
	}

	

	private List<SolarData>  solarData;

	public List<SolarData> getSolarData() {
		return solarData;
	}

	public void setSolarData(List<SolarData> solarData) {
		this.solarData = solarData;
	}

	public static class SolarData{
		
		private String mppptName;// 1,
		private String mpptCurrent;// 148,
		private String mpptPowerKw;// 102,
		private String mpptSolarGenKwh;// 10,
		private String mppptVoltage;
		private List<StringList> stringList;// 1,
		public String getMppptName() {
			return mppptName;
		}
		public void setMppptName(String mppptName) {
			this.mppptName = mppptName;
		}
		public String getMpptCurrent() {
			return mpptCurrent;
		}
		public void setMpptCurrent(String mpptCurrent) {
			this.mpptCurrent = mpptCurrent;
		}
		public String getMpptPowerKw() {
			return mpptPowerKw;
		}
		public void setMpptPowerKw(String mpptPowerKw) {
			this.mpptPowerKw = mpptPowerKw;
		}
		public String getMpptSolarGenKwh() {
			return mpptSolarGenKwh;
		}
		public void setMpptSolarGenKwh(String mpptSolarGenKwh) {
			this.mpptSolarGenKwh = mpptSolarGenKwh;
		}
		public List<StringList> getStringList() {
			return stringList;
		}
		public void setStringList(List<StringList> stringList) {
			this.stringList = stringList;
		}
		public String getMppptVoltage() {
			return mppptVoltage;
		}
		public void setMppptVoltage(String mppptVoltage) {
			this.mppptVoltage = mppptVoltage;
		}
		@Override
		public String toString() {
			return "SolarData [mppptName=" + mppptName + ", mpptCurrent=" + mpptCurrent + ", mpptPowerKw=" + mpptPowerKw
					+ ", mpptSolarGenKwh=" + mpptSolarGenKwh + ", mppptVoltage=" + mppptVoltage + ", stringList="
					+ stringList + "]";
		}

		
		
			}

public static class StringList{
		
		private String stringName;// 1,
		private String stringVoltage;// 148,
		private String stringCurrent;// 102,
		private String stringPowerKw;// 10,
		private String stringSolarGenKwh;// 1,
		public String getStringName() {
			return stringName;
		}
		public void setStringName(String stringName) {
			this.stringName = stringName;
		}
		public String getStringVoltage() {
			return stringVoltage;
		}
		public void setStringVoltage(String stringVoltage) {
			this.stringVoltage = stringVoltage;
		}
		public String getStringCurrent() {
			return stringCurrent;
		}
		public void setStringCurrent(String stringCurrent) {
			this.stringCurrent = stringCurrent;
		}
		public String getStringPowerKw() {
			return stringPowerKw;
		}
		public void setStringPowerKw(String stringPowerKw) {
			this.stringPowerKw = stringPowerKw;
		}
		public String getStringSolarGenKwh() {
			return stringSolarGenKwh;
		}
		public void setStringSolarGenKwh(String stringSolarGenKwh) {
			this.stringSolarGenKwh = stringSolarGenKwh;
		}
		@Override
		public String toString() {
			return "StringList [stringName=" + stringName + ", stringVoltage=" + stringVoltage + ", stringCurrent="
					+ stringCurrent + ", stringPowerKw=" + stringPowerKw + ", stringSolarGenKwh=" + stringSolarGenKwh
					+ "]";
		}
		
		
		
			
			}


}