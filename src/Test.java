import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Test {

    /**
     * @param args
     * @param string TODO
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n:");

        int n = scanner.nextInt();

        int row, col;

        for (row = 1; row <= n; row++) {
            for (col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}