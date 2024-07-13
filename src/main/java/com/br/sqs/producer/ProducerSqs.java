package com.br.sqs.producer;

import io.awspring.cloud.sqs.operations.SqsTemplate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@RequiredArgsConstructor
public class ProducerSqs {

    private final SqsTemplate sqsTemplate;

    public void sendMessage() {
        String message = String.format("Data/hora atual: %s", Instant.now());
        String fila = "https://localhost.localstack.cloud:4566/000000000000/sqs-queue";
        sqsTemplate.send(fila, message);
        System.out.println("Message send: " + message);
    }
}
