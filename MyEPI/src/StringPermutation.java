import java.util.Arrays;

public class StringPermutation {

  public static boolean checkPermutation(String s1, String s2) {
    char[] c1 = s1.toCharArray();
    Arrays.sort(c1);

    s1=new String(c1);
    char[] c2 = s2.toCharArray();
    Arrays.sort(c2);
    s2=new String(c2);

    if (s1.equals(s2)) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    String a = "sagar", b = "vedant";
    System.out.println(checkPermutation(a, b));
  }
}
