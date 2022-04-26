package com.omc.dbUtility.rms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omc.dbUtility.rms.entity.TelecomLoad;



public interface TelecomLoadRepository extends JpaRepository<TelecomLoad,Long>{

	public TelecomLoad findTopByOmcIdOrderByEventTimeStampDesc(int omcId);

	public List<TelecomLoad> findAllByOmcId(int omcId);
	
}
