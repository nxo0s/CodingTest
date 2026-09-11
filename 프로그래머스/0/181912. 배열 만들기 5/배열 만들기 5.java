import java.util.Arrays;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = new int[intStrs.length];
        int count = 0;

        for (String str : intStrs) {
            int num = Integer.parseInt(str.substring(s, s + l));

            if (num > k) {
                answer[count++] = num;
            }
        }

        return Arrays.copyOf(answer, count);
    }
}