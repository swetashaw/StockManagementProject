package com.project.stockmanagement.util;;

/**
 * stock-app Created by sweta.
 */
public class Preconditions {

    public static void checkArgument(boolean expression, String message) throws IllegalArgumentException {
        if (expression)
            throw new IllegalArgumentException(String.valueOf(message));
    }
}
	