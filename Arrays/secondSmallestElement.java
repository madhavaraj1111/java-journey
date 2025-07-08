// One For loop with conditions

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] numArray={2,3,1,4,5};
		findSecondSmallest(numArray);
 
	}
	
	static void findSecondSmallest(int[] arr){
	    if(arr.length<2){
	        System.out.println("Only one Array Element found");
	        return;
	    }
	    
	    int smallest = Integer.MAX_VALUE;
	    int secSmallest=Integer.MAX_VALUE;
	    
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]<smallest&&arr[i]!=smallest){
	            secSmallest=smallest;
	            smallest=arr[i];
	        }
	        
	        else if(arr[i]>smallest&&arr[i]<secSmallest){
	            secSmallest=arr[i];
	        }
	        
	    }
	   // Edge case [10,10] so then second small would remain MAX integer so here by the condition.
	   
	   if(secSmallest==Integer.MAX_VALUE){
	       System.out.println("There is no second smallest element");
	   }
	   else{
	       System.out.println(secSmallest);
	   }
	    
	}
}


// Two loops 

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] numArray={17,27,18,-2,28,-3};
		findSecondSmallest(numArray);
 
	}
	
	static void findSecondSmallest(int[] arr){
	    int smallest = Integer.MAX_VALUE;
	    
	    if(arr.length<2){
	        System.out.println("Only one element in the array");
	        return;
	    }
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]<smallest){
	            smallest=arr[i];
	        }
	    }
	    
	    int secSmallest=Integer.MAX_VALUE;
	    
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]!=smallest&&arr[i]<secSmallest){
	            secSmallest=arr[i];
	        }
	    }
	    
	    System.out.println(secSmallest);
	}
}
