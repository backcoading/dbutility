package com.omc.dbUtility.rms.dto;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;

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
		
		 	 private int sd_no_mppt;
		 	private BigDecimal sdMppt1Current;
		 	private BigDecimal sdMppt1PowerInKw;
		     private BigDecimal sdMppt1SolarGenInKwh;
		     private BigDecimal sdMppt1Voltage;
		     private BigDecimal sdMppt2Current;
		     private BigDecimal sdMppt2PowerInKw;
		     private BigDecimal sdMppt2SolarGenInKwh;
             private BigDecimal sdMppt2Voltage;
		     private BigDecimal sdMppt3Current;
		     private BigDecimal sdMppt3PowerInKw;
		     private BigDecimal sdMppt3SolarGenInKwh;
		     private BigDecimal sdMppt3Voltage;
		      private BigDecimal sdMppt4Current;
		      private BigDecimal sdMppt4PowerInKw;
		      private BigDecimal sdMppt4SolarGenInKwh;
		      private BigDecimal sdMppt4Voltage;
		      private BigDecimal sdMppt5Current;
		      private BigDecimal sdMppt5PowerInKw;
		      private BigDecimal sdMppt5SolarGenInKwh;
		      private BigDecimal sdMppt5Voltage;
		      private BigDecimal sdMppt6Current;
		      private BigDecimal sdMppt6PowerInKw;
		      private BigDecimal sdMppt6SolarGenInKwh;
		      private BigDecimal sdMppt6Voltage;
		     private BigDecimal sdMppt7Current;
		      private BigDecimal sdMppt7PowerInKw;
		      private BigDecimal sdMppt7SolarGenInKwh;
		       private BigDecimal sdMppt7Voltage;
		        private BigDecimal sdMppt8Current;
		        private BigDecimal sdMppt8PowerInKw;
		        private BigDecimal sdMppt8SolarGenInKwh;
		        private BigDecimal sdMppt8Voltage;
		     	private BigDecimal sdMppt9Current;
		         private BigDecimal sdMppt9PowerInKw;
		         private BigDecimal sdMppt9SolarGenInKwh;
		         private BigDecimal sdMppt9Voltage;
		          private BigDecimal sdMppt10Current;
		          private BigDecimal sdMppt10PowerInKw;
		          private BigDecimal sdMppt10SolarGenInKwh;
		          private BigDecimal sdMppt10Voltage;
		          private BigDecimal sdMppt11Current;
		          private BigDecimal sdMppt11PowerInKw;
		          private BigDecimal sdMppt11Voltage;
		          private BigDecimal sdMppt11SolarGenInKwh;  
		          private BigDecimal sdMppt12Current;
		          private BigDecimal sdMppt12PowerInKw;
		          private BigDecimal sdMppt12SolarGenInKwh;
		          private BigDecimal sdMppt12Voltage;
		          private BigDecimal sdMppt13Current;
		          private BigDecimal sdMppt13PowerInKw;
		          private BigDecimal sdMppt13SolarGenInKwh;
		          private BigDecimal sdMppt13Voltage;
		           private BigDecimal sd_mppt14Current;
		        private BigDecimal sdMppt14PowerInKw;
		     	private BigDecimal sdMppt14SolarGenInKwh;
		         private BigDecimal sdMppt14Voltage;
		         private BigDecimal sdMppt15Current;
		         private BigDecimal sdMppt15PowerInKw;
		         private BigDecimal sdMppt15SolarGenInKwh;
		         private BigDecimal sdMppt15Voltage;
		      	private BigDecimal sdMppt16Current;
		          private BigDecimal sdMppt16PowerInKw;
		          private BigDecimal sdMppt16SolarGenInKwh;
		          private BigDecimal sdMppt16Voltage;
		          private BigDecimal sdMppt17Current;
		          private BigDecimal sdMppt17PowerInKw;
		          private BigDecimal sdMppt17SolarGenInKwh;
		          private BigDecimal sdMppt17Voltage;
		           private BigDecimal sdMppt18Current;
		           private BigDecimal sdMppt18PowerInKw;
		           private BigDecimal sdMppt18SolarGenInKwh;
		           private BigDecimal sdMppt18Voltage;

		       public int getSd_no_mppt() {
				return sd_no_mppt;
			}
			public void setSd_no_mppt(int sd_no_mppt) {
				this.sd_no_mppt = sd_no_mppt;
			}
			public BigDecimal getSdMppt1Current() {
				return sdMppt1Current;
			}
			public void setSdMppt1Current(BigDecimal sdMppt1Current) {
				this.sdMppt1Current = sdMppt1Current;
			}
			public BigDecimal getSdMppt1PowerInKw() {
				return sdMppt1PowerInKw;
			}
			public void setSdMppt1PowerInKw(BigDecimal sdMppt1PowerInKw) {
				this.sdMppt1PowerInKw = sdMppt1PowerInKw;
			}
			public BigDecimal getSdMppt1SolarGenInKwh() {
				return sdMppt1SolarGenInKwh;
			}
			public void setSdMppt1SolarGenInKwh(BigDecimal sdMppt1SolarGenInKwh) {
				this.sdMppt1SolarGenInKwh = sdMppt1SolarGenInKwh;
			}
			public BigDecimal getSdMppt1Voltage() {
				return sdMppt1Voltage;
			}
			public void setSdMppt1Voltage(BigDecimal sdMppt1Voltage) {
				this.sdMppt1Voltage = sdMppt1Voltage;
			}
			public BigDecimal getSdMppt2Current() {
				return sdMppt2Current;
			}
			public void setSdMppt2Current(BigDecimal sdMppt2Current) {
				this.sdMppt2Current = sdMppt2Current;
			}
			public BigDecimal getSdMppt2PowerInKw() {
				return sdMppt2PowerInKw;
			}
			public void setSdMppt2PowerInKw(BigDecimal sdMppt2PowerInKw) {
				this.sdMppt2PowerInKw = sdMppt2PowerInKw;
			}
			public BigDecimal getSdMppt2SolarGenInKwh() {
				return sdMppt2SolarGenInKwh;
			}
			public void setSdMppt2SolarGenInKwh(BigDecimal sdMppt2SolarGenInKwh) {
				this.sdMppt2SolarGenInKwh = sdMppt2SolarGenInKwh;
			}
			public BigDecimal getSdMppt2Voltage() {
				return sdMppt2Voltage;
			}
			public void setSdMppt2Voltage(BigDecimal sdMppt2Voltage) {
				this.sdMppt2Voltage = sdMppt2Voltage;
			}
			public BigDecimal getSdMppt3Current() {
				return sdMppt3Current;
			}
			public void setSdMppt3Current(BigDecimal sdMppt3Current) {
				this.sdMppt3Current = sdMppt3Current;
			}
			public BigDecimal getSdMppt3PowerInKw() {
				return sdMppt3PowerInKw;
			}
			public void setSdMppt3PowerInKw(BigDecimal sdMppt3PowerInKw) {
				this.sdMppt3PowerInKw = sdMppt3PowerInKw;
			}
			public BigDecimal getSdMppt3SolarGenInKwh() {
				return sdMppt3SolarGenInKwh;
			}
			public void setSdMppt3SolarGenInKwh(BigDecimal sdMppt3SolarGenInKwh) {
				this.sdMppt3SolarGenInKwh = sdMppt3SolarGenInKwh;
			}
			public BigDecimal getSdMppt3Voltage() {
				return sdMppt3Voltage;
			}
			public void setSdMppt3Voltage(BigDecimal sdMppt3Voltage) {
				this.sdMppt3Voltage = sdMppt3Voltage;
			}
			public BigDecimal getSdMppt4Current() {
				return sdMppt4Current;
			}
			public void setSdMppt4Current(BigDecimal sdMppt4Current) {
				this.sdMppt4Current = sdMppt4Current;
			}
			public BigDecimal getSdMppt4PowerInKw() {
				return sdMppt4PowerInKw;
			}
			public void setSdMppt4PowerInKw(BigDecimal sdMppt4PowerInKw) {
				this.sdMppt4PowerInKw = sdMppt4PowerInKw;
			}
			public BigDecimal getSdMppt4SolarGenInKwh() {
				return sdMppt4SolarGenInKwh;
			}
			public void setSdMppt4SolarGenInKwh(BigDecimal sdMppt4SolarGenInKwh) {
				this.sdMppt4SolarGenInKwh = sdMppt4SolarGenInKwh;
			}
			public BigDecimal getSdMppt4Voltage() {
				return sdMppt4Voltage;
			}
			public void setSdMppt4Voltage(BigDecimal sdMppt4Voltage) {
				this.sdMppt4Voltage = sdMppt4Voltage;
			}
			public BigDecimal getSdMppt5Current() {
				return sdMppt5Current;
			}
			public void setSdMppt5Current(BigDecimal sdMppt5Current) {
				this.sdMppt5Current = sdMppt5Current;
			}
			public BigDecimal getSdMppt5PowerInKw() {
				return sdMppt5PowerInKw;
			}
			public void setSdMppt5PowerInKw(BigDecimal sdMppt5PowerInKw) {
				this.sdMppt5PowerInKw = sdMppt5PowerInKw;
			}
			public BigDecimal getSdMppt5SolarGenInKwh() {
				return sdMppt5SolarGenInKwh;
			}
			public void setSdMppt5SolarGenInKwh(BigDecimal sdMppt5SolarGenInKwh) {
				this.sdMppt5SolarGenInKwh = sdMppt5SolarGenInKwh;
			}
			public BigDecimal getSdMppt5Voltage() {
				return sdMppt5Voltage;
			}
			public void setSdMppt5Voltage(BigDecimal sdMppt5Voltage) {
				this.sdMppt5Voltage = sdMppt5Voltage;
			}
			public BigDecimal getSdMppt6Current() {
				return sdMppt6Current;
			}
			public void setSdMppt6Current(BigDecimal sdMppt6Current) {
				this.sdMppt6Current = sdMppt6Current;
			}
			public BigDecimal getSdMppt6PowerInKw() {
				return sdMppt6PowerInKw;
			}
			public void setSdMppt6PowerInKw(BigDecimal sdMppt6PowerInKw) {
				this.sdMppt6PowerInKw = sdMppt6PowerInKw;
			}
			public BigDecimal getSdMppt6SolarGenInKwh() {
				return sdMppt6SolarGenInKwh;
			}
			public void setSdMppt6SolarGenInKwh(BigDecimal sdMppt6SolarGenInKwh) {
				this.sdMppt6SolarGenInKwh = sdMppt6SolarGenInKwh;
			}
			public BigDecimal getSdMppt6Voltage() {
				return sdMppt6Voltage;
			}
			public void setSdMppt6Voltage(BigDecimal sdMppt6Voltage) {
				this.sdMppt6Voltage = sdMppt6Voltage;
			}
			public BigDecimal getSdMppt7Current() {
				return sdMppt7Current;
			}
			public void setSdMppt7Current(BigDecimal sdMppt7Current) {
				this.sdMppt7Current = sdMppt7Current;
			}
			public BigDecimal getSdMppt7PowerInKw() {
				return sdMppt7PowerInKw;
			}
			public void setSdMppt7PowerInKw(BigDecimal sdMppt7PowerInKw) {
				this.sdMppt7PowerInKw = sdMppt7PowerInKw;
			}
			public BigDecimal getSdMppt7SolarGenInKwh() {
				return sdMppt7SolarGenInKwh;
			}
			public void setSdMppt7SolarGenInKwh(BigDecimal sdMppt7SolarGenInKwh) {
				this.sdMppt7SolarGenInKwh = sdMppt7SolarGenInKwh;
			}
			public BigDecimal getSdMppt7Voltage() {
				return sdMppt7Voltage;
			}
			public void setSdMppt7Voltage(BigDecimal sdMppt7Voltage) {
				this.sdMppt7Voltage = sdMppt7Voltage;
			}
			public BigDecimal getSdMppt8Current() {
				return sdMppt8Current;
			}
			public void setSdMppt8Current(BigDecimal sdMppt8Current) {
				this.sdMppt8Current = sdMppt8Current;
			}
			public BigDecimal getSdMppt8PowerInKw() {
				return sdMppt8PowerInKw;
			}
			public void setSdMppt8PowerInKw(BigDecimal sdMppt8PowerInKw) {
				this.sdMppt8PowerInKw = sdMppt8PowerInKw;
			}
			public BigDecimal getSdMppt8SolarGenInKwh() {
				return sdMppt8SolarGenInKwh;
			}
			public void setSdMppt8SolarGenInKwh(BigDecimal sdMppt8SolarGenInKwh) {
				this.sdMppt8SolarGenInKwh = sdMppt8SolarGenInKwh;
			}
			public BigDecimal getSdMppt8Voltage() {
				return sdMppt8Voltage;
			}
			public void setSdMppt8Voltage(BigDecimal sdMppt8Voltage) {
				this.sdMppt8Voltage = sdMppt8Voltage;
			}
			public BigDecimal getSdMppt9Current() {
				return sdMppt9Current;
			}
			public void setSdMppt9Current(BigDecimal sdMppt9Current) {
				this.sdMppt9Current = sdMppt9Current;
			}
			public BigDecimal getSdMppt9PowerInKw() {
				return sdMppt9PowerInKw;
			}
			public void setSdMppt9PowerInKw(BigDecimal sdMppt9PowerInKw) {
				this.sdMppt9PowerInKw = sdMppt9PowerInKw;
			}
			public BigDecimal getSdMppt9SolarGenInKwh() {
				return sdMppt9SolarGenInKwh;
			}
			public void setSdMppt9SolarGenInKwh(BigDecimal sdMppt9SolarGenInKwh) {
				this.sdMppt9SolarGenInKwh = sdMppt9SolarGenInKwh;
			}
			public BigDecimal getSdMppt9Voltage() {
				return sdMppt9Voltage;
			}
			public void setSdMppt9Voltage(BigDecimal sdMppt9Voltage) {
				this.sdMppt9Voltage = sdMppt9Voltage;
			}
			public BigDecimal getSdMppt10Current() {
				return sdMppt10Current;
			}
			public void setSdMppt10Current(BigDecimal sdMppt10Current) {
				this.sdMppt10Current = sdMppt10Current;
			}
			public BigDecimal getSdMppt10PowerInKw() {
				return sdMppt10PowerInKw;
			}
			public void setSdMppt10PowerInKw(BigDecimal sdMppt10PowerInKw) {
				this.sdMppt10PowerInKw = sdMppt10PowerInKw;
			}
			public BigDecimal getSdMppt10SolarGenInKwh() {
				return sdMppt10SolarGenInKwh;
			}
			public void setSdMppt10SolarGenInKwh(BigDecimal sdMppt10SolarGenInKwh) {
				this.sdMppt10SolarGenInKwh = sdMppt10SolarGenInKwh;
			}
			public BigDecimal getSdMppt10Voltage() {
				return sdMppt10Voltage;
			}
			public void setSdMppt10Voltage(BigDecimal sdMppt10Voltage) {
				this.sdMppt10Voltage = sdMppt10Voltage;
			}
			public BigDecimal getSdMppt11Current() {
				return sdMppt11Current;
			}
			public void setSdMppt11Current(BigDecimal sdMppt11Current) {
				this.sdMppt11Current = sdMppt11Current;
			}
			public BigDecimal getSdMppt11PowerInKw() {
				return sdMppt11PowerInKw;
			}
			public void setSdMppt11PowerInKw(BigDecimal sdMppt11PowerInKw) {
				this.sdMppt11PowerInKw = sdMppt11PowerInKw;
			}
			public BigDecimal getSdMppt11Voltage() {
				return sdMppt11Voltage;
			}
			public void setSdMppt11Voltage(BigDecimal sdMppt11Voltage) {
				this.sdMppt11Voltage = sdMppt11Voltage;
			}
			public BigDecimal getSdMppt11SolarGenInKwh() {
				return sdMppt11SolarGenInKwh;
			}
			public void setSdMppt11SolarGenInKwh(BigDecimal sdMppt11SolarGenInKwh) {
				this.sdMppt11SolarGenInKwh = sdMppt11SolarGenInKwh;
			}
			public BigDecimal getSdMppt12Current() {
				return sdMppt12Current;
			}
			public void setSdMppt12Current(BigDecimal sdMppt12Current) {
				this.sdMppt12Current = sdMppt12Current;
			}
			public BigDecimal getSdMppt12PowerInKw() {
				return sdMppt12PowerInKw;
			}
			public void setSdMppt12PowerInKw(BigDecimal sdMppt12PowerInKw) {
				this.sdMppt12PowerInKw = sdMppt12PowerInKw;
			}
			public BigDecimal getSdMppt12SolarGenInKwh() {
				return sdMppt12SolarGenInKwh;
			}
			public void setSdMppt12SolarGenInKwh(BigDecimal sdMppt12SolarGenInKwh) {
				this.sdMppt12SolarGenInKwh = sdMppt12SolarGenInKwh;
			}
			public BigDecimal getSdMppt12Voltage() {
				return sdMppt12Voltage;
			}
			public void setSdMppt12Voltage(BigDecimal sdMppt12Voltage) {
				this.sdMppt12Voltage = sdMppt12Voltage;
			}
			public BigDecimal getSdMppt13Current() {
				return sdMppt13Current;
			}
			public void setSdMppt13Current(BigDecimal sdMppt13Current) {
				this.sdMppt13Current = sdMppt13Current;
			}
			public BigDecimal getSdMppt13PowerInKw() {
				return sdMppt13PowerInKw;
			}
			public void setSdMppt13PowerInKw(BigDecimal sdMppt13PowerInKw) {
				this.sdMppt13PowerInKw = sdMppt13PowerInKw;
			}
			public BigDecimal getSdMppt13SolarGenInKwh() {
				return sdMppt13SolarGenInKwh;
			}
			public void setSdMppt13SolarGenInKwh(BigDecimal sdMppt13SolarGenInKwh) {
				this.sdMppt13SolarGenInKwh = sdMppt13SolarGenInKwh;
			}
			public BigDecimal getSdMppt13Voltage() {
				return sdMppt13Voltage;
			}
			public void setSdMppt13Voltage(BigDecimal sdMppt13Voltage) {
				this.sdMppt13Voltage = sdMppt13Voltage;
			}
			public BigDecimal getSd_mppt14Current() {
				return sd_mppt14Current;
			}
			public void setSd_mppt14Current(BigDecimal sd_mppt14Current) {
				this.sd_mppt14Current = sd_mppt14Current;
			}
			public BigDecimal getSdMppt14PowerInKw() {
				return sdMppt14PowerInKw;
			}
			public void setSdMppt14PowerInKw(BigDecimal sdMppt14PowerInKw) {
				this.sdMppt14PowerInKw = sdMppt14PowerInKw;
			}
			public BigDecimal getSdMppt14SolarGenInKwh() {
				return sdMppt14SolarGenInKwh;
			}
			public void setSdMppt14SolarGenInKwh(BigDecimal sdMppt14SolarGenInKwh) {
				this.sdMppt14SolarGenInKwh = sdMppt14SolarGenInKwh;
			}
			public BigDecimal getSdMppt14Voltage() {
				return sdMppt14Voltage;
			}
			public void setSdMppt14Voltage(BigDecimal sdMppt14Voltage) {
				this.sdMppt14Voltage = sdMppt14Voltage;
			}
			public BigDecimal getSdMppt15Current() {
				return sdMppt15Current;
			}
			public void setSdMppt15Current(BigDecimal sdMppt15Current) {
				this.sdMppt15Current = sdMppt15Current;
			}
			public BigDecimal getSdMppt15PowerInKw() {
				return sdMppt15PowerInKw;
			}
			public void setSdMppt15PowerInKw(BigDecimal sdMppt15PowerInKw) {
				this.sdMppt15PowerInKw = sdMppt15PowerInKw;
			}
			public BigDecimal getSdMppt15SolarGenInKwh() {
				return sdMppt15SolarGenInKwh;
			}
			public void setSdMppt15SolarGenInKwh(BigDecimal sdMppt15SolarGenInKwh) {
				this.sdMppt15SolarGenInKwh = sdMppt15SolarGenInKwh;
			}
			public BigDecimal getSdMppt15Voltage() {
				return sdMppt15Voltage;
			}
			public void setSdMppt15Voltage(BigDecimal sdMppt15Voltage) {
				this.sdMppt15Voltage = sdMppt15Voltage;
			}
			public BigDecimal getSdMppt16Current() {
				return sdMppt16Current;
			}
			public void setSdMppt16Current(BigDecimal sdMppt16Current) {
				this.sdMppt16Current = sdMppt16Current;
			}
			public BigDecimal getSdMppt16PowerInKw() {
				return sdMppt16PowerInKw;
			}
			public void setSdMppt16PowerInKw(BigDecimal sdMppt16PowerInKw) {
				this.sdMppt16PowerInKw = sdMppt16PowerInKw;
			}
			public BigDecimal getSdMppt16SolarGenInKwh() {
				return sdMppt16SolarGenInKwh;
			}
			public void setSdMppt16SolarGenInKwh(BigDecimal sdMppt16SolarGenInKwh) {
				this.sdMppt16SolarGenInKwh = sdMppt16SolarGenInKwh;
			}
			public BigDecimal getSdMppt16Voltage() {
				return sdMppt16Voltage;
			}
			public void setSdMppt16Voltage(BigDecimal sdMppt16Voltage) {
				this.sdMppt16Voltage = sdMppt16Voltage;
			}
			public BigDecimal getSdMppt17Current() {
				return sdMppt17Current;
			}
			public void setSdMppt17Current(BigDecimal sdMppt17Current) {
				this.sdMppt17Current = sdMppt17Current;
			}
			public BigDecimal getSdMppt17PowerInKw() {
				return sdMppt17PowerInKw;
			}
			public void setSdMppt17PowerInKw(BigDecimal sdMppt17PowerInKw) {
				this.sdMppt17PowerInKw = sdMppt17PowerInKw;
			}
			public BigDecimal getSdMppt17SolarGenInKwh() {
				return sdMppt17SolarGenInKwh;
			}
			public void setSdMppt17SolarGenInKwh(BigDecimal sdMppt17SolarGenInKwh) {
				this.sdMppt17SolarGenInKwh = sdMppt17SolarGenInKwh;
			}
			public BigDecimal getSdMppt17Voltage() {
				return sdMppt17Voltage;
			}
			public void setSdMppt17Voltage(BigDecimal sdMppt17Voltage) {
				this.sdMppt17Voltage = sdMppt17Voltage;
			}
			public BigDecimal getSdMppt18Current() {
				return sdMppt18Current;
			}
			public void setSdMppt18Current(BigDecimal sdMppt18Current) {
				this.sdMppt18Current = sdMppt18Current;
			}
			public BigDecimal getSdMppt18PowerInKw() {
				return sdMppt18PowerInKw;
			}
			public void setSdMppt18PowerInKw(BigDecimal sdMppt18PowerInKw) {
				this.sdMppt18PowerInKw = sdMppt18PowerInKw;
			}
			public BigDecimal getSdMppt18SolarGenInKwh() {
				return sdMppt18SolarGenInKwh;
			}
			public void setSdMppt18SolarGenInKwh(BigDecimal sdMppt18SolarGenInKwh) {
				this.sdMppt18SolarGenInKwh = sdMppt18SolarGenInKwh;
			}
			public BigDecimal getSdMppt18Voltage() {
				return sdMppt18Voltage;
			}
			public void setSdMppt18Voltage(BigDecimal sdMppt18Voltage) {
				this.sdMppt18Voltage = sdMppt18Voltage;
			}
			
		   
		/////////////////////////////////////////////////////////////////////////////////////////////
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
		
	
     private BigDecimal sdMppt1String1Current;
     private BigDecimal sdMppt1String1PowerInKw;
     private BigDecimal sdMppt1String1SolarGenInKwh;
     private BigDecimal sdMppt1String1Voltage;
     private BigDecimal sdMppt2String1Current;
     private BigDecimal sdMppt2String1PowerInKw;
     private BigDecimal sdMppt2String1SolarGenInKwh;
     private BigDecimal sdMppt2String1Voltage;
     private BigDecimal sdMppt3String1Current;
     private BigDecimal sdMppt3String1PowerInKw;
     private BigDecimal sdMppt3String1SolarGenInKwh;
  	private BigDecimal sdMppt3String1Voltage;
      private BigDecimal sdMppt4String1Current;
      private String sdMppt4String1PowerInKw;
      private BigDecimal sdMppt4String1SolarGenInKwh;
      private BigDecimal sdMppt4String1Voltage;
      private BigDecimal sdMppt5String1Current;
      private BigDecimal sdMppt5String1PowerInKw;
      private BigDecimal sdMppt5String1SolarGenInKwh;
      private BigDecimal sdMppt5String1Voltage;
      private BigDecimal sdMppt6String1Current;
      private BigDecimal sdMppt6String1PowerInKw;
      private BigDecimal sdMppt6String1SolarGenInKwh;
      private BigDecimal sdMppt6String1Voltage;
        private BigDecimal sdMppt7String1Current;
        private BigDecimal sdMppt7String1PowerInKw;
        private BigDecimal sdMppt7String1SolarGenInKwh;
         private BigDecimal sdMppt7String1Voltage;
        private BigDecimal sdMppt8String1Current;
        private BigDecimal sdMppt8String1PowerInKw;
        private BigDecimal sdMppt8String1SolarGenInKwh;
        private BigDecimal sdMppt8String1Voltage;
         private BigDecimal sdMppt9String1Current;
         private BigDecimal sdMppt9String1PowerInKw;
         private BigDecimal sdMppt9String1SolarGenInKwh;
      	private BigDecimal sdMppt9String1Voltage;
          private BigDecimal sdMppt10String1Current;
          private BigDecimal sdMppt10String1PowerInKw;
          private BigDecimal sdMppt10String1SolarGenInKwh;
          private BigDecimal sdMppt10String1Voltage;
          private BigDecimal sdMppt11String1Current;
          private BigDecimal sdMppt11String1PowerInKw;
          private BigDecimal sdMppt11String1SolarGenInKwh;
          private BigDecimal sdMppt11String1Voltage;
          private BigDecimal sdMppt12String1Current;
          private BigDecimal sdMppt12String1PowerInKw;
          private BigDecimal sdMppt12String1SolarGenInKwh;
          private BigDecimal sdMppt12String1Voltage;
          private BigDecimal sdMppt13String1Current;
          private BigDecimal sdMppt13String1PowerInKw; 
         private BigDecimal sdMppt13String1SolarGenInKwh;
         private BigDecimal sdMppt13String1Voltage;
         private BigDecimal sdMppt14String1Current;
         private BigDecimal sdMppt14String1PowerInKw;
         private BigDecimal sd_mppt14String1SolarGenInKwh;
         private BigDecimal sdMppt14String1Voltage;
         private BigDecimal sdMppt15String1Current;
         private BigDecimal sdMppt15String1PowerInKw;
         private BigDecimal sdMppt15String1SolarGenInKwh;
         private BigDecimal sdMppt15String1Voltage;
          private BigDecimal sdMppt16String1Current;
          private BigDecimal sdMppt16String1PowerInKw;
          private BigDecimal sdMppt16String1SolarGenInKwh;
          private BigDecimal sdMppt16String1Voltage;
          private BigDecimal sdMppt17String1Current;
          private BigDecimal sdMppt17String1PowerInKw;
          private BigDecimal sdMppt17String1SolarGenInKwh;
       	  private BigDecimal sdMppt17String1Voltage;
           private BigDecimal sdMppt18String1Current;
           private BigDecimal sdMppt18String1PowerInKw;
           private BigDecimal sdMppt18String1SolarGenInKwh;
           private BigDecimal sdMppt18String1Voltage;
    	

	public BigDecimal getSdMppt1String1Current() {
			return sdMppt1String1Current;
		}
		public void setSdMppt1String1Current(BigDecimal sdMppt1String1Current) {
			this.sdMppt1String1Current = sdMppt1String1Current;
		}
		public BigDecimal getSdMppt1String1PowerInKw() {
			return sdMppt1String1PowerInKw;
		}
		public void setSdMppt1String1PowerInKw(BigDecimal sdMppt1String1PowerInKw) {
			this.sdMppt1String1PowerInKw = sdMppt1String1PowerInKw;
		}
		public BigDecimal getSdMppt1String1SolarGenInKwh() {
			return sdMppt1String1SolarGenInKwh;
		}
		public void setSdMppt1String1SolarGenInKwh(BigDecimal sdMppt1String1SolarGenInKwh) {
			this.sdMppt1String1SolarGenInKwh = sdMppt1String1SolarGenInKwh;
		}
		public BigDecimal getSdMppt1String1Voltage() {
			return sdMppt1String1Voltage;
		}
		public void setSdMppt1String1Voltage(BigDecimal sdMppt1String1Voltage) {
			this.sdMppt1String1Voltage = sdMppt1String1Voltage;
		}
		public BigDecimal getSdMppt2String1Current() {
			return sdMppt2String1Current;
		}
		public void setSdMppt2String1Current(BigDecimal sdMppt2String1Current) {
			this.sdMppt2String1Current = sdMppt2String1Current;
		}
		public BigDecimal getSdMppt2String1PowerInKw() {
			return sdMppt2String1PowerInKw;
		}
		public void setSdMppt2String1PowerInKw(BigDecimal sdMppt2String1PowerInKw) {
			this.sdMppt2String1PowerInKw = sdMppt2String1PowerInKw;
		}
		public BigDecimal getSdMppt2String1SolarGenInKwh() {
			return sdMppt2String1SolarGenInKwh;
		}
		public void setSdMppt2String1SolarGenInKwh(BigDecimal sdMppt2String1SolarGenInKwh) {
			this.sdMppt2String1SolarGenInKwh = sdMppt2String1SolarGenInKwh;
		}
		public BigDecimal getSdMppt2String1Voltage() {
			return sdMppt2String1Voltage;
		}
		public void setSdMppt2String1Voltage(BigDecimal sdMppt2String1Voltage) {
			this.sdMppt2String1Voltage = sdMppt2String1Voltage;
		}
		public BigDecimal getSdMppt3String1Current() {
			return sdMppt3String1Current;
		}
		public void setSdMppt3String1Current(BigDecimal sdMppt3String1Current) {
			this.sdMppt3String1Current = sdMppt3String1Current;
		}
		public BigDecimal getSdMppt3String1PowerInKw() {
			return sdMppt3String1PowerInKw;
		}
		public void setSdMppt3String1PowerInKw(BigDecimal sdMppt3String1PowerInKw) {
			this.sdMppt3String1PowerInKw = sdMppt3String1PowerInKw;
		}
		public BigDecimal getSdMppt3String1SolarGenInKwh() {
			return sdMppt3String1SolarGenInKwh;
		}
		public void setSdMppt3String1SolarGenInKwh(BigDecimal sdMppt3String1SolarGenInKwh) {
			this.sdMppt3String1SolarGenInKwh = sdMppt3String1SolarGenInKwh;
		}
		public BigDecimal getSdMppt3String1Voltage() {
			return sdMppt3String1Voltage;
		}
		public void setSdMppt3String1Voltage(BigDecimal sdMppt3String1Voltage) {
			this.sdMppt3String1Voltage = sdMppt3String1Voltage;
		}
		public BigDecimal getSdMppt4String1Current() {
			return sdMppt4String1Current;
		}
		public void setSdMppt4String1Current(BigDecimal sdMppt4String1Current) {
			this.sdMppt4String1Current = sdMppt4String1Current;
		}
		public String getSdMppt4String1PowerInKw() {
			return sdMppt4String1PowerInKw;
		}
		public void setSdMppt4String1PowerInKw(String sdMppt4String1PowerInKw) {
			this.sdMppt4String1PowerInKw = sdMppt4String1PowerInKw;
		}
		public BigDecimal getSdMppt4String1SolarGenInKwh() {
			return sdMppt4String1SolarGenInKwh;
		}
		public void setSdMppt4String1SolarGenInKwh(BigDecimal sdMppt4String1SolarGenInKwh) {
			this.sdMppt4String1SolarGenInKwh = sdMppt4String1SolarGenInKwh;
		}
		public BigDecimal getSdMppt4String1Voltage() {
			return sdMppt4String1Voltage;
		}
		public void setSdMppt4String1Voltage(BigDecimal sdMppt4String1Voltage) {
			this.sdMppt4String1Voltage = sdMppt4String1Voltage;
		}
		public BigDecimal getSdMppt5String1Current() {
			return sdMppt5String1Current;
		}
		public void setSdMppt5String1Current(BigDecimal sdMppt5String1Current) {
			this.sdMppt5String1Current = sdMppt5String1Current;
		}
		public BigDecimal getSdMppt5String1PowerInKw() {
			return sdMppt5String1PowerInKw;
		}
		public void setSdMppt5String1PowerInKw(BigDecimal sdMppt5String1PowerInKw) {
			this.sdMppt5String1PowerInKw = sdMppt5String1PowerInKw;
		}
		public BigDecimal getSdMppt5String1SolarGenInKwh() {
			return sdMppt5String1SolarGenInKwh;
		}
		public void setSdMppt5String1SolarGenInKwh(BigDecimal sdMppt5String1SolarGenInKwh) {
			this.sdMppt5String1SolarGenInKwh = sdMppt5String1SolarGenInKwh;
		}
		public BigDecimal getSdMppt5String1Voltage() {
			return sdMppt5String1Voltage;
		}
		public void setSdMppt5String1Voltage(BigDecimal sdMppt5String1Voltage) {
			this.sdMppt5String1Voltage = sdMppt5String1Voltage;
		}
		public BigDecimal getSdMppt6String1Current() {
			return sdMppt6String1Current;
		}
		public void setSdMppt6String1Current(BigDecimal sdMppt6String1Current) {
			this.sdMppt6String1Current = sdMppt6String1Current;
		}
		public BigDecimal getSdMppt6String1PowerInKw() {
			return sdMppt6String1PowerInKw;
		}
		public void setSdMppt6String1PowerInKw(BigDecimal sdMppt6String1PowerInKw) {
			this.sdMppt6String1PowerInKw = sdMppt6String1PowerInKw;
		}
		public BigDecimal getSdMppt6String1SolarGenInKwh() {
			return sdMppt6String1SolarGenInKwh;
		}
		public void setSdMppt6String1SolarGenInKwh(BigDecimal sdMppt6String1SolarGenInKwh) {
			this.sdMppt6String1SolarGenInKwh = sdMppt6String1SolarGenInKwh;
		}
		public BigDecimal getSdMppt6String1Voltage() {
			return sdMppt6String1Voltage;
		}
		public void setSdMppt6String1Voltage(BigDecimal sdMppt6String1Voltage) {
			this.sdMppt6String1Voltage = sdMppt6String1Voltage;
		}
		public BigDecimal getSdMppt7String1Current() {
			return sdMppt7String1Current;
		}
		public void setSdMppt7String1Current(BigDecimal sdMppt7String1Current) {
			this.sdMppt7String1Current = sdMppt7String1Current;
		}
		public BigDecimal getSdMppt7String1PowerInKw() {
			return sdMppt7String1PowerInKw;
		}
		public void setSdMppt7String1PowerInKw(BigDecimal sdMppt7String1PowerInKw) {
			this.sdMppt7String1PowerInKw = sdMppt7String1PowerInKw;
		}
		public BigDecimal getSdMppt7String1SolarGenInKwh() {
			return sdMppt7String1SolarGenInKwh;
		}
		public void setSdMppt7String1SolarGenInKwh(BigDecimal sdMppt7String1SolarGenInKwh) {
			this.sdMppt7String1SolarGenInKwh = sdMppt7String1SolarGenInKwh;
		}
		public BigDecimal getSdMppt7String1Voltage() {
			return sdMppt7String1Voltage;
		}
		public void setSdMppt7String1Voltage(BigDecimal sdMppt7String1Voltage) {
			this.sdMppt7String1Voltage = sdMppt7String1Voltage;
		}
		public BigDecimal getSdMppt8String1Current() {
			return sdMppt8String1Current;
		}
		public void setSdMppt8String1Current(BigDecimal sdMppt8String1Current) {
			this.sdMppt8String1Current = sdMppt8String1Current;
		}
		public BigDecimal getSdMppt8String1PowerInKw() {
			return sdMppt8String1PowerInKw;
		}
		public void setSdMppt8String1PowerInKw(BigDecimal sdMppt8String1PowerInKw) {
			this.sdMppt8String1PowerInKw = sdMppt8String1PowerInKw;
		}
		public BigDecimal getSdMppt8String1SolarGenInKwh() {
			return sdMppt8String1SolarGenInKwh;
		}
		public void setSdMppt8String1SolarGenInKwh(BigDecimal sdMppt8String1SolarGenInKwh) {
			this.sdMppt8String1SolarGenInKwh = sdMppt8String1SolarGenInKwh;
		}
		public BigDecimal getSdMppt8String1Voltage() {
			return sdMppt8String1Voltage;
		}
		public void setSdMppt8String1Voltage(BigDecimal sdMppt8String1Voltage) {
			this.sdMppt8String1Voltage = sdMppt8String1Voltage;
		}
		public BigDecimal getSdMppt9String1Current() {
			return sdMppt9String1Current;
		}
		public void setSdMppt9String1Current(BigDecimal sdMppt9String1Current) {
			this.sdMppt9String1Current = sdMppt9String1Current;
		}
		public BigDecimal getSdMppt9String1PowerInKw() {
			return sdMppt9String1PowerInKw;
		}
		public void setSdMppt9String1PowerInKw(BigDecimal sdMppt9String1PowerInKw) {
			this.sdMppt9String1PowerInKw = sdMppt9String1PowerInKw;
		}
		public BigDecimal getSdMppt9String1SolarGenInKwh() {
			return sdMppt9String1SolarGenInKwh;
		}
		public void setSdMppt9String1SolarGenInKwh(BigDecimal sdMppt9String1SolarGenInKwh) {
			this.sdMppt9String1SolarGenInKwh = sdMppt9String1SolarGenInKwh;
		}
		public BigDecimal getSdMppt9String1Voltage() {
			return sdMppt9String1Voltage;
		}
		public void setSdMppt9String1Voltage(BigDecimal sdMppt9String1Voltage) {
			this.sdMppt9String1Voltage = sdMppt9String1Voltage;
		}
		public BigDecimal getSdMppt10String1Current() {
			return sdMppt10String1Current;
		}
		public void setSdMppt10String1Current(BigDecimal sdMppt10String1Current) {
			this.sdMppt10String1Current = sdMppt10String1Current;
		}
		public BigDecimal getSdMppt10String1PowerInKw() {
			return sdMppt10String1PowerInKw;
		}
		public void setSdMppt10String1PowerInKw(BigDecimal sdMppt10String1PowerInKw) {
			this.sdMppt10String1PowerInKw = sdMppt10String1PowerInKw;
		}
		public BigDecimal getSdMppt10String1SolarGenInKwh() {
			return sdMppt10String1SolarGenInKwh;
		}
		public void setSdMppt10String1SolarGenInKwh(BigDecimal sdMppt10String1SolarGenInKwh) {
			this.sdMppt10String1SolarGenInKwh = sdMppt10String1SolarGenInKwh;
		}
		public BigDecimal getSdMppt10String1Voltage() {
			return sdMppt10String1Voltage;
		}
		public void setSdMppt10String1Voltage(BigDecimal sdMppt10String1Voltage) {
			this.sdMppt10String1Voltage = sdMppt10String1Voltage;
		}
		public BigDecimal getSdMppt11String1Current() {
			return sdMppt11String1Current;
		}
		public void setSdMppt11String1Current(BigDecimal sdMppt11String1Current) {
			this.sdMppt11String1Current = sdMppt11String1Current;
		}
		public BigDecimal getSdMppt11String1PowerInKw() {
			return sdMppt11String1PowerInKw;
		}
		public void setSdMppt11String1PowerInKw(BigDecimal sdMppt11String1PowerInKw) {
			this.sdMppt11String1PowerInKw = sdMppt11String1PowerInKw;
		}
		public BigDecimal getSdMppt11String1SolarGenInKwh() {
			return sdMppt11String1SolarGenInKwh;
		}
		public void setSdMppt11String1SolarGenInKwh(BigDecimal sdMppt11String1SolarGenInKwh) {
			this.sdMppt11String1SolarGenInKwh = sdMppt11String1SolarGenInKwh;
		}
		public BigDecimal getSdMppt11String1Voltage() {
			return sdMppt11String1Voltage;
		}
		public void setSdMppt11String1Voltage(BigDecimal sdMppt11String1Voltage) {
			this.sdMppt11String1Voltage = sdMppt11String1Voltage;
		}
		public BigDecimal getSdMppt12String1Current() {
			return sdMppt12String1Current;
		}
		public void setSdMppt12String1Current(BigDecimal sdMppt12String1Current) {
			this.sdMppt12String1Current = sdMppt12String1Current;
		}
		public BigDecimal getSdMppt12String1PowerInKw() {
			return sdMppt12String1PowerInKw;
		}
		public void setSdMppt12String1PowerInKw(BigDecimal sdMppt12String1PowerInKw) {
			this.sdMppt12String1PowerInKw = sdMppt12String1PowerInKw;
		}
		public BigDecimal getSdMppt12String1SolarGenInKwh() {
			return sdMppt12String1SolarGenInKwh;
		}
		public void setSdMppt12String1SolarGenInKwh(BigDecimal sdMppt12String1SolarGenInKwh) {
			this.sdMppt12String1SolarGenInKwh = sdMppt12String1SolarGenInKwh;
		}
		public BigDecimal getSdMppt12String1Voltage() {
			return sdMppt12String1Voltage;
		}
		public void setSdMppt12String1Voltage(BigDecimal sdMppt12String1Voltage) {
			this.sdMppt12String1Voltage = sdMppt12String1Voltage;
		}
		public BigDecimal getSdMppt13String1Current() {
			return sdMppt13String1Current;
		}
		public void setSdMppt13String1Current(BigDecimal sdMppt13String1Current) {
			this.sdMppt13String1Current = sdMppt13String1Current;
		}
		public BigDecimal getSdMppt13String1PowerInKw() {
			return sdMppt13String1PowerInKw;
		}
		public void setSdMppt13String1PowerInKw(BigDecimal sdMppt13String1PowerInKw) {
			this.sdMppt13String1PowerInKw = sdMppt13String1PowerInKw;
		}
		public BigDecimal getSdMppt13String1SolarGenInKwh() {
			return sdMppt13String1SolarGenInKwh;
		}
		public void setSdMppt13String1SolarGenInKwh(BigDecimal sdMppt13String1SolarGenInKwh) {
			this.sdMppt13String1SolarGenInKwh = sdMppt13String1SolarGenInKwh;
		}
		public BigDecimal getSdMppt13String1Voltage() {
			return sdMppt13String1Voltage;
		}
		public void setSdMppt13String1Voltage(BigDecimal sdMppt13String1Voltage) {
			this.sdMppt13String1Voltage = sdMppt13String1Voltage;
		}
		public BigDecimal getSdMppt14String1Current() {
			return sdMppt14String1Current;
		}
		public void setSdMppt14String1Current(BigDecimal sdMppt14String1Current) {
			this.sdMppt14String1Current = sdMppt14String1Current;
		}
		public BigDecimal getSdMppt14String1PowerInKw() {
			return sdMppt14String1PowerInKw;
		}
		public void setSdMppt14String1PowerInKw(BigDecimal sdMppt14String1PowerInKw) {
			this.sdMppt14String1PowerInKw = sdMppt14String1PowerInKw;
		}
		public BigDecimal getSd_mppt14String1SolarGenInKwh() {
			return sd_mppt14String1SolarGenInKwh;
		}
		public void setSd_mppt14String1SolarGenInKwh(BigDecimal sd_mppt14String1SolarGenInKwh) {
			this.sd_mppt14String1SolarGenInKwh = sd_mppt14String1SolarGenInKwh;
		}
		public BigDecimal getSdMppt14String1Voltage() {
			return sdMppt14String1Voltage;
		}
		public void setSdMppt14String1Voltage(BigDecimal sdMppt14String1Voltage) {
			this.sdMppt14String1Voltage = sdMppt14String1Voltage;
		}
		public BigDecimal getSdMppt15String1Current() {
			return sdMppt15String1Current;
		}
		public void setSdMppt15String1Current(BigDecimal sdMppt15String1Current) {
			this.sdMppt15String1Current = sdMppt15String1Current;
		}
		public BigDecimal getSdMppt15String1PowerInKw() {
			return sdMppt15String1PowerInKw;
		}
		public void setSdMppt15String1PowerInKw(BigDecimal sdMppt15String1PowerInKw) {
			this.sdMppt15String1PowerInKw = sdMppt15String1PowerInKw;
		}
		public BigDecimal getSdMppt15String1SolarGenInKwh() {
			return sdMppt15String1SolarGenInKwh;
		}
		public void setSdMppt15String1SolarGenInKwh(BigDecimal sdMppt15String1SolarGenInKwh) {
			this.sdMppt15String1SolarGenInKwh = sdMppt15String1SolarGenInKwh;
		}
		public BigDecimal getSdMppt15String1Voltage() {
			return sdMppt15String1Voltage;
		}
		public void setSdMppt15String1Voltage(BigDecimal sdMppt15String1Voltage) {
			this.sdMppt15String1Voltage = sdMppt15String1Voltage;
		}
		public BigDecimal getSdMppt16String1Current() {
			return sdMppt16String1Current;
		}
		public void setSdMppt16String1Current(BigDecimal sdMppt16String1Current) {
			this.sdMppt16String1Current = sdMppt16String1Current;
		}
		public BigDecimal getSdMppt16String1PowerInKw() {
			return sdMppt16String1PowerInKw;
		}
		public void setSdMppt16String1PowerInKw(BigDecimal sdMppt16String1PowerInKw) {
			this.sdMppt16String1PowerInKw = sdMppt16String1PowerInKw;
		}
		public BigDecimal getSdMppt16String1SolarGenInKwh() {
			return sdMppt16String1SolarGenInKwh;
		}
		public void setSdMppt16String1SolarGenInKwh(BigDecimal sdMppt16String1SolarGenInKwh) {
			this.sdMppt16String1SolarGenInKwh = sdMppt16String1SolarGenInKwh;
		}
		public BigDecimal getSdMppt16String1Voltage() {
			return sdMppt16String1Voltage;
		}
		public void setSdMppt16String1Voltage(BigDecimal sdMppt16String1Voltage) {
			this.sdMppt16String1Voltage = sdMppt16String1Voltage;
		}
		public BigDecimal getSdMppt17String1Current() {
			return sdMppt17String1Current;
		}
		public void setSdMppt17String1Current(BigDecimal sdMppt17String1Current) {
			this.sdMppt17String1Current = sdMppt17String1Current;
		}
		public BigDecimal sdMppt17String1PowerInKw() {
			return sdMppt17String1PowerInKw;
		}
		public void sdMppt17String1PowerInKw(BigDecimal sdMppt17String1PowerInKw) {
			this.sdMppt17String1PowerInKw = sdMppt17String1PowerInKw;
		}
		public BigDecimal getSdMppt17String1SolarGenInKwh() {
			return sdMppt17String1SolarGenInKwh;
		}
		public void setSdMppt17String1SolarGenInKwh(BigDecimal sdMppt17String1SolarGenInKwh) {
			this.sdMppt17String1SolarGenInKwh = sdMppt17String1SolarGenInKwh;
		}
		public BigDecimal getSdMppt17String1Voltage() {
			return sdMppt17String1Voltage;
		}
		public void setSdMppt17String1Voltage(BigDecimal sdMppt17String1Voltage) {
			this.sdMppt17String1Voltage = sdMppt17String1Voltage;
		}
		public BigDecimal getSdMppt18String1Current() {
			return sdMppt18String1Current;
		}
		public void setSdMppt18String1Current(BigDecimal sdMppt18String1Current) {
			this.sdMppt18String1Current = sdMppt18String1Current;
		}
		public BigDecimal getSdMppt18String1PowerInKw() {
			return sdMppt18String1PowerInKw;
		}
		public void setSdMppt18String1PowerInKw(BigDecimal sdMppt18String1PowerInKw) {
			this.sdMppt18String1PowerInKw = sdMppt18String1PowerInKw;
		}
		public BigDecimal getSdMppt18String1SolarGenInKwh() {
			return sdMppt18String1SolarGenInKwh;
		}
		public void setSdMppt18String1SolarGenInKwh(BigDecimal sdMppt18String1SolarGenInKwh) {
			this.sdMppt18String1SolarGenInKwh = sdMppt18String1SolarGenInKwh;
		}
		public BigDecimal getSdMppt18String1Voltage() {
			return sdMppt18String1Voltage;
		}
		public void setSdMppt18String1Voltage(BigDecimal sdMppt18String1Voltage) {
			this.sdMppt18String1Voltage = sdMppt18String1Voltage;
		}
		/////////////////////////////////////////////////////////////////////////////////////////////
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