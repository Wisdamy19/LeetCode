package LeetArraysQuestions;

import java.util.Arrays;
import java.util.Scanner;
//88. Merge Sorted Array

public class MergeSortedArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of first array: ");
        int length = scan.nextInt();
        int [] nums = new int[length];

        System.out.println("Enter the length of second array: ");
        int length2 = scan.nextInt();
        int [] nums2 = new int[length2];
        for (int i = 0; i < length; i++){
            System.out.println("Enter the numbers of first array: ");
            nums[i] = scan.nextInt();
        }
        System.out.println();
        for (int i = 0; i < length2; i++){
            System.out.println("Enter the numbers of second array: ");
            nums2[i] = scan.nextInt();
        }

        int [] mergedArray = new int [length + length2];
        System.arraycopy(nums, 0, mergedArray, 0, length);
        System.arraycopy(nums2, 0, mergedArray, length, length2);
        Arrays.sort(mergedArray);

        System.out.println("Total Array: ");
        for (int num : mergedArray){
            System.out.println(num + " ");
        }
    }
}
