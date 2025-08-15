package com.techpalle;

public class RemoveDuplicateCharWithSB {
	public static String removeDuplicateWithSB(String str) {
		StringBuilder sb = new StringBuilder();
		boolean[] visited = new boolean[256];
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(!visited[ch]) {
				visited[ch] = true;
				sb.append(ch);
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String s = "programming";
		System.out.println("Actual String: "+s);
		System.out.println("After removing duplicates: "+removeDuplicateWithSB(s));
	}

}
