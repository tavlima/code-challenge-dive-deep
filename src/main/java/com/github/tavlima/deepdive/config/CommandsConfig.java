package com.github.tavlima.deepdive.config;

import com.github.tavlima.deepdive.command.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by thiago on 8/5/16.
 */
@Configuration
public class CommandsConfig {

    @Bean
    public EmergeCommand emergeCommand() {
        return new EmergeCommand();
    }

    @Bean
    public SubmergeCommand submergeCommand() {
        return new SubmergeCommand();
    }

    @Bean
    public MoveCommand moveCommand() {
        return new MoveCommand();
    }

    @Bean
    public RotateLeftCommand rotateLeftCommand() {
        return new RotateLeftCommand();
    }

    @Bean
    public RotateRightCommand rotateRightCommand() {
        return new RotateRightCommand();
    }

}
