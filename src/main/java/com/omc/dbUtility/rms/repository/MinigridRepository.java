package com.omc.dbUtility.rms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omc.dbUtility.rms.entity.Minigrid;

public interface MinigridRepository extends JpaRepository<Minigrid,Long> {
	
	public Minigrid findTopByOmcIdOrderByEventTimeStampDesc(int omcId);
	
	public List<Minigrid> findAllByOmcId(int omcId);

}
