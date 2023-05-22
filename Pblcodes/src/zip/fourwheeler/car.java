package com.automobile.fourwheeler;

import com.automobile.vehicle;



public class car extends vehicle {

	@Override
	public String getmodelname() {
		// TODO Auto-generated method stub
		return "car";
	}

	@Override
	public String getregistraionNo() {
		// TODO Auto-generated method stub
		return "TN45AQ8873";
	}

	@Override
	public String getownernane() {
		// TODO Auto-generated method stub
		return "vetri";
	}

	public int getspeed() {
		    return 90;
	}
	public void audio() {
		System.out.println("song is playing");
	}
	

}
