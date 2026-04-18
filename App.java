// Basic GPA Calculator

import java.util.Scanner;
import java.util.Locale;

public class App{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); 

        // Variables
        int  phiyscs;
        int math;
        int english;
        int history;
        int music;
        int chemistry;
        double gpa;

        // Labels for get daha from user
        System.out.print("Enter your math score:");
        phiyscs = scanner.nextInt();
        System.out.print("Enter your math score:");
        math = scanner.nextInt();
        System.out.print("Enter your math score:");   
        music = scanner.nextInt();
        System.out.print("Enter your math score:");
        english = scanner.nextInt();
        System.out.print("Enter your math score:");
        history = scanner.nextInt();
        System.out.print("Enter your math score:");
        chemistry = scanner.nextInt();





        


        scanner.close();
    }
}