package com.mtestproject.java;

import java.util.ArrayList;

public class BinarySearch {

    int binarySearch(ArrayList<Integer> arr, int l, int r, int x){
        if(r>=1){
            int mid=(l+(r-1)/2);
            // If the element is present at the
            // middle itself
            if (arr.get(mid) == x)
                return mid;
            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr.get(mid) > x)
                return binarySearch(arr, l, mid - 1, x);
            else
                //// Else the element can only be present
                //            // in right subarray
                return binarySearch(arr,mid+1,r, x);
        }

        return -1;
    }
}
