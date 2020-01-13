package com.java;

import com.kotlin.AddTwoNumKt;

public class SubTwoNum {
    public static void main(String args[])
    {
        int val = AddTwoNumKt.add(2,3);
        System.out.println("Total is " +val);
    }

    public static int sub(int a, int b)
    {
        return a-b;
    }
}
