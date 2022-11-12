package com.cruds.service;

import com.cruds.bean.IVehicleProvider;

public class VehicleProviderService {

	IVehicleProvider vp;
	
	public void setVp(IVehicleProvider vp) {
		this.vp = vp;
	}

	public void getVehicle()
	{
		System.out.println(vp.getVehicle());
	}
	
}
