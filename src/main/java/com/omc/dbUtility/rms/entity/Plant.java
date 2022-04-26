package com.omc.dbUtility.rms.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * The Class Users.
 */
@Entity
@Table(name = "rms_plant")
public class Plant implements Serializable {

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "plant_id")
	private Integer plantId;

	@Column(name = "omc_id")
	private Integer omcId;

	@Column(name = "name")
	private String name;

	@Column(name = "type")
	private String type;
	
	@Column(name = "remark")
	private String remark;

	@Column(name = "added_on")
	private Timestamp addedOn;

	@Column(name = "updated_on")
	private Timestamp updatedOn;
	
	public Plant(){
		
	}
	
	/**
	 * @return the plantId
	 */
	public int getPlantId() {
		return plantId;
	}

	/**
	 * @param plantId the plantId to set
	 */
	public void setPlantId(int plantId) {
		this.plantId = plantId;
	}

	/**
	 * @return the omcId
	 */
	public Integer getOmcId() {
		return omcId;
	}

	/**
	 * @param omcId the omcId to set
	 */
	public void setOmcId(Integer omcId) {
		this.omcId = omcId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * @return the addedOn
	 */
	public Timestamp getAddedOn() {
		return addedOn;
	}

	/**
	 * @param addedOn the addedOn to set
	 */
	public void setAddedOn(Timestamp addedOn) {
		this.addedOn = addedOn;
	}

	/**
	 * @return the updatedOn
	 */
	public Timestamp getUpdatedOn() {
		return updatedOn;
	}

	/**
	 * @param updatedOn the updatedOn to set
	 */
	public void setUpdatedOn(Timestamp updatedOn) {
		this.updatedOn = updatedOn;
	}





}
