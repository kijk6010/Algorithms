class Solution {
  public int solution(double num) {
      int answer = 0;
      if(num<1||num>=8000000){answer=-1; num=1;};
      while(num!=1){
          answer++;
          if(num%2==0){
              num/=2;
          }
          else{
              num=num*3+1;
          }
      }
        if(answer>=450){answer=-1;}
      return answer;
  }
}
