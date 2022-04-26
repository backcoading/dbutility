package com.omc.dbUtility.rms.dto;

import java.util.List;

public class SolarGraphDTO {



		private String plantId;
		private String omcId;


		private List<SolarAvgMpptPowerKwData> solarAvgMpptPowerKwData;
		
		private List<AvgTelecomLoadKwData> avgTelecomLoadKwListData;
		
		private List<AvgTelecomPowerTowerKwData> avgTelecomPowerTowerKwListData;

		private List<AvgBattChgPowerKwData> avgBattChgPowerKwListData;
		
		private List<AvgBattDischgPowerKwData> avgBattDischgPowerKwListData;
		
		private List<MobiledgAll3PhaseBattPowerKwData> mobiledgAll3PhaseBattPowerKwListData;
		
		private List<MobiledgAll3PhaseLoadPowerKwData> mobiledgAll3PhaseLoadPowerKwListData;
		
		private List<MaindgAll3PhaseBattPowerKwData> maindgAll3PhaseBattPowerKwListData;
		
		private List<MaindgAll3PhaseLoadPowerKwData> maindgAll3PhaseLoadPowerKwListData;
		
		private List<AvgMinigridPowerPlantKwData> avgMinigridPowerPlantKwListData;
		
		
		public List<SolarAvgMpptPowerKwData> getSolarAvgMpptPowerKwData() {
			return solarAvgMpptPowerKwData;
		}
		public void setSolarAvgMpptPowerKwData(List<SolarAvgMpptPowerKwData> solarAvgMpptPowerKwData) {
			this.solarAvgMpptPowerKwData = solarAvgMpptPowerKwData;
		}
		

		
		public List<AvgTelecomLoadKwData> getAvgTelecomLoadKwListData() {
			return avgTelecomLoadKwListData;
		}
		public void setAvgTelecomLoadKwListData(List<AvgTelecomLoadKwData> avgTelecomLoadKwListData) {
			this.avgTelecomLoadKwListData = avgTelecomLoadKwListData;
		}



		public List<AvgTelecomPowerTowerKwData> getAvgTelecomPowerTowerKwListData() {
			return avgTelecomPowerTowerKwListData;
		}
		public void setAvgTelecomPowerTowerKwListData(List<AvgTelecomPowerTowerKwData> avgTelecomPowerTowerKwListData) {
			this.avgTelecomPowerTowerKwListData = avgTelecomPowerTowerKwListData;
		}



		public List<AvgBattChgPowerKwData> getAvgBattChgPowerKwListData() {
			return avgBattChgPowerKwListData;
		}
		public void setAvgBattChgPowerKwListData(List<AvgBattChgPowerKwData> avgBattChgPowerKwListData) {
			this.avgBattChgPowerKwListData = avgBattChgPowerKwListData;
		}
		public List<AvgBattDischgPowerKwData> getAvgBattDischgPowerKwListData() {
			return avgBattDischgPowerKwListData;
		}
		public void setAvgBattDischgPowerKwListData(List<AvgBattDischgPowerKwData> avgBattDischgPowerKwListData) {
			this.avgBattDischgPowerKwListData = avgBattDischgPowerKwListData;
		}



		public List<MobiledgAll3PhaseBattPowerKwData> getMobiledgAll3PhaseBattPowerKwListData() {
			return mobiledgAll3PhaseBattPowerKwListData;
		}
		public void setMobiledgAll3PhaseBattPowerKwListData(
				List<MobiledgAll3PhaseBattPowerKwData> mobiledgAll3PhaseBattPowerKwListData) {
			this.mobiledgAll3PhaseBattPowerKwListData = mobiledgAll3PhaseBattPowerKwListData;
		}
		public List<MobiledgAll3PhaseLoadPowerKwData> getMobiledgAll3PhaseLoadPowerKwListData() {
			return mobiledgAll3PhaseLoadPowerKwListData;
		}
		public void setMobiledgAll3PhaseLoadPowerKwListData(
				List<MobiledgAll3PhaseLoadPowerKwData> mobiledgAll3PhaseLoadPowerKwListData) {
			this.mobiledgAll3PhaseLoadPowerKwListData = mobiledgAll3PhaseLoadPowerKwListData;
		}
		public List<MaindgAll3PhaseBattPowerKwData> getMaindgAll3PhaseBattPowerKwListData() {
			return maindgAll3PhaseBattPowerKwListData;
		}
		public void setMaindgAll3PhaseBattPowerKwListData(
				List<MaindgAll3PhaseBattPowerKwData> maindgAll3PhaseBattPowerKwListData) {
			this.maindgAll3PhaseBattPowerKwListData = maindgAll3PhaseBattPowerKwListData;
		}
		public List<MaindgAll3PhaseLoadPowerKwData> getMaindgAll3PhaseLoadPowerKwListData() {
			return maindgAll3PhaseLoadPowerKwListData;
		}
		public void setMaindgAll3PhaseLoadPowerKwListData(
				List<MaindgAll3PhaseLoadPowerKwData> maindgAll3PhaseLoadPowerKwListData) {
			this.maindgAll3PhaseLoadPowerKwListData = maindgAll3PhaseLoadPowerKwListData;
		}


		public List<AvgMinigridPowerPlantKwData> getAvgMinigridPowerPlantKwListData() {
			return avgMinigridPowerPlantKwListData;
		}
		public void setAvgMinigridPowerPlantKwListData(List<AvgMinigridPowerPlantKwData> avgMinigridPowerPlantKwListData) {
			this.avgMinigridPowerPlantKwListData = avgMinigridPowerPlantKwListData;
		}






		public class SolarAvgMpptPowerKwData {

			private String timestamp;
			private String avgMpptPowerKw;
			public String getTimestamp() {
				return timestamp;
			}
			public void setTimestamp(String timestamp) {
				this.timestamp = timestamp;
			}
			public String getAvgMpptPowerKw() {
				return avgMpptPowerKw;
			}
			public void setAvgMpptPowerKw(String avgMpptPowerKw) {
				this.avgMpptPowerKw = avgMpptPowerKw;
			}
			@Override
			public String toString() {
				return "SolarAvgMpptPowerKwData [timestamp=" + timestamp + ", avgMpptPowerKw=" + avgMpptPowerKw + "]";
			}
		
		}

		public class AvgTelecomLoadKwData {

			private String timestamp;
			private String avgLoadKw;
			public String getTimestamp() {
				return timestamp;
			}
			public void setTimestamp(String timestamp) {
				this.timestamp = timestamp;
			}
			public String getAvgLoadKw() {
				return avgLoadKw;
			}
			public void setAvgLoadKw(String avgLoadKw) {
				this.avgLoadKw = avgLoadKw;
			}
			@Override
			public String toString() {
				return "AvgTelecomLoadKwData [timestamp=" + timestamp + ", avgLoadKw=" + avgLoadKw + "]";
			}
			
		
		}
		//AvgTelecomPowerTowerKwData
		
		public class AvgTelecomPowerTowerKwData {

			private String timestamp;
			private String avgPowerTowerKw;
			public String getTimestamp() {
				return timestamp;
			}
			public void setTimestamp(String timestamp) {
				this.timestamp = timestamp;
			}
			public String getAvgPowerTowerKw() {
				return avgPowerTowerKw;
			}
			public void setAvgPowerTowerKw(String avgPowerTowerKw) {
				this.avgPowerTowerKw = avgPowerTowerKw;
			}
			@Override
			public String toString() {
				return "AvgTelecomPowerTowerKwData [timestamp=" + timestamp + ", avgPowerTowerKw=" + avgPowerTowerKw
						+ "]";
			}
			
			
		
		}

		public class AvgBattChgPowerKwData {

			private String timestamp;
			private String avgBattChgPowerKw;
			public String getTimestamp() {
				return timestamp;
			}
			public void setTimestamp(String timestamp) {
				this.timestamp = timestamp;
			}
			public String getAvgBattChgPowerKw() {
				return avgBattChgPowerKw;
			}
			public void setAvgBattChgPowerKw(String avgBattChgPowerKw) {
				this.avgBattChgPowerKw = avgBattChgPowerKw;
			}
			@Override
			public String toString() {
				return "AvgBattChgPowerKwData [timestamp=" + timestamp + ", avgBattChgPowerKw=" + avgBattChgPowerKw
						+ "]";
			}
			
			
			
		}	
			public class AvgBattDischgPowerKwData {

				private String timestamp;
				private String avgBattDischgPowerKw;
				public String getTimestamp() {
					return timestamp;
				}
				public void setTimestamp(String timestamp) {
					this.timestamp = timestamp;
				}
				public String getAvgBattDischgPowerKw() {
					return avgBattDischgPowerKw;
				}
				public void setAvgBattDischgPowerKw(String avgBattDischgPowerKw) {
					this.avgBattDischgPowerKw = avgBattDischgPowerKw;
				}
				@Override
				public String toString() {
					return "AvgBattDischgPowerKwData [timestamp=" + timestamp + ", avgBattDischgPowerKw="
							+ avgBattDischgPowerKw + "]";
				}
				
				
			}
			public class MobiledgAll3PhaseBattPowerKwData {

					private String timestamp;
					private String dgAll3phaseBattPowerKw;
					public String getTimestamp() {
						return timestamp;
					}
					public void setTimestamp(String timestamp) {
						this.timestamp = timestamp;
					}
					public String getDgAll3phaseBattPowerKw() {
						return dgAll3phaseBattPowerKw;
					}
					public void setDgAll3phaseBattPowerKw(String dgAll3phaseBattPowerKw) {
						this.dgAll3phaseBattPowerKw = dgAll3phaseBattPowerKw;
					}
					@Override
					public String toString() {
						return "MobiledgAll3PhaseBattPowerKwData [timestamp=" + timestamp + ", dgAll3phaseBattPowerKw="
								+ dgAll3phaseBattPowerKw + "]";
					}
					
							
				}
				
			public class MobiledgAll3PhaseLoadPowerKwData {

				private String timestamp;
				private String dgAll3phaseLoadPowerKw;
				public String getTimestamp() {
					return timestamp;
				}
				public void setTimestamp(String timestamp) {
					this.timestamp = timestamp;
				}
				public String getDgAll3phaseLoadPowerKw() {
					return dgAll3phaseLoadPowerKw;
				}
				public void setDgAll3phaseLoadPowerKw(String dgAll3phaseLoadPowerKw) {
					this.dgAll3phaseLoadPowerKw = dgAll3phaseLoadPowerKw;
				}
				@Override
				public String toString() {
					return "MobiledgAll3PhaseLoadPowerKwData [timestamp=" + timestamp + ", dgAll3phaseLoadPowerKw="
							+ dgAll3phaseLoadPowerKw + "]";
				}
				
				
				
						
			}	
			
			public class MaindgAll3PhaseBattPowerKwData {

				private String timestamp;
				private String dgAll3phaseBattPowerKw;
				public String getTimestamp() {
					return timestamp;
				}
				public void setTimestamp(String timestamp) {
					this.timestamp = timestamp;
				}
				public String getDgAll3phaseBattPowerKw() {
					return dgAll3phaseBattPowerKw;
				}
				public void setDgAll3phaseBattPowerKw(String dgAll3phaseBattPowerKw) {
					this.dgAll3phaseBattPowerKw = dgAll3phaseBattPowerKw;
				}
				@Override
				public String toString() {
					return "MaindgAll3PhaseBattPowerKwData [timestamp=" + timestamp + ", dgAll3phaseBattPowerKw="
							+ dgAll3phaseBattPowerKw + "]";
				}
				
				
			}
			
		public class MaindgAll3PhaseLoadPowerKwData {

			private String timestamp;
			private String dgAll3phaseLoadPowerKw;
			public String getTimestamp() {
				return timestamp;
			}
			public void setTimestamp(String timestamp) {
				this.timestamp = timestamp;
			}
			public String getDgAll3phaseLoadPowerKw() {
				return dgAll3phaseLoadPowerKw;
			}
			public void setDgAll3phaseLoadPowerKw(String dgAll3phaseLoadPowerKw) {
				this.dgAll3phaseLoadPowerKw = dgAll3phaseLoadPowerKw;
			}
			@Override
			public String toString() {
				return "MaindgAll3PhaseLoadPowerKwData [timestamp=" + timestamp + ", dgAll3phaseLoadPowerKw="
						+ dgAll3phaseLoadPowerKw + "]";
			}
			
			
			
					
		}		
		

		public class AvgMinigridPowerPlantKwData {

			private String timestamp;
			private String avgPowerPlantKw;
			public String getTimestamp() {
				return timestamp;
			}
			public void setTimestamp(String timestamp) {
				this.timestamp = timestamp;
			}
			public String getAvgPowerPlantKw() {
				return avgPowerPlantKw;
			}
			public void setAvgPowerPlantKw(String avgPowerPlantKw) {
				this.avgPowerPlantKw = avgPowerPlantKw;
			}
			@Override
			public String toString() {
				return "AvgMinigridPowerPlantKw [timestamp=" + timestamp + ", avgPowerPlantKw=" + avgPowerPlantKw + "]";
			}
			
			
			
					
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
		@Override
		public String toString() {
			return "SolarGraphDTO [plantId=" + plantId + ", omcId=" + omcId + ", solarAvgMpptPowerKwData="
					+ solarAvgMpptPowerKwData + ", avgTelecomLoadKwListData=" + avgTelecomLoadKwListData
					+ ", avgTelecomPowerTowerKwListData=" + avgTelecomPowerTowerKwListData
					+ ", avgBattChgPowerKwListData=" + avgBattChgPowerKwListData + ", avgBattDischgPowerKwListData="
					+ avgBattDischgPowerKwListData + ", mobiledgAll3PhaseBattPowerKwListData="
					+ mobiledgAll3PhaseBattPowerKwListData + ", mobiledgAll3PhaseLoadPowerKwListData="
					+ mobiledgAll3PhaseLoadPowerKwListData + ", maindgAll3PhaseBattPowerKwListData="
					+ maindgAll3PhaseBattPowerKwListData + ", maindgAll3PhaseLoadPowerKwListData="
					+ maindgAll3PhaseLoadPowerKwListData + ", avgMinigridPowerPlantKwListData="
					+ avgMinigridPowerPlantKwListData + "]";
		}
		
		
		
		
		
		
		

	}




