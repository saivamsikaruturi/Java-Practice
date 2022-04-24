package com.vamsi.javaPractice.DataStructures;

import java.util.Arrays;

public class BinarySerach {
    public static int binarySearchIterative(int[] sortedArray, int key)
    {
        int leftIdx = 0;
        int rightIdx = sortedArray.length - 1;
        while(leftIdx <= rightIdx)
        {
            int midIdx = leftIdx + (rightIdx - leftIdx) / 2;
            if(sortedArray[midIdx] == key)
                return midIdx;
            else if(sortedArray[midIdx] > key)
            {
                rightIdx = midIdx - 1;//left half of the array(from leftIdx to midIdx - 1)
            }
            else
                leftIdx = midIdx + 1;//right half of the array(from midIdx + 1 to rightIdx)
        }
        return -1;//if key is absent
    }
    public static void main(String[] args)
    {
        int[] sortedArray = {5, 7, 15, 20, 110, 120, 139, 500};
        int key1 = 139;
        int key2 = 2;
        System.out.println("The sorted list is: " + Arrays.toString(sortedArray));
        System.out.println("The key " + key1 + " is present at index " + binarySearchIterative(sortedArray, key1));
        System.out.println("The key " + key2 + " is present at index " + binarySearchIterative(sortedArray, key2));
    }
}
