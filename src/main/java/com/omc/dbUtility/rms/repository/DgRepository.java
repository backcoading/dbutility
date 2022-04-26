package com.omc.dbUtility.rms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omc.dbUtility.rms.entity.Dg;


public interface DgRepository extends JpaRepository<Dg,Long>{
	
public Dg findTopByOmcIdOrderByEventTimeStampDesc(int omcId);
	
	public List<Dg> findAllByOmcId(int omcId);
}
