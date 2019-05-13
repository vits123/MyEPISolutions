import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchFirstKey {

  public static int searchFirstOfK(List<Integer> A, int k) {
    int left = 0, right = A.size() - 1, result = -1;
    while (left <= right) {
      int mid = left + ((right - left) / 2);

      if (A.get(mid) > k) {
        right = mid - 1;
      } else if (A.get(mid) == k) {
        // Array is sorted so even if duplicate entries are there further entries can't be first occurence of k
        result = mid;
        right = mid - 1;
      } else {
        left = mid + 1;
      }


    }
    return result;
  }

  public static void main(String[] args) {
    List<Integer> A = new ArrayList<Integer>();
    Scanner s = new Scanner(System.in);

    System.out.println("Enter size");
    int n = s.nextInt();

    System.out.println("Enter list elements");
    while (A.size() != n) {

      A.add(s.nextInt());
    }

    System.out.println("Enter key to search");
    int k = s.nextInt();

    System.out.println(searchFirstOfK(A, k));
  }

}
