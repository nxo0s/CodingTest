class Solution {
    public int[] solution(int n, int k) {
        int count = n / k;
        int[] answer = new int[count];

        for (int i = 0; i < count; i++) {
            answer[i] = k * (i + 1);
        }

        return answer;
    }
}