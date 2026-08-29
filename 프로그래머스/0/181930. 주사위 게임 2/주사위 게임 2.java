class Solution {
    public int solution(int a, int b, int c) {
        int sum1 = a + b + c;

        if (a != b && b != c && a != c) {
            return sum1;
        }

        int sum2 = a * a + b * b + c * c;

        if (a == b && b == c) {
            int sum3 = a * a * a + b * b * b + c * c * c;
            return sum1 * sum2 * sum3;
        }

        return sum1 * sum2;
    }
}