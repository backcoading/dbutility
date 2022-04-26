package com.omc.dbUtility.template.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.omc.dbUtility.template.entity.TemplateData;
import com.omc.dbUtility.template.entity.TemplateMinigridData;
import com.omc.dbUtility.template.entity.TemplateSolarData;

public interface TemplateMinigridDataRepository extends JpaRepository<TemplateMinigridData,Long>{

//	 @Query("select t from TemplateMinigridData t where t.omcId=:omcId order by eventTimeStamp")
//		public List<TemplateMinigridData> findAllMinigridTemplateByOmcId(@Param("omcId") int omcId);
//	 
	 
	 @Query("select t from TemplateMinigridData t where t.omcId=:omcId order by eventTimeStamp")
		public List<TemplateMinigridData> findAllMinigridTemplateByOmcId(@Param("omcId") int omcId);
//	 
//	 @Query("select t from TemplateSolarData t where t.omcId=:omcId order by eventTimeStamp")
//		public List<TemplateSolarData> findAllSolarTemplateByOmcId(@Param("omcId") int omcId);
	 
	 @Query("select t from TemplateMinigridData t where t.omcId=:omcId  and eventTimeStamp>:eventTimeStamp  order by eventTimeStamp")
		public List<TemplateMinigridData> findAllLatestTemplateDataByOmcId(int omcId, Date eventTimeStamp);

}
