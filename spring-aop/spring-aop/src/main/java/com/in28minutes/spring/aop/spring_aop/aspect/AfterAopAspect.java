package com.in28minutes.spring.aop.spring_aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAopAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@AfterReturning(value = "com.in28minutes.spring.aop.spring_aop.aspect.CommonJoinPointConfig.businessLayerExecution()", returning = "result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		logger.info("{} returning with value : {}", joinPoint, result);
	}

	@AfterThrowing(value = "com.in28minutes.spring.aop.spring_aop.aspect.CommonJoinPointConfig.businessLayerExecution()", throwing = "exception")
	public void afterThrowing(JoinPoint joinPoint, Object exception) {
		logger.info("{} throwing with exception : {}", joinPoint, exception);
	}

	@After(value = "com.in28minutes.spring.aop.spring_aop.aspect.CommonJoinPointConfig.businessLayerExecution()")
	public void afterThrowing(JoinPoint joinPoint) {
		logger.info("After the execution of {}", joinPoint);
	}

}
