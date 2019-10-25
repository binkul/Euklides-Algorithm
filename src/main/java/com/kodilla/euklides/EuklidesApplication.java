package com.kodilla.euklides;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EuklidesApplication {

    private static void runSubAlgorithm(int a, int b) {
        Integer tmpGCD = EuklidesAlgorithm.subAlgorithm(a, b);

        if (tmpGCD != null) {
            System.out.format("The GCD for %d and %d is: %d\n", a, b, tmpGCD);
        } else {
            System.out.println("The GCD for 0 and 0 is undetermined");
        }
    }

    private static void runModAlgorithm(int a, int b) {
        Integer tmpGCD = EuklidesAlgorithm.modAlgorithm(a, b);

        if (tmpGCD != null) {
            System.out.format("The GCD for %d and %d is: %d\n", a, b, tmpGCD);
        } else {
            System.out.println("The GCD for 0 and 0 is undetermined");
        }
    }

    public static void main(String[] args) {
        runSubAlgorithm(1024, 64);
        runSubAlgorithm(230, 529);
        runModAlgorithm(462, 1071);
        runModAlgorithm(27462169, 16933);
        runModAlgorithm(5, 0);
        runModAlgorithm(0, 0);
        runSubAlgorithm(0, 0);
    }

}
