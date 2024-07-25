class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;

        for (int num : nums)
        if (num != val)
            nums[i++] = num;

        return i;
    }
}