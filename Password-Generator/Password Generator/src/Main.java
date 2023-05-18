import java.util.Scanner;

import Menu.ExtendedGenerator;

public class Main {

    public static final Scanner key = new Scanner(System.in);

    public static void main(String[] args) {
        ExtendedGenerator generate = new ExtendedGenerator(key);
        generate.pilihanLoop();
        key.close();
    }
}
