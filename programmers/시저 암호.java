class Solution {
  public String solution(String s, int n) {
      char ch =0;
      String answer ="";
      for(int i=0;i<s.length();i++){
          ch = s.charAt(i);
          if(Character.isLowerCase(ch)){
              ch = (char)((ch-'a'+n)%26+'a');
          }
          else if(Character.isUpperCase(ch)){
              ch = (char)((ch-'A'+n)%26+'A');
          }
          answer += ch;
      }
      return answer;
  }
}
