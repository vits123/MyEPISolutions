import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class FirstMissingPositiveEntry {

  public static int findFirstMissingPositive(List<Integer> A) {
    for (int i = 0; i < A.size(); ++i) {
      while (0 < A.get(i) && A.get(i) <= A.size() && !A.get(A.get(i) - 1).equals(A.get(i))) {
        Collections.swap(A, i, A.get(i) - 1);
      }
    }

    return IntStream.range(0, A.size()).filter(i -> A.get(i) != i + 1).findFirst().orElse(A.size())
        + 1;

  }

  public static void main(String[] args) {
    List<Integer> l=new ArrayList<>();
    l.add(3);
    l.add(4);
    l.add(1);
    l.add(2);
    System.out.println(findFirstMissingPositive(l));
  }
}
// Output : 5