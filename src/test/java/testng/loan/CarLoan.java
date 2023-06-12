package testng.loan;

import org.testng.annotations.Test;

public class CarLoan {
	@Test(enabled = true)
	void carLoanWeb() {
		System.out.println("carLoanWeb: "+Thread.currentThread().getId());
	}
	
	@Test
	void carLoanDesktop() {
		System.out.println("carLoanDesktop: "+Thread.currentThread().getId());
	}
	
	@Test
	void carLoanMobile() {
		System.out.println("carLoanMobile: "+Thread.currentThread().getId());
	}
}
