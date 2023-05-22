package practise;

import java.util.Scanner;

public class practise4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char val = sc.next().charAt(0);
		
		if(val>=65 && val<=122) {
			System.out.println("the given value is ALPHABET");
		}
		else if(val>=48 && val<=57) {
			System.out.println("the given value is DIGITS");
		}
		else {
			System.out.println("the given value is SPECIAL CHARACTER");
		}

	}

}
