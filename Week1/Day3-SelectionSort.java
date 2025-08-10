package com.techpalle;

public class SelectionSort {
	//method to perform selection sort
	public static void selectionSort(int[] arr) {
		int n = arr.length;
		
		//one by one move on unsorted array
		for(int i=0; i<n-1; i++) {
			int min = i;    //current element is minimum
			
			//find index of the min element in remaining array
			for(int j=i+1; j<n; j++) {
				if(arr[j] < arr[min]){
					min=j;
				}
			}
			if(min != i) {
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
	}
	//method to display array
	public static void display(int arr[]) {
		for(int num: arr) {
			System.out.print(num+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = {7, 4, 10, 8, 3, 1};
		
		System.out.println("Before Sorting:");
		display(arr);
		
		selectionSort(arr);
		
		System.out.println("After Selection Sort:");
		display(arr);

	}

}
