package com.custom.Replication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.custom.Replication")
@EnableAutoConfiguration
public class ReplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReplicationApplication.class, args);
	}

	
}
