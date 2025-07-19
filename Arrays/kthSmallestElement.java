import java.util.Arrays;
public class kthSmallestElement {
    
	public static void main (String[] args)
	{
	   int[]arr={1,2,3,4,5};
	   int k=4;
	   kthSmallest(arr,k);
	}
	
	static void kthSmallest(int[]arr,int k){
	    Arrays.sort(arr);
	    int i;
	    int count=0;
	    for(i=0;i<arr.length;i++){
	        
	        while(i<arr.length-1&&(arr[i]==arr[i+1])){
	            i++;
	        }
	        count++;
	        if(k==count){
	            break;
	        }
	    }
	    System.out.println(arr[i]);
	}
}

