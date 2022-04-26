package com.omc.dbUtility.template.repository;

import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;

import com.omc.dbUtility.template.entity.TemplateData;
import com.omc.dbUtility.template.entity.TemplateSolarData;
import com.omc.dbUtility.template.entity.TemplateTelecomloadData;



public interface TemplateSolarDataRepository extends JpaRepository<TemplateSolarData,Long>{
	
	
	  @Query("select t from TemplateSolarData t where t.omcId=:omcId order by eventTimeStamp")
		public List<TemplateSolarData> findAllSolarTemplateByOmcId(@Param("omcId") int omcId);
	  
	  @Query("select t from TemplateSolarData t where t.omcId=:omcId  and eventTimeStamp>:eventTimeStamp  order by eventTimeStamp")
		public List<TemplateSolarData> findAllLatestTemplateSolarDataByOmcId(int omcId, Date eventTimeStamp);

/*	List<TemplateSolarData> findAllTemplateByOmcId(int omcId);

	TemplateSolarData findByOmcId(int omcId);

	List<TemplateSolarData> findAllByEventTimeStampGreaterThan(Date date);

	List<TemplateSolarData> findAllLatestTemplateDataByOmcId(Integer omcId, Date latestEvent);
*/
////	List<TemplateSolarData> findAllTemplateByOmcSiteId(int omcId);
//
//	TemplateSolarData findByOmcSiteId(String omcId);
//
//	List<TemplateSolarData> findAllTemplateByOmcSiteId(int omcId);
//
//	List<TemplateSolarData> findAllByEventTimeStampGreaterThan(Date date);

}
