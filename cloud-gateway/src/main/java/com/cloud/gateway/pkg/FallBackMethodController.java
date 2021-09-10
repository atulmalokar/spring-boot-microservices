package com.cloud.gateway.pkg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//implementing fallback controller when we try to access any data but service is unavailable or down
//particular method will return error message
@RestController
public class FallBackMethodController {
	
	//fall back method for user service
	@GetMapping("/userServiceFallBack")
    public String userServiceFallBackMethod() {
        return "User Service is taking longer than Expected." +
                " Please try again later";
    }

	//fall back method for department service
    @GetMapping("/departmentServiceFallBack")
    public String departmentServiceFallBackMethod() {
        return "Department Service is taking longer than Expected." +
                " Please try again later";
    }
}
