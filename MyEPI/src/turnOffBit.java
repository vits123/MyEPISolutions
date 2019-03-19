public class turnOffBit {

  private static int turnOffKBit(int n, int k) {
    if (k <= 0) {
      return n;
    }
    return n & ~(1 << (k - 1));
  }

  public static void main(String[] args) {
    System.out.println(turnOffKBit(3, 4));
  }
}
