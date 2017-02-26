package com.theironyard.novauc;

/**
 * Created by octavio on 2/23/17.
 */


//Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.
//
//        seeColor("redxx") → "red"
//        seeColor("xxred") → ""
//        seeColor("blueTimes") → "blue"


public class String1 {

    public String seeColor(String str) {
        if(str.length()<3) return "";
        else {
            if(str.length()==3) {
                if(str.substring(0,3).equals("red")) return "red";
                else return "";
            }
            else {
                if(str.substring(0,3).equals("red")) return "red";
                if(str.substring(0,4).equals("blue")) return "blue";
                return "";
            }
        }
    }
}
