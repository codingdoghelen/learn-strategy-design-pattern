package com.demo.strategy.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalLearn {
    public static void main(String[] args) {
        Optional<List<String>> testList = Optional.of(Arrays.asList("i", "am", "test", "ing"));
        Optional<List<String>> empty = Optional.ofNullable(null);

       List<Optional<List<String>>> list = Arrays.asList(testList, empty);

//        System.out.println(list.size());

        long size = Optional.of(Stream.of(testList, empty)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .flatMap(List::stream)
                .collect(Collectors.toList())).stream().count();

        list.stream().filter(Optional::isPresent)
                .map(Optional::get)
                .flatMap(List::stream)
                .map(String::toUpperCase);

//        testList.map(x->x.toString().toUpperCase()).orElse(()-> test("s"));

        String result = Stream.concat(testList.stream().flatMap(List::stream), empty.stream().flatMap(List::stream))
//                .map(l -> l.stream()
                .map(String::toUpperCase).collect(Collectors.joining(" "));
//                .collect(Collectors.joining(" ")).orElseGet(() -> test("s"));
        System.out.println(result);

//        List<String> result = Stream.of(test, empty);
//                .map(Optional::get)
//                .flatMap(List::stream)
//                .map(x -> x.toUpperCase())
//                .collect(Collectors.toList());
//        System.out.println(result);

//        List<String> result2 = Stream.of(testList, empty)
////                .filter(Optional::isPresent)
//                .map(Optional::get)
//                .flatMap(List::stream)
//                .map(x -> x.toUpperCase())
//                .collect(Collectors.toList());


//        System.out.println(size);

//        System.out.println(Optional.ofNullable(Stream.of(test, empty).map(x -> x.toString().toUpperCase())).orElse(test("xx")));
//
//        System.out.println(test.map(x -> x.toString().toUpperCase()).orElseGet(() -> helenTest("Learning...")));
//
//        System.out.println(empty.map(x -> x.toString().toUpperCase()).orElseGet(() -> helenTest("Learning...")));

    }


    public static String test(String someText) {
        return someText.concat("ROAAAARRR");
    }

}
