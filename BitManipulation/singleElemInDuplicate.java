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

// HashMap


class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        int[] arr = {
            1,
            1,
            2,
            3,
            3,
            4,
            4,
            8,
            8
        };
        HashMap < Integer, Integer > map = new HashMap < > ();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        for (int key: map.keySet()) {


            if (map.get(key) == 1) {
                System.out.println(key + ":" + map.get(key));
            }
        }

    }
}