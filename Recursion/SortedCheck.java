import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        int arr[] = {
            1,
            3,
            2,
            4,
            5,
            6,
            7
        };

        if (sortedOrNot(arr, 0)) {
            System.out.println("Sorted");
        }
        else {
            System.out.println("Not sorted");
        }
    }

    static boolean sortedOrNot(int[] arr, int i) {
        if (i < arr.length - 1) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }

            return sortedOrNot(arr, i + 1);
        }

        return true;

    }
}