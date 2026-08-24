class Solution {
    public static int rotateDelete(int[] arr) {
        int sz = arr.length;
        java.util.List<Integer> list = new java.util.ArrayList<>();
        for (int num : arr) list.add(num);
        for (int k = 1; k <= sz / 2; k++) {
            int last = list.remove(list.size() - 1);
            list.add(0, last);
            int n = list.size();
            int indexToDelete = n - k; 
            list.remove(indexToDelete);
        }
        return list.get(0);
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        System.out.println(rotateDelete(arr1)); // Output: 3

        int[] arr2 = {1, 2, 3, 4};
        System.out.println(rotateDelete(arr2)); // Output: 2
    }
}
