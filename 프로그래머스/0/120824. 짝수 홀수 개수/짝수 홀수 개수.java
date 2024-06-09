class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        
        boolean a = (num_list.length >= 1 && num_list.length <= 100);
        boolean b = true;
        for(int num : num_list){
            if(!(num >= 0 && num <= 1000)){
                b = false;
                break;
            }
        }
        
        for(int num : num_list){
            if(num % 2 == 0){
                answer[0] = answer[0] + 1;
            }else if(num % 2 == 1){
                answer[1] = answer[1] + 1;
            }
        }
        
        return answer;
    }
}