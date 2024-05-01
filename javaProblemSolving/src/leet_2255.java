import java.util.ArrayList;
import java.util.List;

public class leet_2255 {


    public static void main(String[] args) {
        String[] words = {"ycwj","hak","v","kjg","zw","vtes","vom","ii","as","v","vo","v","w","vomy","loa","fbm","j","v","vo","e","y","t","eh","yk","bt","x","vomy","vom","yab","v","sydi","wnb","z","v","iygp","vomy"};
        String s="vomy";
        int count=0;

        for (int i=0;i< words.length;i++){
           
            if ( prefixOfS(words[i],s)==true){
                count++;
            }
        }

        System.out.println(count);

    }

    private  static boolean prefixOfS(String word, String s) {
        char[] sChar=s.toCharArray();
        int wordLen=word.length();
        char[] wordChar=word.toCharArray();
        String a=String.valueOf(sChar[0]);
        int len=s.length();


        if (word.startsWith(a)){
            if (len<wordLen){
                return false;
            }
            if(len>1){
                if(len==wordLen && wordChar[1]==sChar[1]) {
                    return true;
                }
                else {
                    return false;
                }
            }
        }
        else {
            return false;
        }
        return false;
    }


    public int countPrefixes(String[] words, String s) {

        int count = 0;
        for (String word : words) {
            if (s.startsWith(word)) count++;
        }
        return count;
    }
}
