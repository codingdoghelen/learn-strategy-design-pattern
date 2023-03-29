package com.demo.strategy;

import com.demo.strategy.ResultStrategy;

public record ChildrenResultStrategy() implements ResultStrategy {
    @Override
    public String getResult(String age, String gender) {
        return Integer.parseInt(age) < 18 ? "Children" : "Ok. Can buy Mark Six";
    }
}