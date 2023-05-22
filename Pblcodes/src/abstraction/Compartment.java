package abstraction;

import java.util.Arrays;

abstract class railway {

	public abstract String notice();

}

class FirstClass extends railway {

	public String notice() {

		return "First class";
	}
}

class Ladies extends railway {

	public String notice() {

		return ("Ladies class");
	}
}

class General extends railway {

	public String notice() {

		return ("general class");
	}
}

class Luggage extends railway {

	public String notice() {

		return ("general class");

	}

}

public class Compartment {

	public static void main(String[] args) {
        		
        		String[] railTrain = new String[10];
        		for (int i = 0; i< railTrain.length; i++) {
        			
        			int coach = (int) (Math.random()*4)+1;
        			
        			if (coach==1) {
        			FirstClass firstclassRes = new FirstClass();
        			
        			railTrain[i] = firstclassRes.notice();
        			
        		} 
        		else if (coach == 2) {
        	
        			Ladies ladiesRes = new Ladies();
        			railTrain[i] = ladiesRes.notice();
        			
        		}
        		else if (coach == 3) {
        		
        		Luggage luggageclassRes = new Luggage();
        		
        		railTrain[i] = luggageclassRes.notice();
        			
        		
        	}
        		else if (coach == 4) {
        			
        			General generalclassRes = new General();
        			railTrain[i] = generalclassRes.notice();
        		}
        	  
        	  
        	  
          }System.out.println(Arrays.toString(railTrain));

}
}
