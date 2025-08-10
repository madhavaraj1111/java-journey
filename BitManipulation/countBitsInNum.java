class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	     int n = 5;
	     int mask =1;
	     int count=0;
	     while(n!=0){
	         if((n&mask)==1){
	             count++;
	         }
	         n=n>>1;
	     }
	     System.out.println(count);
           
       
	}
}
