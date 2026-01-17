package com.in28minutes.spring.aop.spring_aop.business;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in28minutes.spring.aop.spring_aop.aspect.TrackTime;
import com.in28minutes.spring.aop.spring_aop.data.Dao1;

@Service
public class Business1 {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private Dao1 dao1;

	@TrackTime
	public String calculateSomething() {
		return dao1.retrieveSomething();
	}

	public void saySomeThing() {
		logger.info("say something");
	}
}
