import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(String[] s1, String[] s2) {
        Set<String> set = new HashSet<>();
        for (String value : s1) {
            set.add(value);
        }

        int answer = 0;
        for (String value : s2) {
            if (set.contains(value)) {
                answer++;
            }
        }

        return answer;
    }
}