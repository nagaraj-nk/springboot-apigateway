package com.wipprep.apigateway;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackMethodController {

    @GetMapping("/fallback")
    public String userServiceFallback() {
        return "User service is taking longer than expected, Please try again later";
    }

    @GetMapping("/fallback2")
    public String departmentServiceFallback() {
        return "Department service is taking longer than expected, Please try again later";
    }
}
