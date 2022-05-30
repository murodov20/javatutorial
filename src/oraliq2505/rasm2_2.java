package oraliq2505;

import java.util.Scanner;

public class rasm2_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 0) {
            System.out.println("nol soni");
        } else {
            String str = "";
            if (n > 0) {
                str = "musbat";
            } else {
                str = "manfiy";
            }

            if (n % 2 == 0) {
                str = str + " juft son";
            } else  {
                str = str + " toq son";
            }

            System.out.println(str);
        }
    }
}
