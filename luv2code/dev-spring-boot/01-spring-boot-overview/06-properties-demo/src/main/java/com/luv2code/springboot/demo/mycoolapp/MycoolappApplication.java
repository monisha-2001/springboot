package com.luv2code.springboot.demo.mycoolapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication    //annotation
public class MycoolappApplication {

	public static void main(String[] args) {

		SpringApplication.run(MycoolappApplication.class, args);  //this is a bootstrap of spring boot app
	}

}
