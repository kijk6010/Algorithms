class Solution {
  public boolean solution(int x) {
      boolean answer = true;
      int[] arr = new int[10];
      int a=x,n=0, sum=0;
      while(a!=0){
          arr[n]=a%10;
          a = a/10;
          sum+=arr[n];
          n++;
        }
      if(x%sum==0){ return answer;}
      else{answer=false; return answer;}
  }
}
