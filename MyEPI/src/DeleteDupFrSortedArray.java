import java.util.ArrayList;
import java.util.List;

public class DeleteDupFrSortedArray {

  public static int deleteDuplicate(List<Integer> A) {
    if (A.isEmpty()) {
      return 0;
    }
    //Main Logic

    int index = 1;
    for (int i = 1; i < A.size(); ++i) {
      if (!A.get(index - 1).equals(A.get(i))) {
        A.set(index++, A.get(i));
      }
    }

    return index;
  }


  public static void main(String[] args) {
    List<Integer> a=new ArrayList<>();
    a.add(3);
    a.add(5);
    a.add(10);
    a.add(10);
    a.add(40);
    a.add(70);
    System.out.println(deleteDuplicate(a));
  }
}
