class Solution {
  public String[] solution(int n, int[] arr1, int[] arr2) {
      String[] result = new String[n];
      String[] answer = new String[n];
      
      for(int i=0;i<n;i++){
          answer[i]="";
          result[i] = Integer.toBinaryString(arr1[i]|arr2[i]);
          if(result[i].length()<n){
              for(int k=0;k<n-result[i].length();k++){
                answer[i]+=" ";   
              }
          }
          for(int j=0;j<result[i].length();j++){
              if(result[i].charAt(j)=='1'){
                  answer[i]+="#";
              }
              else answer[i]+=" ";
          }
      }
      return answer;
  }
}
