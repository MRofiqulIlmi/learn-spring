package com.in28minutes.getstart.getstart.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.getstart.getstart.demo.cdi.SomeCdiBusiness;

@Configuration
@ComponentScan
public class CdiApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(CdiApplication.class);

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				CdiApplication.class);
		SomeCdiBusiness business = applicationContext.getBean(SomeCdiBusiness.class);

		LOGGER.info("{} dao-{}", business, business.getSomeCDIDAO());
		System.out.println("test");

	}

}
