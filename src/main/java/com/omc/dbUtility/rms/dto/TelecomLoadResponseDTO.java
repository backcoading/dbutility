package com.omc.dbUtility.rms.dto;

import java.math.BigDecimal;
import java.util.Date;



public class TelecomLoadResponseDTO extends AbstractResponseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private int plantId;
	
	private int omcId;
	
	private Date eventTimeStamp;

	private TelecomLoaddto telecomloadData;
	
	private Date createdOn;
	
	private String createdBy;
	
	private BigDecimal avgLoadDataPf;
	
	private BigDecimal avgLoadDataFreqHz;
	
	private BigDecimal avgLoadKw;
	
	private BigDecimal avgPlantPowerKwh;
	
	private BigDecimal avgTowerPowerKwh;
	
	private BigDecimal avgPowerTowerKw;
	
	private BigDecimal todayPlantPowerKW;
	
	private BigDecimal todayTowerPeakPowerKW;
	
	private int totalNumberTower;

	public TelecomLoadResponseDTO() {
		super();
	}

	
	public int getTotalNumberTower() {
		return totalNumberTower;
	}


	public void setTotalNumberTower(int totalNumberTower) {
		this.totalNumberTower = totalNumberTower;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getId() {
		return id;
	}

	public void setRtId(Long id) {
		this.id = id;
	}

	public int getPlantId() {
		return plantId;
	}

	public void setPlantId(int plantId) {
		this.plantId = plantId;
	}

	public int getOmcId() {
		return omcId;
	}

	public void setOmcId(int omcId) {
		this.omcId = omcId;
	}

	public Date getEventTimeStamp() {
		return eventTimeStamp;
	}

	public void setEventTimeStamp(Date eventTimeStamp) {
		this.eventTimeStamp = eventTimeStamp;
	}

	public TelecomLoaddto getTelecomloadData() {
		return telecomloadData;
	}

	public void setTelecomloadData(TelecomLoaddto telecomloadData) {
		this.telecomloadData = telecomloadData;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
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

	public BigDecimal getAvgPlantPowerKwh() {
		return avgPlantPowerKwh;
	}

	public void setAvgPlantPowerKwh(BigDecimal avgPlantPowerKwh) {
		this.avgPlantPowerKwh = avgPlantPowerKwh;
	}

	public BigDecimal getAvgTowerPowerKwh() {
		return avgTowerPowerKwh;
	}

	public void setAvgTowerPowerKwh(BigDecimal avgTowerPowerKwh) {
		this.avgTowerPowerKwh = avgTowerPowerKwh;
	}

	public BigDecimal getAvgPowerTowerKw() {
		return avgPowerTowerKw;
	}

	public void setAvgPowerTowerKw(BigDecimal avgPowerTowerKw) {
		this.avgPowerTowerKw = avgPowerTowerKw;
	}

	public BigDecimal getTodayPlantPowerKW() {
		return todayPlantPowerKW;
	}

	public void setTodayPlantPowerKW(BigDecimal todayPlantPowerKW) {
		this.todayPlantPowerKW = todayPlantPowerKW;
	}

	public BigDecimal getTodayTowerPeakPowerKW() {
		return todayTowerPeakPowerKW;
	}

	public void setTodayTowerPeakPowerKW(BigDecimal todayTowerPeakPowerKW) {
		this.todayTowerPeakPowerKW = todayTowerPeakPowerKW;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "TelecomLoadResponseDTO [id=" + id + ", plantId=" + plantId + ", omcId=" + omcId + ", eventTimeStamp="
				+ eventTimeStamp + ", telecomloadData=" + telecomloadData + ", createdOn=" + createdOn + ", createdBy="
				+ createdBy + ", avgLoadDataPf=" + avgLoadDataPf + ", avgLoadDataFreqHz=" + avgLoadDataFreqHz
				+ ", avgLoadKw=" + avgLoadKw + ", avgPlantPowerKwh=" + avgPlantPowerKwh + ", avgTowerPowerKwh="
				+ avgTowerPowerKwh + ", avgPowerTowerKw=" + avgPowerTowerKw + ", todayPlantPowerKW=" + todayPlantPowerKW
				+ ", todayTowerPeakPowerKW=" + todayTowerPeakPowerKW + "]";
	}
	
}
