package _00_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}
	
	// Bogo sort is a joke sorting algorithm. It is considered the most 
	// inefficient sorting algorithm while still maintaining the possibility
	// of eventually sorting data.
	
	// It works by following these steps:
	// STEP 1. Is the array in order?
	//	if yes, finished; if no, go to step 2.
	// STEP 2. Take two random elements in the array and swap them.
	// STEP 3. Go back to step 1.
	
	//1. Complete the sort method using the Bogo sort algorithm. 
	@Override
	void sort(int[] array, SortingVisualizer display) {
		boolean order = false;
		int highestNumber;
		for(int i = 0; i < array.length; i++) {
			for(int j = 1; j < array.length; i++) {
				highestNumber = array[i];
				if(array[j] > highestNumber) {
					highestNumber = array[j];
					order = true;
				}
				else {
					order = false;
					break;
				}
			}
		}
		if(order == false) {
			int randy = new Random().nextInt(array.length);
			int randolph = new Random().nextInt(array.length);
			int temp = array[randy];
			int temp2 = array[randolph];
			array[randy] = temp2;
			array[randolph] = temp;
		}
		if(order == true) {
			System.out.println("finished :)");
		}
	}
}
