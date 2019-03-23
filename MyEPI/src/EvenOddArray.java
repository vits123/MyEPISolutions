import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EvenOddArray {

  private static List<Integer> evenOdd(List<Integer> A) {
    int nextEven = 0, nextOdd = A.size() - 1;
    while (nextEven < nextOdd) {
      if (A.get(nextEven) % 2 == 0) {
        nextEven++;
      } else {
        Collections.swap(A, nextEven, nextOdd--);
      }
    }
    //System.out.println(A);
    return  A;
  }

  public static void main(String[] args) {
    List<Integer> a = new ArrayList<>(7);
    a.add(2);
    a.add(5);
    a.add(3);
    a.add(4);
    a.add(6);
    a.add(7);
    a.add(10);
    System.out.println(evenOdd(a));
  }
}
