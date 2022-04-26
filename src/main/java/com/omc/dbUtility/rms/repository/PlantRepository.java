package com.omc.dbUtility.rms.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.omc.dbUtility.rms.entity.Plant;




/**
 * The Interface UsersRepository.
 */
@Repository
public interface PlantRepository extends JpaRepository<Plant, Integer> {


	public Integer findOmcIdByPlantId(Integer omcId);




}
