package com.templatecloud.transactionconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableConfigServer
public class TransactionConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactionConfigServerApplication.class, args);
	}

}
