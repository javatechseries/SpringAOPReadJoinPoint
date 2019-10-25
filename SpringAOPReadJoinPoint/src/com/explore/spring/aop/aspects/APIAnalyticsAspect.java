package com.explore.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class APIAnalyticsAspect {
	
	
	@Before("com.explore.spring.aop.aspects.AOPExpressions.forDAOPackageNoGetterAndSetter()")
	public void performAPIAnalytics() {
		System.out.println(" ===> Performing API Analytics");
	}

}
