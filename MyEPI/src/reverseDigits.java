public class reverseDigits {

  private static long reverse(int x)
  {
    int result=0;
    while(x!=0)
    {
      result= result*10 + (x%10);
      x /= 10;
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(reverse(-256));
  }

}
