import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagrams {

  public static List<List<String>> findAnagrams(List<String> dictionary) {
    Map<String, List<String>> sortedStringToAnagrams = new HashMap<>();

    for (String s : dictionary) {
      String sortedStr = Stream.of(s.split("")).sorted().collect(Collectors.joining());
      sortedStringToAnagrams.putIfAbsent(sortedStr, new ArrayList<String>());
      sortedStringToAnagrams.get(sortedStr).add(s);
    }

    return sortedStringToAnagrams.values().stream().filter(group -> group.size() >= 2).collect(
        Collectors.toList());
  }

  public static void main(String[] args) {
    List<String> an1=new ArrayList<>();
    an1.add("debitcard");
    an1.add("elvis");
    an1.add("silent");
    an1.add("badcredit");
    an1.add("lives");
    an1.add("freedom");
    an1.add("listen");
    an1.add("levis");
    an1.add("money");

    System.out.println(findAnagrams(an1));
  }
}
