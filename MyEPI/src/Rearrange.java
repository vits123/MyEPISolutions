import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Rearrange {


  public static void rearrangeArray(List<Integer> A) {
    for (int i = 1; i < A.size(); ++i) {
      if ((i % 2) == 0 && A.get(i - 1) < A.get(i) || (i % 2) != 0 && A.get(i - 1) > A.get(i)) {
        Collections.swap(A, i - 1, i);
      }
    }
    System.out.println(A);
  }

  public static void main(String[] args) {
    List<Integer> l = new ArrayList<>();
    l.add(2);
    l.add(4);
    l.add(1);
    l.add(0);
    l.add(15);
    l.add(40);
    Rearrange r = new Rearrange();
    r.rearrangeArray(l);

  }

}
