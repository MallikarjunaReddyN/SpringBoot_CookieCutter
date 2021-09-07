package com.malli.{{ cookiecutter.service_package }}.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.malli.demoservice.service.{{ cookiecutter.entity }}Service;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/{{ cookiecutter.entity.lower() }}")
public class {{ cookiecutter.entity }}Controller {
	
	@Autowired
    	private {{ cookiecutter.entity }}Service {{ cookiecutter.entity.lower() }}Service;
	
}
