package com.lhb.service;

import org.springframework.stereotype.Component;

import com.lhb.constant.Constants;


/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
@Component
public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getEnglishGreeting() {
        return Constants.GREET_ENGLISH;
    }

    @Override
    public String getSpanishGreeting() {
    	return Constants.GREET_SPANISH;
    }

    @Override
    public String getGermanGreeting() {
    	return Constants.GREET_GERMAN;
    }
}
