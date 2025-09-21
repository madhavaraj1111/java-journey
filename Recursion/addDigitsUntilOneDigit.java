class Codechef
{
	public static void main (String[] args)
	{
		int n = 12;
		addDigits(n);
	}
	static void addDigits(int n){
	    int digit=(int)(Math.log10(n)+1);
	    System.out.println(helper(n,digit));
	}
	
	static int helper(int n,int digit){
	    if(digit<=1){
	        return n;
	    }
	    
	    int sumDigit=sum(n,0);
	    int newDigit=(int)(Math.log10(sumDigit)+1);
	    System.out.println(newDigit);
	    return helper(sumDigit,newDigit);
	}
	
	static int sum(int n,int sum){
	    if(n==0){
	        return sum;
	    }
	    sum=sum+(n%10);
	    return sum(n/10,sum);
	}
}