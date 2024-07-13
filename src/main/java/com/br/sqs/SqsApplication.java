package com.br.sqs;

import com.br.sqs.producer.ProducerSqs;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RequiredArgsConstructor
@SpringBootApplication
public class SqsApplication implements CommandLineRunner {

	private final ProducerSqs producerSqs;

	public static void main(String[] args) {
		SpringApplication.run(SqsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		producerSqs.sendMessage();
	}
}
