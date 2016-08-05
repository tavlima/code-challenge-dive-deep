package com.github.tavlima.deepdive.test.step;

import com.github.tavlima.deepdive.domain.Direction;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by thiago on 8/5/16.
 */
public class NavigateSteps {

    @Given("^that the submarine position is (\\d+) (\\d+) (\\d+) ([^ ]+)$")
    public void thatTheSubmarinePositionIs(int x, int y, int z, Direction direction) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^it receives the rotate left command$")
    public void itReceivesTheRotateLeftCommand() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^it receives the rotate right command$")
    public void itReceivesTheRotateRightCommand() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^it receives the move command$")
    public void itReceivesTheMoveCommand() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^it receives the emerge command$")
    public void itReceivesTheEmergeCommand() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^it receives the submerge command$")
    public void itReceivesTheSubmergeCommand() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^it should move to position (\\d+) (\\d+) (\\d+) ([^ ]+)$")
    public void itShouldMoveToPosition(int x, int y, int z, Direction direction) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
