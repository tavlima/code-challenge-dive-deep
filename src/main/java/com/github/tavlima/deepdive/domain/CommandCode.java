package com.github.tavlima.deepdive.domain;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by thiago on 8/5/16.
 */
public enum CommandCode {
    ROTATE_LEFT("L"),
    ROTATE_RIGHT("R"),
    MOVE("M"),
    EMERGE("U"),
    SUBMERGE("D");

    private final String code;

    private static Map<String, CommandCode> map = new HashMap<>();

    static {
        for (CommandCode c : CommandCode.values()) {
            map.put(c.getCode(), c);
        }
    }

    CommandCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static CommandCode getCommand(String code) {
        return map.get(code);
    }

}
