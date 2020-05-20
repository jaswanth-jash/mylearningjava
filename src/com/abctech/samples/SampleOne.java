package com.abctech.samples;

public class SampleOne {
    void dog() {
        System.out.println("hello dog");
    }

    static void testOne() {
        System.out.println("testone already started ");

    }

    public static void main(String arg[]) {
        SampleOne sampleOne = new SampleOne();
        sampleOne.dog();
        SampleOne.testOne();
        System.out.println("hello world");
        System.out.println("good morning");

    }
}
