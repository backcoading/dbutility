package com.omc.dbUtility.template.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.omc.dbUtility.template.entity.TemplateDgData;


public interface TemplateDgDataRepository extends JpaRepository<TemplateDgData,Long>{
	
	@Query("select t from TemplateDgData t where t.omcId=:omcId order by eventTimeStamp")
	public List<TemplateDgData> findAllDgTemplateByOmcId(@Param("omcId") int omcId);


}
