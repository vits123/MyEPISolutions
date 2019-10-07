import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PangramCheck {

  static char[] ALPHABET="abcde".toCharArray();
      static int count=ALPHABET.length;

  public static boolean isPangramWithStreams(String str) {
    if (str == null) {
      return false;
    }
    String strUpper = str.toUpperCase();

    Stream<Character> filteredCharStream = strUpper.chars()
        .filter(item -> ((item >= 'A' && item <= 'Z')))
        .mapToObj(c -> (char) c);

    Map<Character,Boolean> alphabetMap=filteredCharStream
        .collect(Collectors.toMap(item->item, k->Boolean.TRUE,(p1,p2)->p1));

    return alphabetMap.size()==count;


  }

  public static void main(String[] args) {
    System.out.println(isPangramWithStreams("abcde"));
  }
}
