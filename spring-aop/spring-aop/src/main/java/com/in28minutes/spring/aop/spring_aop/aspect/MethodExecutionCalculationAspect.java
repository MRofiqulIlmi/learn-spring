package com.in28minutes.spring.aop.spring_aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class MethodExecutionCalculationAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Around(value = "com.in28minutes.spring.aop.spring_aop.aspect.CommonJoinPointConfig.trackTimeAnnotation()")
	public void around(ProceedingJoinPoint joinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		joinPoint.proceed();
		long proceedTime = System.currentTimeMillis() - startTime;

		logger.info("The time taken by {} is : {}", joinPoint, proceedTime);
	}

}
