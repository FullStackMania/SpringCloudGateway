package com.fullstackmania.productservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {

	@Autowired
	private Environment environment;

	@GetMapping("/get")
	public String getDetails() {
		return "Got Product Details" + environment.getProperty("local.server.port");
	}

}
