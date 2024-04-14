/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dstar;

/**
 *
 * @author Raghad
 */
public class Dstar {

    public static void main(String[] args) {
        int size = 5; // Change this value to adjust the size of the star

        // Outer loop for number of rows
        for (int i = 0; i < size; i++) {
            // Inner loop for number of columns
            for (int j = 0; j < size; j++) {
                // Condition to print '*' at appropriate positions
                if (i == size / 2 || j == size / 2 || i + j == size - 1 || i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(); // Move to the next line after each row is printed
        }
    }
}

