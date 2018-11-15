package com.yoshallc.springrabbit.demo;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface PersonSink {

    String SINGLE_MESSAGE = "single-message";

    @Input(PersonSink.SINGLE_MESSAGE)
    SubscribableChannel input();
}
