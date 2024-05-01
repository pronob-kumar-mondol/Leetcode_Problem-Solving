public class leet_1876 {


    public static void main(String[] args) {
        String s = "aababcabc";
        int size=s.length();
        int ans=0;

        for(int i=0;i<size-2;i++){
            char c1=s.charAt(i);
            char c2=s.charAt(i+1);
            char c3=s.charAt(i+2);

            if (c1!=c2 && c2!=c3 && c3!=c1) ans++;
        }




    }






    public int countGoodSubstrings(String s) {

        int size=s.length();
        int ans=0;

        for(int i=0;i<size-2;i++){
            char c1=s.charAt(i);
            char c2=s.charAt(i+1);
            char c3=s.charAt(i+2);

            if (c1!=c2 && c2!=c3 && c3!=c1) ans++;
        }
        return ans;
    }
}
