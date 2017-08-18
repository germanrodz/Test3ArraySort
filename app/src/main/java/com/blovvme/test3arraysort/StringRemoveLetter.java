package com.blovvme.test3arraysort;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Blovvme on 8/18/17.
 */

public class StringRemoveLetter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word:");
        String string = null;

        string = scanner.nextLine();

        int length = string.length();

        Random rand = new Random();

        while (length > 140) {
            int characterposition = rand.nextInt(length);
            String word1 = string.substring(0, characterposition);
            String word2 = string.substring(characterposition + 1);

            string = word1 + word2;
            System.out.println("String : " + string);
            length = string.length();
        }
    }
}
