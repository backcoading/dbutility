package com.omc.dbUtility.rms.dto;

import java.math.BigDecimal;
import java.util.Date;

public class BatteryResponseDTO extends AbstractResponseDTO{

	private long rsId;
	
	private int omcId;
	
	private int plantId;
	
	private Date eventTimeStamp;
	
	private BatteryDatadto batteryData;
	
	private BigDecimal totalBattChgPowerKw;
	private BigDecimal humidityBattCabinetRoom;
	private BigDecimal totalBattChgCurrentAmp;
	private BigDecimal tempBattCabinetRoom;
	private BigDecimal totalBattDischgChgPowerKw;
	private BigDecimal totalBattDischgCurrentAmp;
	private BigDecimal totalBattDischgVolt;
	private BigDecimal totalBattVolt;
	
	private BigDecimal battCapKwh;
	
	private String createdBy;
	
	private Date createdOn;

	private byte isActive;

	public long getRsId() {
		return rsId;
	}

	public void setRsId(long rsId) {
		this.rsId = rsId;
	}

	public int getOmcId() {
		return omcId;
	}

	public void setOmcId(int omcId) {
		this.omcId = omcId;
	}

	public int getPlantId() {
		return plantId;
	}

	public void setPlantId(int plantId) {
		this.plantId = plantId;
	}

	public Date getEventTimeStamp() {
		return eventTimeStamp;
	}

	public void setEventTimeStamp(Date eventTimeStamp) {
		this.eventTimeStamp = eventTimeStamp;
	}

	

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public byte getIsActive() {
		return isActive;
	}

	public void setIsActive(byte isActive) {
		this.isActive = isActive;
	}

	public BatteryDatadto getBatteryData() {
		return batteryData;
	}

	public void setBatteryData(BatteryDatadto batteryData) {
		this.batteryData = batteryData;
	}

	public BigDecimal getTotalBattChgPowerKw() {
		return totalBattChgPowerKw;
	}

	public BigDecimal getHumidityBattCabinetRoom() {
		return humidityBattCabinetRoom;
	}

	public BigDecimal getTotalBattChgCurrentAmp() {
		return totalBattChgCurrentAmp;
	}

	public BigDecimal getTempBattCabinetRoom() {
		return tempBattCabinetRoom;
	}

	public BigDecimal getTotalBattDischgChgPowerKw() {
		return totalBattDischgChgPowerKw;
	}

	public BigDecimal getTotalBattDischgCurrentAmp() {
		return totalBattDischgCurrentAmp;
	}

	public BigDecimal getTotalBattDischgVolt() {
		return totalBattDischgVolt;
	}

	public BigDecimal getTotalBattVolt() {
		return totalBattVolt;
	}

	public void setTotalBattChgPowerKw(BigDecimal totalBattChgPowerKw) {
		this.totalBattChgPowerKw = totalBattChgPowerKw;
	}

	public void setHumidityBattCabinetRoom(BigDecimal humidityBattCabinetRoom) {
		this.humidityBattCabinetRoom = humidityBattCabinetRoom;
	}

	public void setTotalBattChgCurrentAmp(BigDecimal totalBattChgCurrentAmp) {
		this.totalBattChgCurrentAmp = totalBattChgCurrentAmp;
	}

	public void setTempBattCabinetRoom(BigDecimal tempBattCabinetRoom) {
		this.tempBattCabinetRoom = tempBattCabinetRoom;
	}

	public void setTotalBattDischgChgPowerKw(BigDecimal totalBattDischgChgPowerKw) {
		this.totalBattDischgChgPowerKw = totalBattDischgChgPowerKw;
	}

	public void setTotalBattDischgCurrentAmp(BigDecimal totalBattDischgCurrentAmp) {
		this.totalBattDischgCurrentAmp = totalBattDischgCurrentAmp;
	}

	public void setTotalBattDischgVolt(BigDecimal totalBattDischgVolt) {
		this.totalBattDischgVolt = totalBattDischgVolt;
	}

	public void setTotalBattVolt(BigDecimal totalBattVolt) {
		this.totalBattVolt = totalBattVolt;
	}

	@Override
	public String toString() {
		return "BatteryResponseDTO [rsId=" + rsId + ", omcId=" + omcId + ", plantId=" + plantId + ", eventTimeStamp="
				+ eventTimeStamp + ", batteryData=" + batteryData + ", totalBattChgPowerKw=" + totalBattChgPowerKw
				+ ", humidityBattCabinetRoom=" + humidityBattCabinetRoom + ", totalBattChgCurrentAmp="
				+ totalBattChgCurrentAmp + ", tempBattCabinetRoom=" + tempBattCabinetRoom
				+ ", totalBattDischgChgPowerKw=" + totalBattDischgChgPowerKw + ", totalBattDischgCurrentAmp="
				+ totalBattDischgCurrentAmp + ", totalBattDischgVolt=" + totalBattDischgVolt + ", totalBattVolt="
				+ totalBattVolt + ", createdBy=" + createdBy + ", createdOn=" + createdOn + ", isActive=" + isActive
				+ "]";
	}

	public BigDecimal getBattCapKwh() {
		return battCapKwh;
	}

	public void setBattCapKwh(BigDecimal battCapKwh) {
		this.battCapKwh = battCapKwh;
	}

	
	
	
}
