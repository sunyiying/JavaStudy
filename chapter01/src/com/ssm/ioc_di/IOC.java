package com.ssm.ioc_di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		UserDao userDao=new UserDaoImpl();
//		userDao.login();
//		
		ApplicationContext application=new ClassPathXmlApplicationContext("applicationContext.xml");		
		UserDao userdao1=(UserDao)application.getBean("userDao");		
		userdao1.login();
		
	}

}
