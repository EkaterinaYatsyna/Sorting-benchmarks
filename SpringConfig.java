package com.yatsyna.springstudy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Configuration
@ComponentScan("com.yatsyna.springstudy")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    @Autowired
    public List<Music> ListMusic(@Qualifier("classicalMusic") Music classicalMusic,
                                 @Qualifier("popMusic") Music popMusic,
                                 @Qualifier("rockMusic") Music rockMusic) {

        return Arrays.asList(popMusic,rockMusic,classicalMusic);
    }

}