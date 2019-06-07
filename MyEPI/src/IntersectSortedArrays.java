
// Intersection of 2 sorted arrays

import java.util.ArrayList;
import java.util.List;

public class IntersectSortedArrays {
  public static List<Integer> intersectTwoSortedArrays(List<Integer> A,List<Integer> B){
    List<Integer> intersectionAB=new ArrayList<>();
    for(int i=0;i<A.size();++i){
      if((i==0 || !A.get(i).equals(A.get(i-1))) && B.contains(A.get(i))){
        intersectionAB.add(A.get(i));
      }
    }
    return intersectionAB;
  }

  public static void main(String[] args) {
    List<Integer> A=new ArrayList<>();
    A.add(4);
    A.add(9);
    A.add(5);
    //A.add(1);

    List<Integer> B=new ArrayList<>();
    B.add(9);
    B.add(4);
    B.add(9);
    B.add(8);
    B.add(4);
    System.out.println(intersectTwoSortedArrays(A,B));
  }

}
