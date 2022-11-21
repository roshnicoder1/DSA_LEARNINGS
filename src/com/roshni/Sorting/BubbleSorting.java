package com.roshni.Sorting;

public class BubbleSorting {
	
public static void main(String[] args) {
	BubbleSorting ob = new BubbleSorting();
     int arr[] = { 64, 34, 25, 12, 22, 11, 90,2 };
     ob.bubbleSort(arr);
     System.out.println("Sorted array");
     ob.printArray(arr);
     
     //Best case when it's already sorted 0(n)
     int arr1[] = { 2,11,12,22,25,34,64 };
     ob.optimizedBubbleSort(arr1);
     System.out.println(" Optimized Sorted array");
     ob.printArray(arr1);
}

private void optimizedBubbleSort(int[] arr) {
	// TODO Auto-generated method stub
	int n=arr.length;
	boolean flag=false;
	for(int i=0;i<n-1;i++) {
		for(int j=0;j<n-i-1;j++) {
			if(arr[j]>arr[j+1]) {
				int temp;
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				flag=true;
				System.out.println("\n inside swap");
				
			}
			
		} //end of inner for loop
		//if we find no swapping in 1st iteration i.e i=0 then we exit coz array will be already sorted.
		if(flag==false) {
				break;
		}
	}
}

private void printArray(int[] arr) {
	// TODO Auto-generated method stub
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+",");
	}
	
}

private void bubbleSort(int[] arr) {
	// TODO Auto-generated method stub
	int n=arr.length;
	for(int i=0;i<n-1;i++) {
		for(int j=0;j<n-i-1;j++) {
			if(arr[j]>arr[j+1]) {
				int temp;
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				
			}
		}
		
	}
	
}

}
