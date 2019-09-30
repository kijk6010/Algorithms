class Solution {
  public String solution(int n) {
     String answer = "";
     char[] arr = {'4','1','2'};
     int define =0;
     while(n>0){
        define = n%3;
        n/=3;
        if(define == 0) n--;

        answer =arr[define]+answer;
     }
      return answer;
  }
}
