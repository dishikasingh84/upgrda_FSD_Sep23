package com.company;
import java.util.*;
class Main {

	public static void main(String[] args) {

       Main m=new Main();

       Scanner sc=new Scanner(System.in);
       System.out.println("Enter num");
       int n=sc.nextInt();
       if(m.palindrome(n))
           System.out.println( n +" "+"is PALINDROME");
       else
           System.out.print("Not Palindrome");




    }
    public boolean palindrome(int n)
    {
        String s= Integer.toString(n);
        char[]c= s.toCharArray();
        int l=c.length;
        for(int i=0;i<l/2;i++)
        {
            if(c[i]!=c[l-i-1])
                return false;
        }


        return true;
    }


}
