package com.trycloud.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report.html", "rerun:target/rerun.txt", "me.jvt.cucumber.report.PrettyReports:target/cucumber"},
        features = "src/test/resources/features",
        glue = "com/trycloud/step_definitions",
        dryRun = false,
        tags = "@wip"
        // tags = "" --> runs everything, all features/scenarios
        //  tags = "@wip" -->  runs work in progress (can put any tag there to run)
       // publish = true    // optional, report will self-destruct in 24 hours
)

public class CukesRunner {
}

// order of execution comes from feature file

// dryRun = true --> DO NOT run my step_definitions, but only check if any step implementation is missing, will give all UNIMPLEMENTED STEPS SNIPPETS

// dryRun = false (default) --> run my step_definitions class as expected, turns off dryRun, does not give snippets

// "me.jvt.cucumber.report.PrettyReports:target/cucumber" is optional, this report shows screenshot after each failed step