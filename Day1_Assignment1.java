import java.util.*;
import java.io.*;

class Day1_Assignment1 {

    public static void main(String args[]) {

        System.out.println(ASSIGNMENT 1");

        System.out.println("Electricity Bill...");
        float p = 1.20f;
        float c = 0.0f;

        System.out.println("Standard Unit Price : " +p);

        System.out.println("Enter the units : ");
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        System.out.println("");

        if (units < 100) {
            c = p * units;
        } 
	else if (units <= 300 && units >= 100) {
            float t1 = p * 100;
            float t2 = 2 * (units - 100);
            c = t1 + t2;
        }
	else {
            if (units > 300) {
                float t1 = p * 100;
                float t2 = 2 * 200;
                float t3 = 3 * (units - 300);
                c = t1 + t2 + t3;
            }
        }
        System.out.println("Final electricity bill : " + c);
        System.out.println("");
    }
}