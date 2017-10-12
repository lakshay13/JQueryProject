package com.suri.jquery.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

/**
 * Created by lakshay on 12/10/2017.
 */
@Controller
public class homecontroller {

    @CrossOrigin
    @RequestMapping(value = "/response/", method = RequestMethod.GET)
    @ResponseBody
    public String getResponse() {
        Random random = new Random();
        int randomNum = random.nextInt(20);

        if (randomNum % 2 == 0) {
            return "Success";
        } else if (randomNum % 3 ==0) {
            return "dream";
        } else {
            return "aim";
        }
    }
}
