package com.springmasterclass.basics.springin5steps;

public class BinarySearchImpl {

	private final SortAlgorithm sortAlgorithm;

	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}

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
