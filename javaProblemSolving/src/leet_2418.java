import java.util.*;

public class leet_2418 {


    public static void main(String[] args) {
        String[]  names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};


        Map<Integer,String> map=new HashMap<>();
        List<String> list=new ArrayList<>();

        for (int i=0; i< heights.length;i++){
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        for (int i= heights.length-1;i>=0;i--){
            list.add(map.get(heights[i]));
        }
        System.out.println(list);

    }





    public String[] sortPeople(String[] names, int[] heights) {

        Map<Integer,String> map=new HashMap<>();
        List<String> list=new ArrayList<>();
        String[] finals=new String[names.length];

        for (int i=0; i< heights.length;i++){
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        for (int i= heights.length-1;i>=0;i--){
            list.add(map.get(heights[i]));
        }
        for (int i=0; i< names.length;i++){
            finals[i]= list.get(i);
        }
        return finals;
    }
}
