package com.luan;

/**
 * Created by Administrator on 2018/1/27 0027.
 */
public class 二分查找 {
    public static int binSearch(int key,int []arr){
        int mid=arr.length/2;
        if (key<arr[mid]){
            return mid;
        }
        int low=0;
        int high=arr.length-1;
        while (low<=high){
            mid=(high-low)/2+low;
            if (key<arr[mid]){
                high=mid-1;
            }
            else if (key>arr[mid]){
                low=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    public static int binSearch(int arr[],int start,int end,int key){
        int mid=(end-start)/2+start;
        if (arr[mid]==key){
            return mid;
        }
        if (start>=end){
            return -1;
        }else if (key>arr[mid]){
            return binSearch(arr,mid+1,end,key);
        }else if (key<arr[mid]){
            return binSearch(arr,start,mid-1,key);
        }
        return -1;
    }
    public static void main(String[] args) {
        int srcArray[] = {3,5,11,17,21,23,28,30,32,50,64,78,81,95,101};
        System.out.println(binSearch(srcArray, 0, srcArray.length - 1, 81));
        System.out.println(binSearch(81,srcArray));
    }
}
