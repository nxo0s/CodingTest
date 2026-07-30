import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        
        Arrays.sort(array);

        int answer = array[0];
        int prevNum=array[0];
        int maxCount=1;
        int count=1;

        for (int i = 1; i<array.length; i++){
            int currNum = array[i];

            count = prevNum != currNum ? 1 : count+1;

            if (maxCount < count){
                
                maxCount = count;
                answer = prevNum;
            } else if (maxCount == count){
                answer = -1;
            }

            prevNum = currNum;
        }

        return answer;
    }
}