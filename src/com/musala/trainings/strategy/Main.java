package com.musala.trainings.strategy;

public class Main {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		
		Sorter quickSorter = new Sorter(new QuickSort(), arr);
		quickSorter.sort();
	}
}
