//input= 4
//output= 2
//input= 8
//output= 2
class Solution {
    public int mySqrt(int x) {
        if(x<2){
                return x;
            }
        int l=2;
        int r=x/2; 
        int ans=0;
        long num;
        while(l<=r){
            
            int mid=l+(r-l)/2;
            num = (long)mid * mid;
            if(num>x){
                r=mid-1;
            }
            if(num<=x){
                ans=mid;
                l=mid+1;
            }
        }
        return r;
    }
}