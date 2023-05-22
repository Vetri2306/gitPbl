package limat;

import org.testng.annotations.Test;

public class demo {

	@Test(priority =3)
	public void a() {
		System.out.println("a");
	}
	
	@Test(priority =2)
	public void b() {
		System.out.println("b");
	}
	
	@Test(priority =1)
	public void c() {
		System.out.println("c");
	}
	
	@Test(priority =0)
	public void d() {
		System.out.println("d");
	}
	
	@Test(priority =-1)
	public void e() {
		System.out.println("e");
	}
}
