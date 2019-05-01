/*Pascal Triangle
  Since each element take O(1) time to compute time complexity is
  O(1+2+3+.....+n)=O(n(n+1)/2)= O(n**2)

  Space Complexity- O(n**2)

*/

import java.util.ArrayList;
import java.util.List;

public class PascalTraingle {

  public static List<List<Integer>> generatePascalTriangle(int numRows) {
    List<List<Integer>> pascalTriangle = new ArrayList<>();
    for (int i = 0; i < numRows; ++i) {
      List<Integer> curRow = new ArrayList<>();
      for (int j = 0; j <= i; ++j) {           // Every curRow's 1st to ith entry is calculated by adding previous row's j-1 & jth entry
        curRow.add(
            (0 < j && j < i) ? pascalTriangle.get(i - 1).get(j - 1) + pascalTriangle.get(i - 1)
                .get(j) : 1);
      }
      pascalTriangle.add(curRow);   // Every row is added to main arraylist-> pascalTriangle<>
    }
    return pascalTriangle;
  }

  public static void main(String[] args) {
    System.out.println(generatePascalTriangle(5));
  }
}
