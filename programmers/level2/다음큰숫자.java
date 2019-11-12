class Solution {
  public int solution(int n) {
      int answer = 0;
      String ans = Integer.toBinaryString(n);
      int cnt1=0;
      int cnt2=0;
      for(int i=0;i<ans.length();i++){
          if(ans.charAt(i)=='1'){
              cnt1++;
          }
      }
      while(true){
          n++;
          String ans2 = Integer.toBinaryString(n);
          for(int i=0;i<ans2.length();i++){
            if(ans2.charAt(i)=='1'){
              cnt2++;
            }
          }
         if(cnt1==cnt2){
             answer = n;
             break;
         }else cnt2 =0;
      }
      return answer;
  }
}
