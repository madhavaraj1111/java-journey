import java.util.*;
import java.lang.*;
import java.io.*;

class smallElement
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int [] array= {10,25,32,12,39};
		
		getMin(array);
	}
	static void getMin(int[]arr){
	    
	    int min=arr[0];
	    for(int i=1;i<arr.length;i++){
	        if(arr[i]<min){
	            min=arr[i];
	        }
	    }
	    System.out.println("The minimum value in the array is "+min);
	}
}
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int [] array= {10,25,32,12,39};
		
        getMin(array);
	}
	static void getMin(int[]arr){
	    
	    int min=arr[0];
	    for(int i=1;i<arr.length;i++){
	        if(arr[i]<min){
	            min=arr[i];
	        }
	    }
	    System.out.println("The minimum value in the array is "+min);
	}
}

// Built in Methods Approach

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
