package exams.task1;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
//        fetrues = add file or folder
        features = "src/test/java/exams/task1/feature/task1.feature",
//        glue = "src/test/java/exams/task1/Task1.java",
//        plugin = {"pretty", "html:out"}
        plugin = {"pretty", "html:reports/cucumber-report-task1.html"}
)
public class Task1Runner {

}
