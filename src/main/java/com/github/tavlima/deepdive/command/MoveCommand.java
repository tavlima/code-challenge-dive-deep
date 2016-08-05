package com.github.tavlima.deepdive.command;

import com.github.tavlima.deepdive.domain.CommandCode;
import com.github.tavlima.deepdive.domain.Direction;
import com.github.tavlima.deepdive.domain.Submarine;

/**
 * Created by thiago on 8/5/16.
 */
public class MoveCommand implements NavigationCommand {

    @Override
    public boolean handles(CommandCode commandCode) {
        return CommandCode.MOVE == commandCode;
    }

    @Override
    public void execute(Submarine submarine) {
        Direction currentDirection = submarine.getDirection();

        switch (currentDirection) {
            case NORTE:
                submarine.setY(submarine.getY() + 1);
                break;

            case LESTE:
                submarine.setX(submarine.getX() + 1);
                break;

            case SUL:
                submarine.setY(submarine.getY() - 1);
                break;

            case OESTE:
                submarine.setX(submarine.getX() - 1);
                break;
        }
    }

}
