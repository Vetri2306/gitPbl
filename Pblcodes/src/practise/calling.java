package practise;


class Vetri{
	public int sub() {
		
		int a=100,b=100,sum;
		sum = a-b;
		
		return(sum);
		
	}
	public int add() {
		
		int a=30,b=70,x;
		
		x= a+b;
		return(x);
		
		
	}
	
	
	
	
}

public class calling {

	public static void main(String[] args) {
		
		Vetri one = new Vetri();
		one.sub();
		one.add();
	System.out.println(one.sub());
	System.out.println(one.add());
	}
	
}
