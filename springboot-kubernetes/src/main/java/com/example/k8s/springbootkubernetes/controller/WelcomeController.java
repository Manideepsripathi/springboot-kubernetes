package com.example.k8s.springbootkubernetes.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@RequestMapping("/greeting")
	public String greeting() {
		return "POC on Independent study on Ansible and kubernetes ";
	}

}
