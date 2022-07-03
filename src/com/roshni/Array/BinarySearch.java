package com.roshni.Array;

public class BinarySearch {
	
	public static void main(String[] args) {
		 BinarySearch ob = new BinarySearch();
	        int arr[] = { 2, 3, 4, 10, 40 };
	        int n = arr.length;
	        int x = 40;
	        int result = ob.binarySearch(arr, x);
	        if (result == -1)
	            System.out.println("Element not present");
	        else
	            System.out.println("Element found at "
	                               + "index " + result);
	    }

	private int binarySearch(int[] arr, int x) {
		// TODO Auto-generated method stub
		int l=0;
		int r=arr.length-1;
		while(l<=r) {
			int m= l+(r-l)/2;
			if(arr[m]==x) {
				return m;
			}
			else if(arr[m]>x) {
				r=m-1;
			}
			else {
				l=m+1;
			}
			
		}
		 // if we reach here, then element was
        // not present
		return -1;
	}
		
	


}
	
	


