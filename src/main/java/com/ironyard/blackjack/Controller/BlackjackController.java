package com.ironyard.blackjack.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BlackjackController {
    @RequestMapping(path ="/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(path = "/index", method = RequestMethod.POST)
    public String start(@RequestParam(value="num-players") int num) {
        System.out.println("Number of Players: " + num);
        return "redirect:/table";
    }

    @RequestMapping(path = "/table", method = RequestMethod.GET)
    public String table() {
        return "table";
    }
}
