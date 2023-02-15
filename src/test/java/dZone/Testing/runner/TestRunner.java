package dZone.Testing.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
					features= "classpath:features",
					glue="dZone.Testing.stepdefs",
					tags="@Join",
					plugin={"pretty", // to generate reports
				            "html:target/html/htmlreport.html",
				            "json:target/json/file.json",
				            },
					monochrome=true,
					publish=true,
					dryRun=false

				)

public class TestRunner {

}
