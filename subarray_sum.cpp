//subArrays Sum
//input= {1,2,3,7,5} sum=12
//from 2nd position tom 4th
    class Solution
    {
        public:
        //Function to find a continuous sub-array which adds up to a given number.
        vector<int> subarraySum(int arr[], int n, long long s)
        {
            int ptr1=0,ptr2=0;
            long long sum=arr[0];
            if(sum==s){
                return {1,1};
            }
            while(ptr2<n-1){
                if(sum+arr[ptr2+1]<=s){
                    sum=sum+arr[ptr2+1];
                    ptr2++;
                }
                else{
                    sum=sum-arr[ptr1];
                    ptr1++;
                }
                if(sum==s){
                    return {ptr1+1,ptr2+1};
                }
            }
            return {-1};
        }
    };
    
