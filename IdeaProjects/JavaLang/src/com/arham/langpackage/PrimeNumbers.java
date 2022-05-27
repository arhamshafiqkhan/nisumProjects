package com.arham.langpackage;

public class PrimeNumbers {
    public static int primeNumbers (int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(isPrime(i))
                count++;
            continue;
        }
        return count;
    }

    public static boolean isPrime (int n) {
        boolean prime = true;
        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
