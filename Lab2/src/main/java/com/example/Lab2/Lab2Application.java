package com.example.Lab2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Lab2Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab2Application.class, args);

		int[] coefs1 = {1, 2, 3, 4, 5};
		int[] numerators1 = {1, 1, 1, 1};
		ContinuedFractionBuilder builder1 = new ContinuedFractionBuilder1();
		ContinuedFractionDirector director = new ContinuedFractionDirector();
		ContinuedFractionComposite continuedFraction1 = director.build(builder1, coefs1, numerators1);

		System.out.println(continuedFraction1.print());

		int[] integers = {1, 2, 3, 4, 5};
		int[] numerators = {6, 7, 8, 9};
		ContinuedFractionBuilder builder = new ContinuedFractionBuilder2();
		ContinuedFractionDirector director2 = new ContinuedFractionDirector();
		ContinuedFractionComposite continuedFraction2 = director2.build(builder, integers, numerators);

		// Print the continued fraction
		System.out.println(continuedFraction2.print());

	}
}
