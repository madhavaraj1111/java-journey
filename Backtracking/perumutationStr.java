class Codechef
{
    public static void main(String[] args)
    {
        String a = "AA";
        permute(a, 0, 1);
    }

    static void permute(String a, int left, int right) {
        if (left == right) {
            System.out.println(a);
        }
        else {
            for (int i = left; i <= right; i++) {
                String b = swap(a, left, i);
                permute(b, left + 1, right);
                
            }
        }

    }

    static String swap(String a, int m, int n) {
        char[] arr = a.toCharArray();
        char temp = arr[m];
        arr[m] = arr[n];
        arr[n] = temp;
        return new String(arr);
    }
}