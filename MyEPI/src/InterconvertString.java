// Program that interconvert string and int

public class InterconvertString {

  public static String intToString(int x) {
    boolean isNeg = false;

    if (x < 0) {
      isNeg = true;
    }
    StringBuilder s = new StringBuilder();
    do {

      s.append((char) ('0' + Math.abs(x % 10)));
      x /= 10;
    } while (x != 0);
    return s.append(isNeg ? "-" : "").reverse().toString();

  }

  public static int strToInt(String s)
  {
    return (s.charAt(0)=='-' ? -1 : 1) * s.substring(s.charAt(0) == '-' ? 1 : 0).chars().
        reduce(0,(runningSum,c)-> runningSum*10+c-'0'); //'0' is an Ascii code used to retrive individual string char while moving forward
  }

  public static void main(String[] args) {
    String a1="4567";
    int a2= 491;
    System.out.println(strToInt(a1));
    System.out.println(intToString(a2));
  }


}



