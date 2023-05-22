
 class Aswin{
	public void  Add() {
		System.out.println("hiii");
	}
	class Name extends Aswin{
	public void sub() {
		System.out.println("hello");
	
}
	
}

public class Main {

	public static void main(String[] args) {
		Name obj  = new Name ();
		obj.Add();
		obj.sub();
}

