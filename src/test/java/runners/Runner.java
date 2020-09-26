package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },
        features = "/Users/Abc/IdeaProjects/globaltrader/src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@Company_seller_join",
        dryRun = false
)
public class Runner {
}
