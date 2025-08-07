package com.techpalle;

public class BubbleSort {
	public static void bubbleSort(int[] arr) {
		int n= arr.length;
		//outer loop-number of passes
		for(int i=0; i<n-1; i++) {
			//inner loop- compare and swap
			int flag=0;
			for(int j=0; j<n-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0) {
				break;
			}
		}
	}
	//method to display array
	public static void display(int[] arr) {
		for(int num:arr) {
			System.out.print(num+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[] = {16, 14, 5, 6, 8};
		
		System.out.println("Before Sorting: ");
		display(arr);
		
		bubbleSort(arr);
		
		System.out.println("After Sorting: ");
		display(arr);
	}

}
