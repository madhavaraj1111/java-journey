class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int []arr={1,1,2,3,3,4,4,8,8};
		int sum=0;
		for(int i=0;i<arr.length;i++){
		    sum=sum^arr[i];
		}
		System.out.println(sum);

	}
}
