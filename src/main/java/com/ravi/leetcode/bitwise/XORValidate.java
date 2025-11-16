package com.ravi.leetcode.bitwise;

public class XORValidate {
        // Function to find the XOR of
        // all elements in the array
        static int xorOfArray(int arr[], int n)
        {
            // Resultant variable
            int xor_arr = 0;

            // Iterating through every element in
            // the array
            for (int i = 0; i < n; i++) {

                // Find XOR with the result
                xor_arr = xor_arr | arr[i];
            }

            // Return the XOR
            return xor_arr;
        }

        // Driver Code
        public static void main (String[] args)
        {

            int arr[] = { 3, 9, 12, 13, 15, 13 };
            // int arr[] = { 1,2,3,1 };
            // int arr[] = { 1,2,3,4 };
            // int arr[] = { 1,1,1,3,3,4,3,2,4,2 };

            int n = arr.length;

            // Function call
            System.out.println(xorOfArray(arr, n));

        }
    }

