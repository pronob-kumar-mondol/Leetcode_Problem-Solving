import java.util.ArrayList;
import java.util.List;

public class leet_2942 {

    public static void main(String[] args) {
        String[] words={"abc","bcd","aaaa","cbc"};
        char x='a';

        leet_2942 sollution=new leet_2942();

        List<Integer> v=sollution.findWordsContaining(words,x);
        System.out.println(v);
    }


    public List<Integer> findWordsContaining(String[] words, char x) {

        String strX=String.valueOf(x);

        List<Integer> list = new ArrayList<>();

        for (int i=0; i<words.length; i++){
            if (words[i].contains(strX)){
                list.add(i);
            }
        }

        return list;
    }
}
