package com.kodilla.euklides;

public class EuklidesAlgorithm {

    public static final Integer subAlgorithm(int a, int b) {

        if ( a == 0 && b == 0) {
            return null;
        }

        if (a == 0 || b == 0) {
            return a + b;
        }

        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }

        return a;
    }

    public static final Integer modAlgorithm(int a, int b) {
        int tmp;

        if ( a == 0 && b == 0) {
            return null;
        }

        if (a == 0 || b == 0) {
            return a + b;
        }

        while (b != 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }

        return a;
    }
}
