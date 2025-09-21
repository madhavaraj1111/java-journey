class Codechef
{
    public static void main(String[] args)
    {
        int n = 5604;
        countZeros(n, 0);
    }

    static void countZeros(int n, int count) {
        if (n == 0) {
            System.out.println(count);
            return;
        }
        int rem = n % 10;
        if (rem == 0) {
            count++;
        }

        countZeros(n / 10, count);
    }
}