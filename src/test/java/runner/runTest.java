package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src\\main\\resources\\features",
        glue = "steps",
        plugin = "pretty",
        tags = "@Web"
)

public class runTest extends AbstractTestNGCucumberTests {
	
}
