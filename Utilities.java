package Algorithm_compere;

import java.util.Arrays;

public interface Utilities {

	public static void arrayRandomizer(int[] array, int maxNumber) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * maxNumber);
		}

	}

	public static void printArray(int[] array) {
		System.out.println(Arrays.toString(array));

	}	
	
	public static void swap(int[] array, int i, int j) {

		int temp = array[i];
		array[i] = array[2];
		array[2] = temp;

	}
	
}
