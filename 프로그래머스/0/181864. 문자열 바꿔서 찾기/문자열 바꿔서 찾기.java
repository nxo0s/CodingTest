class Solution {
    public int solution(String myString, String pat) {

        String result = "";

        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'A') {
                result += "B";
            } else {
                result += "A";
            }
        }

        if (result.contains(pat)) {
            return 1;
        } else {
            return 0;
        }
    }
}