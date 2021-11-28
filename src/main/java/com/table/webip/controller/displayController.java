package com.table.webip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class displayController {
    @RequestMapping("/display")
    public String toIndex() {
        return "display";
    }
}
