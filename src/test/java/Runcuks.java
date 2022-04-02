import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Search.feature",
        dryRun = false,
        glue= "stepDefinitions",
        plugin = {"json:target/cucumber.json",
                "pretty", "html:reports/myreports.html",
                "rerun:target/rerun.txt"}


)

public class Runcuks {
}
