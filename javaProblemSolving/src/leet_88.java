import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class leet_88 {


    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2= {2,5,6};

        int m=3,n=3;

        int size = m + n;

        List<Integer> list=new ArrayList<>();

        for(int num:nums1){
            if (num>0){
                list.add(num);
            }
        }
        for (int num:nums2){
            list.add(num);
        }
        int[] arr= new int[size];

        for (int i=0; i<list.size(); i++){
            for (int j:list){
                arr[i]=j;
            }
        }
        Arrays.sort(arr);




    }




    public void merge(int[] nums1, int m, int[] nums2, int n) {

        List<Integer> list=new ArrayList<>();

        for(int num:nums1){
            list.add(num);
        }
        for (int num:nums2){
            list.add(num);
        }
        System.out.println(list);

    }
}
