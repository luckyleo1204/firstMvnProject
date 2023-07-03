package com.mtestproject.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class patternExample {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("i", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("publicis sapient");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }

}
