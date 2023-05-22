package com.automobile.test;
import com.automobile.fourwheeler.*;
import com.automobile.twowheeler.*;
public class test {

	public static void main(String[] args) {
	
		hero v=new hero();
		System.out.println(v.getmodelname());
		System.out.println(v.getregistraionNo());
		System.out.println(v.getownernane());
		v.audio();
		
		car c =new car();
		System.out.println(c.getmodelname());
		System.out.println(c.getownernane());
		System.out.println(c.getregistraionNo());
		c.audio();
	}

}
