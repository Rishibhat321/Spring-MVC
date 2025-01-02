package com.springboot.thymeleaf_demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// spring mvc controller
@Controller
public class HelloWorldController {

    // create a new controller method to show initial HTML Form

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    // need a controller method to process the HTML Form

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    // need a controller method to read from data and add data to the model

    @RequestMapping("/processFormVersionTwo")
    public String readData(HttpServletRequest request, Model model) {
        // read the request parameter from the HTML Form
        String theName = request.getParameter("studentName");

        // convert the data to UpperCase
        theName = theName.toUpperCase();

        // create the message
        String result = "Yo! " + theName;

        // add message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }

}
