//1512. Number of Good Pairs
import java.util.HashMap;
public class leet_1512 {


    public class GoodPairs {
        public static int numIdenticalPairs(int[] nums) {
            HashMap<Integer, Integer> frequency = new HashMap<>();
            int goodPairs = 0;

            for (int num : nums) {

                if (frequency.containsKey(num)) {
                    goodPairs += frequency.get(num);
                    frequency.put(num, frequency.get(num) + 1);
                } else {
                    frequency.put(num, 1);
                }
            }

            return goodPairs;
        }

        public static void main(String[] args) {
            // Test cases
            int[] nums1 = {1, 2, 3, 1, 1, 3};
            System.out.println(numIdenticalPairs(nums1)); // Output: 4

            int[] nums2 = {1, 1, 1, 1};
            System.out.println(numIdenticalPairs(nums2)); // Output: 6

            int[] nums3 = {1, 2, 3};
            System.out.println(numIdenticalPairs(nums3)); // Output: 0
        }
    }



//    public int numIdenticalPairs(int[] nums) {
//
//    }
}
