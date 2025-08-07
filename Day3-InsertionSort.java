package com.techpalle;

public class InsertionSort {
	//method to perform insertion sort
	public static void insertionSort(int[] arr) {
		int n=arr.length;
		
		for(int i=1; i<n; i++) {
			int temp=arr[i];       //cuurrent element to be stoored
			int j = i-1;
			
			//move elements of arr[0,..i-1], that are > temp,
			//to one position ahead of their current position
			while(j >=0 && arr[j]>temp) {
				arr[j+1]=arr[j];           //shift larger element to right
				j--;
			}
			//insert temp at current position
			arr[j+1]=temp;
		}
	}
	
	//method to display the array
	public static void display(int[] arr) {
		for(int num: arr) {
			System.out.print(num+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = {5, 4, 10, 1, 6, 2};
		
		System.out.println("Before Sorting: ");
		display(arr);
		
		insertionSort(arr);
		
		System.out.println("After Insersion Sort: ");
		display(arr);
	}

}
