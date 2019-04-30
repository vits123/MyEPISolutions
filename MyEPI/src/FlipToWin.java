import java.util.ArrayList;

public class FlipToWin {

  public static int longestSequence(int n){
    if(n==-1)
      return Integer.BYTES * 8;
    ArrayList<Integer> sequences=getAlternatingSequences(n);
    return findLongestSequence(sequences);
  }

  private static int findLongestSequence(ArrayList<Integer> seq) {
    int maxSeq=1;
    for(int i=0;i<seq.size();i+=2){
      int zeroSeq=seq.get(i);
      int oneSeqRight = i-1 >= 0 ? seq.get(i-1):0;
      int oneSeqLeft = i+1 < seq.size()?seq.get(i+1):0;

      int thisSeq=0;
      if(zeroSeq==1){
        thisSeq=oneSeqLeft+1+oneSeqRight;
      }if(zeroSeq > 1){
        thisSeq=1+Math.max(oneSeqRight,oneSeqLeft);
      }else if(zeroSeq==0){
        thisSeq=Math.max(oneSeqRight,oneSeqLeft);
      }
      maxSeq=Math.max(thisSeq,maxSeq);
    }
    return maxSeq;
  }

  private static ArrayList<Integer> getAlternatingSequences(int n) {
    ArrayList<Integer> sequences=new ArrayList<Integer>();
    int searchingFor=0;
    int counter=0;

    for(int i=0;i<Integer.BYTES*8;i++){
      if((n&1)!=searchingFor){
        sequences.add(counter);
        searchingFor=n&1;
        counter=0;
      }
      counter++;
      n>>>=1;
    }
    sequences.add(counter);
    return sequences;

  }

  public static void main(String[] args) {
    System.out.println(longestSequence(1775)); // 11011101111
  }

}
