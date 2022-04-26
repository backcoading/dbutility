package com.omc.dbUtility.rms.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.omc.dbUtility.rms.entity.Solar;
import com.omc.dbUtility.template.entity.TemplateData;

/**
 * The Interface UsersRepository.
 */
@Repository
public interface SolarRepository extends JpaRepository<Solar, Long> {

	public Solar findTopByOmcIdOrderByEventTimeStampDesc(int omcId);

	public List<Solar> findAllByOmcId(int omcId);

	 @Query("select t from Solar t where t.omcId=:omcId   order by eventTimeStamp desc")
    	public List<Solar> findLatestByOmcIdOrderByEventTimeStampDesc(Integer omcId);

//	 @Query("select t from TemplateData t where t.omcSiteId=:omcSiteId  and eventTimeStamp>:eventTimeStamp  order by eventTimeStamp")
//		public List<TemplateData> findAllLatestTemplateDataByOmcId(String omcSiteId, Date eventTimeStamp);


}
