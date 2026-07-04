class Solution {
    public int[] solution(int[] arr) {

        int[] stk = new int[arr.length];
        int size = 0;
        int i = 0;

        while (i < arr.length) {

            if (size == 0) {
                stk[size++] = arr[i];
                i++;
            } else if (stk[size - 1] < arr[i]) {
                stk[size++] = arr[i];
                i++;
            } else {
                size--;
            }
        }

        int[] answer = new int[size];
        for (int j = 0; j < size; j++) {
            answer[j] = stk[j];
        }

        return answer;
    }
}