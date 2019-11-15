import java.util.HashMap;
import java.util.Arrays;

class Solution {
    public int[] solution(int N, int[] stages) {
        int len = stages.length;
        double[] NoClear = new double[N];
        int cnt =0;
        for(int i=1;i<N+1;i++){
            cnt=0;
            for(int j=0;j<stages.length;j++){
                if(i==stages[j]){
                   cnt++; 
                }
            }
            if(cnt==0){
            NoClear[i-1]=0;
            }
            else{
                NoClear[i-1] = ((double)cnt/len);
            }
            len-=cnt;
        }
        HashMap<Integer,Double> Map = new HashMap<Integer,Double>();
        for(int i=1;i<N+1;i++){
            Map.put(i,NoClear[i-1]);
        }
        int[] answer = new int[N];
         Arrays.sort(NoClear);
        for(int i=N-1;i>-1;i--){
            for(int j=1;j<=N+1;j++){
               if(NoClear[i]==Map.get(j)){
                   answer[N-i-1] = j;
                   Map.remove(j);
                   Map.put(j,-1.0);
                   break;
                }
            }
        }
        return answer;
    }
}
