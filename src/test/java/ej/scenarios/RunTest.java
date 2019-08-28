package ej.scenarios;
import org.junit.runner.RunWith;


import cucumber.api.junit.Cucumber;

import cucumber.api.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber"},
features = {"src/test/resources/featurefiles/Login.feature"},
glue={"src/test/java/ej.scenarios"},
//format={"pretty","html:test-outout"},
//glue={"StepDefinition"},
dryRun=true,
tags={"@EndToEnd"})

public class RunTest {

}
