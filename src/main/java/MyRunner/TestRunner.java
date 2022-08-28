package MyRunner;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "C:\\Users\\mypc\\Downloads\\CucumberSeleniumFramework-master\\src\\main\\java\\Features", //the path of the feature files
			glue={"stepDefinitions"}, //the path of the step definition files
//			format= {"pretty","html:test-outout", "json:target/cucumber.json"}, //to generate different types of reporting
			format= {"pretty","html:test-outout", "json:target/cucumber.json","com.cucumber.listener.ExtentCucumberFormatter:target/report.html"}, //to generate different types of reporting

			monochrome = true, //display the console output in a proper readable format
			strict = true, //it will check if any step is not defined in step definition file
			dryRun = false, //to check the mapping is proper between feature file and step def file
			tags = {"~@SmokeTest, ~@RegressionTest"}		
			)
	 
	public class TestRunner {
		
	}
	
	//ORed : tags = {"@SmokeTest , @RegressionTest"} -- execute all tests tagged as @SmokeTest OR @RegressionTest
	//ANDed : tags = tags = {"@SmokeTest" , "@RegressionTest"} -- execute all tests tagged as @SmokeTest AND @RegressionTest
	

