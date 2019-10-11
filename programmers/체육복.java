import java.util.ArrayList;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
        ArrayList<Integer> lostL = new  ArrayList<Integer>();
        ArrayList<Integer> reserveL = new  ArrayList<Integer>();
        
         for(int i=0;i<lost.length;i++){
             lostL.add(lost[i]);
         }
          for(int j=0;j<reserve.length;j++){
              reserveL.add(reserve[j]);
          }
         for(int i=0;i<lostL.size();i++){
            for(int j=0;j<reserveL.size();j++){
                if(lostL.get(i)==reserveL.get(j)){
                    lostL.remove(i);
                    reserveL.remove(j);
                    i--;
                    break;
                }
            }
        }
        for(int i=0;i<lostL.size();i++){
            for(int j=0;j<reserveL.size();j++){
                if(lostL.get(i)+1==reserveL.get(j)||lostL.get(i)-1==reserveL.get(j)){
                    lostL.remove(i);
                    reserveL.remove(j);
                    i--;
                    break;
                }
            }
        }
        int answer = n - lostL.size();
        return answer;
    }
}
