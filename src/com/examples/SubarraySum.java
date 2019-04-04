package com.examples;

public class SubarraySum {

    public int totalSum(int a[], int start, int end){
        int sum = 0;
        for(int i = start; i < end; i++){
            sum += a[i];
        }

        return sum;
    }

    public int sumofSubArray(int a[], int target){
        int i = 0;
        int j = a.length;
        int start = 0;

        int sum = 0;

        //for( int i = 0; i < )
        while( i < j){

            //sum += a[i];

            sum = totalSum(a, i, j);
            System.out.println("start at: "+i +" & end:  " +j+" sum"+sum);

            if(sum < target){
                i++;
            }else if(sum > target){
                start++;
                i = start;
                //System.out.println("start "+ start+ " & end "+j);
            }else if(sum == target){
                System.out.println("start "+ start+ " & end "+j);
                break;
            }
        }
        return 0;
    }

    public static void main(String args[]){

        int arr [] = {12,2,4,8,9,5,10,23};
        SubarraySum subarraySum = new SubarraySum();
        subarraySum.sumofSubArray(arr, 23);
    }

}
