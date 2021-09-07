package com.malli.{{ cookiecutter.service_package }}.service;

import com.malli.{{ cookiecutter.service_package }}.repository.{{ cookiecutter.entity }}Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class {{ cookiecutter.entity }}Service {
	
	@Autowired
   	private {{ cookiecutter.entity }}Repository {{ cookiecutter.entity.lower() }}Repository;
	
}
