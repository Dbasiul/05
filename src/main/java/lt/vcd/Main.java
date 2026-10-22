package lt.vcd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Iveskite auksti: ");
        int h = sc.nextInt();
        System.out.print("Iveskite ploti: ");
        int w = sc.nextInt();
        
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                // Jei pirma eilute, paskutine eilute, pirmas stulpelis arba paskutinis stulpelis
                if (i == 0 || i == h - 1 || j == 0 || j == w - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
