package Algorithm_compere;

import java.util.Arrays;

public class Insertionsort implements Utilities {

	private int[] arr;

	public Insertionsort(int[] arr) {
		this.setArr(arr);
	}

	public void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int current = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] >= current) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = current;
		}
	}


	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

}
