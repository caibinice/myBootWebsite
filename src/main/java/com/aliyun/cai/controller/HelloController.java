package com.aliyun.cai.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.text.DateFormat;
import java.util.Date;

@RestController
@EnableAutoConfiguration
public class HelloController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index() {
        return new ModelAndView("redirect:/hello");
    }

    @RequestMapping("/hello")
    public ModelAndView hello() {
        ModelAndView view  = new ModelAndView();
        view.addObject("now", DateFormat.getDateTimeInstance().format(new Date()));
        view.setViewName("helloView");
        return view;
    }
}