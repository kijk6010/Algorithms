import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        Queue<Integer> Q = new LinkedList<Integer>();
        for(int i=0;i<speeds.length;i++){
            if((100-progresses[i])%speeds[i]==0) Q.offer((100-progresses[i])/speeds[i]);
            else Q.offer((100-progresses[i])/speeds[i]+1);
        }
        
        int cnt=1;
        int A = Q.poll();
        while(!Q.isEmpty()){
           int B = Q.poll();
            if(A>=B) cnt++;
            else{
                ans.add(cnt);
                cnt =1;
                A=B;
            }
        }
        ans.add(cnt);
        
        int[] answer = new int[ans.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = ans.get(i);
        }
        return answer;
    }
}
