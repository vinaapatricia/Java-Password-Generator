package Menu;

import java.util.Scanner;

public class passwordStrength {
    private String value;
    private int length; // enkap

    static Scanner key = new Scanner(System.in);

    public static void passCheck() {

        System.out.print("\nInput passwordnya\t:");
        String input = key.next();

        passwordStrength p = new passwordStrength(input);

        System.out.println(p.hitungSkorPass());
    }

    public passwordStrength(String value) {
        this.value = value;
        this.length = value.length();
    }

    public String getValue() {
        return value;
    }

    public int getLength() {
        return length;
    }

    public int CharType(char C) {
        if ((int) C >= 'A' && (int) C <= 'Z')
            return 1; // upper
        else if ((int) C >= 'a' && (int) C <= 'z') {
            return 2; // lower
        } else if ((int) C >= '0' && (int) C <= '9') {
            return 3; // digit
        } else {
            return 4; // sym
        }
    }

    public int PasswordStrength() {
        int upperCase = 0;
        int lowerCase = 0;
        int digit = 0;
        int symbol = 0;
        int Score = 0;

        for (int i = 0; i < this.value.length(); i++) {
            char c = this.value.charAt(i);
            int type = CharType(c);

            if (type == 1) {
                upperCase++;
            } else if (type == 2) {
                lowerCase++;
            } else if (type == 3) {
                digit++;
            } else {
                symbol++;
            }
        }

        if (upperCase > 0)
            Score += 1;
        if (lowerCase > 0)
            Score += 1;
        if (digit > 0)
            Score += 1;
        if (symbol > 0)
            Score += 1;

        if (this.value.length() >= 6 && this.value.length() <= 10) {
            Score++;
        } else if (this.value.length() >= 11) {
            Score += 2;
        }

        return Score;
    }

    public String hitungSkorPass() {
        int Score = PasswordStrength();

        if (Score == 6) {
            return "Password Sangat Kuat";
        } else if (Score >= 4) {
            return "Password Kuat";
        } else if (Score >= 3) {
            return "Password Lemah";
        } else {
            return "Password Sangat Lemah";
        }
    }

    @Override
    public String toString() {
        return value;
    }
}