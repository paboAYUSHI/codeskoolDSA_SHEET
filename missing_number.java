//missingarray
//input= {1,2,3,5}
//output= 4
//another approach which could also be used was -> find out the ideal sum of the array using AP formula i.e., (n*(n+1))/2 and then subtracting this sum by the sum of the
//current given array
class Solution {
    int MissingNumber(int array[], int n) {
        int sum=0;
        for(int i=0;i<= array.length+1;i++){
            sum+=i;
        }
       // System.out.println("Ideal sum is "+sum);
        int fin=sum;
        for(int i=0;i< array.length;i++){
            fin=fin-array[i];
        }
        return fin;
    }
}