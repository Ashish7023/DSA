package sorting.sorting_2;

import java.util.*;

public class Merge {

	public static void merge(int[] arr, int low, int high, int mid) {

		// Crete a temp array with max length form low to high;
		int temp[] = new int[high - low + 1];
		/*
		 * Created a i,j,tempIndex.
		 * i = is to track form low to mid array side.
		 * j = is for track for mid+1 to high we called this part as right side.
		 * tempIndex = for to keep the track for temp array.
		 */
		int i, j, tempIndex = 0;

		i = low;
		j = mid + 1;
		tempIndex = 0;

		/*
		Now in this loop will run on the origin array and based on side (left, Right) and whoever is small will put into temp array.
		*/
		while (i <= mid && j <= high) {
			if (arr[i] <= arr[j]) {
				temp[tempIndex] = arr[i++];
			} else {
				temp[tempIndex] = arr[j++];
			}
			tempIndex++;
		}
		/*
		if all the elements on the right side is the smallest then we have to put the all remaining left side in the temp array.
		*/
		while (i <= mid) {
			temp[tempIndex] = arr[i];
			i++;
			tempIndex++;

		}

		/*
		if all the elements on the right side is the smallest then we have to put the all remaining left side in the temp array.
		*/
		while (j <= high) {
			temp[tempIndex] = arr[j];
			j++;
			tempIndex++;
		}
		//set the tempIndex = 0 why because now this is tell which elements is already pushed into real array.
		tempIndex = 0;

		for (int u = low; u <= high; u++) {
			arr[u] = temp[tempIndex++];
		}
	}

	public static void mergeSort(int[] arr, int low, int high) {

		// Base Condition When the low and high become same then will return
		if (low == high) {
			return;
		}

		// Find the mid using the low & high.
		int mid = low + ((high - low) / 2);

		mergeSort(arr, low, mid);

		mergeSort(arr, mid + 1, high);

		merge(arr, low, high, mid);

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter how many number you want to insert in array : ");

		int size = scan.nextInt();
		int[] array = new int[size];
		System.out.println("Start entering number the you want to insert :");

		// Taking the number and inserting inside the array.
		for (int i = 0; i < size; i++) {
			array[i] = scan.nextInt();
		}
		System.out.print("Original Array is : [");

		// Showing the origin array.
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + ",");
		}
		System.out.println("]");

		// Calling the Bubble Sort.
		mergeSort(array, 0, size - 1);

		// Print the sorted array.
		System.out.print("Sort Array is : [");
		for (int i : array) {
			System.out.print(i + ",");
		}
		System.out.println("]");
		scan.close();

	}
}
