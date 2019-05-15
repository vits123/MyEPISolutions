import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchEntryEqualToIndex {

  public static int searchEntryEqualToItsIndex(List<Integer> A) {
    int left = 0, right = A.size() - 1;
    int mid = left + ((right - left) / 2);

    int diff = A.get(mid) - mid;

    if (diff == 0) {
      return mid;
    } else if (diff > 0) {
      right = mid - 1;
    } else {
      left = mid + 1;
    }

    return -1;
  }

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    List<Integer> A = new ArrayList<>();
    System.out.println("Enter list size");
    int size = s.nextInt();

    System.out.println("Enter list elements");
    for (int i = 0; i < size; i++) {
      A.add(s.nextInt());
    }

    System.out.println("Output: ");

    System.out.println(searchEntryEqualToItsIndex(A));
  }
}