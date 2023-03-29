package com.demo.strategy;

public record AdultResultStrategy() implements ResultStrategy {
    @Override
    public String getResult(String age, String gender) {
        return switch (gender) {
            case "male" -> "Man gambles no good";
            case "female" -> "Girl gambles good luck";
            default -> "OMG FUCK OFF";
        };
    }
}