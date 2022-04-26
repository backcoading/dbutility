package com.omc.dbUtility;


import java.net.URISyntaxException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.omc.dbUtility.rms.entity.Plant;
import com.omc.dbUtility.rms.repository.PlantRepository;
import com.omc.dbUtility.rms.service.DgService;
import com.omc.dbUtility.rms.service.MinigridService;
import com.omc.dbUtility.rms.service.SolarService;
import com.omc.dbUtility.rms.service.TelecomLoadService;

@SpringBootApplication
@EnableAutoConfiguration
public class DbUtilityApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DbUtilityApplication.class, args);
		System.out.println("starting..........");
	}

	@Autowired(required=true)                              
	private SolarService solarService;               //1

	@Autowired
	private PlantRepository plantRepository;
	
	@Autowired
	private MinigridService minigridService;          //2
	
	@Autowired
	private DgService dgService;                        //3
	
	@Autowired
	private TelecomLoadService telecomLoadService;       //4

	private static List<Plant> plants ;

	@Override
	public void run(String... args) throws Exception {
		plants = plantRepository.findAll();
		callRmsMicroservice(); 
		System.exit(0);
	}

	private void callRmsMicroservice() throws URISyntaxException, JsonProcessingException {   //multiThreading

		for (Plant plant : plants) {
			// thread threadPool Executor - 10
			Integer omcId = plant.getOmcId();
			Integer plantId = plant.getPlantId();
			
			// solarService.updateSolarData(omcId, plantId);
			solarService.updateSolarTemplateData(omcId, plantId);
			minigridService.updateTemplateMinigridData(omcId,plantId);
	     	telecomLoadService.updateTemplateTelecomloadData(omcId,plantId);
			dgService.updateTemplateDgData(omcId,plantId);
			
		}
	}

	
	

}