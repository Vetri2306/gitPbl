package practise;


import java.util.*;
import java.util.Map.Entry;


public class practise15 {


	public static void main(String[] args) {
  Scanner vet = new Scanner(System.in);
  String str = vet.nextLine();
  
  
HashMap <Character,Integer>  tri = new HashMap<>();
char a[] = str.toCharArray();

for(char c:a) {
	
	if(tri.containsKey(c)) {
		
		tri.put(c,tri.get(c)+1);
	}
	else {
		
		tri.put(c,1);
	}
}
	
	for(Map.Entry z: tri.entrySet()) {
		
		System.out.println(z.getKey()+" "+z.getValue());
	}

}
}