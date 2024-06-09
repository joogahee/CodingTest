class Solution {
    public int solution(int[] array, int n) {
        int cnt = 0;
        boolean a = (n >= 0 && n <= 1000);
        boolean b = (array.length >= 1 && array.length <= 100);
        boolean c = true;
        
        for(int d : array){
            if(!(d >= 0 && d <= 1000)){
                c = false;
                break;
            }
        }
        
        if(a && b && c){
            for(int num : array){
            if(n == num){
                cnt++;
                }
            } 
        }

        return cnt;
    }
}