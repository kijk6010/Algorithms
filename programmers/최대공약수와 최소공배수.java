class Solution {
  public int[] solution(int n, int m) {
      int[] answer = new int[2];
      int tmp=0;
      if(n<m){
          tmp =n;
          n = m;
          m = tmp;
      }

      for(int i=1;i<=n;i++){
          if(m%i==0&&n%i==0){
              answer[0]=i;
          }
      }
     if(answer[1]==0) answer[1] = m*n/answer[0];
      return answer;
  }
}
