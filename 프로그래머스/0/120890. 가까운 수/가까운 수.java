import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        return Arrays.stream(array)
                     .boxed()
                     .min((a, b) -> {
                         int diffA = Math.abs(a - n);
                         int diffB = Math.abs(b - n);

                         if (diffA != diffB) {
                             return Integer.compare(diffA, diffB);
                         }
                         return Integer.compare(a, b);
                     })
                     .orElseThrow();
    }
}