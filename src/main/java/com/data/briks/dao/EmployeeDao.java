package com.data.briks.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {
	@Autowired
	@Qualifier("databricksJdbcTemplate")
	JdbcTemplate jdbcTemplate;

	String query = "SELECT * FROM FOO WHERE ID=1";
}
