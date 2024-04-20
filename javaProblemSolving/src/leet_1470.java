//1470. Shuffle the Array
public class leet_1470 {

    public static void main(String[] args) {
        int[] nums={2,5,1,3,4,7};
        int arrayLen=(nums.length/2);
//        We have to devide the array and make two separate array
        int[] nums1=new int[arrayLen];

        for (int i=0;i<=nums.length-arrayLen-1;i++){
            nums1[i]=nums[i];
        }

        int[] nums2=new int[arrayLen];

        for (int j=nums.length-1, i=arrayLen-1; j>=arrayLen; j--,i--){
            nums2[i]=nums[j];
        }

//        num1 and num2 two separate arrays are ready. Now time to merge

        int[] finalNum=new int[nums.length];

        for (int k=0; k<=arrayLen-1;k++){
            if (k==0){
                finalNum[k]=nums1[k];
            }
            if (k%2!=0){
                finalNum[k]=nums2[k-1];
            }
            if (k%2==0){
                finalNum[k]=nums1[k-2];
            }

        }
        System.out.println(finalNum[0]);


    }















//    public int[] shuffle(int[] nums, int n) {
//
//    }
}
