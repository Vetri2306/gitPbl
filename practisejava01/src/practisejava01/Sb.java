package practisejava01;


//Why use StringBuilder in Java?
//Java StringBuilder class is used to create mutable (modifiable) String. T
//the Java StringBuilder class is same as StringBuffer class except that it is non-synchronized.
public class Sb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuilder sb = new StringBuilder("java");
sb.insert(2,"vetri");
System.out.println(sb);

//StringBuilder class can be used when you want to modify a string without creating a new object.
	}

}
