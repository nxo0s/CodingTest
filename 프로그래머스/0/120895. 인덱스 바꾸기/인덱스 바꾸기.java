class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] letters = my_string.toCharArray();

        char temp = letters[num1];
        letters[num1] = letters[num2];
        letters[num2] = temp;

        return new String(letters);
    }
}