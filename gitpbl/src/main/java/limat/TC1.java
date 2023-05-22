package limat;

import org.testng.annotations.Test;

public class TC1 extends base {

	@Test(groups="smoke")
	public void test1() {
		System.out.println("TC1-123");
	}
	
	@Test(groups="regression")
	public void test2() {
		System.out.println("TC2-456");
	}	
}
