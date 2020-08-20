package _00_Sorting_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _01_SwappingDigits {

	@Test
	void test() {
		int[] x = {5, 6};
		int[] y = {6, 5};
		//swapArrayOfTwo(x);
		//assertArrayEquals(y, x); 
		
		int[] z = {7, 3, 5, 9, 2};
		int[] q = {2, 3, 5, 7, 9};
		//sortIntArray(z);
		//assertArrayEquals(q, z);
		
		int[] m = {7, 3, 9, 5, 2};
		assertEquals(5, findMiddle(m));
	}
	
	//1. Complete the method so that the first two elements of the array are swapped
	public static void swapArrayOfTwo(int[] arr) {
		for(int i = 0; i < 2; i++) {
			int a = arr[i];
			int b = arr[i++];
			arr[i] = b;
			arr[i++] = a;
		}
	}
	
	//2. Complete the method so that it sorts the array using a bubble sort.
	//   Iterate through the array and when you find two elements that are out
	//   of order, swap them. Repeat this until the array is in order.
	public static void sortIntArray(int[] arr) {
		int l = arr.length;
		int a = 0;
		for(int i = a; i < l; i++) {
			for(int j = 1;j < l-j; i++ ) {
				if(arr[j-1] > arr[j]) {
					a = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = a;
				}
			}
		}
	}
	
	//3. Complete the method so that it finds the middle number in the array.
	//   *Hint* it helps to sort it first.
	//   *Double Hint* Use the method you already wrote in step 2 to sort it
	public static int findMiddle(int[] arr) {
		sortIntArray(arr);
		int l = arr.length;
		int mid = l/2;
		return arr[mid];
	}
}
