class Solution {
  public String solution(String s) {
      String answer = "";
      char[] ch = s.toCharArray();
      char tmp =0;
     for(int i=0;i<s.length();i++){
          for(int j=0;j<s.length()-1;j++){
              if(ch[j] <ch[j+1]){
                  tmp = ch[j];
                  ch[j] = ch[j+1];
                  ch[j+1] = tmp;
              }
          }
     }
      for(int i=0;i<s.length();i++){
          answer += ch[i];
      }
      return answer;
  }
}
