package practise;

 class all{
	
	 void  Sound() {
		System.out.println("noise");
	}

}

      class lion extends all{
	
	 void king() {
		
		System.out.println("roar");
	}
	
	
	
}

 class ele extends lion {
	 
	 void phant() {
	 System.out.println("strength");
	 
	
 }
 }
 
public  class al{
	 public static void main(String[] args) {
		 ele jungle = new ele();
		 
		jungle.Sound();
		jungle.king();
		jungle.phant();
		
	 }
 }
 
 
 
 