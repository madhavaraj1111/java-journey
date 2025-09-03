import java.util.Arrays;
class Codechef {
    public static void main(String[] args) {
        int[] arr = {
          5,7,10,12
        };
        int pi = 20;
        Arrays.sort(arr);
        System.out.println(chefRes(arr, pi));
    }
    static int chefRes(int[] arr, int k) {
        int i = 0;
        int j = 1;
        int ans = -1;
        while (i < arr.length && j < arr.length) {
            if ((k >= arr[i]) && (k < arr[j])) {
                ans = 0;
                return ans;
            } else if (k < arr[i] && k < arr[j]) {
                return arr[i] - k;
            }
            i += 2;
            j += 2;
        }
        return ans;
    }
}