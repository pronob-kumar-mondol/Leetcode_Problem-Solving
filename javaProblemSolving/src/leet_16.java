import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class leet_16 {

    public static void main(String[] args) {
        int[] nums={4,0,5,-5,3,3,0,-4,-5};
        List<Integer> list= new ArrayList<>();
        int target=-100;
        Arrays.sort(nums);
        int windowSum=0, closestSum=0, start=0, end=0, k=3;

        while (end<k){
            windowSum+=nums[end++];
        }
        list.add(windowSum-target);
        while (end<nums.length){
            windowSum+=nums[end++]-nums[start++];

            list.add(windowSum-target);
        }
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list.get(0)+target);
        
    }






    public int threeSumClosest(int[] nums, int target) {

                List<Integer> list= new ArrayList<>();
                Arrays.sort(nums);
                int windowSum=0, start=0, end=0, k=3;

                while (end<k){
                    windowSum+=nums[end++];
                }
                list.add(windowSum-target);
                while (end<nums.length){
                    windowSum+=nums[end++]-nums[start++];

                    if (windowSum==target){
                        return windowSum;
                    }
                    else {
                        list.add(windowSum-target);
                    }
                }
                if(target>0){
                    Collections.sort(list,Collections.reverseOrder());
                }else{
                    Collections.sort(list);
                }

                return list.get(0)+target;
            }
        }

