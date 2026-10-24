package com.testrunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\kanis\\OneDrive\\Documents\\Custom Office Templates\\CucumberBatch2026Sep\\src\\test\\resources\\Features\\datatableee.feature",glue={"com.step"})
//plugin= {"pretty",		
//		"html:target/CucumberReport/report.html",
//		"json:target/CucumberReport/report.json",
//		"junit:target/CucumberReport/report.xml",
//					
//},
//dryRun=true)

public class RunnerClass {
	
	
}
