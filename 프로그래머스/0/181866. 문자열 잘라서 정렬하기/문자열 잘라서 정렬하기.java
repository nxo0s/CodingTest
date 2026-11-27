import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String[] solution(String myString) {
        String[] parts = myString.split("x");
        ArrayList<String> words = new ArrayList<>();

        for (String part : parts) {
            if (!part.isEmpty()) {
                words.add(part);
            }
        }

        Collections.sort(words);
        return words.toArray(new String[0]);
    }
}