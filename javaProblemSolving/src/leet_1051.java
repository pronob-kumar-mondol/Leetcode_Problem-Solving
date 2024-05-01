import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class leet_1051 {

    public static void main(String[] args) {
        int[] heights={1,1,4,2,1,3};
        int count=0;
        List<Integer> list=new ArrayList<>();

        for(int i=0;i< heights.length;i++){
            list.add(heights[i]);
        }
        Collections.sort(list);

        for (int i=0;i< heights.length;i++){
            if (!list.get(i).equals(heights[i])){
                count++;
            }
        }
        System.out.println(count);

    }

    public int heightChecker(int[] heights) {
        int count=0;
        List<Integer> list=new ArrayList<>();


        for(int i=0;i< heights.length;i++){
            list.add(heights[i]);
        }
        Collections.sort(list);

        for (int i=0;i< heights.length;i++){
            if (!list.get(i).equals(heights[i])){
                count++;
            }
        }

        return count;
    }



}
