package com.lhb.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
@Service
@Primary
@Profile({"en", "default"})
public class PrimaryEnglishGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryEnglishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getEnglishGreeting();
    }
}
