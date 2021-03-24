package config;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
        tags= "@tag1",
        features= "./Resources",
        glue= "steps",
        monochrome = true)
public class Runner {
	 			
}
