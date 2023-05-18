package Menu;

import java.util.Scanner;

public class Generator {
    public Huruf Huruf;
    public static Scanner key;
    public String text;

    public Generator(Scanner scan) {
        key = scan;
        Huruf = new Huruf(true, true, true, true);
    }

    public Generator(boolean HurufBesar, boolean HurufKecil, boolean angka, boolean simbol) {
        Huruf = new Huruf(HurufBesar, HurufKecil, angka, simbol);
    }

    public passwordStrength GeneratePassword(int length) {
        final StringBuilder pass = new StringBuilder("");

        final int lengthHuruf = Huruf.getHuruf().length();

        int max = lengthHuruf - 1;
        int min = 0;
        int range = max - min + 1;

        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * range) + min;
            pass.append(Huruf.getHuruf().charAt(index));
        }

        return new passwordStrength(pass.toString());
    }

    public void userPassGenerate(boolean includeCustomText) {
        boolean HurufBesar = true;
        boolean HurufKecil = true;
        boolean angka = true;
        boolean simbol = true;

        boolean bool;

        System.out.println();
        System.out.println("jawab dengan y/n");
        do {
            String input;
            bool = false;

            do {
                System.out.println("ingin tertermasuk huruf kecil?");
                input = key.next();
                userPassError(input);
            } while (!input.equalsIgnoreCase("y") && !input.equalsIgnoreCase("n"));

            if (termasuk(input))
                HurufKecil = true;

            do {
                System.out.println("ingin tertermasuk huruf besar?");
                input = key.next();
                userPassError(input);
            } while (!input.equalsIgnoreCase("y") && !input.equalsIgnoreCase("n"));

            if (termasuk(input))
                HurufBesar = true;

            do {
                System.out.println("ingin tertermasuk angka?");
                input = key.next();
                userPassError(input);
            } while (!input.equalsIgnoreCase("y") && !input.equalsIgnoreCase("n"));

            if (termasuk(input))
                angka = true;

            do {
                System.out.println("ingin tertermasuk simbol?");
                input = key.next();
                userPassError(input);
            } while (!input.equalsIgnoreCase("y") && !input.equalsIgnoreCase("n"));

            if (termasuk(input))
                simbol = true;

            // No Pool Selected
            if (!HurufBesar && !HurufKecil && !angka && !simbol) {
                System.out.println("Kok gak pilih apa-apa? @_@ \n");
                bool = true;
            }

        } while (bool);

        System.out.println("Ingin seberapa panjang\t:");
        int length = key.nextInt();

        if (includeCustomText) {
            System.out.println("masukkan text khusus :");
            // String customText = key.next();

            final Generator generator = new Generator(HurufBesar, HurufKecil, angka, simbol);
            final passwordStrength password = generator.GeneratePassword(length);

            System.err.println("Hasil\t\t:" + password);
        } else {
            final Generator generator = new Generator(HurufBesar, HurufKecil, angka, simbol);
            final passwordStrength password = generator.GeneratePassword(length);
            System.err.println("Hasil\t\t:" + password);
        }
    }

    private boolean termasuk(String Input) {
        if (Input.equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }
    }

    private void userPassError(String i) {
        if (!i.equalsIgnoreCase("y") && !i.equalsIgnoreCase("n")) {
            System.out.println("Ketik yang betul @_@ \n");
        }
    }

}
