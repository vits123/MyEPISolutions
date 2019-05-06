/*
* @author- Vedant Rahane
* Look and Say Sequence
* Time Complexity- O(n2**n)

*/

public class LookAndSay {

  public static String lookAndSay(int n){
    String s="1";
    for(int i=1;i<n;++i){
      s=nextNumber(s);
    }
    return s;
  }

  private static String nextNumber(String s) {  // Calculating the next string in sequence
    StringBuilder res=new StringBuilder();
    for(int i=0;i<s.length();++i){
      int count=1;
      while(i+1 < s.length() && s.charAt(i)==s.charAt(i+1)){
        ++i;
        ++count;
      }
    res.append(count).append(s.charAt(i));

    }
    return res.toString();
  }

  public static void main(String[] args) {
    System.out.println(lookAndSay(5));
  }

}
