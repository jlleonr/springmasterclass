package com.springmasterclass.basics.springin5steps.springindepth.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quickSort")
public class QuickSortAlgorithm implements SortAlgorithm{

	public int[] sort(int[] numbers) {

		// logic for Quick Sort

		return numbers;
	}

}
