package de.tum.in.ase;

public final class Euclid {
    
    private Euclid() {
    }

    // Testing
    public static void main(String[] args) {
        // final int a = 320;
        // final int b = 160;
        // System.out.println(euclidAlgorithm(a, b));
    }

//TODO: Fix all code issues
    public static int euclidAlgorithm(int a, int b) {
        if (a == 0) {
            return b;
        } else {
            while (b != 0) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
            return a;
        }
    }
}
