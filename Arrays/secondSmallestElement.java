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
