class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int start = slicer[0];
        int end = slicer[1];   
        int step = 1;

        if (n == 1) {
            start = 0;
        } else if (n == 2) {
            end = num_list.length - 1;
        } else if (n == 4) {
            step = slicer[2];
        }

        int[] answer = new int[(end - start) / step + 1];

        int index = 0;
        for (int i = start; i <= end; i += step) {
            answer[index++] = num_list[i];
        }

        return answer;
    }
}