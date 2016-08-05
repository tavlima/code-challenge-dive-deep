package com.github.tavlima.deepdive.command;

import com.github.tavlima.deepdive.domain.CommandCode;
import com.github.tavlima.deepdive.domain.Direction;
import com.github.tavlima.deepdive.domain.Submarine;

/**
 * Created by thiago on 8/5/16.
 */
public class RotateRightCommand implements NavigationCommand {

    @Override
    public boolean handles(CommandCode commandCode) {
        return CommandCode.ROTATE_RIGHT == commandCode;
    }

    @Override
    public void execute(Submarine submarine) {
        Direction currentDirection = submarine.getDirection();
        Direction newDirection = null;

        switch (currentDirection) {
            case NORTE:
                newDirection = Direction.LESTE;
                break;

            case LESTE:
                newDirection = Direction.SUL;
                break;

            case SUL:
                newDirection = Direction.OESTE;
                break;

            case OESTE:
                newDirection = Direction.NORTE;
                break;
        }

        submarine.setDirection(newDirection);
    }

}
