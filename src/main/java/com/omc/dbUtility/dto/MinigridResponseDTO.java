package com.omc.dbUtility.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.omc.dbUtility.rms.dto.MinigridDTO;



public class MinigridResponseDTO extends AbstractResponseDTO{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long rmId;
	
	private int plantId;
	
	private int omcId;
	
	private Date eventTimeStamp;
	
	private MinigridDTO minigridLinesData;
	
	private BigDecimal totalMgPlantVoltage;
	
	private BigDecimal totalMgPlantCurrent;
	
	private BigDecimal totalMgPlantPowerKw;
	
	private BigDecimal totalMgPlantPowerKwh;
	
	private BigDecimal totalMgFreqHz;
	
	private BigDecimal totalMgPf;
	
	private BigDecimal totalMgAvgPowerKw;
	
	private BigDecimal totalMgPeakPowerKw;
	
	private BigDecimal totalMgPowerCustomerKw;
	
	private BigDecimal totalMgPowerCustomerKwh;
	
	private BigDecimal totalLossMgPrecentage;
	
	private BigDecimal totalOmcSupplyHourDay;
	
	private BigDecimal totalOmcSupplyHourNight;
	
	private BigDecimal totalOmcSupplyHourDayNight;
	
	private Date created_on;
	
	private String created_by;
	
	private BigDecimal avgPowerPlantKw;
	
	private BigDecimal avgPowerPlantKwh;

	public Long getRmId() {
		return rmId;
	}

	public void setRmId(Long rmId) {
		this.rmId = rmId;
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

	public MinigridDTO getMinigridLinesData() {
		return minigridLinesData;
	}

	public void setMinigridLinesData(MinigridDTO minigridLinesData) {
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
		return "MinigridResponseDTO [rmId=" + rmId + ", plantId=" + plantId + ", omcId=" + omcId + ", eventTimeStamp="
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
