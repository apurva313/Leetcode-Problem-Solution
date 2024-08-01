class Solution {
    public boolean isHappy(int n) {
        int p = squaredSum(n);
        int q = squaredSum(squaredSum(n));

        while (p != q) {
        p = squaredSum(p);
        q = squaredSum(squaredSum(q));
        }

        return p == 1;
  }

        private int squaredSum(int n) {
            int sum = 0;
            while (n > 0) {
                sum += Math.pow(n % 10, 2);
                n /= 10;
            }
            return sum;
    }
}