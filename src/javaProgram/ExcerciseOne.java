//Write a Java program to reverse an array of integer values.
//Created by Raj Anilkumar on 07/11/2020

package javaProgram;

public class ExcerciseOne {

        public static void main(String[] args) {
            //Initialize array
            int [] arr = new int [] {1, 2, 3, 4, 5};
            System.out.println("Original array: ");
            //using for loop having initialization, condition and increment
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            System.out.println("Array in reverse order: ");

            //using for loop having initialization, condition and decrement in order to achieve reverse order
            for (int i = arr.length-1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
        }
    }

