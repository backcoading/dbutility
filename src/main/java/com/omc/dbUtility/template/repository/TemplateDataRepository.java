package com.omc.dbUtility.template.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.omc.dbUtility.template.entity.TemplateData;

@Repository
public interface TemplateDataRepository extends JpaRepository<TemplateData, Long> {

    public List<TemplateData> findByOmcSiteId(String omcSiteId);

//    public List<TemplateData> findAllByOmcSiteIdOrderByEventTimestamp(String omcSiteId);
    
    //public List<TemplateData> findByOmcSiteIdAndEventTimeStamp(String omcSiteId, Date eventTimeStanp);


   // public List<TemplateData> findAllByOrderByEventTimeStampDesc(Date eventTimeStanp);


   // public TemplateData findTopByOrderByEventTimeStampDesc(Date eventTimeStanp);


    public List<TemplateData> findAllByEventTimeStampGreaterThan(Date eventTimeStanp);
    
    @Query("select t from TemplateData t where t.omcSiteId=:omcSiteId order by eventTimeStamp")
	public List<TemplateData> findAllTemplateByOmcSiteId(@Param("omcSiteId") String omcSiteId);
    @Query("select t from TemplateData t where t.omcSiteId=:omcSiteId  and eventTimeStamp>:eventTimeStamp  order by eventTimeStamp")
	public List<TemplateData> findAllLatestTemplateDataByOmcId(String omcSiteId, Date eventTimeStamp);

}
