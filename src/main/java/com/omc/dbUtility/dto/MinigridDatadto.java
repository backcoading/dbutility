package com.omc.dbUtility.dto;

import java.util.List;

import com.omc.dbUtility.rms.dto.MinigridLinedto.MinigridLine;



public class MinigridDatadto {

	public MinigridDatadto() {
		super();
	
	}
	
	private List<MinigridLine>  minigridData;

	public List<MinigridLine> getMinigridData() {
		return minigridData;
	}

	public void setMinigridData(List<MinigridLine> minigridData) {
		this.minigridData = minigridData;
	}
	
	
	

}
