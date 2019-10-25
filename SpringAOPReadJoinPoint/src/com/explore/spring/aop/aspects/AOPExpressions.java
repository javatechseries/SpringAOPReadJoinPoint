package com.explore.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AOPExpressions {
	
	@Pointcut("execution(* com.explore.spring.aop.dao.*.*(..))")
	public void forDaoPackage() {
		
	}
	
	@Pointcut("execution(* com.explore.spring.aop.dao.*.get*(..))")
	public void getterMethods() {
		
	}
	
	@Pointcut("execution(* com.explore.spring.aop.dao.*.set*(..))")
	public void setterMethods() {
		
	}
	
	@Pointcut("(forDaoPackage() && !(getterMethods() || setterMethods() ))")
	public void forDAOPackageNoGetterAndSetter() {
		
	}

}
