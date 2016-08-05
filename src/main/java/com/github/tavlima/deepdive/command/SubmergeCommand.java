package com.github.tavlima.deepdive.command;

import com.github.tavlima.deepdive.domain.CommandCode;
import com.github.tavlima.deepdive.domain.Submarine;

/**
 * Created by thiago on 8/5/16.
 */
public class SubmergeCommand implements NavigationCommand {

    @Override
    public boolean handles(CommandCode commandCode) {
        return CommandCode.SUBMERGE == commandCode;
    }

    @Override
    public void execute(Submarine submarine) {
        submarine.setZ(submarine.getZ() + 1);
    }

}
