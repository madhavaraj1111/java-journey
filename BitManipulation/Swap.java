public class Swap{
    	public static void main (String[] args)
	{
	    int a=2,b=1;
		swap(a,b);
	}
	
	static void swap(int a, int b){
	    a=a+b;
	    b=a-b;
	    a=a-b;
	    System.out.println(a);
	    System.out.println(b);
	}
}