import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class leet_832 {


    public static void main(String[] args) {
        int[][] image = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};


        int rows = image.length;
        int collumn = image[0].length;

        for (int i = 0; i < rows; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = collumn - 1; j >= 0; j--) {
                sb.append(image[i][j] ^ 1);
            }
            for (int j = 0; j < collumn; j++) {
                image[i][j] = sb.charAt(j) - '0';
            }
        }

    }


    }














