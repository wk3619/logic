package com.kat.lcs;

import sun.tools.jconsole.MaximizableInternalFrame;

/**
 * LCS for input Sequences “ABCDGH” and “AEDFHR” is “ADH” of length 3.
 * LCS for input Sequences “AGGTAB” and “GXTXAYB” is “GTAB” of length 4.
 */
public class lcs {
    public static void main(String[] args) {

        lcs lcs = new lcs();
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        char[] X=s1.toCharArray();
        char[] Y=s2.toCharArray();
        int m = X.length;
        int n = Y.length;

        System.out.println("Length of LCS is" + " " +
                lcs._lcs( X, Y, m, n ) );
    }

    static int _lcs(char X[], char Y[], int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }
        if (X[m-1]==Y[n-1]){
            return 1+_lcs(X,Y,m-1,n-1);
        }else {
            return Math.max(_lcs(X,Y,m,n-1),_lcs(X,Y,m-1,n));
        }
    }

}
