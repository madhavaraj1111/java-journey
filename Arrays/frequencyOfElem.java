// Mine approach to find frequency of elements in an array
// This code sorts the array and counts the frequency of each element

import java.util.Arrays;
public class frequencyOfElem{

	public static void main (String[] args)
	{
		int[]arr={5,8,5,7,8,10};
		frequency(arr);
	}
	static void frequency(int[]arr){
	    Arrays.sort(arr);
	    for(int i=0;i<arr.length;i++){
	        int count=1;
	        while((i<arr.length-1)&&(arr[i]==arr[i+1])){
	            count++;
	            i++;
	        }
	        
	        System.out.println(arr[i]+":"+count);
	        
	    }
	}

}


//Lazy delay + Sorted , frequency of elements in an array
// Time Complexity: O(n log n) due to sorting
import java.util.Arrays;
class Codechef
{
	public static void main (String[] args)
	{
      int[]arr={2,3,5,3,2,3,2,4};
      frequency(arr);
	}
	static void frequency(int[]arr){
	         Arrays.sort(arr);
	     for(int i=0;i<arr.length;i++){
	         int count=1;
	         while(i<arr.length-1&&(arr[i]==arr[i+1])){
	             count++;
	             i++;
	         }
	         System.out.println(arr[i]+":"+count);
	     }
	}
}