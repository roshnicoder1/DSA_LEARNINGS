package com.roshni.Array;

/*
 * Find largest value of sum of subarray out of all subarrays  {-2,3,4,-1,5,-12,6,1,3} ans is 11

 */
public class SubArraySumBruteForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Array Containing
        int arr[] = {-2,3,4,-1,5,-12,6,1,3};
     
      //  System.out.println(largestSubarraySum1(arr));
        System.out.println(largestSubarraySum2(arr));

	}

	//O(N^3)
	private static int largestSubarraySum2(int[] arr) {
		// TODO Auto-generated method stub
		int largest=0;
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr.length;j++) {
				int subarraySum=0;
				for(int k=i;k<=j;k++) {
					//System.out.print(arr[k]+",");
					subarraySum=subarraySum+arr[k];
				}
				//System.out.println();
				largest=max(largest,subarraySum);
				//System.out.println(largest);
			}
		}
		return largest;
	}

    private static int max(int a, int b) {
		// TODO Auto-generated method stub
    	//System.out.println(a+"and "+b);
    	if(a>=b) {
    		return a;
    	}
    	
		return b;
	}

	// Prefix Sum Approach O(N^2)
	private static int largestSubarraySum1(int[] arr) {
		// TODO Auto-generated method stub
		int largest=0;
		return largest;
	}

}
