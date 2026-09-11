import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dice = {a, b, c, d};
        Arrays.sort(dice);

        int x = dice[0];
        int y = dice[1];
        int z = dice[2];
        int w = dice[3];

        if (x == w) {
            return 1111 * x;
        }

        if (x == z) {
            int score = 10 * x + w;
            return score * score;
        }

        if (y == w) {
            int score = 10 * y + x;
            return score * score;
        }

        if (x == y && z == w) {
            return (x + z) * Math.abs(x - z);
        }

        if (x == y) {
            return z * w;
        }

        if (y == z) {
            return x * w;
        }

        if (z == w) {
            return x * y;
        }

        return x;
    }
}