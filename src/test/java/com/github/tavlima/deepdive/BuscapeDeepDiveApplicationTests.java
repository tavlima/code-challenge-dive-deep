package com.github.tavlima.deepdive;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {
                "classpath:features/Navigate.feature",
                "classpath:features/Output.feature"
        },
        glue = "com.github.tavlima.deepdive.test.step"
)
public class BuscapeDeepDiveApplicationTests {

}
