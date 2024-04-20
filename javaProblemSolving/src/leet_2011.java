public class leet_2011 {

    public static void main(String[] args) {
        String[] operations={"X++","++X","--X","X--"};
        leet_2011 sollution=new leet_2011();
        int v=sollution.finalValueAfterOperations(operations);
        System.out.println(v);
        
    }


    public int finalValueAfterOperations(String[] operations) {

        int x=0;
        for (int i=0;i<=operations.length-1;i++){
            if ("--X".equals(operations[i]) || "X--".equals(operations[i])){
                x-=1;
            } else if ("++X".equals(operations[i]) || "X++".equals(operations[i])) {
                x+=1;
            }
        }


    return x;
    }
}
