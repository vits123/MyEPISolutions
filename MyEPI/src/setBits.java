
public class setBits {

	public static int countBits(int x) {
	    int count = 0;
	    while(x > 0)
	    {
	      x = x&(x-1);
	      count++;
	    }
	     return count;
	  }
	public static void main(String[] args) {
		System.out.println(countBits(4));

	}

}
