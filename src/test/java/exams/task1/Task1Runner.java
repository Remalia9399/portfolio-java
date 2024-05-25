package exams.task1;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/exams/task1/feature/task1.feature",
        glue = "src/test/java/exams/task1/Task1.java"
)
public class Task1Runner {

}
