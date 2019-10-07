import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicate {

  public static void main(String[] args) {
    int[] arr = {1, 4, 7, 4, 1, 9, 3, 9, 5, 5, 2, 2};

    int end = arr.length;
    Set<Integer> set = new HashSet<Integer>();

    for (int i = 0; i < end; i++) {
      set.add(arr[i]);
    }

    Iterator it = set.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }

  }
}
