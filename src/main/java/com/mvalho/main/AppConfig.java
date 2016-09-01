package com.mvalho.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.mvalho.service.DumbService;
import com.mvalho.service.impl.DumbServiceImpl;

@SpringBootApplication
@EnableJpaRepositories
@ComponentScan(basePackageClasses={DumbServiceImpl.class})
public class AppConfig implements CommandLineRunner {
	@Autowired
	private DumbService dumbService;

	public static void main(String[] args) {
		SpringApplication.run(AppConfig.class);
	}

	@Override
	public void run(String... arg0) throws Exception {
		System.out.println(dumbService.doSomething("lorem ipsun dolor set amet"));
	}

}
