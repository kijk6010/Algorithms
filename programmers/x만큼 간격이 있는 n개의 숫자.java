class Solution {
  public long[] solution(int x, int n) {
      long[] answer = new long[n];
      long a =0;
      for(int i=0;i<n;i++){
          a +=x;
          answer[i] = a;
      }
        System.out.print(x);
      return answer;
  }
}
