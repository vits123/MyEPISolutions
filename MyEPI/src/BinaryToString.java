import java.util.Scanner;

public class BinaryToString {

  public static String printBinary(double num) {      //input should be between 0 & 1
    if (num >= 1 || num <= 0) {
      return "ERROR";
    }

    StringBuilder binary = new StringBuilder();
    binary.append(".");
    while (num > 0) {
      if (binary.length() >= 32) {
        return "ERROR";
      }

      double r = num * 2;                      // if r >=1 appending 1 after "." else 0
      if (r >= 1) {
        binary.append(1);
        num = r - 1;
      } else {
        binary.append(0);
        num = r;
      }

    }

    return binary.toString();
  }

  public static void main(String[] args) {
    Scanner s1 = new Scanner(System.in);
    System.out.println("Enter float value between 0 & 1");
    double a = s1.nextDouble();
    System.out.println(printBinary(a));
  }


}
