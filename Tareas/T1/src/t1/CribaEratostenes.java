/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1;

/**
 *
 * @author TOSHIBA
 */
class CribaEratostenes {

    void cribadeEratostenes(int n) {
        // Create a bolean matrix  "primeNumber[0..n]" end initialize all the entries with true.
        // the value in primeNumber[i] will be finally false if  i is not a primeNumber (if is not true).
        boolean primeNumber[] = new boolean[n + 1];
        for (int i = 0; i < n; i++) {
            primeNumber[i] = true;
        }
        for (int p = 2; p * p <= n; p++) {
            // if the primeNumber[p] not change, then is primeNumber
            if (primeNumber[p] == true) {
                //this part update all the number multiple of p
                for (int i = p * 2; i <= n; i += p) {
                    primeNumber[i] = false;
                }
            }
        }
        // this part update the all the prime numbers
        for (int i = 2; i <= n; i++) {
            if (primeNumber[i] == true) {
                System.out.print(i + " ");
            }
        }
    }

}
