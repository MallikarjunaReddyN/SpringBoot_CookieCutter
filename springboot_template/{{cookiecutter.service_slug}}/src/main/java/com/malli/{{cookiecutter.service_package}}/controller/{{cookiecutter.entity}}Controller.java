package com.malli.{{ cookiecutter.service_package }}.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/{{ cookiecutter.entity.lower() }}")
public class {{ cookiecutter.entity }}Controller {
	
}