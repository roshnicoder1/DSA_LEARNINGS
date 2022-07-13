package com.roshni.Array;

public class KadanesSubArraySumLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int arr[] = {-2,3,4,-1,5,-12,6,1,3};
		     
	      //  System.out.println(largestSubarraySum1(arr));
	        System.out.println(largestSubarraySumKadanes(arr));
	}

	private static int largestSubarraySumKadanes(int[] arr) {
		// TODO Auto-generated method stub
		int maxSum=Integer.MIN_VALUE;
        int cs=0;

        for(int i=0;i<arr.length;i++){
             cs=cs+arr[i];
          
              maxSum=Math.max(cs,maxSum);
            
            if(cs<0 ){
                cs=0;
            }
           
          
           
            
        }
        
        return maxSum;
	}

}
