package com.roshni.Array;

/* Reverse Array with space complexity O(1)
 * 
 * 
 */
public class ReverseArray {
	
	public static void main(String[] args) {
	    int arr[] = {10,20,30,45,60,80,90};
        int n = arr.length;
        //Print the Output
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();


        reverseArray(arr,n);

        //Print the Output
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();

		
	}

	private static void reverseArray(int[] arr, int n) {
		// TODO Auto-generated method stub
		int l=0;
		int r=arr.length-1;
		while(l<=r) {
			arr[l]=arr[l]+arr[r];
			arr[r]=arr[l]-arr[r];
			arr[l]=arr[l]-arr[r];
			l+=1;
			r-=1;
		}
		
		
	}
	

}
