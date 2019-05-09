package com.pk.leetcode;

public class _189_RotateArray {

    //Rotate using temp array, O(n) time and space
    public static void rotate(int[] nums, int k) {
        if (nums.length == 0 || k == 0)
            return;

        k = k % nums.length;
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
            result[(i + k) % nums.length] = nums[i];

        System.arraycopy(result, 0, nums, 0, nums.length);
    }

    //Rotate cyclic.
    //Particularly handle cases like: nums: [1, 2, 3, 4, 5, 6] k: 2
    //Here we first swap 1, 3, 5 and 1 again but we skip 2,4 and 6 in the first do/while loop.
    public static void rotateCyclic(int[] nums, int k) {
        if (nums.length == 0 || k == 0)
            return;

        k = k % nums.length;
        int count = 0;
        for (int start = 0; count < nums.length; start++) {
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (start != current);
        }
    }

    //Reverse all the array
    //Reverse 0 to k-1 and k to nums.lenght - 1
    public static void rotateReverse(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    private static void swap(int[] nums, int from, int to) {
        int tmp = nums[to];
        nums[to] = nums[from];
        nums[from] = tmp;
    }
}
