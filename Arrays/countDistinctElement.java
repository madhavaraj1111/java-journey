import java.util.*;
import java.lang.*;
import java.io.*;

class countDistinctElement
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] arr={5,8,5,8,7,10};
		countDistinctElements(arr);
	}
	
	static void countDistinctElements(int[] arr){
	    if(arr.length==0){
	        System.out.println("Array is empty");
	        return;
	    }
	    
	    Set<Integer> distinctElements = new HashSet<>();
	    for(int num : arr){
	        distinctElements.add(num);
	    }
	    
	    System.out.println("Count of distinct elements: " + distinctElements.size());
	}
}
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[]arr={5,8,5,8,7,10};
		countDisElem(arr);

	}
	
	static void countDisElem(int[]arr){
	    int[]visited=new int[arr.length];
	    int countDis=0;
	    for(int i=0;i<arr.length;i++){
	        if(visited[i]==0){
	            for(int j=i+1;j<arr.length;j++){
	                if(arr[i]==arr[j]){
	                    visited[j]=1;
	                }
	            }
	            countDis++;
	        }
	    }
	    System.out.println(countDis);
	    System.out.println(Arrays.toString(visited));
	}
}


// lazy-delay -->Until we find the last possible element that will be distinct one

class Codechef
{
	public static void main (String[] args)
	{
		int[]arr={5,8,5,8,7,10,5};
		findDisElemCount(arr);
	}
	static void findDisElemCount(int[]arr){
	    int count=0;
	    for(int i=0;i<arr.length;i++){
	        int flag=0;
	        for(int j=i+1;j<arr.length;j++){
	            if(arr[i]==arr[j]){
	                flag=1;
	            }
	        }
	        
	        if(flag==0){
	            count++;
	        }
	    }
	    System.out.println(count);
	}
	
}

// lazy delay method But with sorted Array

import java.util.Arrays;
class Codechef
{
	public static void main (String[] args)
	{
		int[] myArray={5,8,6,8,7,4,6,4,7,-4};
		 countDisElem(myArray);
	}
	static void countDisElem(int[]arr){
	    Arrays.sort(arr);
	    int count=0;
	    for(int i=0;i<arr.length;i++){
	        while((i<arr.length-1)&&(arr[i]==arr[i+1])){
	            i++;
	        }
	        
	            count++;
	    }
	    System.out.println(count);
	    
	}
}