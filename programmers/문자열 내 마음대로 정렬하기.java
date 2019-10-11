import java.util.Arrays;
import java.util.Comparator;

class Solution {
  public String[] solution(String[] strings, int n) {
      Arrays.sort(strings);
      Arrays.sort(strings,new Comparator<String>(){
          public int compare(String a, String b){
              if(a.charAt(n)>b.charAt(n)) 
                  return 1;
              else if(a.charAt(n)<b.charAt(n)) 
                  return -1;
              else  return 0;
          }
      });
      return strings;
  }
}
