class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int n=-1;
       for(int i=0;i<s.length();i++){
           if(i==0&&s.charAt(i)=='(') n=1;
           else if(n>=0 && i>0){
            if(s.charAt(i)=='(') n++; 
            else if(s.charAt(i)==')') n--;
           }
       }
        if(n==0)  answer=true;
        return answer;
    }
}
