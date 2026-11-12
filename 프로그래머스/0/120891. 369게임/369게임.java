class Solution {
    public int solution(int order) {
        int count = 0;

        while (order > 0) {
            int digit = order % 10;

            if (digit == 3 || digit == 6 || digit == 9) {
                count++;
            }

            order /= 10;
        }

        return count;
    }
}