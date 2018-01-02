package com.springmasterclass.basics.springin5steps.springindepth.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

	@Autowired
	@Qualifier("quickSort")
	private SortAlgorithm sortAlgorithm;

	/**
	 * Binary search method
	 * 
	 * @param numbers
	 * @param targetNumber
	 * @return location of target number
	 */
	public int binarySearch(int[] numbers, int targetNumber) {

		// Implement sorting logic
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm.getClass().getName());

		// Search the array

		// Return result
		return 3;
	}
}
