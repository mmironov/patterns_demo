package com.musala.trainings.strategy;

public class Sorter {

	private int[] array;
	
	private Sorting sorting;
	
	public Sorter(Sorting sorting, int[] array) {
		this.sorting = sorting;
		this.array = array;
	}
	
	public void sort() {
		sorting.sort(array);
	}
}
