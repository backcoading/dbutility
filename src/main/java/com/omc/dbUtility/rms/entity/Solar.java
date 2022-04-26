package com.omc.dbUtility.rms.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


/**
 * The persistent class for the rms_solar_txn database table.
 * 
 */
@Entity
@Table(name="rms_solar_txn")
@NamedQuery(name="RmsSolarTxn.findAll", query="SELECT r FROM Solar r")
public class Solar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="rs_id", unique=true, nullable=false)
	private Long rsId;

	@Column(name="created_by", length=80)
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_on")
	private Date createdOn;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false)
	private Date eventTimeStamp;

	@Column(name="is_active", nullable=false)
	private byte isActive;

	@Column(name="omc_id", nullable=false)
	private int omcId;

	@Column(name="plant_id")
	private long plantId;

	@Lob
	@Column(name="solar_data")
	private String solarData;

	@Column(name="total_solar_gen_factor", precision=10, scale=2)
	private BigDecimal totalSolarGenFactor;

	@Column(name="total_solar_gen_kw", precision=10, scale=2)
	private BigDecimal totalSolarGenKw;
	
	@Column(name="total_solar_gen_kwh", precision=10, scale=2)
	private BigDecimal totalSolarGenKwh;
	
	@Column(name="avg_mppt_power_kw", precision=10, scale=2)
	private BigDecimal avgMpptPowerKw;
	
	@Column(name="accumlated_solar_gen_kw", precision=10, scale=2)
	private BigDecimal accumltedSolarGenKw;
	
	@Column(name="accumlated_solar_gen_kwh", precision=10, scale=2)
	private BigDecimal accumltedSolarGenKwh;
	
	
	public Solar() {
	}

	public long getRsId() {
		return this.rsId;
	}

	public void setRsId(long rsId) {
		this.rsId = rsId;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getEventTimeStamp() {
		return this.eventTimeStamp;
	}

	public void setEventTimeStamp(Date eventTimeStamp) {
		this.eventTimeStamp = eventTimeStamp;
	}
	
	public BigDecimal getAvgMpptPowerKw() {
		return avgMpptPowerKw;
	}

	public void setAvgMpptPowerKw(BigDecimal avgMpptPowerKw) {
		this.avgMpptPowerKw = avgMpptPowerKw;
	}

	public byte getIsActive() {
		return this.isActive;
	}

	public void setIsActive(byte isActive) {
		this.isActive = isActive;
	}

	public int getOmcId() {
		return this.omcId;
	}

	public void setOmcId(int omcId) {
		this.omcId = omcId;
	}

	public long getPlantId() {
		return this.plantId;
	}

	public void setPlantId(long plantId) {
		this.plantId = plantId;
	}

	public String getSolarData() {
		return this.solarData;
	}

	public void setSolarData(String solarData) {
		this.solarData = solarData;
	}

	public BigDecimal getTotalSolarGenFactor() {
		return this.totalSolarGenFactor;
	}


	public void setTotalSolarGenFactor(BigDecimal totalSolarGenFactor) {
		this.totalSolarGenFactor = totalSolarGenFactor;
	}

	public BigDecimal getTotalSolarGenKw() {
		return this.totalSolarGenKw;
	}

	public void setTotalSolarGenKw(BigDecimal totalSolarGenKw) {
		this.totalSolarGenKw = totalSolarGenKw;
	}


	public BigDecimal getTotalSolarGenKwh() {
		return totalSolarGenKwh;
	}

	public void setTotalSolarGenKwh(BigDecimal totalSolarGenKwh) {
		this.totalSolarGenKwh = totalSolarGenKwh;
	}


	public BigDecimal getAccumltedSolarGenKw() {
		return accumltedSolarGenKw;
	}

	public void setAccumltedSolarGenKw(BigDecimal accumltedSolarGenKw) {
		this.accumltedSolarGenKw = accumltedSolarGenKw;
	}

	public BigDecimal getAccumltedSolarGenKwh() {
		return accumltedSolarGenKwh;
	}

	public void setAccumltedSolarGenKwh(BigDecimal accumltedSolarGenKwh) {
		this.accumltedSolarGenKwh = accumltedSolarGenKwh;
	}

	@Override
	public String toString() {
		return "Solar [rsId=" + rsId + ", createdBy=" + createdBy + ", createdOn=" + createdOn + ", eventTimeStamp="
				+ eventTimeStamp + ", isActive=" + isActive + ", omcId=" + omcId + ", plantId=" + plantId
				+ ", solarData=" + solarData + ", totalSolarGenFactor=" + totalSolarGenFactor + ", totalSolarGenKw="
				+ totalSolarGenKw + ", totalSolarGenKwh=" + totalSolarGenKwh + ", accumltedSolarGenKw="
				+ accumltedSolarGenKw + ", accumltedSolarGenKwh=" + accumltedSolarGenKwh + "]";
	}

	

}