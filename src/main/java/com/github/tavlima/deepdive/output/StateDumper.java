package com.github.tavlima.deepdive.output;

import com.github.tavlima.deepdive.domain.Submarine;
import org.springframework.stereotype.Component;

/**
 * Created by thiago on 8/5/16.
 */
@Component
public class StateDumper {

    public void dump(Submarine submarine) {
        System.out.println(String.format("%d %d %d %s", submarine.getX(), submarine.getY(), submarine.getZ(), submarine.getDirection().name()));
    }

}
