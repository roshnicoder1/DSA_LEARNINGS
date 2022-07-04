package com.roshni.Array;

public class PrintSubArrays {
	
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60};
		printSubarrays(arr);
	}

	private static void printSubarrays(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				//System.out.print("("+i+","+j+")");
				for(int k=i;k<=j;k++) {
					System.out.print(arr[k]+",");
				}
				System.out.println();
			}
			//System.out.println();
		}
		
	}

}
