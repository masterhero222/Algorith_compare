package Algorithm_compere;

import java.util.Arrays;
import java.util.Random;

public class Quicksort implements Utilities {
	private int[] array;

	public Quicksort(int[] array) {
		this.array = array;

	}

	public static int partition(int a[], int beg, int end) {

		int left, right, temp, loc, flag;
		loc = left = beg;
		right = end;
		flag = 0;
		while (flag != 1) {
			while ((a[loc] <= a[right]) && (loc != right))
				right--;
			if (loc == right)
				flag = 1;
			else if (a[loc] > a[right]) {
				temp = a[loc];
				a[loc] = a[right];
				a[right] = temp;
				loc = right;
			}
			if (flag != 1) {
				while ((a[loc] >= a[left]) && (loc != left))
					left++;
				if (loc == left)
					flag = 1;
				else if (a[loc] < a[left]) {
					temp = a[loc];
					a[loc] = a[left];
					a[left] = temp;
					loc = left;
				}
			}
		}
		return loc;
	}

	static void quickSort(int a[], int beg, int end) {

		int loc;
		if (beg < end) {
			loc = partition(a, beg, end);
			quickSort(a, beg, loc - 1);
			quickSort(a, loc + 1, end);
		}
	}

	// Implementations - Utilities//

	

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

}
