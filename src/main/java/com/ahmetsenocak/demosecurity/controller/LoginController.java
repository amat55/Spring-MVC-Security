package com.ahmetsenocak.demosecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/showMyLoginPage")
    public String getLoginPage() {
        // return "plain-login";
        return "fancy-login";
    }
}
