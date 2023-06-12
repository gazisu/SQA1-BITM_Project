package testng.loan;

import org.testng.annotations.Test;

public class PersonalLoan {

	@Test(groups = {"SmokeTest", "e2eTest"})
	void personalLoanWeb() {
		System.out.println("personalLoanWeb");
		
	}
	
	@Test(groups = {"SmokeTest"})
	void personalLoanDesktop() {
		System.out.println("personalLoanDesktop");
	}
	
	@Test
	void personalLoanMobile() {
		System.out.println("personalLoanMobile");
	}
	
	@Test(groups = {"SmokeTest"})
	void personalAdvanceWeb() {
		System.out.println("personalAdvanceWeb");
	}
	
	@Test(groups = {"SmokeTest"})
	void personalAdvanceDesktop() {
		System.out.println("personalAdvanceDesktop");
	}
	
	@Test
	void personalAdvanceMobile() {
		System.out.println("personalAdvanceMobile");
	}
}
