package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jeff on 4/19/2017.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        //Tells Spring what template/view should be returned - no extension needed
        return "index";
    }
}
