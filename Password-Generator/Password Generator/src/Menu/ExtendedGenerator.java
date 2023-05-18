package Menu;

import java.util.Scanner;

public class ExtendedGenerator extends Generator {
    public ExtendedGenerator(Scanner scan) {
        super(scan);
    }

    public ExtendedGenerator(boolean HurufBesar, boolean HurufKecil, boolean angka, boolean simbol) {
        super(HurufBesar, HurufKecil, angka, simbol);
    }

    public void pilihanLoop() {
        pilihan.displayMenu();
        String userOpsi = "-1";

        while (!userOpsi.equals("4")) {

            userOpsi = key.next();

            switch (userOpsi) {
                case "1":
                    userPassGenerate(false);
                    pilihan.displayMenu();
                    break;
                case "2":
                    passwordStrength.passCheck();
                    pilihan.displayMenu();
                    break;
                case "3":
                    pilihan.pesanKeluar();

                    break;
                default:
                    System.out.println();
                    System.out.println("Pilih yang betul @_@");
                    pilihan.displayMenu();
            }
        }
    }
}