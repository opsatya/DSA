package com.webvitels;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];

        Scanner input = new Scanner(System.in);
        for (int i = 0 ;i<arr.length; i++){
            System.out.println("enter the number");
            input.nextInt(arr[i]);
        }
        for (int i = 0 ;i<arr.length ;i++){
            System.out.println("printing the number");
            System.out.println(arr[i]);
        }
    }
}