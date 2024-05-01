public class leet_2529 {


    public static void main(String[] args) {

        int[] nums={-3,-2,-1,0,0,1,2};
        int negCount=0, posCount=0;

        for (int i=0;i< nums.length;i++){
            if (nums[i]<0){
                negCount++;
            }
            else if (nums[i]>0){
                posCount++;
            }
            else{
                continue;
            }
        }




    }




    public int maximumCount(int[] nums) {

        int negCount=0, posCount=0;

        for (int i=0;i< nums.length;i++){
            if (nums[i]<0){
                negCount++;
            }
            else if (nums[i]>0){
                posCount++;
            }
            else{
                continue;
            }
        }
        return Math.max(negCount,posCount);
    }
}
