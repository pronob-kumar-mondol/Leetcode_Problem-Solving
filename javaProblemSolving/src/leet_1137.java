import java.util.ArrayList;
import java.util.List;

public class leet_1137 {


    public static void main(String[] args) {
        int n=4;
        List<Integer>list=new ArrayList<>();
        for (int i=0; i<2;i++){
            list.add(i);
        }
        list.add(1);
        for (int i=0; i<2;i++){

        }

        System.out.println(list);
    }









    public int tribonacci(int n) {

            if (n == 0) return 0;
            if (n == 1 || n == 2) return 1;

            int[] arr = new int[n + 1];
            arr[0] = 0;
            arr[1] = 1;
            arr[2] = 1;

            for (int i = 3; i <= n; i++) {
                arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
            }

            return arr[n];
        }
    }

