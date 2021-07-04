package com.yatsyna.springstudy;

import org.springframework.stereotype.Component;

@Component
public class PopMusic implements Music{
    @Override
    public String getSong() {
        return "I like to moved";
    }
}
