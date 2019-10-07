import java.util.ArrayList;

class Solution {
     public int[] solution(int[] answers) {
        int[] p1 = {1,2,3,4,5};
        int[] p2 = {2,1,2,3,2,4,2,5};
        int[] p3 = {3,3,1,1,2,2,4,4,5,5};
        int[] pn = {0,0,0};
        for(int i=0;i<answers.length;i++){
            if(p1[i%5] == answers[i])pn[0]++;
             if(p2[i%8] == answers[i])pn[1]++;
             if(p3[i%10] == answers[i])pn[2]++;
        }
       int max = Math.max(Math.max(pn[0],pn[1]),pn[2]);
        int n=0;
        ArrayList<Integer> ans=new ArrayList<Integer>();
        for(int i=0;i<pn.length;i++){
            if(max == pn[i]){
                ans.add(i+1);
                n++;
            }
        }
        int[] answer =new int[n];
        for(int i=0;i<n;i++){
            answer[i] = ans.get(i);
        }
        return answer;
    }
}
