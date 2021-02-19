package cucumberOptions;

/*
 * import org.junit.runner.RunWith;
 * 
 * import io.cucumber.junit.Cucumber; import io.cucumber.junit.CucumberOptions;
 * 
 * @RunWith(Cucumber.class)
 * 
 * @CucumberOptions(features =
 * "src/test/java/features/aconexapplication.feature", plugin =
 * "json:target/jsonReports/cucumber-report.json", dryRun = false, tags = {
 * "@Aconexemailtest" }, glue = { "stepdefinitions" }, monochrome = true)
 * 
 * //@Aconexuploaddoctest\
 * 
 * 
 * 
 * 
 * import org.junit.runner.RunWith;
 * 
 * import io.cucumber.junit.Cucumber; import io.cucumber.junit.CucumberOptions;
 * 
 * @RunWith(Cucumber.class)
 * 
 * @CucumberOptions(features =
 * "src/test/java/features/aconexapplication.feature", plugin =
 * "json:target/jsonReports/cucumber-report.json", dryRun = false, tags = {
 * "@Aconexemailtest" }, glue = { "stepdefinitions" }, monochrome = true)
 * 
 * 
 * //@Aconexemailtest or @Aconexuploaddoctest" public class TestRunner {
 * 
 * }
 */

 
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber; import io.cucumber.junit.CucumberOptions;


/* 
@RunWith(Cucumber.class)
@CucumberOptions(
 features = "src/test/java/features/Amazon.feature",plugin = "json:target/jsonReports/cucumber-report.json", dryRun = false}
 ,glue={"stepdefinitions"}
 */
 @RunWith(Cucumber.class)
 @CucumberOptions(features = "src/test/java/features/Amazon.feature", plugin = "json:target/jsonReports/cucumber-report.json", dryRun = false
  ,glue={"stepdefinitions"})

public class TestRunner {
	 
}
