
/* Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack */
// Leetcode 28
public class strStr {

  public static int strStrSearch(String haystack, String needle) {
    for (int i = 0; ; i++) {
      for (int j = 0; ; j++) {

        // needle is empty
        if (j == needle.length()) {
          return i;
        }
        // needle is not present in haystack
        if (i + j == haystack.length()) {
          return -1;
        }
        if (needle.charAt(j) != haystack.charAt(i + j)) {
          break;
        }
      }
    }
  }

  public static void main(String[] args) {
    int result = strStrSearch("hello", "ll");
    System.out.println(result);
  }
}
