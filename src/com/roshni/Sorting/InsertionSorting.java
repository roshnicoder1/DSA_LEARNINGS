package com.roshni.Sorting;

public class InsertionSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = { 12, 11, 13, 5, 6 };
		  
		 InsertionSorting ob = new InsertionSorting();
	        ob.insertionSort(arr);
	  
	        printArray(arr);
	}

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		
		 int n = arr.length;
	        for (int i = 0; i < n; ++i)
	            System.out.print(arr[i] + " ");
	  
	        System.out.println();
		
	}

	private void insertionSort(int[] arr) {
		// TODO Auto-generated method stub
		int n=arr.length;
		for(int i=1;i<arr.length;i++) {
			int key=arr[i];
			int j=i-1;
			 /* Move elements of arr[0..i-1], that are
            greater than key, to one position ahead
            of their current position */
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
			
		}
		
	}

}
