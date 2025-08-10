package com.techpalle;

import java.util.Scanner;

public class LeftRotation {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Rotations: ");
		int n = sc.nextInt();
		
		int len = arr.length;
		
		//perform n left rotations
		for(int i=0; i<n; i++) {
			int first=arr[0];
			for(int j=0; j<len-1; j++) {
				arr[j]=arr[j+1];
			}
			arr[len-1] = first;
		}
		//print rotated array
		for(int num: arr) {
			System.out.print(num+" ");
		}

	}

}
