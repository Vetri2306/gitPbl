package Pbl_questions;


import java.util.*;

public class Aray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] arr = {1,2,3,4,5,6,7,8,9};
	
	//sum of odd and even indexed elements
	int Sum=0;
	int plus=0
	int Total=0;
	
	for(int i=0;i<arr.length;i++){
		
		if(i%2!=0) {
		
		Sum=Sum+arr[i];
//			System.out.println(arr[i]);
		}
		else {
			plus=plus+arr[i];
		}
		
	}
	Total = Sum+plus;
	
	System.out.println(Total);


	

}

}