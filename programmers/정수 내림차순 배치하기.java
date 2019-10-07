import java.util.*;

class Solution {
  public long solution(long n) {
      int num =0;
      ArrayList<Long> arr= new ArrayList<Long>();
      while(n!=0){
          arr.add(n%10);
          n = n/10;
          num ++;
      }
      Collections.sort(arr);
      Collections.reverse(arr);
      long answer = 0;
      long p =1;
      for(int i=num-1;i>=0;i--){
          answer += arr.get(i)*p;
          p*=10;
      }
      return answer;
  }
}
