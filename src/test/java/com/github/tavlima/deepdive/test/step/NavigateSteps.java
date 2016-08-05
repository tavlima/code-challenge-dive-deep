package com.github.tavlima.deepdive.test.step;

import com.github.tavlima.deepdive.BuscapeDeepDiveApplication;
import com.github.tavlima.deepdive.domain.Command;
import com.github.tavlima.deepdive.domain.Direction;
import com.github.tavlima.deepdive.domain.Submarine;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.assertj.core.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;

/**
 * Created by thiago on 8/5/16.
 */
@ContextConfiguration(classes = BuscapeDeepDiveApplication.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public class NavigateSteps {

    @Autowired
    private BuscapeDeepDiveApplication application;

    @Autowired
    private Submarine submarine;

    @Given("^that the submarine position is ([^ ]+) ([^ ]+) ([^ ]+) ([^ ]+)$")
    public void thatTheSubmarinePositionIs(int x, int y, int z, Direction direction) throws Throwable {
        this.submarine.setX(x);
        this.submarine.setY(y);
        this.submarine.setZ(z);
        this.submarine.setDirection(direction);
    }

    @When("^it receives the rotate left command$")
    public void itReceivesTheRotateLeftCommand() throws Throwable {
        executeCommand(Command.ROTATE_LEFT);
    }

    @When("^it receives the rotate right command$")
    public void itReceivesTheRotateRightCommand() throws Throwable {
        executeCommand(Command.ROTATE_RIGHT);
    }

    @When("^it receives the move command$")
    public void itReceivesTheMoveCommand() throws Throwable {
        executeCommand(Command.MOVE);
    }

    @When("^it receives the emerge command$")
    public void itReceivesTheEmergeCommand() throws Throwable {
        executeCommand(Command.EMERGE);
    }

    @When("^it receives the submerge command$")
    public void itReceivesTheSubmergeCommand() throws Throwable {
        executeCommand(Command.SUBMERGE);
    }

    @Then("^it should move to position ([^ ]+) ([^ ]+) ([^ ]+) ([^ ]+)$")
    public void itShouldMoveToPosition(int x, int y, int z, Direction direction) throws Throwable {
        Assertions.assertThat(this.submarine.getX())
                .isEqualTo(x);

        Assertions.assertThat(this.submarine.getY())
                .isEqualTo(y);

        Assertions.assertThat(this.submarine.getZ())
                .isEqualTo(z);

        Assertions.assertThat(this.submarine.getDirection())
                .isEqualTo(direction);
    }

    private void executeCommand(Command command) throws Exception {
        application.run(command.getCode());
    }
}
