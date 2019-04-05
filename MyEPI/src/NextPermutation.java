import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NextPermutation {

  public static List<Integer> nextPermutation(List<Integer> perm)
  {
    int inversionPoint=perm.size()-2;
    while(inversionPoint >=0 && perm.get(inversionPoint) >= perm.get(inversionPoint+1))
    {
      --inversionPoint;
    }
    if(inversionPoint== -1)
    {
      return Collections.emptyList();
    }
    for(int i=perm.size()-1; i> inversionPoint;--i)
    {
      if(perm.get(i)> perm.get(inversionPoint))
      {
        Collections.swap(perm,inversionPoint,i);
        break;
      }
    }

    Collections.reverse(perm.subList(inversionPoint+1,perm.size()));
    return  perm;
  }

  public static void main(String[] args) {
    List<Integer> p= new ArrayList<Integer>();
    p.add(1);
    p.add(0);
    p.add(3);
    p.add(2);
    System.out.println(nextPermutation(p));

  }


}
