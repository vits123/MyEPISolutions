public class ReverseStringWords {

  public static void reverseWords(char[] input) {
    int n = input.length;
    reverse(input, 0, n - 1);
    int start = 0, finish = 0;
    while (start < n) {
      while (start < finish || start < n && input[start] == ' ') {
        ++start;
      }
      while (finish < start || finish < n && input[finish] != ' ') {
        ++finish;
      }
      reverse(input, start, finish - 1);


    }


  }

  private static void reverse(char[] c, int start, int end) {
    while (start < end) {
      char tmp = c[start];
      c[start++] = c[end];
      c[end--] = tmp;
    }
    String text = String.copyValueOf(c);
    System.out.println("reverse is = "+text);

  }

  public static void main(String[] args) {
    ReverseStringWords o = new ReverseStringWords();
    String s = "Ram is costly";
    char[] ch = s.toCharArray();
    o.reverseWords(ch);
  }
}
