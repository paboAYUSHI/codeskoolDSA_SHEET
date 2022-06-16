//wave array
//input= {1,2,3,4,5}
//output= {2,1,4,3,5}
class Solution {
    public static void convertToWave(int n, int[] a) {
       for(int i=0;i<=n-2;i+=2){
           if(a[i]<a[i+1]){
               int temp=a[i];
               a[i]=a[i+1];
               a[i+1]=temp;
           }
       }
    }
}
        
