import java.util.Arrays;
import java.util.Scanner;

public class Sollution {
    public static void main(String[] args) {

        int[] nums={1,15,6,3};
        Sollution sollution=new Sollution();
        int v=sollution.differenceOfSum(nums);
        System.out.println(v);
    }

    public int differenceOfSum(int[] nums) {
        int elementSum=0;
        int digitSum=0;
        for (int i=0; i<=nums.length-1;i++){
             elementSum+=nums[i];
        }
        String eachElementString= Arrays.toString(nums);
        for (int j=0; j<=eachElementString.length()-1;j++){
            char ch=eachElementString.charAt(j);
            if (Character.isDigit(ch)) {
                digitSum += Character.getNumericValue(ch);
            }
        }
        return (elementSum-digitSum);

    }
}
