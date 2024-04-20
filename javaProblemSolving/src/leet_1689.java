import java.util.Arrays;
import java.util.Collections;

public class leet_1689
{

    public static void main(String[] args) {
        String n = "32";
        Integer[] arr = new Integer[n.length()];

        for (int i = 0; i < n.length(); i++) {
            arr[i] = Character.getNumericValue(n.charAt(i));
        }

        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(arr[0]);


    }



    public int minPartitions(String n) {

        Integer[] arr = new Integer[n.length()];

        for (int i = 0; i < n.length(); i++) {
            arr[i] = Character.getNumericValue(n.charAt(i));
        }

        Arrays.sort(arr, Collections.reverseOrder());
        return arr[0];
    }
}
