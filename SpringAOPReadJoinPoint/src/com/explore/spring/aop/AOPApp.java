package com.explore.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.explore.spring.aop.dao.AccountDAO;
import com.explore.spring.aop.dao.MembershipDAO;

public class AOPApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctxt= new AnnotationConfigApplicationContext(AppConfig.class);
		
		AccountDAO accountDAO = ctxt.getBean( "accountDAO",AccountDAO.class);
		
		Account account = new Account();
		account.setName("Naga");
		account.setLevel("Silver");
		accountDAO.addAccount(account,true);
		accountDAO.removeAccount(account);
		accountDAO.setName("Naga");
		accountDAO.setServiceCode("Silver");
		
		String name=accountDAO.getName();
		String serviceCode=accountDAO.getServiceCode();
		
		MembershipDAO membershipDAO = ctxt.getBean( "membershipDAO",MembershipDAO.class);
		membershipDAO.addAccount();
		membershipDAO.removeAccount();
		
		ctxt.close();


	}

}
