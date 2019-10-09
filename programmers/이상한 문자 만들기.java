class Solution {
  public String solution(String s) {
      char ch =0;
      String answer = "";
      int n=0;
      for(int i=0;i<s.length();i++){
          if(s.charAt(i)==' '){ 
              n=1; 
              ch = s.charAt(i);
          }
          if(n%2==0){
              ch = Character.toUpperCase(s.charAt(i));
           }
          else{ ch = Character.toLowerCase(s.charAt(i));}
          answer+=ch;
          n++;
      }
      return answer;
  }
}
