package com.malli.{{ cookiecutter.service_package }}.repository;


import org.springframework.stereotype.Repository;

Repository
public class {{ cookiecutter.entity }}Repository extends JpaRepository<{{ cookiecutter.entity }}, Integer> {
	
}