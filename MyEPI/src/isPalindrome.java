

// Checks whether number is palindrome or not

public class isPalindrome {

  private static boolean isNumberPalindrome(int x) {
    if (x <= 0) {
      return x == 0;
    }

    final int numDigits = (int) (Math.floor(Math.log10(x))) + 1;
    int msd = (int) Math.pow(10, numDigits - 1);

    for (int i = 0; i < (numDigits / 2); ++i) {
      if (x / msd != x % 10) {
        return false;
      }

      x %= msd;   //Extracting MSB
      x /= 10;    // Extracting LSB
      msd /= 100;
    }
    return true;

  }

  public static void main(String[] args) {
    System.out.println(isNumberPalindrome(100));  // return false
  }

}

