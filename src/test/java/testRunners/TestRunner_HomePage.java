package testRunners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features",glue="",tags= {"@E2E,@FilterVerification2"},
//plugin= {"pretty","html:target/cucumber-reports"},
plugin= {"pretty","junit:target/cucumber-reports/Cucumber.xml"},
monochrome= true
		)




public class TestRunner_HomePage {

}
