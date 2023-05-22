package practise;

import java.util.HashMap;

public class Hashmapconcpets {

	public static void main(String[] args) {
		
		HashMap <String,Integer>velon = new HashMap<>();
		
	    velon.put("vetri",1);
		velon.put("vel",2);
		velon.put("AM",3);
		
	
		velon.put("selva",2);
		velon.remove("vetri",1);
		
		System.out.println(velon.size());
		System.out.println(velon);
		
		

	}

}
