package com.company2;
import java.io.IOException;
import java.util.*;



class OOPSExamples {

    public void isCharPresent(String a[],char c) {

        for (int i = 0; i < a.length; i++) {
            char[] arr= a[i].toCharArray();
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]==c){
                    System.out.println(a[i]);
                    break;
                    }




            }

        }

    }

    public static void main(String[] args) {
        OOPSExamples obj = new OOPSExamples();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements in array");
        int n = sc.nextInt();
        System.out.println("enter the char to be found");
        char c=sc.next().charAt(0);
        String arr[] = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element value : ");
            arr[i] = sc.next();
        }
         obj.isCharPresent(arr,c);



    }
}