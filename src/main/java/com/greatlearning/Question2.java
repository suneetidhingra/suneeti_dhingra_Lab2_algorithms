package com.greatlearning;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Question2 {

    public static void run() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of currency denominations");
        int numDenominations = sc.nextInt();
        Integer[] denominations = new Integer[numDenominations];
        System.out.println("Enter the currency denominations value");
        for (int i = 0; i < numDenominations; ++i) {
            denominations[i] = sc.nextInt();
        }
        System.out.println("Enter the amount you want to pay");
        int value = sc.nextInt();

        System.out.println("\nYour payment approach in order to give min no of notes will be");
        printPaymentApproach(denominations, numDenominations, value);
    }

    private static void printPaymentApproach(Integer[] denominations, int n, int value) {

        Arrays.sort(denominations, Collections.reverseOrder());
        for (int i = 0; i < n; ++i) {
            if (denominations[i] > value) {
                continue;
            }
            System.out.println(denominations[i] + " : " + value/denominations[i]);
            value %= denominations[i];
        }
    }
}
