package com.mtestproject.java;

public class bubbleSort {
    public static void main(String[] args) {
        int[] a={11,22,1,3,55,4,32,2,6};
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
                System.out.print(a[j+1]+"\t");

            }
            System.out.println();
        }
        for(int i : a)
            System.out.print(i+"\t");
    }
}
