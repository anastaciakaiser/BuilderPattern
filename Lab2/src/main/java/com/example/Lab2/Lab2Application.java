package com.example.Lab2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab2Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab2Application.class, args);

		final int n = 5;
		int[] an = {1, 2, 3, 4, 5};
		int[] bn = {6, 7, 8, 9};

		Builder builder = new FractionBuilder();
		builder.buildFraction(n, an, null);
		Component fraction = builder.getFraction();
		System.out.println(fraction.print());

		builder.buildFraction(n, an, bn);
		fraction = builder.getFraction();
		System.out.println(fraction.print());
	}

}
