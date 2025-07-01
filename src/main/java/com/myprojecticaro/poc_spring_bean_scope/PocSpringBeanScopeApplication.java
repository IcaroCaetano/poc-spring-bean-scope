package com.myprojecticaro.poc_spring_bean_scope;

import com.myprojecticaro.poc_spring_bean_scope.infrastructure.adapter.PrototypeConsumer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PocSpringBeanScopeApplication implements CommandLineRunner {

	private final PrototypeConsumer prototypeConsumer;

	public PocSpringBeanScopeApplication(PrototypeConsumer prototypeConsumer) {
		this.prototypeConsumer = prototypeConsumer;
	}

	public static void main(String[] args) {
		SpringApplication.run(PocSpringBeanScopeApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println("Starting execution...");
		prototypeConsumer.execute();
	}
}
