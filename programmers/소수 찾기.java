class Solution {
  public int solution(int n) {
      int answer = 0;
      boolean[] arr = new boolean[n+1];
      arr[0] = arr[1] = false;
      for(int i=2;i<n+1;i++){
          arr[i] = true;
      }
      for(int i=2; i*i<n+1;i++){
          for(int j=i*i;j<n+1;j+=i){
              arr[j]=false;
          }
      }
      for(int i=2;i<=n;i++){
          if(arr[i]==true){
              answer++;
          }
      }
      return answer;
  }
}
