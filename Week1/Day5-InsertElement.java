package com.techpalle;

import java.util.Scanner;

public class InsertElement {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n+1];
		//input elements
		System.out.println("Enter "+n+" elements:");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		//input element and index
		System.out.print("Enter element to insert: ");
		int x = sc.nextInt();
		System.out.print("Enter ondex to insert at: ");
		int y =sc.nextInt();
		
		//shift elements to right from index y
		for(int i=n; i>y; i--) {
			arr[i] = arr[i-1];
		}
		arr[y] = x;
		
		System.out.println("Array after insertion:");
		for(int i=0; i<n+1; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
