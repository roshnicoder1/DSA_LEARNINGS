package com.roshni.Array;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2, 3, 4, 10, 40 };
		int element=3;
		int result=linearSearch(arr,element);
		if (result == -1)
	            System.out.print("Element is not present in array");
	    else
	            System.out.print("Element is present at index "+ result);

	}

	private static int linearSearch(int[] arr, int element) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) {
				return i;
			}
			
		}
		return -1;
	}

}
