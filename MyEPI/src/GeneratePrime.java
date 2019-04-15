//Enumerate all primes to n

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GeneratePrime {

  public static List<Integer> generatePrimes(int n) {
    List<Integer> primes = new ArrayList<>();
    List<Boolean> isPrime = new ArrayList<>(Collections.nCopies(n + 1, true));
    isPrime.set(0, false);
    isPrime.set(1, false);

    for (int p = 2; p <= n; ++p) {
      if (isPrime.get(p)) {
        primes.add(p);

        for (int i = p * 2; i <= n; i += p) {
          isPrime.set(i, false);
        }


      }
    }
    return primes;
  }

  public static void main(String[] args) {
    System.out.println(generatePrimes(7));
  }
}
