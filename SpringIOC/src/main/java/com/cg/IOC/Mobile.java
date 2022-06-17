package com.cg.IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	private static ApplicationContext c;
	
	public static void main(String[] args) {
		
		// how to create object manually
		//Airtel a=new Airtel();
		//a.calling();
		//a.data();
		
		//now we are using IOC Concept
	
			ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
			/*Sim a=c.getBean(Sim.class);
			a.calling();
			a.data();*/
			Sim j=c.getBean(Sim.class);
			
			j.calling();
			j.data();
			System.out.println("The program is executed....!");
			

		}

	}

	
