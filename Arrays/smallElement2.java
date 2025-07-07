import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Integer [] arr={-7,1,-3,-10};
	    getMin(arr);
 
	}
	
	static void getMin(Integer[] arr){
	    List<Integer> list=Arrays.asList(arr);
	    int min=Collections.min(list);
	    System.out.println(min);
	}
}
