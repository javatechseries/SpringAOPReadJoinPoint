package com.explore.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class LogToCloudAspect {
	

	@Before("com.explore.spring.aop.aspects.AOPExpressions.forDAOPackageNoGetterAndSetter()")
	public void logToCloudAsync() {
		System.out.println(" ===> Logging to Cloud in async fashion");
	}

}
