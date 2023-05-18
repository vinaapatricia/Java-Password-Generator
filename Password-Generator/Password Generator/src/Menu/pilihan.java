package Menu;

import java.util.Scanner;

public class pilihan {
    public static Scanner key;
    Generator generate = new Generator(null);

    public pilihan(Scanner scan) {
        key = scan;
    }

    public static void pesanKeluar() {
        System.out.println("Program Selesai");
    }

    public static void displayMenu() {
        System.out.println();
        System.out.println("1. Password Generator");
        System.out.println("2. Check Kekuatan Password");
        System.out.println("3. Keluar\nPilih:");
    }

}
