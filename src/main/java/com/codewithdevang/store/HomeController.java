package com.codewithdevang.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    // Injecting the application name from application.properties
    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping("/")
    public String index() {
        String viewName = getViewName();
        System.out.println(viewName);
        System.out.println("Application Name: " + appName);
        return viewName;
    }

    private String getViewName() {
        return "index.html";
    }
}
