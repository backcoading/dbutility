package com.omc.dbUtility.template.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.omc.dbUtility.template.entity.TemplateMinigridData;
import com.omc.dbUtility.template.entity.TemplateTelecomloadData;

public interface TemplateTelecomloadDataRepository extends JpaRepository<TemplateTelecomloadData,Long>{

	@Query("select t from TemplateTelecomloadData t where t.omcId=:omcId order by eventTimeStamp")
	public List<TemplateTelecomloadData> findAllTelecomloadTemplateByOmcId(@Param("omcId") int omcId);
	
	@Query("select t from TemplateTelecomloadData t where t.omcId=:omcId  and eventTimeStamp>:eventTimeStamp  order by eventTimeStamp")
	public List<TemplateTelecomloadData> findAllLatestTemplateTelecomloadDataByOmcId(int omcId, Date eventTimeStamp);
}
