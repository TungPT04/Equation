/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.Scanner;

/**
 *
 * @author tung
 */
public class Validation {
    protected Scanner sc = new Scanner(System.in);

    public int validateMenuOption(int firstOption, int lastOption) {
        int option;

        while (true) {
            try {
                option = Integer.parseInt(sc.nextLine().trim());
                if (option < firstOption || option > lastOption) {
                    throw new NumberFormatException();
                }
                return option;
            } catch (NumberFormatException e) {
                System.out.println("Option must be between " + firstOption + " and " + lastOption);
                System.out.print("Your choice: ");
            }
        }
    }

    public double validateDouble() {
       
        double inputDouble;

        while (true) {
            try {
                inputDouble = Double.parseDouble(sc.nextLine().trim());
                return inputDouble;
            } catch (NumberFormatException e) {
                System.out.println("Please input a valid Double number!!!");
                System.out.print("Enter Double number: ");
            }
        }
    }

    public boolean isOdd(double inputNumber) {
        return inputNumber % 2 != 0;
    }

    public boolean isEven(double inputNumber) {
        return inputNumber % 2 == 0;
    }

    public boolean isSquare(double inputNumber) {
        if (inputNumber < 0) {
            return false; 
        }
        return Math.sqrt(inputNumber) % 1 == 0; 
    }
}