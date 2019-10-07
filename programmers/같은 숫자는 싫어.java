import java.util.*;

public class Solution {
	public int[] solution(int []arr) {
        int a =10;
        int n=0;
        ArrayList<Integer> ans=new ArrayList<Integer>();
         for(int i=0;i<arr.length;i++){
            if(a!=arr[i]){
               ans.add(arr[i]);
               n++;
            }
            a=arr[i];
         }
         int[] answer = new int[n];
         for(int i=0;i<n;i++){
             answer[i] = ans.get(i);
         }
        return answer;
	}
}
