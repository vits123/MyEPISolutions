import java.util.ArrayList;
import java.util.List;

public class IntAsArrayIncrement {

  public static List<Integer> plusOne(List<Integer> A) {
    int n = A.size() - 1;
    A.set(n, A.get(n) + 1);
    for (int i = n; i > 0 && A.get(i) == 10; --i) {
      A.set(i, 0);
      A.set(i - 1, A.get(i - 1) + 1);
    }

    if (A.get(0) == 10) {
      A.set(0, 1);
      A.add(0);
    }
    return A;
  }

  public static void main(String[] args) {
    List<Integer> li = new ArrayList<Integer>();
    li.add(1);
    li.add(2);
    li.add(9);

    System.out.println(plusOne(li));
  }
}
