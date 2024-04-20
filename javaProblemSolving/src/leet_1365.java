import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leet_1365 {

    public static void main(String[] args) {

        int[] nums={8,1,2,2,3};
        int count=0;
        Arrays.asList(nums);


        System.out.println(Arrays.toString(nums));


    }


    public int[] smallerNumbersThanCurrent(int[] nums) {

        int count=0;
        int[] res = new int[nums.length];
        Arrays.asList(nums);
        List<Integer>list=new ArrayList<>();

        for (int i=0; i< nums.length; i++){
            for (int j=0; j< nums.length;j++){
                if (nums[i]>nums[j]){
                    count+=1;
                }
                else {
                    continue;
                }
            }
            list.add(count);
            count=0;
        }

        for (int i=0; i<nums.length;i++){
            res[i]=list.get(i);
        }
        return res;
    }
}
