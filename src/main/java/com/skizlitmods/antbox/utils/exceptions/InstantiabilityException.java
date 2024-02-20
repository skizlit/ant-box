package com.skizlitmods.antbox.utils.exceptions;

public class InstantiabilityException extends IllegalAccessException {

    public InstantiabilityException(final String className) {

        super(String.format("Cant instantiate utility class: %s. Methods should be accessed statically", className));
    }
}
