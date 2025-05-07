package com.in28minutes.getstart.getstart.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28minutes.getstart.getstart.demo.xml.XmlPersonDAO;

public class XmlContextApplication {
	private static Logger logger = LoggerFactory.getLogger(XmlContextApplication.class);

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml")) {
			XmlPersonDAO personDao = applicationContext.getBean(XmlPersonDAO.class);
			System.out.println(personDao.getXmlJdbcConnection());

			logger.info("Beans Loaded -> {}", (Object) applicationContext.getBeanDefinitionNames());
		}
	}
}
