package com.springmasterclass.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {
	
	//What are the beans?
		//Beans are objects that will be managed by the Spring framework,
		//they are identified with the @Component annotation.
	
	//What are the dependencies of a bean?
		//Dependencies are managed using the @Autowired annotation.
	
	//Where to search for the beans?
		//Spring looks for beans within the package where the 
		//@SpringBootApplication annotation is present.

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		//int result = binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3);
		
		ConfigurableApplicationContext applicationContext = 
				SpringApplication.run(SpringIn5StepsApplication.class, args);
		
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		
		int result = binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3);
		System.out.println(result);
	}
}
