package cucumberTestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Feature/GoogleLaunch.feature:4",
		glue={"googleSD","hookspackage"},
		dryRun = false,		
		monochrome = true,
		plugin = {"pretty", "html:target/Destination/webreport.html",
			//	"json:target/Destination/jsonreport.json",
			//	"junit:target/Destination/xmlreport.xml"
				"rerun:target/Rerun/cucumber"
				},
		tags= "@Google"
		)
public class RerunDemoTR {

}
