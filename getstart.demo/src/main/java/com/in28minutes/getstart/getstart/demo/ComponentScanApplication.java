package com.in28minutes.getstart.getstart.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.getstart.getstart.componentscan.ComponentDAO;

// Component scan is for search where the component exist, by default if we not declared is same with this app
// but when the component in another place and cannot to find it
// then use ComponentScan and place the package where the component exist

@Configuration
@ComponentScan("com.in28minutes.getstart.getstart.componentscan")
public class ComponentScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(ComponentScanApplication.class);

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				ComponentScanApplication.class);
		ComponentDAO componentDao = applicationContext.getBean(ComponentDAO.class);

		LOGGER.info("{}", componentDao);
		System.out.println("test2");

	}

}
