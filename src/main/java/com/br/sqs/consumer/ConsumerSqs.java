package com.br.sqs.consumer;

import io.awspring.cloud.sqs.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerSqs {

    @SqsListener("sqs-queue")
    public void receiveMessage(String message) {
        System.out.println("Message received: " + message);
    }
}
