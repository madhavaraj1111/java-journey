import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
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
