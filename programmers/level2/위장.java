import java.util.HashMap;
class Solution {
    public int solution(String[][] clothes) {
        HashMap<String,Integer> clothes_M = new HashMap<String,Integer>();
        for(int i=0;i<clothes.length;i++){
            if(clothes_M.containsKey(clothes[i][1])){
                clothes_M.replace(clothes[i][1],clothes_M.get(clothes[i][1])+1);
            }
            else clothes_M.put(clothes[i][1],1);
        }
        int answer = 1;
        for(String i:clothes_M.keySet()){
            answer *= clothes_M.get(i)+1;
        }
        answer -=1;  
        return answer;
    }
}
