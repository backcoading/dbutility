package com.omc.dbUtility.rms.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
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

/**
 * The persistent class for the rms_minigrid_txn database table.
 * 
 */

@Entity
@Table(name="rms_minigrid_txn")
@NamedQuery(name="RmsMinigridTxn.findAll", query="SELECT r FROM Minigrid r")
public class Minigrid implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="rm_id")
	private Long rmId;
	
	@Column(name="plant_id")
	private int plantId;
	
	@Column(name="omc_id")
	private int omcId;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false)
	private Date eventTimeStamp;
	
	@Lob
	@Column(name="minigrid_lines_data")
	private String minigridLinesData;
	
	@Column(name="total_mg_plant_voltage")
	private BigDecimal totalMgPlantVoltage;
	
	@Column(name="total_mg_plant_current")
	private BigDecimal totalMgPlantCurrent;
	
	@Column(name="total_mg_plant_power_kw")
	private BigDecimal totalMgPlantPowerKw;
	
	@Column(name="total_mg_plant_power_kwh")
	private BigDecimal totalMgPlantPowerKwh;
	
	@Column(name="total_mg_freq_hz")
	private BigDecimal totalMgFreqHz;
	
	@Column(name="total_mg_pf")
	private BigDecimal totalMgPf;
	
	@Column(name="total_mg_avg_power_kw")
	private BigDecimal totalMgAvgPowerKw;
	
	@Column(name="total_mg_peak_power_kw")
	private BigDecimal totalMgPeakPowerKw;
	
	@Column(name="total_mg_power_customer_kw")
	private BigDecimal totalMgPowerCustomerKw;
	
	@Column(name="total_mg_power_customer_kwh")
	private BigDecimal totalMgPowerCustomerKwh;
	
	@Column(name="total_loss_mg_precentage")
	private BigDecimal totalLossMgPrecentage;
	
	@Column(name="total_omc_supply_hour_day")
	private BigDecimal totalOmcSupplyHourDay;
	
	@Column(name="total_omc_supply_hour_night")
	private BigDecimal totalOmcSupplyHourNight;
	
	@Column(name="total_omc_supply_hour_day_night")
	private BigDecimal totalOmcSupplyHourDayNight;
	
	@Column(name="created_on")
	private Date created_on;
	
	@Column(name="created_by")
	private String created_by;
	
	@Column(name="avg_power_plant_kw")
	private BigDecimal avgPowerPlantKw;
	
	@Column(name="avg_power_plant_kwh")
	private BigDecimal avgPowerPlantKwh;

	public Minigrid() {
		super();
	}

	public Long getRmId() {
		return rmId;
	}

	public void setRmId(Long rmId) {
		this.rmId = rmId;
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

	public String getMinigridLinesData() {
		return minigridLinesData;
	}

	public void setMinigridLinesData(String minigridLinesData) {
		this.minigridLinesData = minigridLinesData;
	}

	public BigDecimal getTotalMgPlantVoltage() {
		return totalMgPlantVoltage;
	}

	public void setTotalMgPlantVoltage(BigDecimal totalMgPlantVoltage) {
		this.totalMgPlantVoltage = totalMgPlantVoltage;
	}

	public BigDecimal getTotalMgPlantCurrent() {
		return totalMgPlantCurrent;
	}

	public void setTotalMgPlantCurrent(BigDecimal totalMgPlantCurrent) {
		this.totalMgPlantCurrent = totalMgPlantCurrent;
	}

	public BigDecimal getTotalMgPlantPowerKw() {
		return totalMgPlantPowerKw;
	}

	public void setTotalMgPlantPowerKw(BigDecimal totalMgPlantPowerKw) {
		this.totalMgPlantPowerKw = totalMgPlantPowerKw;
	}

	public BigDecimal getTotalMgPlantPowerKwh() {
		return totalMgPlantPowerKwh;
	}

	public void setTotalMgPlantPowerKwh(BigDecimal totalMgPlantPowerKwh) {
		this.totalMgPlantPowerKwh = totalMgPlantPowerKwh;
	}

	public BigDecimal getTotalMgFreqHz() {
		return totalMgFreqHz;
	}

	public void setTotalMgFreqHz(BigDecimal totalMgFreqHz) {
		this.totalMgFreqHz = totalMgFreqHz;
	}

	public BigDecimal getTotalMgPf() {
		return totalMgPf;
	}

	public void setTotalMgPf(BigDecimal totalMgPf) {
		this.totalMgPf = totalMgPf;
	}

	public BigDecimal getTotalMgAvgPowerKw() {
		return totalMgAvgPowerKw;
	}

	public void setTotalMgAvgPowerKw(BigDecimal totalMgAvgPowerKw) {
		this.totalMgAvgPowerKw = totalMgAvgPowerKw;
	}

	public BigDecimal getTotalMgPeakPowerKw() {
		return totalMgPeakPowerKw;
	}

	public void setTotalMgPeakPowerKw(BigDecimal totalMgPeakPowerKw) {
		this.totalMgPeakPowerKw = totalMgPeakPowerKw;
	}

	public BigDecimal getTotalMgPowerCustomerKw() {
		return totalMgPowerCustomerKw;
	}

	public void setTotalMgPowerCustomerKw(BigDecimal totalMgPowerCustomerKw) {
		this.totalMgPowerCustomerKw = totalMgPowerCustomerKw;
	}

	public BigDecimal getTotalMgPowerCustomerKwh() {
		return totalMgPowerCustomerKwh;
	}

	public void setTotalMgPowerCustomerKwh(BigDecimal totalMgPowerCustomerKwh) {
		this.totalMgPowerCustomerKwh = totalMgPowerCustomerKwh;
	}

	public BigDecimal getTotalLossMgPrecentage() {
		return totalLossMgPrecentage;
	}

	public void setTotalLossMgPrecentage(BigDecimal totalLossMgPrecentage) {
		this.totalLossMgPrecentage = totalLossMgPrecentage;
	}

	public BigDecimal getTotalOmcSupplyHourDay() {
		return totalOmcSupplyHourDay;
	}

	public void setTotalOmcSupplyHourDay(BigDecimal totalOmcSupplyHourDay) {
		this.totalOmcSupplyHourDay = totalOmcSupplyHourDay;
	}

	public BigDecimal getTotalOmcSupplyHourNight() {
		return totalOmcSupplyHourNight;
	}

	public void setTotalOmcSupplyHourNight(BigDecimal totalOmcSupplyHourNight) {
		this.totalOmcSupplyHourNight = totalOmcSupplyHourNight;
	}

	public BigDecimal getTotalOmcSupplyHourDayNight() {
		return totalOmcSupplyHourDayNight;
	}

	public void setTotalOmcSupplyHourDayNight(BigDecimal totalOmcSupplyHourDayNight) {
		this.totalOmcSupplyHourDayNight = totalOmcSupplyHourDayNight;
	}

	public Date getCreated_on() {
		return created_on;
	}

	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public BigDecimal getAvgPowerPlantKw() {
		return avgPowerPlantKw;
	}

	public void setAvgPowerPlantKw(BigDecimal avgPowerPlantKw) {
		this.avgPowerPlantKw = avgPowerPlantKw;
	}

	public BigDecimal getAvgPowerPlantKwh() {
		return avgPowerPlantKwh;
	}

	public void setAvgPowerPlantKwh(BigDecimal avgPowerPlantKwh) {
		this.avgPowerPlantKwh = avgPowerPlantKwh;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Minigrid [rmId=" + rmId + ", plantId=" + plantId + ", omcId=" + omcId + ", eventTimeStamp="
				+ eventTimeStamp + ", minigridLinesData=" + minigridLinesData + ", totalMgPlantVoltage="
				+ totalMgPlantVoltage + ", totalMgPlantCurrent=" + totalMgPlantCurrent + ", totalMgPlantPowerKw="
				+ totalMgPlantPowerKw + ", totalMgPlantPowerKwh=" + totalMgPlantPowerKwh + ", totalMgFreqHz="
				+ totalMgFreqHz + ", totalMgPf=" + totalMgPf + ", totalMgAvgPowerKw=" + totalMgAvgPowerKw
				+ ", totalMgPeakPowerKw=" + totalMgPeakPowerKw + ", totalMgPowerCustomerKw=" + totalMgPowerCustomerKw
				+ ", totalMgPowerCustomerKwh=" + totalMgPowerCustomerKwh + ", totalLossMgPrecentage="
				+ totalLossMgPrecentage + ", totalOmcSupplyHourDay=" + totalOmcSupplyHourDay
				+ ", totalOmcSupplyHourNight=" + totalOmcSupplyHourNight + ", totalOmcSupplyHourDayNight="
				+ totalOmcSupplyHourDayNight + ", created_on=" + created_on + ", created_by=" + created_by
				+ ", avgPowerPlantKw=" + avgPowerPlantKw + ", avgPowerPlantKwh=" + avgPowerPlantKwh + "]";
	}
	
	
}
