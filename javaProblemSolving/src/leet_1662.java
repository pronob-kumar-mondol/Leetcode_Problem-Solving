public class leet_1662 {


    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        String ward1 = "";
        String ward2 = "";

        for (int i=0; i< word1.length;i++){
            ward1+=word1[i];
        }

        System.out.println(ward1);
        for (int i=0; i< word2.length;i++){
            ward2+=word2[i];
        }

        System.out.println(ward2);

        System.out.println(ward1.equals(ward2));


    }












    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        String ward1 = "";
        String ward2 = "";

        for (int i=0; i< word1.length;i++){
            ward1+=word1[i];
        }
        for (int i=0; i< word2.length;i++){
            ward2+=word2[i];
        }


        return ward1.equals(ward2);
    }
}
