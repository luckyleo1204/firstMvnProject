package com.mtestproject.java;

public class aaabbccadbba {

    public static void main(String[] args) {
        String s="aaabbccadbba ";
        char[] s1=s.toCharArray();
        String finalString="";
        int count=1;
        for(int i=0;i<s1.length-1;i++){
            if(s1[i]==s1[i+1]){
                count++;
            }else{
                System.out.print(finalString+s1[i]+count+"\t");
                count=1;
            }
        }

    }
}
