import java.util.Stack;

class Solution {
    public int solution(String arrangement) {
        Stack<String> arr_S = new Stack<String>();
        String arr = arrangement.replace("()","#");
    
        int answer = 0;
        for(int i=0;i<arr.length();i++){
            String temp = String.valueOf(arr.charAt(i));
            if(temp.equals("(")){
                arr_S.push(temp);
            }
            else if(temp.equals("#")){
                answer+=arr_S.size();
            }
            else if(temp.equals(")")){
                arr_S.pop();
                answer+=1;
            }
            System.out.print(temp);
        }        
        return answer;
    }
}
