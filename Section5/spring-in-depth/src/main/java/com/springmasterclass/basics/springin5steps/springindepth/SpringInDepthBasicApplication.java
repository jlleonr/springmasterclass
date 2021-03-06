package com.springmasterclass.basics.springin5steps.springindepth;

//import org.springframework.context.ApplicationContext;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.springmasterclass.basics.springin5steps.springindepth.basic.BinarySearchImpl;

//@SpringBootApplication
@Configuration
@ComponentScan("com.springmasterclass.basics.springin5steps.springindepth.basic")
public class SpringInDepthBasicApplication {
	
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
		
		try (AnnotationConfigApplicationContext annotationConfigApplicationContext = 
				new AnnotationConfigApplicationContext(SpringInDepthBasicApplication.class)) {
				// AnnotationConfigApplicationContext applicationContext =
				// SpringApplication.run(SpringInDepthBasicApplication.class, args);
				// annotationConfigApplicationContext;

				// BinarySearchImpl binarySearch =
				// applicationContext.getBean(BinarySearchImpl.class);
				BinarySearchImpl binarySearch = 
							annotationConfigApplicationContext.getBean(BinarySearchImpl.class);
	
				// BinarySearchImpl binarySearch2 =
				// applicationContext.getBean(BinarySearchImpl.class);
				BinarySearchImpl binarySearch2 = 
							annotationConfigApplicationContext.getBean(BinarySearchImpl.class);
	
				System.out.println(binarySearch);
				System.out.println(binarySearch2);
				
				int result = binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3);
				System.out.println(result);
		}
		
	}
}
