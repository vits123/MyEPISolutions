
public class PrimitiveMultiply {
	
	public static long mult(long x,long y)
	{
		long sum=0;
		while(x!= 0)
		{
			if((x & 1)!= 0)
			{
				sum = add(sum,y);
			}
			x >>=1;
			y <<=1;
				
		}
		return sum;
	}
	
	private static long add(long a, long b)
	{
		while(b != 0)
		{
			long carry = a & b;
			a = a ^ b;
			b = carry << 1;
		}
		return a;
	}
	

	public static void main(String[] args) {
		System.out.println(mult(10,10));
		
	}

}
