class Solution {
    public int solution(String s) {
        int answer = 0;
        int previous = 0;

        for (String token : s.split(" ")) {
            if (token.equals("Z")) {
                answer -= previous;
            } else {
                previous = Integer.parseInt(token);
                answer += previous;
            }
        }

        return answer;
    }
}