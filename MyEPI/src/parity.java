import java.io.*;
public class parity {
	
	
	public static short Parity(long x)
	{
		short res=0;
		while(x!=0)
		{
			res ^= (x&1);
			x >>>= 1;
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(Parity(60));

	}

}
