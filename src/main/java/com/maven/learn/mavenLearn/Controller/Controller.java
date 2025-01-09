package com.maven.learn.mavenLearn.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;

@RestController
public class Controller {

    @GetMapping("/hello")
    @Operation(summary = "Greet the user", description = "Returns a greeting message for the given user.")
    public String hello(@RequestParam @Parameter(description = "Name of the user to greet", example = "John") String name) 
    {
        return "Hello,"+name+" g !!";
    }
}