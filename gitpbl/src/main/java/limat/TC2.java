package limat;

import org.testng.annotations.Test;

public class TC2 extends base{

	@Test(groups="regression")
	public void test1() {
		System.out.println("TC3-ABC");
	}
	
	@Test(groups="smoke")
	public void test2() {
		System.out.println("TC4-XYZ");
	}
}
