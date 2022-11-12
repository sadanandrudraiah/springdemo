package com.cruds.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cruds.service.VehicleProviderService;

public class TestVPService {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		VehicleProviderService vps = (VehicleProviderService) context.getBean("vps");
		
		vps.getVehicle();
	}

}
