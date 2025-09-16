class Solution {
    public List<List<Integer>> permute(int[] nums) {
        return permutation(nums, 0);
    }

    static List<List<Integer>> permutation(int[] arr, int fixedIndex) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        if (fixedIndex == arr.length - 1) {
            ArrayList<Integer> single = new ArrayList<>();
            for (int elem : arr) {
                single.add(elem);
            }
            list.add(single);
            return list;
        } else {
            for (int i = fixedIndex; i < arr.length; i++) {
                swap(arr, fixedIndex, i);
                list.addAll(permutation(arr, fixedIndex + 1));
                swap(arr, fixedIndex, i);
            }
        }
        return list;
    }

    static void swap(int[] arr, int fixedIndex, int i) {
        int temp = arr[i];
        arr[i] = arr[fixedIndex];
        arr[fixedIndex] = temp;
    }
}