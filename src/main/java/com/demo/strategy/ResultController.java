package com.demo.strategy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResultController {

    @GetMapping("/result")
    public String getResult(@RequestParam(name = "age", required = false) String age,
                            @RequestParam(name = "gender", required = false) String gender) {
        ResultContext context = new ResultContext(new ChildrenResultStrategy(), new AdultResultStrategy());

        String ageValue = age != null && !age.isEmpty() ? age : "";
        String genderValue = gender != null && !gender.isEmpty() ? gender.toLowerCase() : "";

        String result = context.getResult(ageValue, genderValue);
        return result.isEmpty() ? "OMG FUCK OFF (Invalid input)" : result;
    }
}