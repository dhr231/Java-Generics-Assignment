package com.bridgelabz.assignment;
import java.util.*;
public class generics {
    public static int maximumInt(Integer n1,Integer n2, Integer n3){
        Integer max=n1;
        max=(n2.compareTo(max)==1) ? n2:max;
        max=(n3.compareTo(max)==1) ? n3:max;
        return max;

    }

    public static void main(String[] args) {
//        maximumInt(Integer n1, Integer n2, Integer n3);

        }

}
