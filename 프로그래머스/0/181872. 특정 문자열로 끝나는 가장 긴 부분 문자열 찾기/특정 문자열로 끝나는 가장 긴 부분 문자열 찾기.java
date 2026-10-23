class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int end = 0;

        for (int i = 0; i <= myString.length() - pat.length(); i++) {
            if (myString.startsWith(pat, i)) {
                end = i + pat.length();
            }
        }

        return myString.substring(0, end);
    }
}