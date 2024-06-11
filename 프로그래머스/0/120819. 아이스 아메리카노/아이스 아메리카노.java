class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        
        for(int i = 0 ; 5500 * i <= money ; i++){
            answer[0] = i;
            answer[1] = money % 5500; 
        }
        
        return answer;
    }
}