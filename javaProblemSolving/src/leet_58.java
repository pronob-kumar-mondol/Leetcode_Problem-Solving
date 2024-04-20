import java.util.ArrayList;
import java.util.Scanner;

public class leet_58 {

    public static void main(String[] args) {
        int num= 9996;
        int target=6;
        int result=0;
        ArrayList<Integer> numList= new ArrayList<>();
        String numStr=String.valueOf(num);
        for (int i=0; i<=numStr.length()-1; i++){
            char digiChar= numStr.charAt(i);
            int digit=Character.getNumericValue(digiChar);
            numList.add(digit);
        }
        System.out.println(numList);

        for (int j=0; j<numList.size(); j++){
            if (numList.get(j)==target){
                numList.set(j,9);
                break;
            }
            else {
                continue;
            }
        }
        for (int number:numList){
            result=result*10+number;
        }
        System.out.println(result);

    }

    public int maximum69Number (int num) {

        int target=6;
        int result=0;

        ArrayList<Integer> numList= new ArrayList<>();
        String numStr=String.valueOf(num);
        for (int i=0; i<=numStr.length()-1; i++){
            char digiChar= numStr.charAt(i);
            int digit=Character.getNumericValue(digiChar);
            numList.add(digit);
        }
        for (int j=0; j<numList.size(); j++){
            if (numList.get(j)==target){
                numList.set(j,9);
                break;
            }
            else {
                continue;
            }
        }
        for (int number:numList){
            result=result*10+number;
        }
        return result;
    }




}
