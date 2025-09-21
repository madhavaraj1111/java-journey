import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   
	  
	   System.out.println(sumOfDigits(1324));

	}
	
	static int sumOfDigits(int n){
	    if(n==0){
	        return 0;
	    }
	    
	    return (n%10)+sumOfDigits(n/10);
	}
}
