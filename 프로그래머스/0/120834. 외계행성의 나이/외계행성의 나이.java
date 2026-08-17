class Solution {
    public String solution(int age) {
        StringBuilder answer = new StringBuilder();

        while (age > 0) {
            char letter = (char) ('a' + age % 10);
            answer.append(letter);
            age /= 10;
        }

        return answer.reverse().toString();
    }
}