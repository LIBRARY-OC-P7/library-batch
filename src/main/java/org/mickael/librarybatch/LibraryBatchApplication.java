package org.mickael.librarybatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("org.mickael.librarybatch")
@EnableDiscoveryClient
public class LibraryBatchApplication {



	public static void main(String[] args) {
		SpringApplication.run(LibraryBatchApplication.class, args);
	}
}
