class Solution {
    boolean solution(String s) {
        boolean answer = false;
          int n1=0,n2=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch =='p'||ch=='P'){
                n1 ++;
            }
            if(ch =='y'||ch=='Y'){
                n2++;
            }
        }
        if(n1==n2) answer = true;
        return answer;
    }
}
