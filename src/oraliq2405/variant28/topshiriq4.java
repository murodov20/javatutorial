package oraliq2405.variant28;

import java.util.Scanner;

public class topshiriq4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 1 || n > 999) {
            System.out.println("Notogri son berildi");
        }
        String str = "";
        if (n < 10) {
            str = "bir xonali";
        } else if (n < 100) {
            str = "ikki xonali";
        } else  {
            str = "uch xonali";
        }

        if (n % 2 == 0) {
            str = str + " juft son";
        } else  {
            str = str + " toq son";
        }

        System.out.println(str);
    }
}
