package TazwarBelal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double x = Math.random();
        int y = (int) (x * 11);
        System.out.println("x=" +y);
        if (!(x == 5)){
            System.out.println("that is not correct");
        }
        System.out.println("That is correct");
    }
}
