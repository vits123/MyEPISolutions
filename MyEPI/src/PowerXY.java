public class PowerXY {

  private static double computePower(double x, int y) {
    double result = 1.0;
    long power = y;
    if (y < 0) {
      x = 1.0 / x;
    }
    while (power != 0) {

      if ((power & 1) != 0) {
        result *= x;
      }
      x *= x;
      power >>>= 1;
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(computePower(2, 5));
  }
}