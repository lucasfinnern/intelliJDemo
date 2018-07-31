package com.launchcode.routebuilder.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "")
public class route_controller {

    //controls path to add
    @RequestMapping(value = "add")
    public String index(Model model) {
        return "add";
    }
}