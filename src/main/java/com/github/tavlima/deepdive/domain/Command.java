package com.github.tavlima.deepdive.domain;

/**
 * Created by thiago on 8/5/16.
 */
public enum Command {
    ROTATE_LEFT("L"),
    ROTATE_RIGHT("R"),
    MOVE("M"),
    EMERGE("U"),
    SUBMERGE("D");

    private final String code;

    Command(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
