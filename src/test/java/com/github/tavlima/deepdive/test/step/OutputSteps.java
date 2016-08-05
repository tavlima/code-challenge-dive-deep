package com.github.tavlima.deepdive.test.step;

import com.github.tavlima.deepdive.BuscapeDeepDiveApplication;
import com.github.tavlima.deepdive.domain.Submarine;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.assertj.core.api.Assertions;
import org.junit.Rule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.rule.OutputCapture;

/**
 * Created by thiago on 8/5/16.
 */
public class OutputSteps {

    @Rule
    public OutputCapture outputCapture = new OutputCapture();

    @Given("^that the submarine is in its starting position$")
    public void thatTheSubmarineIsInItsStartingPosition() throws Throwable {
        // nothing to do
    }

    @When("^it receives the commands ([^ ]+)$")
    public void itReceivesTheCommands(String commands) throws Throwable {
        BuscapeDeepDiveApplication.main(new String[] { commands });
    }

    @Then("^the result '([^']+)' should be printed to the console$")
    public void theResultShouldBePrintedToTheConsole(String result) throws Throwable {
        String output = this.outputCapture.toString();

        Assertions.assertThat(output).isEqualTo(result);
    }

}
