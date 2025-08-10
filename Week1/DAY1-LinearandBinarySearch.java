package com.palletech;
import java.util.Arrays;
import java.util.Scanner;

public class LinearandBinarySearch {
	//logic for Linear search
	public static int linearSearch(int[] arr, int index, int target) {
		if(index >= arr.length) {
			return -1;
		}
		if(arr[index] == target) {
			return index;
		}
		return linearSearch(arr, index+1, target);
	}
	
	//logic for Binary search(for sorted array)
	public static int binarySearch(int arr[], int low, int high, int target) {
		if(low > high) {
			return -1;
		}
		int mid= (low+high)/2;
		if(arr[mid] == target) {
			return mid;
		}
		else if (target < arr[mid]) {
			return binarySearch(arr, low, mid-1, target);
		}
		else {
			return binarySearch(arr, mid+1, high, target);
		}
	}
	
	//Main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//array size and elements
		System.out.println("Enter the number of elements: ");
		int n= sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter array elements: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		//for target element
		System.out.println("Enter the element to search");
		int target = sc.nextInt();
		
		//Linear search
		int linearResult = linearSearch(arr, 0, target);
		if(linearResult == -1) {
			System.out.println("Linear Search: Element not found.");
		}
		else {
			System.out.println("Linear Search: Element found at index "+linearResult);
		}
		
		//sort the arr for binary search
		Arrays.sort(arr);
		
		//Binary Search
		int binaryResult = binarySearch(arr, 0, n-1, target);
		if(binaryResult == -1) {
			System.out.println("Binary Search: Element not found.");
		}
		else {
			System.out.println("Binary Search: Element found at index "+binaryResult);
		}
	}
}
