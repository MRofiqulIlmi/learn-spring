package com.in28minutes.getstart.getstart.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ComponentDAO {
	@Autowired
	ComponentScanJdbcConnection jdbcConnection;

	public ComponentScanJdbcConnection getComponentJdbcConnection() {
		return jdbcConnection;
	}

	public void setComponentJdbcConnection(ComponentScanJdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}

}
