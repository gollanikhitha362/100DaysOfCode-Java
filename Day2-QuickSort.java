package com.techpalle;

public class Day2QuickSort {
	//divide into partitions
	public static int partition(int[] arr, int lb, int ub) {
		int pivot=arr[lb];
		int start=lb;
		int end=ub;
		
		while(start < end) {
			while(start <= ub && arr[start] <= pivot) {
				start++;
			}
			while(arr[end] > pivot) {
				end--;
			}
			
			//swap arr[start] and arr[end
			if(start < end) {
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
			}
		}
		//swap pivot with arr[end]
		int temp=arr[lb];
		arr[lb]=arr[end];
		arr[end]=temp;
		return end;
	}
	
	//recursive quick sort
	public static void quickSort(int[] arr, int lb, int ub) {
		if(lb < ub) {
			int loc = partition(arr, lb, ub);
			quickSort(arr, lb, loc-1);
			quickSort(arr, loc+1, ub);
		}
	}

	public static void main(String[] args) {
		int[] arr = {7, 6, 10, 5, 9, 2, 1, 15, 7};
		
		System.out.println("Before Sorting:");
        for (int n : arr) {
            System.out.print(n + " ");
        }

        quickSort(arr, 0, arr.length-1);

        System.out.println("\nAfter Quick Sort:");
        for (int n : arr) {
            System.out.print(n + " ");
        }

	}

}
