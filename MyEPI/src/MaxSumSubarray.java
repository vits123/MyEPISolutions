
//Finding maximum subarray sum using dynamic programming

import java.util.ArrayList;
import java.util.List;

public class MaxSumSubarray {

  public static int findMaximumSubarray(List<Integer> A){
    int maxEnd=0,maxSeen=0;

    for(int a:A){
      maxEnd=Math.max(a,a+maxEnd);
      maxSeen = Math.max(maxEnd,maxSeen);
    }
    return maxSeen;
  }

  public static void main(String[] args) {
    List<Integer> A=new ArrayList<>();
    A.add(904);
    A.add(40);
    A.add(523);
    A.add(12);
    A.add(-335);
    A.add(-385);
    A.add(-124);
    A.add(481);
    A.add(-31);

    System.out.println(findMaximumSubarray(A));

  }
}
