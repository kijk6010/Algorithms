import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int solution(int[] scoville, int K) {
        Queue<Integer> Q = new PriorityQueue<Integer>();
        int answer = 0;
        int mix = 0;
        for(int i:scoville){
            Q.offer(i);
        }
        while(!Q.isEmpty()){
            if(Q.peek()>=K){
                break;
            }
            else if(Q.peek()<K&&Q.size()==1){
                answer = -1;
                break;
            }
            else{
                mix = Q.poll() + (2*Q.poll());
                Q.offer(mix);
                answer++;
            }
        }
        return answer;
    }
}
