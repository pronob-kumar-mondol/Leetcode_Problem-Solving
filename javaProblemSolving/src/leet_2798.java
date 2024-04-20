public class leet_2798
{

    public static void main(String[] args) {
        int[] hours={0,1,2,3,4,5,6};
        int target=3;
        int sum=0;
        for (int i=0; i< hours.length; i++){
            if (hours[i]==target || hours[i]>target){
                sum+=1;
            }
        }
        System.out.println(sum);
    }




    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int sum=0;
        for (int i=0; i<hours.length; i++){
            if (hours[i]==target || hours[i]>target){
                sum+=1;
            }
        }

        return sum;
    }
}
