class Solution {
    public String solution(String my_string, int[] indices) {
        boolean[] removed = new boolean[my_string.length()];

        for (int i = 0; i < indices.length; i++) {
            removed[indices[i]] = true;
        }

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            if (!removed[i]) {
                answer.append(my_string.charAt(i));
            }
        }

        return answer.toString();
    }
}