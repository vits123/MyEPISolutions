public class Binary {

  private static void intToBinary(int n) {
    if (n > 1) {
      intToBinary(n / 2);    //Recursive Function
    }
    System.out.print( n % 2);

  }

  public static void main(String[] args) {
    intToBinary(15);
  }

}
