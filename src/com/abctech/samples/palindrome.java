package com.abctech.samples;

public class palindrome {
    public static void main(String[] args) {
        System.out.println("enter the string");
        String s= scan.nextLine();
        s=s.trim();
        for(int i=s.length()-1;i>=0;i--){
            res +=s.charAt(i);
        }
        if(res.equals(s))
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");
    }
}
