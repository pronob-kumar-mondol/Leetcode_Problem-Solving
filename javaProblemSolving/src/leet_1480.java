import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class leet_1480 {


    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int sum=0;
        List<Integer>list=new ArrayList<>();
        List<Integer>newList=new ArrayList<>();

        for (int i=0;i< nums.length;i++){
            list.add(nums[i]);
        }
        newList.add(nums[0]);
        for (int j=1; j< nums.length;j++){
            sum=list.get(j)+ newList.get(j-1);
            newList.add(sum);

        }


        System.out.println(newList);

    }



    public int[] runningSum(int[] nums) {

        int sum=0;
        List<Integer>list=new ArrayList<>();
        List<Integer>newList=new ArrayList<>();
        int[] array = new int[nums.length];

        for (int i=0;i< nums.length;i++){
            list.add(nums[i]);
        }
        newList.add(nums[0]);
        for (int j=1; j< nums.length;j++){
            sum=list.get(j)+ newList.get(j-1);
            newList.add(sum);
        }

        for (int k=0; k< nums.length;k++){
            array[k]=newList.get(k);
        }

        return array;
    }
}
