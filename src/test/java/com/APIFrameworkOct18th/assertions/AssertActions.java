package com.APIFrameworkOct18th.assertions;

import static org.assertj.core.api.Assertions.assertThat;

public class AssertActions {

    public static void validateStringResponse(String actual, String expected){

        assertThat(actual).isEqualTo(expected);
    }
}
