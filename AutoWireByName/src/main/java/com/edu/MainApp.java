package com.edu;




import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.edu.Human;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("spring.xml");
		Human obj= (Human) ctx.getBean("humanobj");
		obj.humanFunction();
		

	}


}
