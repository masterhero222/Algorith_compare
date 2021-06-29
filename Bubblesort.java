package Algorithm_compere;

import java.util.Arrays;

public class Bubblesort implements Utilities {
	private int[] array;

	public Bubblesort(int[] array) {
		this.array = array;
	}

	// Method - Algorithm
	public static void bubbleSort(int[] array) {
		for (int i = 0; i < array.length; i++) {

			for (int j = 1; j < array.length - i; j++) {

				if (array[j - 1] > array[j]) {

					int temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;

				}
			}
		}

	}

	public void setBubbleSort(int[] array) {
		this.array = array;
	}

	// Implementations - Utilities//

	
	// Getters and setters
	public int[] getBubbleSort() {
		return array;
	}

}
