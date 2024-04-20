public class leet_2485 {
    public int pivotInteger(int n) {
        int totalSum= (n*(n+1))/2;
        int half = (int) Math.sqrt(totalSum);
        if (half*half==totalSum){
            return half;
        }
        else {
            return -1;
        }
    }
}
