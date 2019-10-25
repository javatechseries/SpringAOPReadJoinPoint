package com.explore.spring.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.explore.spring.aop.Account;

@Aspect
@Component
@Order(2)
public class LoginAspect {
	
		
	@Before("com.explore.spring.aop.aspects.AOPExpressions.forDAOPackageNoGetterAndSetter()")
	public void performLogging(JoinPoint joinPoint) {
	
		System.out.println(" ===> Performing Logging");
		
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		
		System.out.println("Method: "+signature );
		
		Object[] args = joinPoint.getArgs();
		
		for(Object tempArg:args) {
			
			System.out.println("Argument is: "+tempArg);
			
			if(tempArg instanceof Account) {
				Account theAccount = (Account) tempArg;
				
				System.out.println("Account name is: "+theAccount.getName());
				System.out.println("Account level is: "+theAccount.getLevel());
				
				
			}
		}
		
	}

}
