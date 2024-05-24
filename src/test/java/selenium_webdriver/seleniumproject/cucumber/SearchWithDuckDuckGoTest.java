package pl.coderslab.seleniumproject.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/cucumber/features/searchWithDuckDuckGoParametrized.feature",
                 plugin = {"pretty", "html:reports/cucumber-report.html"}
)
public class SearchWithDuckDuckGoTest {

}