package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class polymorphism_demo {public static void main(String[] args) {
    int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };
    int n=3;
    transpose(matrix,n);
}
    public static void transpose(int[][] matrix,int n) {
        int temp[][]=new int[n][n];
        int rows = n;
        int columns = n;
        for (int i = n-1; i >=0; i--) {
            for (int j = 0; j < columns; j++) {
                temp[i][j]=matrix[j][n-1-i];
            }
        }
        printMatrix(temp);
    }
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}





