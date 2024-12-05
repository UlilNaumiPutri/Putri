/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */  
package soal_mudah3;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Soal_mudah3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        for (int put = 50; put >= 1; put--) {

            if (put== 1) {
                System.out.println(put + "saya senang");
            } else if (put % 3 == 0) {
                System.out.println(put + ". saya angkatan 33");
            } else if (put % 2 == 0) {
                System.out.println(put + ". saya anak moklet");
            } else {
                System.out.println(put+ ". saya anak wikusama");
            }
        }
    }
}
