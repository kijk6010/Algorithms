class Solution {
  public String solution(String s) {
      String[] arr = s.split("");
      String answer = "";
      int n=0;
      for(int i=0;i<arr.length;i++){
          if(arr[i]==" "){ n=1; }
          if(n%2==0){
              arr[i]=arr[i].toUpperCase();
           }
          else{ arr[i]=arr[i].toLowerCase();}
          answer+=arr[i];
          n++;
      }
      return answer;
  }
}
