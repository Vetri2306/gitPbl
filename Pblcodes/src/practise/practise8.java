package practise;
import java.util.Scanner;

public class practise8 {

	public static void main(String[] args) {
		
Scanner Scan = new Scanner(System.in);
	
	System.out.print("enter the number: ");
	int num = Scan.nextInt();
	int sum;
	
	for (sum = 0; num > 0; num = num/10)
		sum = sum + (num % 10);
	
	System.out.println(sum);

	}

}
