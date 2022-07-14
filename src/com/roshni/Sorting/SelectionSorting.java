package com.roshni.Sorting;

public class SelectionSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelectionSorting ob = new SelectionSorting();
	     int arr[] = { 64, 34, 25, 12, 22, 11, 90,2 };
	     ob.selectionSort(arr);
	     System.out.println("Sorted array");
	     ob.printArray(arr);
	}

	private void printArray(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
		
	}

	private void selectionSort(int[] arr) {
		// TODO Auto-generated method stub
		
		int n=arr.length;
		for(int i=0;i<n;i++) {
			int minIndex=i;
			 // Find the minimum element in unsorted array
			for(int j=i+1;j<n;j++) {
				if (arr[j]<arr[minIndex]) {
					minIndex=j;
				}
			}
			//Swap minIndex with arr[i]
			int temp;
			temp=arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
		}
	}

}
