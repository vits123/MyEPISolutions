public class TowerofHanoi {

  int noOfRings;
  public TowerofHanoi(int i)
  {
    this.noOfRings=i;
    getSolve(noOfRings,"A","C","B");
  }


  private void getSolve(int noOfRings, String A, String C, String B) {
    if(noOfRings==1)
    {
      System.out.println("Move from tower " + A + " to tower " +C);
      return;
    }
    getSolve(noOfRings-1, A, B, C);         //recursive call to getSolve()
    System.out.println("Move from tower "+ A +" to tower " +C);
    getSolve(noOfRings-1, B, C, A);
  }


  public static void main(String[] args) {
    TowerofHanoi th=new TowerofHanoi(2);

  }

}

