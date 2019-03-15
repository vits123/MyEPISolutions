import java.util.*;
public class reverseBits {

	   public static void main(String[] args) {
	        Scanner s=new Scanner(System.in);
	        System.out.println("enter x:");
	        int x=s.nextInt();
	        int b=0;
	        while (x!=0){
	        	  b<<=1;
	        	  b|=( x &1);
	        	  x>>=1;
	        	}
	        System.out.println(b);
	    }
	}


