package com.iflytek.testyml;

import com.iflytek.testyml.entity.CustomizeProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({ CustomizeProperties.class })
public class TestYmlApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestYmlApplication.class, args);
    }

}
