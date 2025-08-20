import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 
	 System.out.println(power(2,-3));	
       
	}
	
	static double power(long x,long n){
	    
	    if(n!=0){
	       return 1.0/(x)*power(x,n+1); 
	    }
	    else{
	        return 1;
	    }
	}
}
