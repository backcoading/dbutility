package com.omc.dbUtility.rms.configuration;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.omc.dbUtility.rms",entityManagerFactoryRef = "rmsEntityManagerFactory", transactionManagerRef = "rmsTransactionManager")
public class RmsDBConfiguration {

	// DataSource

	@Bean(name = "rmsDatasource")
	@ConfigurationProperties(prefix = "spring.rms-datasource")
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}

	// EntityManagerFactory

	@Bean(name = "rmsEntityManagerFactory")
	public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(EntityManagerFactoryBuilder builder,
			@Qualifier("rmsDatasource") DataSource dataSource) {
//		Map<String, Object> properties = new HashMap<>();
//		properties.put("hibernate.hbm2ddl.auto", "update");
//		properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		return builder.dataSource(dataSource).packages("com.omc.dbUtility.rms").persistenceUnit("Solar").build();
	}

	@Primary
	@Bean(name = "rmsTransactionManager")
	public PlatformTransactionManager transactionManager(
			@Qualifier("rmsEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
		return new JpaTransactionManager(entityManagerFactory);
	}

}
