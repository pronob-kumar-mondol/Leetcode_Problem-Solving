import java.util.Arrays;
import java.util.HashSet;

public class leet_136 {


    public static void main(String[] args) {

        int[] nums = {2, 2, 1};


        HashSet<Integer> window = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (window.contains(nums[i])) {
                window.remove(nums[i]);
            } else {
                window.add(nums[i]);
            }
        }

        // At the end, the window will contain the single number
        System.out.println(window);
    }

    }

