package com.mtestproject.java;

public class noOfOccurance {
    public static void main(String[] args) {
        String s="aaaabbccabaac";
        String s1=s+ " ";
        String finalStr=" ";
        char[] c=s1.toCharArray();
        int count=1;

        for(int i=0;i<c.length-1;i++){
            if(c[i]==c[i+1]){
                count++;
             }else{
                System.out.print(finalStr=c[i]+":"+count+"\t");
                count=1;
            }
        }
    }
}
