package com.malli.{{ cookiecutter.service_package }}.repository;

import com.malli.demoservice.domain.{{ cookiecutter.entity }};
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface {{ cookiecutter.entity }}Repository extends JpaRepository<{{ cookiecutter.entity }}, Integer> {
	
}
