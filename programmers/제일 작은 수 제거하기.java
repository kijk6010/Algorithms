import java.util.ArrayList;
class Solution {
  public int[] solution(int[] arr) {
      int[] answer;
      if(arr.length==1){ 
          answer = new int[1];
          answer[0]=-1;
      }
      else{
        answer = new int[arr.length-1];
        int temp =arr[0];
        int index =0;
        for(int i=1;i<arr.length;i++){
            if(temp>arr[i]){
                temp = arr[i];
                index = i;
            }
        }
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            ans.add(arr[i]);
        }
        ans.remove(index);
         for(int i=0;i<answer.length;i++){
            answer[i] = ans.get(i);
        }
      }
      return answer;
  }
}
