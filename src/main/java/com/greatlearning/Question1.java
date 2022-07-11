package com.greatlearning;

import java.util.Scanner;

public class Question1 {

    public static void run() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of transaction array");
        int numTransactions = sc.nextInt();
        int[] transactions = new int[numTransactions];
        System.out.println("Enter the values of array");
        for (int i = 0; i < numTransactions; ++i) {
            transactions[i] = sc.nextInt();
        }

        System.out.println("Enter the total no of targets that needs to be achieved");
        int numTargets = sc.nextInt();
        for (int i = 0; i < numTargets; ++i) {
            System.out.println("\nEnter the value of target");
            int target = sc.nextInt();
            int t = findNumberOfTransactions(transactions, target, numTransactions);
            if (t > 0) {
                System.out.println("Target achieved after " + t + " transactions");
            } else {
                System.out.println("Given target is not achieved");
            }
        }
    }

    private static int findNumberOfTransactions(int[] transactions, int target, int n) {

        int sum = 0;
        for (int i = 0; i < n; ++i) {
            sum += transactions[i];
            if (sum >= target) {
                return i + 1;
            }
        }
        return 0;
    }
}
