import java.util.HashMap;
import java.util.Map;

public class leet_1528 {


    public static void main(String[] args) {
        String s="codeleet";
        int[] indices={4,5,6,7,0,2,1,3};

        StringBuilder a= new StringBuilder();
        char[] charArray=s.toCharArray();

        Map<Integer,Character> map=new HashMap<>();

        for (int i=0; i<indices.length;i++){
            map.put(indices[i],charArray[i]);
            a.append(map.get(i).toString());
        }

        System.out.println(a);


    }







    public String restoreString(String s, int[] indices) {
        StringBuilder a= new StringBuilder();
        char[] charArray=s.toCharArray();

        Map<Integer,Character> map=new HashMap<>();

        for (int i=0; i<indices.length;i++){
            map.put(indices[i],charArray[i]);
            a.append(map.get(i).toString());
        }
        return a.toString();
    }
}
