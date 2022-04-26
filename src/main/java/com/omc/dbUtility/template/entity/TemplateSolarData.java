package com.omc.dbUtility.template.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "template_solar_data")
public class TemplateSolarData {

	
    @Column(name = "solar_id")
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "omc_id")
    private int omcId;

    @Column(name = "plant_id")
    private int plantId;

   	@Temporal(TemporalType.TIMESTAMP)
      @Column(nullable = false)
      private Date eventTimeStamp; 
 	
 	  @Column(name = "is_active")
      private int isActive;

      @Column(name = "created_on")
      private Date createdOn;

      @Column(name = "created_by")
      private String createdBy;
 	
      @Column(name = "sd_no_mppt")
 	 private int sd_no_mppt;
 	
 	 @Column(name = "sd_mppt1_current")
     private BigDecimal sdMppt1Current;

     @Column(name = "sd_mppt1_power_in_kw")
     private BigDecimal sdMppt1PowerInKw;

     @Column(name = "sd_mppt1_solar_gen_in_kwh")
     private BigDecimal sdMppt1SolarGenInKwh;

     @Column(name = "sd_mppt1_voltage")
     private BigDecimal sdMppt1Voltage;

     @Column(name = "sd_mppt1_string1_current")
     private BigDecimal sdMppt1String1Current;

     @Column(name = "sd_mppt1_string1_power_in_kw")
     private BigDecimal sdMppt1String1PowerInKw;

     @Column(name = "sd_mppt1_string1_solar_gen_in_kwh")
     private BigDecimal sdMppt1String1SolarGenInKwh;

     @Column(name = "sd_mppt1_string1_voltage")
     private BigDecimal sdMppt1String1Voltage;

     @Column(name = "sd_mppt2_current")
     private BigDecimal sdMppt2Current;

     @Column(name = "sd_mppt2_power_in_kw")
     private BigDecimal sdMppt2PowerInKw;

     @Column(name = "sd_mppt2_solar_gen_in_kwh")
     private BigDecimal sdMppt2SolarGenInKwh;

     @Column(name = "sd_mppt2_voltage")
     private BigDecimal sdMppt2Voltage;

     @Column(name = "sd_mppt2_string1_current")
     private BigDecimal sdMppt2String1Current;

     @Column(name = "sd_mppt2_string1_power_in_kw")
     private BigDecimal sdMppt2String1PowerInKw;

     @Column(name = "sd_mppt2_string1_solar_gen_in_kwh")
     private BigDecimal sdMppt2String1SolarGenInKwh;

     @Column(name = "sd_mppt2_string1_voltage")
     private BigDecimal sdMppt2String1Voltage;

     @Column(name = "sd_mppt3_current")
     private BigDecimal sdMppt3Current;

     @Column(name = "sd_mppt3_power_in_kw")
     private BigDecimal sdMppt3PowerInKw;

     @Column(name = "sd_mppt3_solar_gen_in_kwh")
     private BigDecimal sdMppt3SolarGenInKwh;

     @Column(name = "sd_mppt3_voltage")
     private BigDecimal sdMppt3Voltage;

     @Column(name = "sd_mppt3_string1_current")
     private BigDecimal sdMppt3String1Current;

     @Column(name = "sd_mppt3_string1_power_in_kw")
     private BigDecimal sdMppt3String1PowerInKw;

     @Column(name = "sd_mppt3_string1_solar_gen_in_kwh")
     private BigDecimal sdMppt3String1SolarGenInKwh;
     
  	@Column(name = "sd_mppt3_string1_voltage")
  	private BigDecimal sdMppt3String1Voltage;
  	
  	 @Column(name = "sd_mppt4_current")
      private BigDecimal sdMppt4Current;

      @Column(name = "sd_mppt4_power_in_kw")
      private BigDecimal sdMppt4PowerInKw;

      @Column(name = "sd_mppt4_solar_gen_in_kwh")
      private BigDecimal sdMppt4SolarGenInKwh;

      @Column(name = "sd_mppt4_voltage")
      private BigDecimal sdMppt4Voltage;

      @Column(name = "sd_mppt4_string1_current")
      private BigDecimal sdMppt4String1Current;

      @Column(name = "sd_mppt4_string1_power_in_kw")
      private String sdMppt4String1PowerInKw;

      @Column(name = "sd_mppt4_string1_solar_gen_in_kwh")
      private BigDecimal sdMppt4String1SolarGenInKwh;

      @Column(name = "sd_mppt4_string1_voltage")
      private BigDecimal sdMppt4String1Voltage;

      @Column(name = "sd_mppt5_current")
      private BigDecimal sdMppt5Current;

      @Column(name = "sd_mppt5_power_in_kw")
      private BigDecimal sdMppt5PowerInKw;

      @Column(name = "sd_mppt5_solar_gen_in_kwh")
      private BigDecimal sdMppt5SolarGenInKwh;

      @Column(name = "sd_mppt5_voltage")
      private BigDecimal sdMppt5Voltage;

      @Column(name = "sd_mppt5_string1_current")
      private BigDecimal sdMppt5String1Current;

      @Column(name = "sd_mppt5_string1_power_in_kw")
      private BigDecimal sdMppt5String1PowerInKw;

      @Column(name = "sd_mppt5_string1_solar_gen_in_kwh")
      private BigDecimal sdMppt5String1SolarGenInKwh;

      @Column(name = "sd_mppt5_string1_voltage")
      private BigDecimal sdMppt5String1Voltage;

      @Column(name = "sd_mppt6_current")
      private BigDecimal sdMppt6Current;

      @Column(name = "sd_mppt6_power_in_kw")
      private BigDecimal sdMppt6PowerInKw;

      @Column(name = "sd_mppt6_solar_gen_in_kwh")
      private BigDecimal sdMppt6SolarGenInKwh;

      @Column(name = "sd_mppt6_voltage")
      private BigDecimal sdMppt6Voltage;

      @Column(name = "sd_mppt6_string1_current")
      private BigDecimal sdMppt6String1Current;

      @Column(name = "sd_mppt6_string1_power_in_kw")
      private BigDecimal sdMppt6String1PowerInKw;

      @Column(name = "sd_mppt6_string1_solar_gen_in_kwh")
      private BigDecimal sdMppt6String1SolarGenInKwh;

      @Column(name = "sd_mppt6_string1_voltage")
      private BigDecimal sdMppt6String1Voltage;
      
    @Column(name = "sd_mppt7_current")
    private BigDecimal sdMppt7Current;
   	
   	 @Column(name = "sd_mppt7_power_in_kw")
       private BigDecimal sdMppt7PowerInKw;

       @Column(name = "sd_mppt7_solar_gen_in_kwh")
       private BigDecimal sdMppt7SolarGenInKwh;

       @Column(name = "sd_mppt7_voltage")
       private BigDecimal sdMppt7Voltage;
       
       
       @Column(name = "sd_mppt7_string1_current")
        private BigDecimal sdMppt7String1Current;

        @Column(name = "sd_mppt7_string1_power_in_kw")
        private BigDecimal sdMppt7String1PowerInKw;

        @Column(name = "sd_mppt7_string1_solar_gen_in_kwh")
        private BigDecimal sdMppt7String1SolarGenInKwh;

        @Column(name = "sd_mppt7_string1_voltage")
        private BigDecimal sdMppt7String1Voltage;

        @Column(name = "sd_mppt8_current")
        private BigDecimal sdMppt8Current;

        @Column(name = "sd_mppt8_power_in_kw")
        private BigDecimal sdMppt8PowerInKw;

        @Column(name = "sd_mppt8_solar_gen_in_kwh")
        private BigDecimal sdMppt8SolarGenInKwh;

        @Column(name = "sd_mppt8_voltage")
        private BigDecimal sdMppt8Voltage;

        @Column(name = "sd_mppt8_string1_current")
        private BigDecimal sdMppt8String1Current;

        @Column(name = "sd_mppt8_string1_power_in_kw")
        private BigDecimal sdMppt8String1PowerInKw;

        @Column(name = "sd_mppt8_string1_solar_gen_in_kwh")
        private BigDecimal sdMppt8String1SolarGenInKwh;

        @Column(name = "sd_mppt8_string1_voltage")
        private BigDecimal sdMppt8String1Voltage;
        
     	@Column(name = "sd_mppt9_current")
     	private BigDecimal sdMppt9Current;
     	
     	 @Column(name = "sd_mppt9_power_in_kw")
         private BigDecimal sdMppt9PowerInKw;

         @Column(name = "sd_mppt9_solar_gen_in_kwh")
         private BigDecimal sdMppt9SolarGenInKwh;

         @Column(name = "sd_mppt9_voltage")
         private BigDecimal sdMppt9Voltage;

         @Column(name = "sd_mppt9_string1_current")
         private BigDecimal sdMppt9String1Current;

         @Column(name = "sd_mppt9_string1_power_in_kw")
         private BigDecimal sdMppt9String1PowerInKw;

         @Column(name = "sd_mppt9_string1_solar_gen_in_kwh")
         private BigDecimal sdMppt9String1SolarGenInKwh;
         
      	@Column(name = "sd_mppt9_string1_voltage")
      	private BigDecimal sdMppt9String1Voltage;
      	
      	 @Column(name = "sd_mppt10_current")
          private BigDecimal sdMppt10Current;

          @Column(name = "sd_mppt10_power_in_kw")
          private BigDecimal sdMppt10PowerInKw;

          @Column(name = "sd_mppt10_solar_gen_in_kwh")
          private BigDecimal sdMppt10SolarGenInKwh;

          @Column(name = "sd_mppt10_voltage")
          private BigDecimal sdMppt10Voltage;

          @Column(name = "sd_mppt10_string1_current")
          private BigDecimal sdMppt10String1Current;

          @Column(name = "sd_mppt10_string1_power_in_kw")
          private BigDecimal sdMppt10String1PowerInKw;

          @Column(name = "sd_mppt10_string1_solar_gen_in_kwh")
          private BigDecimal sdMppt10String1SolarGenInKwh;

          @Column(name = "sd_mppt10_string1_voltage")
          private BigDecimal sdMppt10String1Voltage;

          @Column(name = "sd_mppt11_current")
          private BigDecimal sdMppt11Current;

          @Column(name = "sd_mppt11_power_in_kw")
          private BigDecimal sdMppt11PowerInKw;
          
          @Column(name = "sd_mppt11_voltage")
          private BigDecimal sdMppt11Voltage;
   
		@Column(name = "sd_mppt11_solar_gen_in_kwh")
          private BigDecimal sdMppt11SolarGenInKwh;

          @Column(name = "sd_mppt11_string1_current")
          private BigDecimal sdMppt11String1Current;

          @Column(name = "sd_mppt11_string1_power_in_kw")
          private BigDecimal sdMppt11String1PowerInKw;

          @Column(name = "sd_mppt11_string1_solar_gen_in_kwh")
          private BigDecimal sdMppt11String1SolarGenInKwh;

          @Column(name = "sd_mppt11_string1_voltage")
          private BigDecimal sdMppt11String1Voltage;

          @Column(name = "sd_mppt12_current")
          private BigDecimal sdMppt12Current;

          @Column(name = "sd_mppt12_power_in_kw")
          private BigDecimal sdMppt12PowerInKw;

          @Column(name = "sd_mppt12_solar_gen_in_kwh")
          private BigDecimal sdMppt12SolarGenInKwh;

          @Column(name = "sd_mppt12_voltage")
          private BigDecimal sdMppt12Voltage;
       
          @Column(name = "sd_mppt12_string1_current")
          private BigDecimal sdMppt12String1Current;

          @Column(name = "sd_mppt12_string1_power_in_kw")
          private BigDecimal sdMppt12String1PowerInKw;

          @Column(name = "sd_mppt12_string1_solar_gen_in_kwh")
          private BigDecimal sdMppt12String1SolarGenInKwh;

          @Column(name = "sd_mppt12_string1_voltage")
          private BigDecimal sdMppt12String1Voltage;

          @Column(name = "sd_mppt13_current")
          private BigDecimal sdMppt13Current;

          @Column(name = "sd_mppt13_power_in_kw")
          private BigDecimal sdMppt13PowerInKw;

          @Column(name = "sd_mppt13_solar_gen_in_kwh")
          private BigDecimal sdMppt13SolarGenInKwh;

          @Column(name = "sd_mppt13_voltage")
          private BigDecimal sdMppt13Voltage;

          @Column(name = "sd_mppt13_string1_current")
          private BigDecimal sdMppt13String1Current;

          @Column(name = "sd_mppt13_string1_power_in_kw")
          private BigDecimal sdMppt13String1PowerInKw;

          @Column(name = "sd_mppt13_string1_solar_gen_in_kwh")
          private BigDecimal sdMppt13String1SolarGenInKwh;
          
         @Column(name = "sd_mppt13_string1_voltage")
         private BigDecimal sdMppt13String1Voltage;
       	
       	 @Column(name = "sd_mppt14_current")
           private BigDecimal sd_mppt14Current;

       	@Column(name = "sd_mppt14_power_in_kw")
        private BigDecimal sdMppt14PowerInKw;
        
     	@Column(name = "sd_mppt14_solar_gen_in_kwh")
     	private BigDecimal sdMppt14SolarGenInKwh;
     	
     	 @Column(name = "sd_mppt14_voltage")
         private BigDecimal sdMppt14Voltage;

         @Column(name = "sd_mppt14_string1_current")
         private BigDecimal sdMppt14String1Current;

         @Column(name = "sd_mppt14_string1_power_in_kw")
         private BigDecimal sdMppt14String1PowerInKw;

         @Column(name = "sd_mppt14_string1_solar_gen_in_kwh")
         private BigDecimal sd_mppt14String1SolarGenInKwh;

         @Column(name = "sd_mppt14_string1_voltage")
         private BigDecimal sdMppt14String1Voltage;

         @Column(name = "sd_mppt15_current")
         private BigDecimal sdMppt15Current;

         @Column(name = "sd_mppt15_power_in_kw")
         private BigDecimal sdMppt15PowerInKw;

         @Column(name = "sd_mppt15_solar_gen_in_kwh")
         private BigDecimal sdMppt15SolarGenInKwh;

         @Column(name = "sd_mppt15_voltage")
         private BigDecimal sdMppt15Voltage;

         @Column(name = "sd_mppt15_string1_current")
         private BigDecimal sdMppt15String1Current;

         @Column(name = "sd_mppt15_string1_power_in_kw")
         private BigDecimal sdMppt15String1PowerInKw;

         @Column(name = "sd_mppt15_string1_solar_gen_in_kwh")
         private BigDecimal sdMppt15String1SolarGenInKwh;

         @Column(name = "sd_mppt15_string1_voltage")
         private BigDecimal sdMppt15String1Voltage;
         
      	@Column(name = "sd_mppt16_current")
      	private BigDecimal sdMppt16Current;
      	
      	 @Column(name = "sd_mppt16_power_in_kw")
          private BigDecimal sdMppt16PowerInKw;

          @Column(name = "sd_mppt16_solar_gen_in_kwh")
          private BigDecimal sdMppt16SolarGenInKwh;

          @Column(name = "sd_mppt16_voltage")
          private BigDecimal sdMppt16Voltage;

          @Column(name = "sd_mppt16_string1_current")
          private BigDecimal sdMppt16String1Current;

          @Column(name = "sd_mppt16_string1_power_in_kw")
          private BigDecimal sdMppt16String1PowerInKw;

          @Column(name = "sd_mppt16_string1_solar_gen_in_kwh")
          private BigDecimal sdMppt16String1SolarGenInKwh;

          @Column(name = "sd_mppt16_string1_voltage")
          private BigDecimal sdMppt16String1Voltage;

          @Column(name = "sd_mppt17_current")
          private BigDecimal sdMppt17Current;

          @Column(name = "sd_mppt17_power_in_kw")
          private BigDecimal sdMppt17PowerInKw;

          @Column(name = "sd_mppt17_solar_gen_in_kwh")
          private BigDecimal sdMppt17SolarGenInKwh;

          @Column(name = "sd_mppt17_voltage")
          private BigDecimal sdMppt17Voltage;

          @Column(name = "sd_mppt17_string1_current")
          private BigDecimal sdMppt17String1Current;

          @Column(name = "sd_mppt17_string1_power_in_kw")
          private BigDecimal sdMppt17String1PowerInKw;

          @Column(name = "sd_mppt17_string1_solar_gen_in_kwh")
          private BigDecimal sdMppt17String1SolarGenInKwh;
          
       	@Column(name = "sd_mppt17_string1_voltage")
       	private BigDecimal sdMppt17String1Voltage;
       	
       	 @Column(name = "sd_mppt18_current")
           private BigDecimal sdMppt18Current;

           @Column(name = "sd_mppt18_power_in_kw")
           private BigDecimal sdMppt18PowerInKw;

           @Column(name = "sd_mppt18_solar_gen_in_kwh")
           private BigDecimal sdMppt18SolarGenInKwh;

           @Column(name = "sd_mppt18_voltage")
           private BigDecimal sdMppt18Voltage;

           @Column(name = "sd_mppt18_string1_current")
           private BigDecimal sdMppt18String1Current;

           @Column(name = "sd_mppt18_string1_power_in_kw")
           private BigDecimal sdMppt18String1PowerInKw;

           @Column(name = "sd_mppt18_string1_solar_gen_in_kwh")
           private BigDecimal sdMppt18String1SolarGenInKwh;

           @Column(name = "sd_mppt18_string1_voltage")
           private BigDecimal sdMppt18String1Voltage;

           @Column(name = "total_solar_gen_kw_current_hour")
           private BigDecimal totalSolarGenKwCurrentHour;
           
           
           @Column(name = "total_solar_gen_kwh_current_hour")
           private BigDecimal totalSolarGenKwhCurrentHour;


           @Column(name = "total_solar_gen_kw_current_today")
           private BigDecimal totalSolarGenKwCurrentToday;

           @Column(name = "total_solar_gen_kwh_current_today")
           private BigDecimal totalSolarGenKwhCurrentToday;

           @Column(name = "total_solar_gen_kw_current_month")
           private BigDecimal totalSolarGenKwCurrentMonth;

           @Column(name = "total_solar_gen_kwh_current_month")
           private BigDecimal total_solar_gen_kwh_current_month;

           @Column(name = "total_solar_gen_kw_current_year")
           private BigDecimal totalSolarGenKwCurrentYear;

           @Column(name = "total_solar_gen_kwh_current_year")
           private BigDecimal totalSolarGenKwhCurrentYear;

           @Column(name = "total_solar_gen_kw_lifetime")
           private BigDecimal totalSolarGenKwLifetime;

           @Column(name = "total_solar_gen_kwh_lifetime")
           private BigDecimal totalSolarGenKwhLifetime;

           @Column(name = "solar_gen_factor")
           private BigDecimal solarGenFactor;

           @Column(name = "avg_mppt_power_kw")
           private BigDecimal avgMpptPowerKw;

           @Column(name = "energy_to_batt_kwh_current_hour")
           private BigDecimal energyToBattKwhCurrentHour;

           @Column(name = "energy_to_batt_kwh_current_day")
           private BigDecimal energyToBattKwhCurrentDay;

           @Column(name = "energy_to_batt_kwh_current_month")
           private BigDecimal energyToBattKwhCurrentMonth;

           @Column(name = "energy_to_batt_kwh_current_year")
           private BigDecimal energyToBattKwhCurrentYear;

           @Column(name = "energy_to_batt_kwh_lifetime")
           private BigDecimal energyToBattKwhLifetime;

		public TemplateSolarData() {
			super();
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public int getOmcId() {
			return omcId;
		}

		public void setOmcId(int omcId) {
			this.omcId = omcId;
		}

		public int getPlantId() {
			return plantId;
		}

		public void setPlantId(int plantId) {
			this.plantId = plantId;
		}

		public Date getEventTimeStamp() {
			return eventTimeStamp;
		}

		public void setEventTimeStamp(Date eventTimeStamp) {
			this.eventTimeStamp = eventTimeStamp;
		}

		public int getSd_no_mppt() {
			return sd_no_mppt;
		}

		public void setSd_no_mppt(int sd_no_mppt) {
			this.sd_no_mppt = sd_no_mppt;
		}

		public BigDecimal getSdMppt1Current() {
			return sdMppt1Current;
		}

		public void setSdMppt1Current(BigDecimal sdMppt1Current) {
			this.sdMppt1Current = sdMppt1Current;
		}

		public BigDecimal getSdMppt1PowerInKw() {
			return sdMppt1PowerInKw;
		}

		public void setSdMppt1PowerInKw(BigDecimal sdMppt1PowerInKw) {
			this.sdMppt1PowerInKw = sdMppt1PowerInKw;
		}

		public BigDecimal getSdMppt1SolarGenInKwh() {
			return sdMppt1SolarGenInKwh;
		}

		public void setSdMppt1SolarGenInKwh(BigDecimal sdMppt1SolarGenInKwh) {
			this.sdMppt1SolarGenInKwh = sdMppt1SolarGenInKwh;
		}

		public BigDecimal getSdMppt1Voltage() {
			return sdMppt1Voltage;
		}

		public void setSdMppt1Voltage(BigDecimal sdMppt1Voltage) {
			this.sdMppt1Voltage = sdMppt1Voltage;
		}

		public BigDecimal getSdMppt1String1Current() {
			return sdMppt1String1Current;
		}

		public void setSdMppt1String1Current(BigDecimal sdMppt1String1Current) {
			this.sdMppt1String1Current = sdMppt1String1Current;
		}

		public BigDecimal getSdMppt1String1PowerInKw() {
			return sdMppt1String1PowerInKw;
		}

		public void setSdMppt1String1PowerInKw(BigDecimal sdMppt1String1PowerInKw) {
			this.sdMppt1String1PowerInKw = sdMppt1String1PowerInKw;
		}

		public BigDecimal getSdMppt1String1SolarGenInKwh() {
			return sdMppt1String1SolarGenInKwh;
		}

		public void setSdMppt1String1SolarGenInKwh(BigDecimal sdMppt1String1SolarGenInKwh) {
			this.sdMppt1String1SolarGenInKwh = sdMppt1String1SolarGenInKwh;
		}

		public BigDecimal getSdMppt1String1Voltage() {
			return sdMppt1String1Voltage;
		}

		public void setSdMppt1String1Voltage(BigDecimal sdMppt1String1Voltage) {
			this.sdMppt1String1Voltage = sdMppt1String1Voltage;
		}

		public BigDecimal getSdMppt2Current() {
			return sdMppt2Current;
		}

		public void setSdMppt2Current(BigDecimal sdMppt2Current) {
			this.sdMppt2Current = sdMppt2Current;
		}

		public BigDecimal getSdMppt2PowerInKw() {
			return sdMppt2PowerInKw;
		}

		public void setSdMppt2PowerInKw(BigDecimal sdMppt2PowerInKw) {
			this.sdMppt2PowerInKw = sdMppt2PowerInKw;
		}

		public BigDecimal getSdMppt2SolarGenInKwh() {
			return sdMppt2SolarGenInKwh;
		}

		public void setSdMppt2SolarGenInKwh(BigDecimal sdMppt2SolarGenInKwh) {
			this.sdMppt2SolarGenInKwh = sdMppt2SolarGenInKwh;
		}

		public BigDecimal getSdMppt2Voltage() {
			return sdMppt2Voltage;
		}

		public void setSdMppt2Voltage(BigDecimal sdMppt2Voltage) {
			this.sdMppt2Voltage = sdMppt2Voltage;
		}

		public BigDecimal getSdMppt2String1Current() {
			return sdMppt2String1Current;
		}

		public void setSdMppt2String1Current(BigDecimal sdMppt2String1Current) {
			this.sdMppt2String1Current = sdMppt2String1Current;
		}

		public BigDecimal getSdMppt2String1PowerInKw() {
			return sdMppt2String1PowerInKw;
		}

		public void setSdMppt2String1PowerInKw(BigDecimal sdMppt2String1PowerInKw) {
			this.sdMppt2String1PowerInKw = sdMppt2String1PowerInKw;
		}

		public BigDecimal getSdMppt2String1SolarGenInKwh() {
			return sdMppt2String1SolarGenInKwh;
		}

		public void setSdMppt2String1SolarGenInKwh(BigDecimal sdMppt2String1SolarGenInKwh) {
			this.sdMppt2String1SolarGenInKwh = sdMppt2String1SolarGenInKwh;
		}

		public BigDecimal getSdMppt2String1Voltage() {
			return sdMppt2String1Voltage;
		}

		public void setSdMppt2String1Voltage(BigDecimal sdMppt2String1Voltage) {
			this.sdMppt2String1Voltage = sdMppt2String1Voltage;
		}

		public BigDecimal getSdMppt3Current() {
			return sdMppt3Current;
		}

		public void setSdMppt3Current(BigDecimal sdMppt3Current) {
			this.sdMppt3Current = sdMppt3Current;
		}

		public BigDecimal getSdMppt3PowerInKw() {
			return sdMppt3PowerInKw;
		}

		public void setSdMppt3PowerInKw(BigDecimal sdMppt3PowerInKw) {
			this.sdMppt3PowerInKw = sdMppt3PowerInKw;
		}

		public BigDecimal getSdMppt3SolarGenInKwh() {
			return sdMppt3SolarGenInKwh;
		}

		public void setSdMppt3SolarGenInKwh(BigDecimal sdMppt3SolarGenInKwh) {
			this.sdMppt3SolarGenInKwh = sdMppt3SolarGenInKwh;
		}

		public BigDecimal getSdMppt3Voltage() {
			return sdMppt3Voltage;
		}

		public void setSdMppt3Voltage(BigDecimal sdMppt3Voltage) {
			this.sdMppt3Voltage = sdMppt3Voltage;
		}

		public BigDecimal getSdMppt3String1Current() {
			return sdMppt3String1Current;
		}

		public void setSdMppt3String1Current(BigDecimal sdMppt3String1Current) {
			this.sdMppt3String1Current = sdMppt3String1Current;
		}

		public BigDecimal getSdMppt3String1PowerInKw() {
			return sdMppt3String1PowerInKw;
		}

		public void setSdMppt3String1PowerInKw(BigDecimal sdMppt3String1PowerInKw) {
			this.sdMppt3String1PowerInKw = sdMppt3String1PowerInKw;
		}

		public BigDecimal getSdMppt3String1SolarGenInKwh() {
			return sdMppt3String1SolarGenInKwh;
		}

		public void setSdMppt3String1SolarGenInKwh(BigDecimal sdMppt3String1SolarGenInKwh) {
			this.sdMppt3String1SolarGenInKwh = sdMppt3String1SolarGenInKwh;
		}

		public BigDecimal getSdMppt3String1Voltage() {
			return sdMppt3String1Voltage;
		}

		public void setSdMppt3String1Voltage(BigDecimal sdMppt3String1Voltage) {
			this.sdMppt3String1Voltage = sdMppt3String1Voltage;
		}

		public BigDecimal getSdMppt4Current() {
			return sdMppt4Current;
		}

		public void setSdMppt4Current(BigDecimal sdMppt4Current) {
			this.sdMppt4Current = sdMppt4Current;
		}

		public BigDecimal getSdMppt4PowerInKw() {
			return sdMppt4PowerInKw;
		}

		public void setSdMppt4PowerInKw(BigDecimal sdMppt4PowerInKw) {
			this.sdMppt4PowerInKw = sdMppt4PowerInKw;
		}

		public BigDecimal getSdMppt4SolarGenInKwh() {
			return sdMppt4SolarGenInKwh;
		}

		public void setSdMppt4SolarGenInKwh(BigDecimal sdMppt4SolarGenInKwh) {
			this.sdMppt4SolarGenInKwh = sdMppt4SolarGenInKwh;
		}

		public BigDecimal getSdMppt4Voltage() {
			return sdMppt4Voltage;
		}

		public void setSdMppt4Voltage(BigDecimal sdMppt4Voltage) {
			this.sdMppt4Voltage = sdMppt4Voltage;
		}

		public BigDecimal getSdMppt4String1Current() {
			return sdMppt4String1Current;
		}

		public void setSdMppt4String1Current(BigDecimal sdMppt4String1Current) {
			this.sdMppt4String1Current = sdMppt4String1Current;
		}

		public String getSdMppt4String1PowerInKw() {
			return sdMppt4String1PowerInKw;
		}

		public void setSdMppt4String1PowerInKw(String sdMppt4String1PowerInKw) {
			this.sdMppt4String1PowerInKw = sdMppt4String1PowerInKw;
		}

		public BigDecimal getSdMppt4String1SolarGenInKwh() {
			return sdMppt4String1SolarGenInKwh;
		}

		public void setSdMppt4String1SolarGenInKwh(BigDecimal sdMppt4String1SolarGenInKwh) {
			this.sdMppt4String1SolarGenInKwh = sdMppt4String1SolarGenInKwh;
		}

		public BigDecimal getSdMppt4String1Voltage() {
			return sdMppt4String1Voltage;
		}

		public void setSdMppt4String1Voltage(BigDecimal sdMppt4String1Voltage) {
			this.sdMppt4String1Voltage = sdMppt4String1Voltage;
		}

		public BigDecimal getSdMppt5Current() {
			return sdMppt5Current;
		}

		public void setSdMppt5Current(BigDecimal sdMppt5Current) {
			this.sdMppt5Current = sdMppt5Current;
		}

		public BigDecimal getSdMppt5PowerInKw() {
			return sdMppt5PowerInKw;
		}

		public void setSdMppt5PowerInKw(BigDecimal sdMppt5PowerInKw) {
			this.sdMppt5PowerInKw = sdMppt5PowerInKw;
		}

		public BigDecimal getSdMppt5SolarGenInKwh() {
			return sdMppt5SolarGenInKwh;
		}

		public void setSdMppt5SolarGenInKwh(BigDecimal sdMppt5SolarGenInKwh) {
			this.sdMppt5SolarGenInKwh = sdMppt5SolarGenInKwh;
		}

		public BigDecimal getSdMpt5Voltage() {
			return sdMppt5Voltage;
		}

		public void setSdMppt5Voltage1(BigDecimal sdMppt5Voltage) {
			this.sdMppt5Voltage = sdMppt5Voltage;
		}

		public BigDecimal getSdMppt5String1Current() {
			return sdMppt5String1Current;
		}

		public void setSdMppt5String1Current(BigDecimal sdMppt5String1Current) {
			this.sdMppt5String1Current = sdMppt5String1Current;
		}

		public BigDecimal getSdMppt5String1PowerInKw() {
			return sdMppt5String1PowerInKw;
		}

		public void setSdMppt5String1PowerInKw(BigDecimal sdMppt5String1PowerInKw) {
			this.sdMppt5String1PowerInKw = sdMppt5String1PowerInKw;
		}

		public BigDecimal getSdMppt5String1SolarGenInKwh() {
			return sdMppt5String1SolarGenInKwh;
		}

		public void setSdMppt5String1SolarGenInKwh(BigDecimal sdMppt5String1SolarGenInKwh) {
			this.sdMppt5String1SolarGenInKwh = sdMppt5String1SolarGenInKwh;
		}

		public BigDecimal getSdMppt5String1Voltage() {
			return sdMppt5String1Voltage;
		}

		public void setSdMppt5String1Voltage(BigDecimal sdMppt5String1Voltage) {
			this.sdMppt5String1Voltage = sdMppt5String1Voltage;
		}

		public BigDecimal getSdMppt6Current() {
			return sdMppt6Current;
		}

		public void setSdMppt6Current(BigDecimal sdMppt6Current) {
			this.sdMppt6Current = sdMppt6Current;
		}

		public BigDecimal getSdMppt6PowerInKw() {
			return sdMppt6PowerInKw;
		}

		public void setSdMppt6PowerInKw(BigDecimal sdMppt6PowerInKw) {
			this.sdMppt6PowerInKw = sdMppt6PowerInKw;
		}

		public BigDecimal getSdMppt6SolarGenInKwh() {
			return sdMppt6SolarGenInKwh;
		}

		public void setSdMppt6SolarGenInKwh(BigDecimal sdMppt6SolarGenInKwh) {
			this.sdMppt6SolarGenInKwh = sdMppt6SolarGenInKwh;
		}

		public BigDecimal getSdMppt6Voltage() {
			return sdMppt6Voltage;
		}

		public void setSdMppt6Voltage(BigDecimal sdMppt6Voltage) {
			this.sdMppt6Voltage = sdMppt6Voltage;
		}

		public BigDecimal getSdMppt6String1Current() {
			return sdMppt6String1Current;
		}

		public void setSdMppt6String1Current(BigDecimal sdMppt6String1Current) {
			this.sdMppt6String1Current = sdMppt6String1Current;
		}

		public BigDecimal getSdMppt6String1PowerInKw() {
			return sdMppt6String1PowerInKw;
		}

		public void setSdMppt6String1PowerInKw(BigDecimal sdMppt6String1PowerInKw) {
			this.sdMppt6String1PowerInKw = sdMppt6String1PowerInKw;
		}

		public BigDecimal getSdMppt6String1SolarGenInKwh() {
			return sdMppt6String1SolarGenInKwh;
		}

		public void setSdMppt6String1SolarGenInKwh(BigDecimal sdMppt6String1SolarGenInKwh) {
			this.sdMppt6String1SolarGenInKwh = sdMppt6String1SolarGenInKwh;
		}

		public BigDecimal getSdMppt6String1Voltage() {
			return sdMppt6String1Voltage;
		}

		public void setSdMppt6String1Voltage(BigDecimal sdMppt6String1Voltage) {
			this.sdMppt6String1Voltage = sdMppt6String1Voltage;
		}

		public BigDecimal getSdMppt7Current() {
			return sdMppt7Current;
		}

		public void setSdMppt7Current(BigDecimal sdMppt7Current) {
			this.sdMppt7Current = sdMppt7Current;
		}

		public BigDecimal getSdMppt7PowerInKw() {
			return sdMppt7PowerInKw;
		}

		public void setSdMppt7PowerInKw(BigDecimal sdMppt7PowerInKw) {
			this.sdMppt7PowerInKw = sdMppt7PowerInKw;
		}

		public BigDecimal getSdMppt7SolarGenInKwh() {
			return sdMppt7SolarGenInKwh;
		}

		public void setSdMppt7SolarGenInKwh(BigDecimal sdMppt7SolarGenInKwh) {
			this.sdMppt7SolarGenInKwh = sdMppt7SolarGenInKwh;
		}

		public BigDecimal getSdMppt7Voltage() {
			return sdMppt7Voltage;
		}

		public void setSdMppt7Voltage(BigDecimal sdMppt7Voltage) {
			this.sdMppt7Voltage = sdMppt7Voltage;
		}

		public BigDecimal getSdMppt7String1Current() {
			return sdMppt7String1Current;
		}

		public void setSdMppt7String1Current(BigDecimal sdMppt7String1Current) {
			this.sdMppt7String1Current = sdMppt7String1Current;
		}

		public BigDecimal getSdMppt7String1PowerInKw() {
			return sdMppt7String1PowerInKw;
		}

		public void setSdMppt7String1PowerInKw(BigDecimal sdMppt7String1PowerInKw) {
			this.sdMppt7String1PowerInKw = sdMppt7String1PowerInKw;
		}

		public BigDecimal getSdMppt7String1SolarGenInKwh() {
			return sdMppt7String1SolarGenInKwh;
		}

		public void setSdMppt7String1SolarGenInKwh(BigDecimal sdMppt7String1SolarGenInKwh) {
			this.sdMppt7String1SolarGenInKwh = sdMppt7String1SolarGenInKwh;
		}

		public BigDecimal getSdMppt7String1Voltage() {
			return sdMppt7String1Voltage;
		}

		public void setSdMppt7String1Voltage(BigDecimal sdMppt7String1Voltage) {
			this.sdMppt7String1Voltage = sdMppt7String1Voltage;
		}

		public BigDecimal getSdMppt8Current() {
			return sdMppt8Current;
		}

		public void setSdMppt8Current(BigDecimal sdMppt8Current) {
			this.sdMppt8Current = sdMppt8Current;
		}

		public BigDecimal getSdMppt8PowerInKw() {
			return sdMppt8PowerInKw;
		}

		public void setSdMppt8PowerInKw(BigDecimal sdMppt8PowerInKw) {
			this.sdMppt8PowerInKw = sdMppt8PowerInKw;
		}

		public BigDecimal getSdMppt8SolarGenInKwh() {
			return sdMppt8SolarGenInKwh;
		}

		public void setSdMppt8SolarGenInKwh(BigDecimal sdMppt8SolarGenInKwh) {
			this.sdMppt8SolarGenInKwh = sdMppt8SolarGenInKwh;
		}

		public BigDecimal getSdMppt8Voltage() {
			return sdMppt8Voltage;
		}

		public void setSdMppt8Voltage(BigDecimal sdMppt8Voltage) {
			this.sdMppt8Voltage = sdMppt8Voltage;
		}

		public BigDecimal getSdMppt8String1Current() {
			return sdMppt8String1Current;
		}

		public void setSdMppt8String1Current(BigDecimal sdMppt8String1Current) {
			this.sdMppt8String1Current = sdMppt8String1Current;
		}

		public BigDecimal getSdMppt8String1PowerInKw() {
			return sdMppt8String1PowerInKw;
		}

		public void setSdMppt8String1PowerInKw(BigDecimal sdMppt8String1PowerInKw) {
			this.sdMppt8String1PowerInKw = sdMppt8String1PowerInKw;
		}

		public BigDecimal getSdMppt8String1SolarGenInKwh() {
			return sdMppt8String1SolarGenInKwh;
		}

		public void setSdMppt8String1SolarGenInKwh(BigDecimal sdMppt8String1SolarGenInKwh) {
			this.sdMppt8String1SolarGenInKwh = sdMppt8String1SolarGenInKwh;
		}

		public BigDecimal getSdMppt8String1Voltage() {
			return sdMppt8String1Voltage;
		}

		public void setSdMppt8String1Voltage(BigDecimal sdMppt8String1Voltage) {
			this.sdMppt8String1Voltage = sdMppt8String1Voltage;
		}

		public BigDecimal getSdMppt9Current() {
			return sdMppt9Current;
		}

		public void setSdMppt9Current(BigDecimal sdMppt9Current) {
			this.sdMppt9Current = sdMppt9Current;
		}

		public BigDecimal getSdMppt9PowerInKw() {
			return sdMppt9PowerInKw;
		}

		public void setSdMppt9PowerInKw(BigDecimal sdMppt9PowerInKw) {
			this.sdMppt9PowerInKw = sdMppt9PowerInKw;
		}

		public BigDecimal getSdMppt9SolarGenInKwh() {
			return sdMppt9SolarGenInKwh;
		}

		public void setSdMppt9SolarGenInKwh(BigDecimal sdMppt9SolarGenInKwh) {
			this.sdMppt9SolarGenInKwh = sdMppt9SolarGenInKwh;
		}

		public BigDecimal getSdMppt9Voltage() {
			return sdMppt9Voltage;
		}

		public void setSdMppt9Voltage(BigDecimal sdMppt9Voltage) {
			this.sdMppt9Voltage = sdMppt9Voltage;
		}

		public BigDecimal getSdMppt9String1Current() {
			return sdMppt9String1Current;
		}

		public void setSdMppt9String1Current(BigDecimal sdMppt9String1Current) {
			this.sdMppt9String1Current = sdMppt9String1Current;
		}

		public BigDecimal getSdMppt9String1PowerInKw() {
			return sdMppt9String1PowerInKw;
		}

		public void setSdMppt9String1PowerInKw(BigDecimal sdMppt9String1PowerInKw) {
			this.sdMppt9String1PowerInKw = sdMppt9String1PowerInKw;
		}

		public BigDecimal getSdMppt9String1SolarGenInKwh() {
			return sdMppt9String1SolarGenInKwh;
		}

		public void setSdMppt9String1SolarGenInKwh(BigDecimal sdMppt9String1SolarGenInKwh) {
			this.sdMppt9String1SolarGenInKwh = sdMppt9String1SolarGenInKwh;
		}

		public BigDecimal getSdMppt9String1Voltage() {
			return sdMppt9String1Voltage;
		}

		public void setSdMppt9String1Voltage(BigDecimal sdMppt9String1Voltage) {
			this.sdMppt9String1Voltage = sdMppt9String1Voltage;
		}

		public BigDecimal getSdMppt10Current() {
			return sdMppt10Current;
		}

		public void setSdMppt10Current(BigDecimal sdMppt10Current) {
			this.sdMppt10Current = sdMppt10Current;
		}

		public BigDecimal getSdMppt10PowerInKw() {
			return sdMppt10PowerInKw;
		}

		public void setSdMppt10PowerInKw(BigDecimal sdMppt10PowerInKw) {
			this.sdMppt10PowerInKw = sdMppt10PowerInKw;
		}

		public BigDecimal getSdMppt10SolarGenInKwh() {
			return sdMppt10SolarGenInKwh;
		}

		public void setSdMppt10SolarGenInKwh(BigDecimal sdMppt10SolarGenInKwh) {
			this.sdMppt10SolarGenInKwh = sdMppt10SolarGenInKwh;
		}

		public BigDecimal getSdMppt10Voltage() {
			return sdMppt10Voltage;
		}

		public void setSdMppt10Voltage(BigDecimal sdMppt10Voltage) {
			this.sdMppt10Voltage = sdMppt10Voltage;
		}

		public BigDecimal getSdMppt10String1Current() {
			return sdMppt10String1Current;
		}

		public void setSdMppt10String1Current(BigDecimal sdMppt10String1Current) {
			this.sdMppt10String1Current = sdMppt10String1Current;
		}

		public BigDecimal getSdMppt10String1PowerInKw() {
			return sdMppt10String1PowerInKw;
		}

		public void setSdMppt10String1PowerInKw1(BigDecimal sdMppt10String1PowerInKw) {
			this.sdMppt10String1PowerInKw = sdMppt10String1PowerInKw;
		}

		public BigDecimal getSdMppt10String1SolarGenInKwh() {
			return sdMppt10String1SolarGenInKwh;
		}

		public void setSdMppt10String1SolarGenInKwh(BigDecimal sdMppt10String1SolarGenInKwh) {
			this.sdMppt10String1SolarGenInKwh = sdMppt10String1SolarGenInKwh;
		}

		public BigDecimal getSdMppt10String1Voltage() {
			return sdMppt10String1Voltage;
		}

		public void setSdMppt10String1Voltage(BigDecimal sdMppt10String1Voltage) {
			this.sdMppt10String1Voltage = sdMppt10String1Voltage;
		}

		public BigDecimal getSdMppt11Current() {
			return sdMppt11Current;
		}

		public void setSdMppt11Current(BigDecimal sdMppt11Current) {
			this.sdMppt11Current = sdMppt11Current;
		}

		public BigDecimal getSdMppt11PowerInKw() {
			return sdMppt11PowerInKw;
		}

		public void setSdMppt11PowerInKw(BigDecimal sdMppt11PowerInKw) {
			this.sdMppt11PowerInKw = sdMppt11PowerInKw;
		}

		public BigDecimal getSdMppt11SolarGenInKwh() {
			return sdMppt11SolarGenInKwh;
		}

		public void setSdMppt11SolarGenInKwh(BigDecimal sdMppt11SolarGenInKwh) {
			this.sdMppt11SolarGenInKwh = sdMppt11SolarGenInKwh;
		}

		public BigDecimal getSdMppt11String1Current() {
			return sdMppt11String1Current;
		}

		public void setSdMppt11String1Current(BigDecimal sdMppt11String1Current) {
			this.sdMppt11String1Current = sdMppt11String1Current;
		}

		public BigDecimal getSdMppt11String1PowerInKw() {
			return sdMppt11String1PowerInKw;
		}

		public void setSdMppt11String1PowerInKw(BigDecimal sdMppt11String1PowerInKw) {
			this.sdMppt11String1PowerInKw = sdMppt11String1PowerInKw;
		}

		public BigDecimal getSdMppt11String1SolarGenInKwh() {
			return sdMppt11String1SolarGenInKwh;
		}

		public void setSdMppt11String1SolarGenInKwh(BigDecimal sdMppt11String1SolarGenInKwh) {
			this.sdMppt11String1SolarGenInKwh = sdMppt11String1SolarGenInKwh;
		}

		public BigDecimal getSdMppt11String1Voltage() {
			return sdMppt11String1Voltage;
		}

		public void setSdMppt11String1Voltage(BigDecimal sdMppt11String1Voltage) {
			this.sdMppt11String1Voltage = sdMppt11String1Voltage;
		}

		public BigDecimal getSdMppt12Current() {
			return sdMppt12Current;
		}

		public void setSdMppt12Current(BigDecimal sdMppt12Current) {
			this.sdMppt12Current = sdMppt12Current;
		}

		public BigDecimal getSdMppt12PowerInKw() {
			return sdMppt12PowerInKw;
		}

		public void setSdMppt12PowerInKw(BigDecimal sdMppt12PowerInKw) {
			this.sdMppt12PowerInKw = sdMppt12PowerInKw;
		}

		public BigDecimal getSdMppt12SolarGenInKwh() {
			return sdMppt12SolarGenInKwh;
		}

		public void setSdMppt12SolarGenInKwh(BigDecimal sdMppt12SolarGenInKwh) {
			this.sdMppt12SolarGenInKwh = sdMppt12SolarGenInKwh;
		}

		public BigDecimal getSdMppt12Voltage() {
			return sdMppt12Voltage;
		}

		public void setSdMppt12Voltage(BigDecimal sdMppt12Voltage) {
			this.sdMppt12Voltage = sdMppt12Voltage;
		}

		public BigDecimal getSdMppt12String1Current() {
			return sdMppt12String1Current;
		}

		public void setSdMppt12String1Current(BigDecimal sdMppt12String1Current) {
			this.sdMppt12String1Current = sdMppt12String1Current;
		}

		public BigDecimal getSdMppt12String1PowerInKw() {
			return sdMppt12String1PowerInKw;
		}

		public void setSdMppt12String1PowerInKw(BigDecimal sdMppt12String1PowerInKw) {
			this.sdMppt12String1PowerInKw = sdMppt12String1PowerInKw;
		}

		public BigDecimal getSdMppt12String1SolarGenInKwh() {
			return sdMppt12String1SolarGenInKwh;
		}

		public void setSdMppt12String1SolarGenInKwh(BigDecimal sdMppt12String1SolarGenInKwh) {
			this.sdMppt12String1SolarGenInKwh = sdMppt12String1SolarGenInKwh;
		}

		public BigDecimal getSdMppt12String1Voltage() {
			return sdMppt12String1Voltage;
		}

		public void setSdMppt12String1Voltage(BigDecimal sdMppt12String1Voltage) {
			this.sdMppt12String1Voltage = sdMppt12String1Voltage;
		}

		public BigDecimal getSdMppt13Current() {
			return sdMppt13Current;
		}

		public void setSdMppt13Current(BigDecimal sdMppt13Current) {
			this.sdMppt13Current = sdMppt13Current;
		}

		public BigDecimal getSdMppt13PowerInKw() {
			return sdMppt13PowerInKw;
		}

		public void setSdMppt13PowerInKw(BigDecimal sdMppt13PowerInKw) {
			this.sdMppt13PowerInKw = sdMppt13PowerInKw;
		}

		public BigDecimal getSdMppt13SolarGenInKwh() {
			return sdMppt13SolarGenInKwh;
		}

		public void setSdMppt13SolarGenInKwh(BigDecimal sdMppt13SolarGenInKwh) {
			this.sdMppt13SolarGenInKwh = sdMppt13SolarGenInKwh;
		}

		public BigDecimal getSdMppt13Voltage() {
			return sdMppt13Voltage;
		}

		public void setSdMppt13Voltage(BigDecimal sdMppt13Voltage) {
			this.sdMppt13Voltage = sdMppt13Voltage;
		}

		public BigDecimal getSdMppt13String1Current() {
			return sdMppt13String1Current;
		}

		public void setSdMppt13String1Current(BigDecimal sdMppt13String1Current) {
			this.sdMppt13String1Current = sdMppt13String1Current;
		}

		public BigDecimal getSdMppt13String1PowerInKw() {
			return sdMppt13String1PowerInKw;
		}

		public void setSdMppt13String1PowerInKw(BigDecimal sdMppt13String1PowerInKw) {
			this.sdMppt13String1PowerInKw = sdMppt13String1PowerInKw;
		}

		public BigDecimal getSdMppt13String1SolarGenInKwh() {
			return sdMppt13String1SolarGenInKwh;
		}

		public void setSdMppt13String1SolarGenInKwh(BigDecimal sdMppt13String1SolarGenInKwh) {
			this.sdMppt13String1SolarGenInKwh = sdMppt13String1SolarGenInKwh;
		}

		public BigDecimal getSdMppt13String1Voltage() {
			return sdMppt13String1Voltage;
		}

		public void setSdMppt13String1Voltage(BigDecimal sdMppt13String1Voltage) {
			this.sdMppt13String1Voltage = sdMppt13String1Voltage;
		}

		public BigDecimal getSd_mppt14Current() {
			return sd_mppt14Current;
		}

		public void setSd_mppt14Current(BigDecimal sd_mppt14Current) {
			this.sd_mppt14Current = sd_mppt14Current;
		}

		public BigDecimal getSdMppt14PowerInKw() {
			return sdMppt14PowerInKw;
		}

		public void setSdMppt14PowerInKw(BigDecimal sdMppt14PowerInKw) {
			this.sdMppt14PowerInKw = sdMppt14PowerInKw;
		}

		public BigDecimal getSdMppt14SolarGenInKwh() {
			return sdMppt14SolarGenInKwh;
		}

		public void setSdMppt14SolarGenInKwh(BigDecimal sdMppt14SolarGenInKwh) {
			this.sdMppt14SolarGenInKwh = sdMppt14SolarGenInKwh;
		}

		public BigDecimal getSdMppt14Voltage() {
			return sdMppt14Voltage;
		}

		public void setSdMppt14Voltage(BigDecimal sdMppt14Voltage) {
			this.sdMppt14Voltage = sdMppt14Voltage;
		}

		public BigDecimal getSdMppt14String1Current() {
			return sdMppt14String1Current;
		}

		public void setSdMppt14String1Current(BigDecimal sdMppt14String1Current) {
			this.sdMppt14String1Current = sdMppt14String1Current;
		}

		public BigDecimal getSdMppt14String1PowerInKw() {
			return sdMppt14String1PowerInKw;
		}

		public void setSdMppt14String1PowerInKw(BigDecimal sdMppt14String1PowerInKw) {
			this.sdMppt14String1PowerInKw = sdMppt14String1PowerInKw;
		}

		public BigDecimal getSd_mppt14String1SolarGenInKwh() {
			return sd_mppt14String1SolarGenInKwh;
		}

		public void setSd_mppt14String1SolarGenInKwh(BigDecimal sd_mppt14String1SolarGenInKwh) {
			this.sd_mppt14String1SolarGenInKwh = sd_mppt14String1SolarGenInKwh;
		}

		public BigDecimal getSdMppt14String1Voltage() {
			return sdMppt14String1Voltage;
		}

		public void setSdMppt14String1Voltage(BigDecimal sdMppt14String1Voltage) {
			this.sdMppt14String1Voltage = sdMppt14String1Voltage;
		}

		public BigDecimal getSdMppt15Current() {
			return sdMppt15Current;
		}

		public void setSdMppt15Current(BigDecimal sdMppt15Current) {
			this.sdMppt15Current = sdMppt15Current;
		}

		public BigDecimal getSdMppt15PowerInKw() {
			return sdMppt15PowerInKw;
		}

		public void setSdMppt15PowerInKw(BigDecimal sdMppt15PowerInKw) {
			this.sdMppt15PowerInKw = sdMppt15PowerInKw;
		}

		public BigDecimal getSdMppt15SolarGenInKwh() {
			return sdMppt15SolarGenInKwh;
		}

		public void setSdMppt15SolarGenInKwh(BigDecimal sdMppt15SolarGenInKwh) {
			this.sdMppt15SolarGenInKwh = sdMppt15SolarGenInKwh;
		}

		public BigDecimal getSdMppt15Voltage() {
			return sdMppt15Voltage;
		}

		public void setSdMppt15Voltage(BigDecimal sdMppt15Voltage) {
			this.sdMppt15Voltage = sdMppt15Voltage;
		}

		public BigDecimal getSdMppt15String1Current() {
			return sdMppt15String1Current;
		}

		public void setSdMppt15String1Current(BigDecimal sdMppt15String1Current) {
			this.sdMppt15String1Current = sdMppt15String1Current;
		}

		

		public BigDecimal getSdMppt15String1PowerInKw() {
			return sdMppt15String1PowerInKw;
		}

		public void setSdMppt15String1PowerInKw(BigDecimal sdMppt15String1PowerInKw) {
			this.sdMppt15String1PowerInKw = sdMppt15String1PowerInKw;
		}

		public BigDecimal getSdMppt15String1SolarGenInKwh() {
			return sdMppt15String1SolarGenInKwh;
		}

		public void setSdMppt15String1SolarGenInKwh(BigDecimal sdMppt15String1SolarGenInKwh) {
			this.sdMppt15String1SolarGenInKwh = sdMppt15String1SolarGenInKwh;
		}

		public BigDecimal getSdMppt15String1Voltage() {
			return sdMppt15String1Voltage;
		}

		public void setSdMppt15String1Voltage(BigDecimal sdMppt15String1Voltage) {
			this.sdMppt15String1Voltage = sdMppt15String1Voltage;
		}

		public BigDecimal getSdMppt16Current() {
			return sdMppt16Current;
		}

		public void setSdMppt16Current(BigDecimal sdMppt16Current) {
			this.sdMppt16Current = sdMppt16Current;
		}

		public BigDecimal getSdMppt16PowerInKw() {
			return sdMppt16PowerInKw;
		}

		public void setSdMppt16PowerInKw(BigDecimal sdMppt16PowerInKw) {
			this.sdMppt16PowerInKw = sdMppt16PowerInKw;
		}

		public BigDecimal getSdMppt16SolarGenInKwh() {
			return sdMppt16SolarGenInKwh;
		}

		public void setSdMppt16SolarGenInKwh(BigDecimal sdMppt16SolarGenInKwh) {
			this.sdMppt16SolarGenInKwh = sdMppt16SolarGenInKwh;
		}

		public BigDecimal getSdMppt16Voltage() {
			return sdMppt16Voltage;
		}

		public void setSdMppt16Voltage(BigDecimal sdMppt16Voltage) {
			this.sdMppt16Voltage = sdMppt16Voltage;
		}

		public BigDecimal getSdMppt16String1Current() {
			return sdMppt16String1Current;
		}

		public void setSdMppt16String1Current(BigDecimal sdMppt16String1Current) {
			this.sdMppt16String1Current = sdMppt16String1Current;
		}

		public BigDecimal getSdMppt16String1PowerInKw() {
			return sdMppt16String1PowerInKw;
		}

		public void setSdMppt16String1PowerInKw(BigDecimal sdMppt16String1PowerInKw) {
			this.sdMppt16String1PowerInKw = sdMppt16String1PowerInKw;
		}

		public BigDecimal getSdMppt16String1SolarGenInKwh() {
			return sdMppt16String1SolarGenInKwh;
		}

		public void setSdMppt16String1SolarGenInKwh(BigDecimal sdMppt16String1SolarGenInKwh) {
			this.sdMppt16String1SolarGenInKwh = sdMppt16String1SolarGenInKwh;
		}

		public BigDecimal getSdMppt16String1Voltage() {
			return sdMppt16String1Voltage;
		}

		public void setSdMppt16String1Voltage(BigDecimal sdMppt16String1Voltage) {
			this.sdMppt16String1Voltage = sdMppt16String1Voltage;
		}

		public BigDecimal getSdMppt17Current() {
			return sdMppt17Current;
		}
		
		 public BigDecimal getSdMppt11Voltage() {
				return sdMppt11Voltage;
			}

			public void setSdMppt11Voltage(BigDecimal sdMppt11Voltage) {
				this.sdMppt11Voltage = sdMppt11Voltage;
			}

			public void setIsActive(int isActive) {
				this.isActive = isActive;
			}

			public void setCreatedBy(String createdBy) {
				this.createdBy = createdBy;
			}

			public void setSd_mppt5Voltage(BigDecimal sd_mppt5Voltage) {
				this.sdMppt5Voltage = sd_mppt5Voltage;
			}

			public void setSdMppt10String1PowerInKw(BigDecimal sdMppt10String1PowerInKw) {
				this.sdMppt10String1PowerInKw = sdMppt10String1PowerInKw;
			}

		public void setSdMppt17Current(BigDecimal sdMppt17Current) {
			this.sdMppt17Current = sdMppt17Current;
		}

		public BigDecimal getSdMppt17PowerInKw() {
			return sdMppt17PowerInKw;
		}

		public void setSdMppt17PowerInKw(BigDecimal sdMppt17PowerInKw) {
			this.sdMppt17PowerInKw = sdMppt17PowerInKw;
		}

		public BigDecimal getSdMppt17SolarGenInKwh() {
			return sdMppt17SolarGenInKwh;
		}

		public void setSdMppt17SolarGenInKwh(BigDecimal sdMppt17SolarGenInKwh) {
			this.sdMppt17SolarGenInKwh = sdMppt17SolarGenInKwh;
		}

		public BigDecimal getSdMppt17Voltage() {
			return sdMppt17Voltage;
		}

		public void setSdMppt17Voltage(BigDecimal sdMppt17Voltage) {
			this.sdMppt17Voltage = sdMppt17Voltage;
		}

		public BigDecimal getSdMppt17String1Current() {
			return sdMppt17String1Current;
		}

		public void setSdMppt17String1Current(BigDecimal sdMppt17String1Current) {
			this.sdMppt17String1Current = sdMppt17String1Current;
		}

		public BigDecimal sdMppt17String1PowerInKw() {
			return sdMppt17String1PowerInKw;
		}

		public void sdMppt17String1PowerInKw(BigDecimal sdMppt17String1PowerInKw) {
			this.sdMppt17String1PowerInKw = sdMppt17String1PowerInKw;
		}

		public BigDecimal getSdMppt17String1SolarGenInKwh() {
			return sdMppt17String1SolarGenInKwh;
		}

		public void setSdMppt17String1SolarGenInKwh(BigDecimal sdMppt17String1SolarGenInKwh) {
			this.sdMppt17String1SolarGenInKwh = sdMppt17String1SolarGenInKwh;
		}

		public BigDecimal getSdMppt17String1Voltage() {
			return sdMppt17String1Voltage;
		}

		public void setSdMppt17String1Voltage(BigDecimal sdMppt17String1Voltage) {
			this.sdMppt17String1Voltage = sdMppt17String1Voltage;
		}

		public BigDecimal getSdMppt18Current() {
			return sdMppt18Current;
		}

		public void setSdMppt18Current(BigDecimal sdMppt18Current) {
			this.sdMppt18Current = sdMppt18Current;
		}

		public BigDecimal getSdMppt18PowerInKw() {
			return sdMppt18PowerInKw;
		}

		public void setSdMppt18PowerInKw(BigDecimal sdMppt18PowerInKw) {
			this.sdMppt18PowerInKw = sdMppt18PowerInKw;
		}

		public BigDecimal getSdMppt18SolarGenInKwh() {
			return sdMppt18SolarGenInKwh;
		}

		public void setSdMppt18SolarGenInKwh(BigDecimal sdMppt18SolarGenInKwh) {
			this.sdMppt18SolarGenInKwh = sdMppt18SolarGenInKwh;
		}

		public BigDecimal getSdMppt18Voltage() {
			return sdMppt18Voltage;
		}

		public void setSdMppt18Voltage(BigDecimal sdMppt18Voltage) {
			this.sdMppt18Voltage = sdMppt18Voltage;
		}

		public BigDecimal getSdMppt18String1Current() {
			return sdMppt18String1Current;
		}

		public void setSdMppt18String1Current(BigDecimal sdMppt18String1Current) {
			this.sdMppt18String1Current = sdMppt18String1Current;
		}

		public BigDecimal getSdMppt18String1PowerInKw() {
			return sdMppt18String1PowerInKw;
		}

		public void setSdMppt18String1PowerInKw(BigDecimal sdMppt18String1PowerInKw) {
			this.sdMppt18String1PowerInKw = sdMppt18String1PowerInKw;
		}

		public BigDecimal getSdMppt18String1SolarGenInKwh() {
			return sdMppt18String1SolarGenInKwh;
		}

		public void setSdMppt18String1SolarGenInKwh(BigDecimal sdMppt18String1SolarGenInKwh) {
			this.sdMppt18String1SolarGenInKwh = sdMppt18String1SolarGenInKwh;
		}

		public BigDecimal getSdMppt18String1Voltage() {
			return sdMppt18String1Voltage;
		}

		public void setSdMppt18String1Voltage(BigDecimal sdMppt18String1Voltage) {
			this.sdMppt18String1Voltage = sdMppt18String1Voltage;
		}

		public BigDecimal getTotalSolarGenKwCurrentHour() {
			return totalSolarGenKwCurrentHour;
		}

		public void setTotalSolarGenKwCurrentHour(BigDecimal totalSolarGenKwCurrentHour) {
			this.totalSolarGenKwCurrentHour = totalSolarGenKwCurrentHour;
		}

		public BigDecimal getTotalSolarGenKwCurrentToday() {
			return totalSolarGenKwCurrentToday;
		}

		public void setTotalSolarGenKwCurrentToday(BigDecimal totalSolarGenKwCurrentToday) {
			this.totalSolarGenKwCurrentToday = totalSolarGenKwCurrentToday;
		}

		public BigDecimal getTotalSolarGenKwhCurrentToday() {
			return totalSolarGenKwhCurrentToday;
		}

		public void setTotalSolarGenKwhCurrentToday(BigDecimal totalSolarGenKwhCurrentToday) {
			this.totalSolarGenKwhCurrentToday = totalSolarGenKwhCurrentToday;
		}

		public BigDecimal getTotalSolarGenKwCurrentMonth() {
			return totalSolarGenKwCurrentMonth;
		}

		public void setTotalSolarGenKwCurrentMonth(BigDecimal totalSolarGenKwCurrentMonth) {
			this.totalSolarGenKwCurrentMonth = totalSolarGenKwCurrentMonth;
		}

		public BigDecimal getTotal_solar_gen_kwh_current_month() {
			return total_solar_gen_kwh_current_month;
		}

		public void setTotal_solar_gen_kwh_current_month(BigDecimal total_solar_gen_kwh_current_month) {
			this.total_solar_gen_kwh_current_month = total_solar_gen_kwh_current_month;
		}

		public BigDecimal getTotalSolarGenKwCurrentYear() {
			return totalSolarGenKwCurrentYear;
		}

		public void setTotalSolarGenKwCurrentYear(BigDecimal totalSolarGenKwCurrentYear) {
			this.totalSolarGenKwCurrentYear = totalSolarGenKwCurrentYear;
		}

		public BigDecimal getTotalSolarGenKwhCurrentYear() {
			return totalSolarGenKwhCurrentYear;
		}

		public void setTotalSolarGenKwhCurrentYear(BigDecimal totalSolarGenKwhCurrentYear) {
			this.totalSolarGenKwhCurrentYear = totalSolarGenKwhCurrentYear;
		}

		public BigDecimal getTotalSolarGenKwLifetime() {
			return totalSolarGenKwLifetime;
		}

		public void setTotalSolarGenKwLifetime(BigDecimal totalSolarGenKwLifetime) {
			this.totalSolarGenKwLifetime = totalSolarGenKwLifetime;
		}

		public BigDecimal getTotalSolarGenKwhLifetime() {
			return totalSolarGenKwhLifetime;
		}

		public void setTotalSolarGenKwhLifetime(BigDecimal totalSolarGenKwhLifetime) {
			this.totalSolarGenKwhLifetime = totalSolarGenKwhLifetime;
		}

		public BigDecimal getSolarGenFactor() {
			return solarGenFactor;
		}

		public void setSolarGenFactor(BigDecimal solarGenFactor) {
			this.solarGenFactor = solarGenFactor;
		}

		public BigDecimal getAvgMpptPowerKw() {
			return avgMpptPowerKw;
		}

		public void setAvgMpptPowerKw(BigDecimal avgMpptPowerKw) {
			this.avgMpptPowerKw = avgMpptPowerKw;
		}

		public BigDecimal getEnergyToBattKwhCurrentHour() {
			return energyToBattKwhCurrentHour;
		}

		public void setEnergyToBattKwhCurrentHour(BigDecimal energyToBattKwhCurrentHour) {
			this.energyToBattKwhCurrentHour = energyToBattKwhCurrentHour;
		}

		public BigDecimal getEnergyToBattKwhCurrentDay() {
			return energyToBattKwhCurrentDay;
		}

		public void setEnergyToBattKwhCurrentDay(BigDecimal energyToBattKwhCurrentDay) {
			this.energyToBattKwhCurrentDay = energyToBattKwhCurrentDay;
		}

		public BigDecimal getEnergyToBattKwhCurrentMonth() {
			return energyToBattKwhCurrentMonth;
		}

		public void setEnergyToBattKwhCurrentMonth(BigDecimal energyToBattKwhCurrentMonth) {
			this.energyToBattKwhCurrentMonth = energyToBattKwhCurrentMonth;
		}

		public BigDecimal getEnergyToBattKwhCurrentYear() {
			return energyToBattKwhCurrentYear;
		}

		public void setEnergyToBattKwhCurrentYear(BigDecimal energyToBattKwhCurrentYear) {
			this.energyToBattKwhCurrentYear = energyToBattKwhCurrentYear;
		}

		public BigDecimal getEnergyToBattKwhLifetime() {
			return energyToBattKwhLifetime;
		}

		public void setEnergyToBattKwhLifetime(BigDecimal energyToBattKwhLifetime) {
			this.energyToBattKwhLifetime = energyToBattKwhLifetime;
		}

		public int getIsActive() {
			return isActive;
		}

		public void setIs_active(int is_active) {
			this.isActive = isActive;
		}

		public Date getCreatedOn() {
			return createdOn;
		}

		public void setCreatedOn(Date createdOn) {
			this.createdOn = createdOn;
		}

		public String getCreatedBy() {
			return createdBy;
		}

		public void setCreated_by(String createdBy) {
			this.createdBy = createdBy;
		}

		public BigDecimal getTotalSolarGenKwhCurrentHour() {
			return totalSolarGenKwhCurrentHour;
		}

		public void setTotalSolarGenKwhCurrentHour(BigDecimal totalSolarGenKwhCurrentHour) {
			this.totalSolarGenKwhCurrentHour = totalSolarGenKwhCurrentHour;
		}

		@Override
		public String toString() {
			return "TemplateSolarData [id=" + id + ", omcId=" + omcId + ", plantId=" + plantId + ", eventTimeStamp="
					+ eventTimeStamp + ", isActive=" + isActive + ", createdOn=" + createdOn + ", createdBy="
					+ createdBy + ", sd_no_mppt=" + sd_no_mppt + ", sdMppt1Current=" + sdMppt1Current
					+ ", sdMppt1PowerInKw=" + sdMppt1PowerInKw + ", sdMppt1SolarGenInKwh=" + sdMppt1SolarGenInKwh
					+ ", sdMppt1Voltage=" + sdMppt1Voltage + ", sdMppt1String1Current=" + sdMppt1String1Current
					+ ", sdMppt1String1PowerInKw=" + sdMppt1String1PowerInKw + ", sdMppt1String1SolarGenInKwh="
					+ sdMppt1String1SolarGenInKwh + ", sdMppt1String1Voltage=" + sdMppt1String1Voltage
					+ ", sdMppt2Current=" + sdMppt2Current + ", sdMppt2PowerInKw=" + sdMppt2PowerInKw
					+ ", sdMppt2SolarGenInKwh=" + sdMppt2SolarGenInKwh + ", sdMppt2Voltage=" + sdMppt2Voltage
					+ ", sdMppt2String1Current=" + sdMppt2String1Current + ", sdMppt2String1PowerInKw="
					+ sdMppt2String1PowerInKw + ", sdMppt2String1SolarGenInKwh=" + sdMppt2String1SolarGenInKwh
					+ ", sdMppt2String1Voltage=" + sdMppt2String1Voltage + ", sdMppt3Current=" + sdMppt3Current
					+ ", sdMppt3PowerInKw=" + sdMppt3PowerInKw + ", sdMppt3SolarGenInKwh=" + sdMppt3SolarGenInKwh
					+ ", sdMppt3Voltage=" + sdMppt3Voltage + ", sdMppt3String1Current=" + sdMppt3String1Current
					+ ", sdMppt3String1PowerInKw=" + sdMppt3String1PowerInKw + ", sdMppt3String1SolarGenInKwh="
					+ sdMppt3String1SolarGenInKwh + ", sdMppt3String1Voltage=" + sdMppt3String1Voltage
					+ ", sdMppt4Current=" + sdMppt4Current + ", sdMppt4PowerInKw=" + sdMppt4PowerInKw
					+ ", sdMppt4SolarGenInKwh=" + sdMppt4SolarGenInKwh + ", sdMppt4Voltage=" + sdMppt4Voltage
					+ ", sdMppt4String1Current=" + sdMppt4String1Current + ", sdMppt4String1PowerInKw="
					+ sdMppt4String1PowerInKw + ", sdMppt4String1SolarGenInKwh=" + sdMppt4String1SolarGenInKwh
					+ ", sdMppt4String1Voltage=" + sdMppt4String1Voltage + ", sdMppt5Current=" + sdMppt5Current
					+ ", sdMppt5PowerInKw=" + sdMppt5PowerInKw + ", sdMppt5SolarGenInKwh=" + sdMppt5SolarGenInKwh
					+ ", sd_mppt5Voltage=" + sdMppt5Voltage + ", sdMppt5String1Current=" + sdMppt5String1Current
					+ ", sdMppt5String1PowerInKw=" + sdMppt5String1PowerInKw + ", sdMppt5String1SolarGenInKwh="
					+ sdMppt5String1SolarGenInKwh + ", sdMppt5String1Voltage=" + sdMppt5String1Voltage
					+ ", sdMppt6Current=" + sdMppt6Current + ", sdMppt6PowerInKw=" + sdMppt6PowerInKw
					+ ", sdMppt6SolarGenInKwh=" + sdMppt6SolarGenInKwh + ", sdMppt6Voltage=" + sdMppt6Voltage
					+ ", sdMppt6String1Current=" + sdMppt6String1Current + ", sdMppt6String1PowerInKw="
					+ sdMppt6String1PowerInKw + ", sdMppt6String1SolarGenInKwh=" + sdMppt6String1SolarGenInKwh
					+ ", sdMppt6String1Voltage=" + sdMppt6String1Voltage + ", sdMppt7Current=" + sdMppt7Current
					+ ", sdMppt7PowerInKw=" + sdMppt7PowerInKw + ", sdMppt7SolarGenInKwh=" + sdMppt7SolarGenInKwh
					+ ", sdMppt7Voltage=" + sdMppt7Voltage + ", sdMppt7String1Current=" + sdMppt7String1Current
					+ ", sdMppt7String1PowerInKw=" + sdMppt7String1PowerInKw + ", sdMppt7String1SolarGenInKwh="
					+ sdMppt7String1SolarGenInKwh + ", sdMppt7String1Voltage=" + sdMppt7String1Voltage
					+ ", sdMppt8Current=" + sdMppt8Current + ", sdMppt8PowerInKw=" + sdMppt8PowerInKw
					+ ", sdMppt8SolarGenInKwh=" + sdMppt8SolarGenInKwh + ", sdMppt8Voltage=" + sdMppt8Voltage
					+ ", sdMppt8String1Current=" + sdMppt8String1Current + ", sdMppt8String1PowerInKw="
					+ sdMppt8String1PowerInKw + ", sdMppt8String1SolarGenInKwh=" + sdMppt8String1SolarGenInKwh
					+ ", sdMppt8String1Voltage=" + sdMppt8String1Voltage + ", sdMppt9Current=" + sdMppt9Current
					+ ", sdMppt9PowerInKw=" + sdMppt9PowerInKw + ", sdMppt9SolarGenInKwh=" + sdMppt9SolarGenInKwh
					+ ", sdMppt9Voltage=" + sdMppt9Voltage + ", sdMppt9String1Current=" + sdMppt9String1Current
					+ ", sdMppt9String1PowerInKw=" + sdMppt9String1PowerInKw + ", sdMppt9String1SolarGenInKwh="
					+ sdMppt9String1SolarGenInKwh + ", sdMppt9String1Voltage=" + sdMppt9String1Voltage
					+ ", sdMppt10Current=" + sdMppt10Current + ", sdMppt10PowerInKw=" + sdMppt10PowerInKw
					+ ", sdMppt10SolarGenInKwh=" + sdMppt10SolarGenInKwh + ", sdMppt10Voltage=" + sdMppt10Voltage
					+ ", sdMppt10String1Current=" + sdMppt10String1Current + ", sdMppt10String1PowerInKw="
					+ sdMppt10String1PowerInKw + ", sdMppt10String1SolarGenInKwh=" + sdMppt10String1SolarGenInKwh
					+ ", sdMppt10String1Voltage=" + sdMppt10String1Voltage + ", sdMppt11Current=" + sdMppt11Current
					+ ", sdMppt11PowerInKw=" + sdMppt11PowerInKw + ", sdMppt11Voltage=" + sdMppt11Voltage
					+ ", sdMppt11SolarGenInKwh=" + sdMppt11SolarGenInKwh + ", sdMppt11String1Current="
					+ sdMppt11String1Current + ", sdMppt11String1PowerInKw=" + sdMppt11String1PowerInKw
					+ ", sdMppt11String1SolarGenInKwh=" + sdMppt11String1SolarGenInKwh + ", sdMppt11String1Voltage="
					+ sdMppt11String1Voltage + ", sdMppt12Current=" + sdMppt12Current + ", sdMppt12PowerInKw="
					+ sdMppt12PowerInKw + ", sdMppt12SolarGenInKwh=" + sdMppt12SolarGenInKwh + ", sdMppt12Voltage="
					+ sdMppt12Voltage + ", sdMppt12String1Current=" + sdMppt12String1Current
					+ ", sdMppt12String1PowerInKw=" + sdMppt12String1PowerInKw + ", sdMppt12String1SolarGenInKwh="
					+ sdMppt12String1SolarGenInKwh + ", sdMppt12String1Voltage=" + sdMppt12String1Voltage
					+ ", sdMppt13Current=" + sdMppt13Current + ", sdMppt13PowerInKw=" + sdMppt13PowerInKw
					+ ", sdMppt13SolarGenInKwh=" + sdMppt13SolarGenInKwh + ", sdMppt13Voltage=" + sdMppt13Voltage
					+ ", sdMppt13String1Current=" + sdMppt13String1Current + ", sdMppt13String1PowerInKw="
					+ sdMppt13String1PowerInKw + ", sdMppt13String1SolarGenInKwh=" + sdMppt13String1SolarGenInKwh
					+ ", sdMppt13String1Voltage=" + sdMppt13String1Voltage + ", sd_mppt14Current=" + sd_mppt14Current
					+ ", sdMppt14PowerInKw=" + sdMppt14PowerInKw + ", sdMppt14SolarGenInKwh=" + sdMppt14SolarGenInKwh
					+ ", sdMppt14Voltage=" + sdMppt14Voltage + ", sdMppt14String1Current=" + sdMppt14String1Current
					+ ", sdMppt14String1PowerInKw=" + sdMppt14String1PowerInKw + ", sd_mppt14String1SolarGenInKwh="
					+ sd_mppt14String1SolarGenInKwh + ", sdMppt14String1Voltage=" + sdMppt14String1Voltage
					+ ", sdMppt15Current=" + sdMppt15Current + ", sdMppt15PowerInKw=" + sdMppt15PowerInKw
					+ ", sdMppt15SolarGenInKwh=" + sdMppt15SolarGenInKwh + ", sdMppt15Voltage=" + sdMppt15Voltage
					+ ", sdMppt15String1Current=" + sdMppt15String1Current + ", sdMppt15String1PowerInKw="
					+ sdMppt15String1PowerInKw + ", sdMppt15String1SolarGenInKwh=" + sdMppt15String1SolarGenInKwh
					+ ", sdMppt15String1Voltage=" + sdMppt15String1Voltage + ", sdMppt16Current=" + sdMppt16Current
					+ ", sdMppt16PowerInKw=" + sdMppt16PowerInKw + ", sdMppt16SolarGenInKwh=" + sdMppt16SolarGenInKwh
					+ ", sdMppt16Voltage=" + sdMppt16Voltage + ", sdMppt16String1Current=" + sdMppt16String1Current
					+ ", sdMppt16String1PowerInKw=" + sdMppt16String1PowerInKw + ", sdMppt16String1SolarGenInKwh="
					+ sdMppt16String1SolarGenInKwh + ", sdMppt16String1Voltage=" + sdMppt16String1Voltage
					+ ", sdMppt17Current=" + sdMppt17Current + ", sdMppt17PowerInKw=" + sdMppt17PowerInKw
					+ ", sdMppt17SolarGenInKwh=" + sdMppt17SolarGenInKwh + ", sdMppt17Voltage=" + sdMppt17Voltage
					+ ", sdMppt17String1Current=" + sdMppt17String1Current + ", sd_mppt17_string1_power_in_kw="
					+ sdMppt17String1PowerInKw + ", sdMppt17String1SolarGenInKwh=" + sdMppt17String1SolarGenInKwh
					+ ", sdMppt17String1Voltage=" + sdMppt17String1Voltage + ", sdMppt18Current=" + sdMppt18Current
					+ ", sdMppt18PowerInKw=" + sdMppt18PowerInKw + ", sdMppt18SolarGenInKwh=" + sdMppt18SolarGenInKwh
					+ ", sdMppt18Voltage=" + sdMppt18Voltage + ", sdMppt18String1Current=" + sdMppt18String1Current
					+ ", sdMppt18String1PowerInKw=" + sdMppt18String1PowerInKw + ", sdMppt18String1SolarGenInKwh="
					+ sdMppt18String1SolarGenInKwh + ", sdMppt18String1Voltage=" + sdMppt18String1Voltage
					+ ", totalSolarGenKwCurrentHour=" + totalSolarGenKwCurrentHour + ", totalSolarGenKwhCurrentHour="
					+ totalSolarGenKwhCurrentHour + ", totalSolarGenKwCurrentToday=" + totalSolarGenKwCurrentToday
					+ ", totalSolarGenKwhCurrentToday=" + totalSolarGenKwhCurrentToday
					+ ", totalSolarGenKwCurrentMonth=" + totalSolarGenKwCurrentMonth
					+ ", total_solar_gen_kwh_current_month=" + total_solar_gen_kwh_current_month
					+ ", totalSolarGenKwCurrentYear=" + totalSolarGenKwCurrentYear + ", totalSolarGenKwhCurrentYear="
					+ totalSolarGenKwhCurrentYear + ", totalSolarGenKwLifetime=" + totalSolarGenKwLifetime
					+ ", totalSolarGenKwhLifetime=" + totalSolarGenKwhLifetime + ", solarGenFactor=" + solarGenFactor
					+ ", avgMpptPowerKw=" + avgMpptPowerKw + ", energyToBattKwhCurrentHour="
					+ energyToBattKwhCurrentHour + ", energyToBattKwhCurrentDay=" + energyToBattKwhCurrentDay
					+ ", energyToBattKwhCurrentMonth=" + energyToBattKwhCurrentMonth + ", energyToBattKwhCurrentYear="
					+ energyToBattKwhCurrentYear + ", energyToBattKwhLifetime=" + energyToBattKwhLifetime + "]";
		}

		
  }
