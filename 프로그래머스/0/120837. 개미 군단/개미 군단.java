class Solution {
    public int solution(int hp) {
        int answer = 0;
        int n = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int num = 0;
        
        a = hp / 5;
        num = hp % 5;
        b = num / 3;
        num = num % 3;
        c = num;
        
        answer = a + b + c;
        return answer;
    }
}