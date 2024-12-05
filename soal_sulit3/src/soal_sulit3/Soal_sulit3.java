/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal_sulit3;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Soal_sulit3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = {3, 7, 3, 1, 7, 7, 5,};

        int palingSeringMuncul = 0;
        int nilaiTertinggi = 0;

        for (int i = 0; i < array.length; i++) {
             int a = 0;

        for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    a++;
                }
            }

            if (a > palingSeringMuncul) {
                palingSeringMuncul = a;
                nilaiTertinggi = array[i];
            }
        }

        System.out.println("Nilai tertinggi yang paling sering muncul adalah " + nilaiTertinggi + " sebanyak " + palingSeringMuncul + " kali");
    }
}
