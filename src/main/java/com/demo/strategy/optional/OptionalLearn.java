package com.demo.strategy.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalLearn {
    public static void main(String[] args) {
        Optional<List<String>> test = Optional.of(Arrays.asList("i", "am", "test", "ing"));
        Optional<List<String>> empty = Optional.ofNullable(null);

        System.out.println(test.map( x -> x.toString().toUpperCase()).orElseGet(()-> helenTest("Learning...")));

        System.out.println(empty.map( x -> x.toString().toUpperCase()).orElseGet(()-> helenTest("Learning...")));

    }


    public static String helenTest(String someText){
        return someText.concat("ROAAAARRR");
    }

}
