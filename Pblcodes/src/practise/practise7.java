package practise;

import java.util.Scanner;

public class practise7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number:");
		int num = scan.nextInt();
		int count = 0;
		
		for( int i = 2;i < num/2; i++) {
			if(num % i == 0) {
				count++;
			}
			else
			{
				continue;
			}
		}
		if(count == 0) {
			System.out.println("number is prime");
		}
		else {
			System.out.println("number is not prime");
		}
	}

}
