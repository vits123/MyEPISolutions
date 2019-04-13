public class ReplaceAndRemove {

  public static int replaceAndRemove(int size, char[] s) {
    int writeIdx = 0, aCount = 0;
    for (int i = 0; i < size; ++i)      // Forward iteration to count a's and skips b's
    {
      if (s[i] != 'b') {
        s[writeIdx++] = s[i];
      }
      if (s[i] == 'a') {
        ++aCount;
      }
    }

    int curIdx = writeIdx - 1;
    writeIdx = writeIdx + aCount - 1;
    final int finalSize = writeIdx + 1;

    while (curIdx >= 0) {                //Backward loop to replace a's with d
      if (s[curIdx] == 'a') {
        s[writeIdx--] = 'd';
        s[writeIdx--] = 'd';
      } else {
        s[writeIdx--] = s[curIdx];
      }
      --curIdx;
    }

    return finalSize;
  }

  public static void main(String[] args) {


    char[] x = {'a','c','a','a','c','c','a'};

    int size = 3;
    System.out.println(replaceAndRemove(size, x));
  }


}
