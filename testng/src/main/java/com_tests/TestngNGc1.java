package com_tests;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
 

public class TestngNGc1 extends Baseclass {


		// TODO Auto-generated method stub
	@Parameter({"value1","value2","value3"})
		 @Test
		 public void b(String val1,String val2,String val3) {
		   System.out.println(value1); 
		   System.out.println(value2);
		   System.out.println(value3);
		 }
			
		

	}


