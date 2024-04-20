//66. Plus One
public class leet_66 {


    public static void main(String[] args) {
        long[] digits={7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
        long sum=0;
        for (int i=0; i< digits.length;i++){
            sum*=10;
            sum+=digits[i];
        }

        sum+=1;
        System.out.println(sum);

        String strSum=Long.toString(sum);
        int[] newSum=new  int[strSum.length()];

        for (int j=0; j<strSum.length();j++){
            newSum[j]=Character.getNumericValue(strSum.charAt(j));
        }
    }


//    public static void main(String[] args) {
//        int[] digits={4,3,2,1};
//        int sum=0;
//        for (int i=0; i<= digits.length-1;i++){
//
//            sum*=10;
//            sum+=digits[i];
//
//        }
//        System.out.println(sum);
//
//        sum+=1;
//
//        System.out.println(sum);
//        String strSum=Integer.toString(sum);
//        String[] newSum = new String[digits.length];
//        for (int j=0; j<=strSum.length()-1;j++){
//            newSum[j]= String.valueOf(strSum.charAt(j));
//        }
//        System.out.println(newSum[0]);
//
//
//    }

    public int[] plusOne(int[] digits) {
        int sum=0;
        for (int i=0; i<= digits.length-1;i++){
            sum*=10;
            sum+=digits[i];
        }

        sum+=1;

        String strSum=Long.toString(sum);
        int[] newSum=new  int[strSum.length()];

        for (int j=0; j<strSum.length();j++){
            newSum[j]=Character.getNumericValue(strSum.charAt(j));
        }

        return  newSum;
    }


}
