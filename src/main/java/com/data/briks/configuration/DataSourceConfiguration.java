package com.data.briks.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;

@Configuration
public class DataSourceConfiguration {

	// JdbcTemplate bean creation for Azure Databricks SQL
	@Bean
	public JdbcTemplate databricksJdbcTemplate(@Qualifier("databricksDataSource") DataSource databricksDataSource) {
		return new JdbcTemplate(databricksDataSource);
	}

	// Bean creation for Azure Databricks SQL datasource
	@Bean(name = "databricksDataSource")
	public DataSource databricksDataSource() {
		return databricksDataSourceProperties().initializeDataSourceBuilder().build();
	}

	@Bean
	@ConfigurationProperties("spring.datasource.databricks")
	public static DataSourceProperties databricksDataSourceProperties() {
		return new DataSourceProperties();
	}

	// Bean creation for primary datasource
	@Bean(name = "mssqlDataSource")
	@Primary
	public DataSource mssqlDataSource() {
		return mssqlDataSourceProperties().initializeDataSourceBuilder().build();
	}

	@Bean
	@ConfigurationProperties("spring.datasource.mssql")
	public DataSourceProperties mssqlDataSourceProperties() {
		return new DataSourceProperties();
	}

}