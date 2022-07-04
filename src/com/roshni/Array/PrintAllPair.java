package com.roshni.Array;

public class PrintAllPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50,60};
		printAllPairs(arr);

	}

	private static void printAllPairs(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				System.out.println(arr[i]+","+arr[j]);
			}
		}
		
	}

}
