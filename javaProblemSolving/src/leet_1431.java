import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class leet_1431 {

    public static void main(String[] args) {
        int[] candies={2,3,5,1,3};
        int extraCandies=3;
        int tempSum=0,sum=0;
        List<Boolean> booleanList=new ArrayList<>();

        for (int i=0;i< candies.length;i++){
            tempSum= candies[i]+ extraCandies;
            for (int j=0; j<candies.length;j++){

                if (tempSum>=candies[j]){
                    sum+=1;
                }
            }
            if (sum==candies.length){
                booleanList.add(true);
            }else {
                booleanList.add(false);
            }
            sum=0;
            tempSum=0;
        }
        System.out.println(booleanList);
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int tempSum=0,sum=0;
        List<Boolean> booleanList=new ArrayList<>();

        for (int i=0;i< candies.length;i++){
            tempSum= candies[i]+ extraCandies;
            for (int j=0; j<candies.length;j++){

                if (tempSum>=candies[j]){
                    sum+=1;
                }
            }
            if (sum==candies.length){
                booleanList.add(true);
            }else {
                booleanList.add(false);
            }
            sum=0;
            tempSum=0;
        }

        return booleanList;
    }
}
