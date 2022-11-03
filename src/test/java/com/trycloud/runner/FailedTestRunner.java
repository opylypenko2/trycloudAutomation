package com.trycloud.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/rerun.txt", // location of failed scenarios
        glue = "com/trycloud/step_definitions" // implementation
)

public class FailedTestRunner {
// This runner class will run only failed scenarios
}
