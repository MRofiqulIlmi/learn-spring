package com.in28minutes.spring.aop.spring_aop.data;

import org.springframework.stereotype.Service;

import com.in28minutes.spring.aop.spring_aop.aspect.TrackTime;

@Service
public class Dao1 {

	@TrackTime
	public String retrieveSomething() {
		return "Dao1";
	}

}
