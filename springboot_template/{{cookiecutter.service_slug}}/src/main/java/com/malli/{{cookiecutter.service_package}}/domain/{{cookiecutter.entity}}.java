package com.malli.{{ cookiecutter.service_package }}.domain;


import javax.persistence.*;


@Entity
@Table(name = "{{ cookiecutter.entity }}")
public class {{ cookiecutter.entity }} {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
}