public class leet_2413 {

    public static void main(String[] args) {
        int n=51;
        int num=0;
        for (int i=1; i<=200 ; i++){
            if (i%2==0 && i%n==0){
                num+=i;
                break;
            }
        }
        System.out.println(num);
    }


    public int smallestEvenMultiple(int n) {

        int num=51;
        for (int i=1; i<=100 ; i++){
            if (i%2==0 && i%n==0){
                num+=i;
                break;
            }
        }
        return num;
    }
}
