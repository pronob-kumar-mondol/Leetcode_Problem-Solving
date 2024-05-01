import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class leet_1207 {


    public static void main(String[] args) {

        String sentence= "aabacd";

        int[] freq= new int[101];
        for(char c: sentence.toCharArray()){
            System.out.println(c-'0');
            freq[c]++;
        }
        int count=0;
        for(int i: freq){
            System.out.println(i);
            if(i>0){
                count++;
            }
        }
        if (count==26) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }




//        for(int i:arr){
//
//            if (set.contains(i)){
//
//            }
//
//            set.add(i);
//
//        }
//        System.out.println(set);






    }









    public boolean checkPangram(String sentence) {
        int[] freq= new int[1000];
        for(char c: sentence.toCharArray()){
            freq[c]++;
        }
        int count=0;
        for(int i: freq){
            if(i>0){
                count++;
            }
        }
        return count==26;
    }
}
