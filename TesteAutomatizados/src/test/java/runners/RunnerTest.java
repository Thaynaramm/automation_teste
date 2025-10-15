package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber-reports/cucumber-report.html"},
                 features = "classpath:features",
                 glue = "stepsDefinitions",
                 tags = "@Alerts",
                 snippets = SnippetType.CAMELCASE,
                 monochrome = true,
                 publish = true,
                 dryRun = false)


public class RunnerTest {

}
