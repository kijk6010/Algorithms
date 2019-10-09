import java.util.Arrays;
import java.util.ArrayList;
class Solution {
  public int[] solution(int[] arr, int divisor) {
      ArrayList<Integer> arr1= new ArrayList<Integer>(); 
      int n=0;
      for(int i=0;i<arr.length;i++){
          if(arr[i]%divisor==0){
              arr1.add(arr[i]);
              n++;
          }
      }
      int[] answer;
      if(n==0){
          answer= new int[1]; 
          answer[0]=-1;
      }
      else{
        answer = new int[n];
        for(int i=0;i<n;i++){
              answer[i] = arr1.get(i);
        }
        Arrays.sort(answer);
      }
      return answer;
  }
}
