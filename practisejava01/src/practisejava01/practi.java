package practisejava01;

//Print Characters Presented at Odd Positions by Using the charAt() Method
//question = "Welcome to Javatpoint portal"

public class practi {

	public static void main(String[] args) {
		
		String str ="Welcome to Javatpoint portal";
		//length = 28
		//index value starts form o to 27
		for(int i=0;i<=str.length();i++) {
			
			     
			if(i%2!=0) {
				
				System.out.println(str.charAt(i));	
			}
			
		}
		
		
		
	}

}
