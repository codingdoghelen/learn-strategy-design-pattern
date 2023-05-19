package com.demo.strategy.builder;

public class Foo {
    public Foo() {
    }

    public Foo(String firstName, String lastName, int age, boolean married) {}
    public static void main(String[] args) {
        Foo joe = new FooBuilder().setFirstName("Joe").setLastName("Smith").setAge(42).setMarried(false).createFoo();
    }
}