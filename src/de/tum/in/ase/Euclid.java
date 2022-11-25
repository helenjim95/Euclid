package de.tum.in.ase;

import java.util.Random;

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
public static int euclidAlgorithm(int a ,  int B){

        var x = 77;

        if (0 == a) return B;

        else {
            while(B != 0) {
                if (a>B) { a = a - B; }
                else {
                    B = B -a;  }
                }

            return 0 ;
    }}}