/*
 * Program: Lab3.java
 * 
 * Author: Kaden Krider
 * Date:   2/5/2023
 * Course: CSCI251
 * 
 * Program Description:
 * 
 * This program  prompts a user to choose between a Ciruclar
 * Cone Volume Calculator, A BMI Calculator, Or a THR Calculator
 * The program then preforms a specific task based on the users input
 */


 import java.io.PrintStream;
import java.util.Scanner;

public class Lab3 {
  private static PrintStream printf;

/**
 * @param args
 */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Main Menu");
        System.out.println("-----------------------------------");
        System.out.println(" 1. Circular Cone Volume Calculator");
        System.out.println(" 2. BMI Calculator");
        System.out.println(" 3. THR Calculator");
        System.out.println("-----------------------------------");
        System.out.print("Enter Option : ");
        int choice = scan.nextInt();

        if (choice == 1) {
            Scanner input = new Scanner(System.in);
            System.out.println("\nThis program calculates the volume of a cone");
            System.out.println("==================================================");
            System.out.print("Please enter the radius (r) : ");
            double radius = input.nextDouble();
            System.out.print("Please enter the height (h) : ");
            double height = input.nextDouble();
            double volume = (1.0/3.0) * Math.PI * radius * radius * height;
            System.out.println("--------------------------------------------------");
            System.out.printf("The volume of the circular cone is : %.3f\n", volume);
            System.out.println("==================================================");
            
            
        } else if (choice == 2) {
            Scanner input = new Scanner(System.in);
            System.out.println("\nThis program calculates your Body Mass Index (BMI)");
            System.out.println("==================================================");
            System.out.print("Enter your weight in pounds : ");
            double weight = input.nextDouble();
            System.out.print("Enter your height in inches : ");
            double height = input.nextDouble();
            double BMI = (weight * 703) / (height * height);
            System.out.println("--------------------------------------------------");
            System.out.printf("Your BMI is : %.1f\n", BMI);
            System.out.println("==================================================");
            
            
        } else if (choice == 3) {
            Scanner input = new Scanner(System.in);
            System.out.println("\nThis program calculates your Target Heart Rate (THR)");
            System.out.println("==================================================");
            System.out.print("Please enter your age in years : ");
            int age = input.nextInt();
            double intensity = 0.75;
            double THR = (220 - age) * intensity;
            System.out.println("--------------------------------------------------");
            System.out.println("Your intensity is " + (int)(intensity * 100) + "%");
            System.out.println("--------------------------------------------------");
            System.out.println("Your THR is : " + THR);
            System.out.println("==================================================");
        } 
    }


}



