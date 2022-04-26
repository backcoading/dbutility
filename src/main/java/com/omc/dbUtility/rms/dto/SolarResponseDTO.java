package com.omc.dbUtility.rms.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import springfox.documentation.spring.web.json.Json;

public class SolarResponseDTO extends AbstractResponseDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long rsId;
	
	private int omcId;
	
	private long plantId;
	
	private Date eventTimeStamp;
	
	private SolarDatadto solarData;
	
	private BigDecimal totalSolarGenFactor;
	
	private BigDecimal totalSolarGenKw;
	
	private BigDecimal totalSolarGenKwh;
	
	private BigDecimal avgMpptPowerKw;
	
	private BigDecimal accumlatedSolarGenKw;
	
	private BigDecimal accumlatedSolarGenKwh;

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

	public long getPlantId() {
		return plantId;
	}

	public void setPlantId(long plantId) {
		this.plantId = plantId;
	}
	
	public void setRsId(Long rsId) {
		this.rsId = rsId;
	}

	public Date getEventTimeStamp() {
		return eventTimeStamp;
	}

	public void setEventTimeStamp(Date eventTimeStamp) {
		this.eventTimeStamp = eventTimeStamp;
	}

	
	public SolarDatadto getSolarData() {
		return solarData;
	}

	public void setSolarData(SolarDatadto solarData) {
		this.solarData = solarData;
	}

	public BigDecimal getTotalSolarGenFactor() {
		return totalSolarGenFactor;
	}

	public void setTotalSolarGenFactor(BigDecimal totalSolarGenFactor) {
		this.totalSolarGenFactor = totalSolarGenFactor;
	}

	public BigDecimal getTotalSolarGenKw() {
		return totalSolarGenKw;
	}

	public void setTotalSolarGenKw(BigDecimal totalSolarGenKw) {
		this.totalSolarGenKw = totalSolarGenKw;
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


	public BigDecimal getTotalSolarGenKwh() {
		return totalSolarGenKwh;
	}

	public void setTotalSolarGenKwh(BigDecimal totalSolarGenKwh) {
		this.totalSolarGenKwh = totalSolarGenKwh;
	}

	public BigDecimal getAvgMpptPowerKw() {
		return avgMpptPowerKw;
	}

	public void setAvgMpptPowerKw(BigDecimal avgMpptPowerKw) {
		this.avgMpptPowerKw = avgMpptPowerKw;
	}

	public BigDecimal getAccumlatedSolarGenKw() {
		return accumlatedSolarGenKw;
	}

	public void setAccumlatedSolarGenKw(BigDecimal accumlatedSolarGenKw) {
		this.accumlatedSolarGenKw = accumlatedSolarGenKw;
	}

	public BigDecimal getAccumlatedSolarGenKwh() {
		return accumlatedSolarGenKwh;
	}

	public void setAccumlatedSolarGenKwh(BigDecimal accumlatedSolarGenKwh) {
		this.accumlatedSolarGenKwh = accumlatedSolarGenKwh;
	}

	@Override
	public String toString() {
		return "SolarResponseDTO [rsId=" + rsId + ", omcId=" + omcId + ", plantId=" + plantId + ", eventTimeStamp="
				+ eventTimeStamp + ", solarData=" + solarData + ", totalSolarGenFactor=" + totalSolarGenFactor
				+ ", totalSolarGenKw=" + totalSolarGenKw + ", totalSolarGenKwh=" + totalSolarGenKwh
				+ ", avgMpptPowerKw=" + avgMpptPowerKw + ", accumlatedSolarGenKw=" + accumlatedSolarGenKw
				+ ", accumlatedSolarGenKwh=" + accumlatedSolarGenKwh + ", createdBy=" + createdBy + ", createdOn="
				+ createdOn + ", isActive=" + isActive + "]";
	}

	
	
	
}
