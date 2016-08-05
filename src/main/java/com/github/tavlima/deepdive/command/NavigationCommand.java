package com.github.tavlima.deepdive.command;

import com.github.tavlima.deepdive.domain.CommandCode;
import com.github.tavlima.deepdive.domain.Submarine;

/**
 * Created by thiago on 8/5/16.
 */
public interface NavigationCommand {

    void execute(Submarine submarine);

    boolean handles(CommandCode commandCode);

}
