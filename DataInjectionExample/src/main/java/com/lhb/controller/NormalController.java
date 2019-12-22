package com.lhb.controller;

import com.lhb.service.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
@Controller
public class NormalController {

    private GreetingService greetingService;

    public NormalController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        return greetingService.sayGreeting();
    }
}
