package practisejava01;

public class Practiprimenum2 {
	
	public static void main(String args[]) {

	
	int i;
	int j;
	
	
	for( i=1;i<=10;i++) {
		
		int count=0;
				for( j=1;j<=i;j++) {
					
					if(i%j==0) {
						
					
					count++;
				}
				}
				if(count==2) {
					
					System.out.println(i);
				}
	
	
	
	}
	
}
}