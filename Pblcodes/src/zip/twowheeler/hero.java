package com.automobile.twowheeler;

import com.automobile.vehicle;

public class hero extends vehicle {

	@Override
	public String getmodelname() {
		// TODO Auto-generated method stub
		return "hero";
	}

	@Override
	public String getregistraionNo() {
		// TODO Auto-generated method stub
		return "TN45AQ8871";
	}

	@Override
	public String getownernane() {
		// TODO Auto-generated method stub
		return "vetri";
	}

	public int getspeed() {
		    return 80;
	}
	public void audio() {
		System.out.println("song is playing");
	}
	

}
