package com.in28minutes.getstart.getstart.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28minutes.getstart.getstart.demo.xml.XmlPersonDAO;

@Configuration
@ComponentScan("com.in28minutes.getstart.getstart.demo.basic")
public class XmlContextApplication {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml")) {
			XmlPersonDAO personDao = applicationContext.getBean(XmlPersonDAO.class);
			System.out.println(personDao.getXmlJdbcConnection());
		}
	}
}
