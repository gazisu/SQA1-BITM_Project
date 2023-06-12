package testng.assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDemo {
	
	@Test
	void assertDemo() {
		int num1 = 5;
		int num2 = 6;
		int expectedResult = 12;
		int actualResutl  = MathUtils.add(num1, num2);
		Assert.assertEquals(actualResutl, expectedResult);
		
//		if (expectedResult == MathUtils.add(num1, num2)) {
//			System.out.println("Pass");
//		}
//		else {
//			System.out.println("Fail");
//		}
		
	}
}
