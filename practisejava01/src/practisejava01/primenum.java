package practisejava01;

public class primenum {

	public static void main(String[] args) {
		int n=3 ;
		boolean prime = false;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				prime =true;
				break;
			}
			
		}
		   
		 System.out.println(prime); 
	}

}
