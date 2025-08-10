class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	     int m=10;
	     int n=20;
	     int mask=1;
	     int q;
	     int flips=0;
	   //  First perform XOR for m and n
	       q=m^n;
	   //  Then check for the set bits (Set bits == The number of flips required)
	     while(q!=0){
	         if((q&mask)==1){
	             flips++;
	         };
	         q=q>>1;
	     }
	     
	     System.out.println(flips);
	   
           
       
	}
}
