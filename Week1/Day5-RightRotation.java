package com.techpalle;

import java.util.Scanner;

public class RightRotation {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Rotations: ");
		int n = sc.nextInt();
		
		int len = arr.length;
		
		//perform n right rotations
		for(int i=0; i<n; i++) {
			int last=arr[len-1];
			for(int j=len-1; j>0; j--) {
				arr[j]=arr[j-1];
			}
			arr[0] = last;
		}
		//print rotated array
		for(int num: arr) {
			System.out.print(num+" ");
		}
	}
}
