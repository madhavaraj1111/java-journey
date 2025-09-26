class Codechef
{
    public static void main(String[] args)
    {
        int[] arr = {
            23,
            56,
            78,
            12,
            48,
            87,
            6,
            4,
            54
        };
        System.out.println(linearSearch(arr, 54, 0));
    }

    static int linearSearch(int[] arr, int target, int i) {
        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == target) {
            return i;
        }

        return linearSearch(arr, target,i+1);
    }
}