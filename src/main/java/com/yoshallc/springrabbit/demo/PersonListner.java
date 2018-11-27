package com.yoshallc.springrabbit.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PersonListner {


    @StreamListener(PersonSink.SINGLE_MESSAGE)
    public void listenAndLog(@Payload Data payload) {

        log.info(payload.toString());
    }
}


