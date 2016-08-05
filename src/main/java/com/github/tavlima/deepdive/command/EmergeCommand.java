package com.github.tavlima.deepdive.command;

import com.github.tavlima.deepdive.domain.CommandCode;
import com.github.tavlima.deepdive.domain.Submarine;

/**
 * Created by thiago on 8/5/16.
 */
public class EmergeCommand implements NavigationCommand {

    @Override
    public boolean handles(CommandCode commandCode) {
        return CommandCode.EMERGE == commandCode;
    }

    @Override
    public void execute(Submarine submarine) {
        if (submarine.getZ() > 0) {
            submarine.setZ(submarine.getZ() - 1);
        }
    }

}
