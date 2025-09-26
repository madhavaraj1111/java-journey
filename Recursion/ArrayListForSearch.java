import java.util.ArrayList;
class Codechef
{
    public static void main(String[] args)
    {
        int arr[] = {
            6,
            4,
            6,
            8,
            4
        };
        System.out.println(findIndex(arr, 6, 0));
    }

    static ArrayList < Integer > findIndex(int[] arr, int target, int i) {
        ArrayList < Integer > list = new ArrayList < > ();

        // base condition
        if (i == arr.length) {
            return list;
        }

        // adding target to the list if matched
        if (arr[i] == target) {
            list.add(i);
        }

        // Past values coming 
        ArrayList < Integer > ans = findIndex(arr, target, i + 1);
        // Adding current list value and the past
        list.addAll(ans);
        return list;

    }
}