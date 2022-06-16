//kadane's algorithm
//time complexity= O(n)
//used to find the largest sum out of all the subarrays in a given array
//input= {1,2,3,-2,5}
//output= 9
    class Solution{
    
        // arr: input array
        // n: size of array
        //Function to find the sum of contiguous subarray with maximum sum.
        long maxSubarraySum(int arr[], int n){
            
            int max=arr[0];
            int curr_max=0;
            for(int i=0;i<n;i++){
                curr_max=Math.max(arr[i],curr_max+arr[i]);
                max=Math.max(curr_max,max);
            }
            return max;
            
        }
        
    }
    
    
