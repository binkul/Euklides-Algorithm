package com.kodilla.euklides;

public class EuklidesAlgorithm {

    public static final Integer subAlgorithm(int a, int b) {

        Integer result;

        if ( a == 0 && b == 0) {
            result = null;
        } else if (a == 0 || b == 0) {
            result = Integer.valueOf(a + b);
        } else {
            while (a != b) {
                if (a > b) {
                    a -= b;
                } else {
                    b -= a;
                }
            }
            result = Integer.valueOf(a);
        }
        return result;
    }

    public static final Integer modAlgorithm(int a, int b) {
        int tmp;
        Integer result;

        if ( a == 0 && b == 0) {
            result = null;
        } else if (a == 0 || b == 0) {
            result = Integer.valueOf(a + b);
        } else {
            while (b != 0) {
                tmp = a % b;
                a = b;
                b = tmp;
            }
            result = Integer.valueOf(a);
        }
        return result;
    }
}
