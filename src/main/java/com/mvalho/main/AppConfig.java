package com.mvalho.main;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.mvalho.entity.Person;
import com.mvalho.service.impl.DumbServiceImpl;

@SpringBootApplication
@EnableJpaRepositories
@EntityScan(basePackageClasses = Person.class)
@ComponentScan(basePackageClasses={DumbServiceImpl.class})
public class AppConfig implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(AppConfig.class);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
	}

}
