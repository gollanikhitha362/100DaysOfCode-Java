package com.techpalle;

public class RemoveDuplicatesInPlace {
	public static String removeDuplicateInPlace(String str) {
		char[] arr = str.toCharArray();
		int n = arr.length;
		if(n < 2)
			return str;
		
		int tail = 1;
		for(int i=1; i<n; i++) {
			int j = 0;
			for(j=0; j<tail; j++) {
				if(arr[i] == arr[j]) {
					break;
				}
			}
			if(j == tail) {
				arr[tail] = arr[i];
				tail++;
			}
		}
		return new String(arr, 0, tail);
	}
	public static void main(String[] args) {
		String s = "programming";
		System.out.println("Actual sting: "+s);
		System.out.println("After remove duplicates: "+removeDuplicateInPlace(s));
	}

}
