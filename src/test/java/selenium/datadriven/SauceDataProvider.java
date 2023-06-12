package selenium.datadriven;

import org.testng.annotations.DataProvider;

public class SauceDataProvider {
	
	@DataProvider(name="user-data")
	Object[][] dataSet(){
		Object[][] data = {
				{"standard_user", "secret_sauce"},
				{"locked_out_user", "secret_sauce"},
				{"problem_user", "secret_sauce"},
				{"performance_glitch_user", "secret_sauce"},
		};
		return data;
	}
}
