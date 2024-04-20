import java.util.ArrayList;

public class leet_2520 {
    public static void main(String[] args) {
        int num=121;
        String numStr=Integer.toString(num);
        int[] numArray= new int[numStr.length()];
        int count=0;

        for (int j=0; j<numStr.length();j++){
            numArray[j]=Character.getNumericValue(numStr.charAt(j));
        }


        for (int i=0; i<=numArray.length-1;i++){
            if (num%numArray[i]==0){
                count+=1;
            }
        }
        System.out.println(count);
    }
    public int countDigits(int num) {
        String numStr=Integer.toString(num);
        int[] numArray= new int[numStr.length()];
        int count=0;

        for (int j=0; j<numStr.length();j++){
            numArray[j]=Character.getNumericValue(numStr.charAt(j));
        }


        for (int i=0; i<=numArray.length-1;i++){
            if (num%numArray[i]==0){
                count+=1;
            }
        }
       return count;

    }
}
