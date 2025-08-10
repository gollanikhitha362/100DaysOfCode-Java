package com.techpalle;

public class Day2MeargeSort {
	//divide array
	public static void mergeSort(int[] arr, int lb, int ub) {
		if(lb < ub) {
			int mid = (lb+ub)/2;
			mergeSort(arr, lb, mid);
			mergeSort(arr, mid+1, ub);
			merge(arr, lb, mid, ub);
		}
	}
	//merge two halves
	public static void merge(int[] arr, int lb, int mid, int ub) {
		int i = lb;
		int j=mid+1;
		int k=lb;
		int arr2[]=new int[arr.length];
		
		//merge two sorted subarrays
		while(i<=mid && j<=ub) {
			if(arr[i] <= arr[j]) {
				arr2[k] = arr[i];
				i++;
			}
			else {
				arr2[k]=arr[j];
				j++;
			}
			k++;
		}
		
		while (i <= mid) {
            arr2[k++] = arr[i++];
        }

        while (j <= ub) {
            arr2[k++] = arr[j++];
        }
        
		for(k=lb; k<=ub; k++) {
			arr[k]=arr2[k];
		}
	}
	public static void main(String[] args) {
		int[] arr= {15, 5, 24, 8, 1, 3, 16, 10, 20};
		
		System.out.println("Before Sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\nAfter Merge Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
	}

}
