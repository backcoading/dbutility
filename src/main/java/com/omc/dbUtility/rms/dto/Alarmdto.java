package com.omc.dbUtility.rms.dto;

import java.util.List;


public class Alarmdto {
	
	public Alarmdto() {
		super();
	}


	private List<Alarms>  alarms;

	public List<Alarms> getAlarms() {
		return alarms;
	}

	public void setAlarms(List<Alarms> alarms) {
		this.alarms = alarms;
	}

	public static class Alarms{
		
		private String info;// 1,
		private String minor;
		private String major;// 148,
		private String critical;// 102,
		
		
		
		public String getInfo() {
			return info;
		}



		public String getMinor() {
			return minor;
		}



		public String getMajor() {
			return major;
		}



		public String getCritical() {
			return critical;
		}



		public void setInfo(String info) {
			this.info = info;
		}



		public void setMinor(String minor) {
			this.minor = minor;
		}



		public void setMajor(String major) {
			this.major = major;
		}



		public void setCritical(String critical) {
			this.critical = critical;
		}



		public Alarms() {
			super();
			// TODO Auto-generated constructor stub
		}




		

	}

}