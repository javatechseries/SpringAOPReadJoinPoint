package com.explore.spring.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	
	public boolean addAccount() {
		
		System.out.println(getClass() + " : Adding account \n");
		return true;
	}
	
	public boolean removeAccount() {
		
		System.out.println(getClass() + " : Removing account \n");
		return true;
	}

}
