package com.dgmarkt.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber.json",
                "html:targer/default-html-reports.html"
        },
        features = "src/test/resources/features",
        glue = "com/dgmarkt/stepDef",
        dryRun = false,
        tags = "@initialLogin"
)

public class CukesRunner {
}
