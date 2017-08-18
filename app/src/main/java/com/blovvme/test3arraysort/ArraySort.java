package com.blovvme.test3arraysort;

import java.util.Scanner;

/**
 * Created by Blovvme on 8/18/17.
 */

public class ArraySort {

    public static void main(String[] args) {

     int num,temp;
        //Input: {2,8,9,3,4,3,2,6,6,2,4,9,8}
        //Output: {2,2,2,3,3,4,4,6,6,8,8,9,9}

        System.out.println("Enter array size:");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        int a[] = new int[num];

        System.out.println("Enter the numbers: ");
        for (int i = 0; i < num; i++)
        {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < num; i++)
        {
            for (int j = i + 1; j < num; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Ascending order");
        for (int i = 0; i < num - 1; i++)
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[num - 1]);

    }
}//
