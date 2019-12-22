package com.lhb.service;

import org.springframework.stereotype.Service;

import com.lhb.constant.Constants;


/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
@Service
public class SetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return Constants.SETTER_GREET;
    }
}
