package com.demo.strategy;

public record ResultContext(ResultStrategy ageStrategy, ResultStrategy genderStrategy) {
    public String getResult(String age, String gender) {
        String ageResult = ageStrategy.getResult(age, gender);
        String genderResult = ageResult.equals("Children") ? "" : genderStrategy.getResult(age, gender);
        return ageResult + " " + genderResult;
    }
}
