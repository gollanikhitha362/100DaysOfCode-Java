package com.techpalle;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		int[] arr = {12, 45, 7, 32, 89, 45, 89, 2};
		
		int first = arr[0];
		int second = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > first) {
				second=first;
				first=arr[i];
			}
			else if (arr[i] > second && arr[i] != first) {
				second=arr[i];
			}
		}
		System.out.println("Second Largest: "+second);
	}
}
