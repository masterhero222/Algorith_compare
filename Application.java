package Algorithm_compere;

import java.util.Scanner;

public class Application {

	public static Scanner user_input = new Scanner(System.in);

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		System.out.println("Array lenght");
		int inputArrayLenght = user_input.nextInt();
		int[] bubblesortArray = new int[inputArrayLenght];
		int[] quicksortArray = new int[inputArrayLenght];
		int[] insertionsortArray = new int[inputArrayLenght];
		int[] mergesortArray = new int[inputArrayLenght];

		System.out.println("Random number range");
		int inputRandomNumber = user_input.nextInt();

		Bubblesort bbs = new Bubblesort(bubblesortArray);
		long startTime1 = System.nanoTime();
		Utilities.arrayRandomizer(bubblesortArray, inputRandomNumber);
		bbs.bubbleSort(bubblesortArray);
		Utilities.printArray(bubblesortArray);
		long endTime1 = System.nanoTime();
		long totalTime1 = endTime1 - startTime1;
		System.out.println("Bubblesort needs " + totalTime1 + " nanoseconds");

		Quicksort qs = new Quicksort(quicksortArray);
		long startTime2 = System.nanoTime();
		Utilities.arrayRandomizer(quicksortArray, inputRandomNumber);
		qs.quickSort(quicksortArray, 0, qs.getArray().length - 1);
		Utilities.printArray(quicksortArray);
		long endTime2 = System.nanoTime();
		long totalTime2 = endTime2 - startTime2;
		System.out.println("Quicksort needs " + totalTime2 + " nanoseconds");

		Insertionsort is = new Insertionsort(insertionsortArray);
		long startTime3 = System.nanoTime();
		Utilities.arrayRandomizer(insertionsortArray, inputRandomNumber);
		is.insertionSort(insertionsortArray);
		Utilities.printArray(insertionsortArray);
		long endTime3 = System.nanoTime();
		long totalTime3 = endTime3 - startTime3;
		System.out.println("Insertiosort needs " + totalTime3 + " nanoseconds");
		
		
		//Bugs
//		long startTime4 = System.nanoTime();
//		Mergesort ms = new Mergesort(mergesortArray);
//		Utilities.arrayRandomizer(mergesortArray, inputRandomNumber);
//		ms.merge(mergesortArray, 0, inputRandomNumber /2 ,inputRandomNumber - 1);
//		ms.sort(mergesortArray, 0, inputRandomNumber - 1);
//		Utilities.printArray(mergesortArray);
//		Utilities.printArray(insertionsortArray);
//		long endTime4 = System.nanoTime();
//		long totalTime4 = endTime4 - startTime4;
//		System.out.println("Mergesort needs " + totalTime4 + " nanoseconds");
		

		System.out.println("\n");

		Runtime runtime = Runtime.getRuntime();
		System.out.println("max memory: " + runtime.maxMemory() / 1024 + " kibibytes");

		Runtime runtime2 = Runtime.getRuntime();
		System.out.println("allocated memory: " + runtime.totalMemory() / 1024 + " kibibytes");

		Runtime runtime3 = Runtime.getRuntime();
		System.out.println("free memory: " + runtime.freeMemory() / 1024 + " kibibytes");

	}

}
