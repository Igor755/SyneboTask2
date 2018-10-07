package com.company;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


        System.out.println("Please enter n in the limit (1 ≤ n ≤ 2000), n must be an integer");
        Scanner scan = new Scanner(System.in);


        try {

            int n = scan.nextInt();

            String fact = factorial (n);
            if (n >= 1 && n <= 2000) {

                System.out.println("Factorial " + n + " = " + fact);
            } else {
                System.out.println("n value not entered correctly");
            }

        }catch (InputMismatchException e){
            System.out.println("You did not enter an integer");
        }




    }

    public static String factorial(int k) {

        BigInteger fact = new BigInteger("1");

        for (int i = 1; i <= k; i++) {
            fact = fact.multiply(new BigInteger(i + ""));

        }
        return fact.toString();

    }
}