

package practise;

import java.util.Scanner;

public class practise13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
       char[]  Arr = str.toCharArray();
	
		for(int i=0;i<Arr.length;i++) {
			
			for(int j=i+1;j<Arr.length;j++) {
				
				if(Arr[i]>Arr[j]) {
					
					char temp = Arr[i];
					Arr[i] = Arr[j];
					Arr[j] = temp;
					
					
				}
			}
			
			
			
		}
		
	System.out.println(Arr);
		
	
	}

}
