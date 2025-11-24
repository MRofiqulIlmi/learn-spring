package com.in28minutes.spring.aop.spring_aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserAccessAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// What kind of method calls I would intercept
	// execution (* PACKAGE.*.*(..))

	@Before("com.in28minutes.spring.aop.spring_aop.aspect.CommonJoinPointConfig.businessLayerExecution()")
	public void Before(JoinPoint joinPoint) {
		// the example for check the user access
		logger.info("Check for user access");
		logger.info("Allowed execution for - {}", joinPoint);
	}

	@Before("com.in28minutes.spring.aop.spring_aop.aspect.CommonJoinPointConfig.dataLayerExecution()")
	public void BeforeDataAccess(JoinPoint joinPoint) {
		// the example for check the user access
		logger.info("Check for user data access");
		logger.info("Allowed execution for this data layer - {}", joinPoint);
	}

}
