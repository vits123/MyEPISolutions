// Greedy Algorithm for coins

public class MakingChange {

  public static int changeMaking(int cents){
    final int[] COINS={100,50,25,10,5,1};
    int numCoins=0;
    for(int i=0;i<COINS.length;i++){
      numCoins += cents / COINS[i];
      cents%=COINS[i];
    }
    return numCoins;
  }

  public static void main(String[] args) {
    System.out.println(changeMaking(150));
  }
}
