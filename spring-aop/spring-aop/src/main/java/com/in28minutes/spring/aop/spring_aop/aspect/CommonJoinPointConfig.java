package com.in28minutes.spring.aop.spring_aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

	@Pointcut("execution(* com.in28minutes.spring.aop.spring_aop.data.*.*(..))")
	public void dataLayerExecution() {
	}

	@Pointcut("execution(* com.in28minutes.spring.aop.spring_aop.business.*.*(..))")
	public void businessLayerExecution() {
	}

	@Pointcut("com.in28minutes.spring.aop.spring_aop.aspect.CommonJoinPointConfig.dataLayerExecution() || com.in28minutes.spring.aop.spring_aop.aspect.CommonJoinPointConfig.businessLayerExecution()")
	public void allLayerExecution() {
	}

	@Pointcut("bean(*dao*)")
	public void beanContainingWithDaoExecution() {
	}

	@Pointcut("within(com.in28minutes.spring.aop.spring_aop.data..*)")
	public void withinDataLayerExecution() {
	}

	@Pointcut("@annotation(com.in28minutes.spring.aop.spring_aop.aspect.TrackTime)")
	public void trackTimeAnnotation() {
	}

}
