package com.malli.{{ cookiecutter.service_package }};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class {{cookiecutter.service_name_combined}}Application {

	public static void main(String[] args) {
		SpringApplication.run({{cookiecutter.service_name_combined}}Application.class, args);
	}

}
