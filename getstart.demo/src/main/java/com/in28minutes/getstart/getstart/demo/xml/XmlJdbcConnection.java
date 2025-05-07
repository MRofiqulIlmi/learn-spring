package com.in28minutes.getstart.getstart.demo.xml;

import org.springframework.context.annotation.Configuration;

@Configuration
public class XmlJdbcConnection {
	public XmlJdbcConnection() {
		System.out.println("JDBC Connection : using XML Context");
	}
}
