package com.omc.dbUtility.rms.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="rms_telecomload_txn")
public class TelecomLoad {

	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="rt_id")
	private Long rtId;
	
	@Column(name="plant_id")
	private int plantId;
	
	@Column(name="omc_id")
	private int omcId;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="eventTimeStamp")
	private Date eventTimeStamp;
	
	@Lob
	@Column(name="telecomload_data")
	private String telecomloadData;
	
	@Column(name="created_on")
	private Date createdOn;
	
	@Column(name="created_by")
	private String createdBy;
	
	@Column(name="avg_load_data_pf")
	private BigDecimal avgLoadDataPf;
	
	@Column(name="avg_load_data_freq_hz")
	private BigDecimal avgLoadDataFreqHz;
	
	@Column(name="avg_load_kw")
	private BigDecimal avgLoadKw;
	
	@Column(name="avg_plant_power_kwh")
	private BigDecimal avgPlantPowerKwh;
	
	@Column(name="avg_tower_power_kwh")
	private BigDecimal avgTowerPowerKwh;
	
	@Column(name="avg_power_tower_kw")
	private BigDecimal avgPowerTowerKw;
	
	@Column(name="today_plantPowerKW")
	private BigDecimal todayPlantPowerKW;
	
	@Column(name="today_towerPeakPowerKW")
	private BigDecimal todayTowerPeakPowerKW;

	public TelecomLoad() {
		super();
	}

	public Long getRtId() {
		return rtId;
	}

	public void setRtId(Long rtId) {
		this.rtId = rtId;
	}

	public int getPlantId() {
		return plantId;
	}

	public void setPlantId(int i) {
		this.plantId = i;
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

	public String getTelecomloadData() {
		return telecomloadData;
	}

	public void setTelecomloadData(String telecomloadData) {
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

	@Override
	public String toString() {
		return "TelecomLoad [rtId=" + rtId + ", plantId=" + plantId + ", omcId=" + omcId + ", eventTimeStamp="
				+ eventTimeStamp + ", telecomloadData=" + telecomloadData + ", createdOn=" + createdOn + ", createdBy="
				+ createdBy + ", avgLoadDataPf=" + avgLoadDataPf + ", avgLoadDataFreqHz=" + avgLoadDataFreqHz
				+ ", avgLoadKw=" + avgLoadKw + ", avgPlantPowerKwh=" + avgPlantPowerKwh + ", avgTowerPowerKwh="
				+ avgTowerPowerKwh + ", avgPowerTowerKw=" + avgPowerTowerKw + ", todayPlantPowerKW=" + todayPlantPowerKW
				+ ", todayTowerPeakPowerKW=" + todayTowerPeakPowerKW + "]";
	}
	
}
