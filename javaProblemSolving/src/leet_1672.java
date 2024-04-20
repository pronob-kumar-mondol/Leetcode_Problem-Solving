import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class leet_1672
{

    public static void main(String[] args) {
        int sum=0;
        int[][] accounts={{1,5},{7,3},{3,5}};
        List<Integer> list = new ArrayList<>();
        for (int i=0; i< accounts.length; i++){

            for (int j=0; j<accounts[i].length; j++){
                sum+=accounts[i][j];

            }
            list.add(sum);
            System.out.println(list);
            sum=0;

        }
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        System.out.println(list.get(0));


    }



    public int maximumWealth(int[][] accounts) {
        List<Integer> list = new ArrayList<>();
        int sum=0;

        for (int i=0; i<accounts.length; i++){

            for (int j=0; j<accounts[i].length; j++){
                sum+=accounts[i][j];
            }
            list.add(sum);
            sum=0;
        }
        Collections.sort(list,Collections.reverseOrder());

        return list.get(0);
    }
}
