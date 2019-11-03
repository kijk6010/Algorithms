import java.util.Stack;

class Solution {
    public int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        Stack<Integer> H = new Stack(); 
        
        for(int h:heights){
            H.push(h);
        }
        
        int H_index = heights.length;
        while(H_index!=0){
            H_index--;
            for(int i=H_index;i>=0;i--){ 
              if(heights[i]>H.peek()){
                    answer[H_index] = i+1; 
                    H.pop();
                    break;
                }
               else if(i==0){
                    answer[H_index]=0;
                    H.pop();
                }   
            }
        }
        
        return answer;
    }
}
