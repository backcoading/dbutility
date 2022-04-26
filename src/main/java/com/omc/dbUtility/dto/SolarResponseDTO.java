package com.omc.dbUtility.dto;

import java.math.BigDecimal;
import java.util.Date;

public class SolarResponseDTO extends AbstractResponseDTO {

	private long rsId;

	private int omcId;

	private int plantId;

	private Date eventTimeStamp;

	private SolarDatadto solarData;

	private BigDecimal totalSolarGenFactor;

	private BigDecimal totalSolarGenKw;

	private BigDecimal solrCapKwh;

	private String createdBy;

	private Date createdOn;

	private byte isActive;

	private BigDecimal sumMpptPowerKw;

	private BigDecimal avgLoadDataPf;

	private BigDecimal avgLoadDataFreqHz;

	private BigDecimal avgLoadKw;

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

	@Override
	public String toString() {
		return "SolarResponseDTO [rsId=" + rsId + ", omcId=" + omcId + ", plantId=" + plantId + ", eventTimeStamp="
				+ eventTimeStamp + ", solarData=" + solarData + ", totalSolarGenFactor=" + totalSolarGenFactor
				+ ", totalSolarGenKw=" + totalSolarGenKw + ", solrCapKwh=" + solrCapKwh + ", createdBy=" + createdBy
				+ ", createdOn=" + createdOn + ", isActive=" + isActive + ", sumMpptPowerKw=" + sumMpptPowerKw
				+ ", avgLoadDataPf=" + avgLoadDataPf + ", avgLoadDataFreqHz=" + avgLoadDataFreqHz + ", avgLoadKw="
				+ avgLoadKw + "]";
	}

	public BigDecimal getSolrCapKwh() {
		return solrCapKwh;
	}

	public void setSolrCapKwh(BigDecimal solrCapKwh) {
		this.solrCapKwh = solrCapKwh;
	}

	public BigDecimal getSumMpptPowerKw() {
		return sumMpptPowerKw;
	}

	public void setSumMpptPowerKw(BigDecimal sumMpptPowerKw) {
		this.sumMpptPowerKw = sumMpptPowerKw;
	}

	public BigDecimal getAvgLoadDataPf() {
		return avgLoadDataPf;
	}

	public void setAvgLoadDataPf(BigDecimal avgLoadDataPf) {
		this.avgLoadDataPf = avgLoadDataPf;
	}

	public BigDecimal getAvgLoadDataFreqHz() {
		return avgLoadDataFreqHz;
	}

	public void setAvgLoadDataFreqHz(BigDecimal avgLoadDataFreqHz) {
		this.avgLoadDataFreqHz = avgLoadDataFreqHz;
	}

	public BigDecimal getAvgLoadKw() {
		return avgLoadKw;
	}

	public void setAvgLoadKw(BigDecimal avgLoadKw) {
		this.avgLoadKw = avgLoadKw;
	}

}
