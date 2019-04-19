// Substring match using Rabin Carp algorithm

public class SubstringMatch {

  public static int rabinKarp(String t, String s) {
    if (s.length() > t.length()) {             //if substring. length > original given string
      return -1;
    }
    final int BASE = 26;
    int tHash = 0, sHash = 0;
    int powerS = 1;

    for (int i = 0; i < s.length(); i++) {
      powerS = i > 0 ? powerS * BASE : 1;
      tHash = tHash * BASE + t.charAt(i);      // Calculating hash codes using hash function
      sHash = sHash * BASE + s.charAt(i);
    }
    for (int i = s.length(); i < t.length(); i++) {
      if (tHash == sHash && t.substring(i - s.length(), i).equals(s)) {
        return i - s.length();
      }
      tHash -= t.charAt(i - s.length()) * powerS;
      tHash = tHash * BASE + t.charAt(i);

      if (tHash == sHash && t.substring(t.length() - s.length()).equals(s)) { //if hash codes matches returns starting index where match happen
        return t.length() - s.length();
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    System.out.println(rabinKarp("GACGCCA","CGC"));
  }
}
