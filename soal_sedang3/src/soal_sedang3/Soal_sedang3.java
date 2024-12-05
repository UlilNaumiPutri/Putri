/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal_sedang3;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author user6
 * 
 */
public class Soal_sedang3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean running = true;

        while (running) {
            int bil1 = random.nextInt(10) + 1; 
            int bil2 = random.nextInt(10) + 1; 
            char operator;
            int hasilBenar = 0;

            switch (random.nextInt(3)) {
                case 0:
                    operator = '*';
                    hasilBenar = bil1 * bil2;
                    break;
                case 1:
                   operator = '/';
                   hasilBenar = bil1 / bil2;
                    break;
                   
                default:
                    operator = '%';
                    hasilBenar = bil1 % bil2;
                    break;
            }

            System.out.print(bil1 + " " + operator + " " + bil2 + " = ");
            int jawaban = scanner.nextInt();

            if (jawaban == hasilBenar) {
                System.out.println("Jawaban Anda benar!");
            } else {
                System.out.println("Jawaban Anda salah. Jawaban yang benar adalah: " + hasilBenar);
            }

            scanner.nextLine(); 
            System.out.print("Apakah Anda ingin melanjutkan kuis? (iya/tidak): ");
            String lanjut = scanner.nextLine().toLowerCase();

            if (lanjut.equals("tidak")) {
                running = false;
                System.out.println(" kuis telah selesai");
            }
        }
        scanner.close();
    }
}