class Solution {
    public int reverse(int x) {
        if (x == 0) return 0;
        long result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
                return 0;
            x /= 10;
        }
        return (int) result;
    }
}