package com.liumapp.demo.log.controller;

import com.liumapp.demo.log.entity.Guest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liumapp
 * @file IndexController.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 5/16/18
 */
@Controller
@RequestMapping("/")
public class IndexController {

    private static Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private Guest guest;

    @GetMapping("/")
    public String index (ModelMap model) {

        model.addAttribute("name" , guest.getName());
        model.addAttribute("sex" , guest.getSex());
        logger.info("a user coming in : " + model.toString());
        logger.debug("a debug info ");
        logger.error("an error info ");

        return "index";

    }

}
