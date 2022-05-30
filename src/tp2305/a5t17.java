package tp2305;

import java.util.Scanner;

public class a5t17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 20 || n > 69) {
            System.out.println("Notogri son berildi");
        }
        String[] units = {"bir", "ikki", "uch", "to'rt", "besh", "olti", "yetti", "sakkiz", "to'qqiz"};
        String[] decimals = {"o'n", "yigirma", "o'ttiz", "qirq", "ellik", "oltmish", "yetmish", "sakson", "to'qson"};

        int onlik = n / 10, birlik = n % 10;
        String on = onlik == 0 ? "" : decimals[onlik - 1] + " ";
        String bir = birlik == 0 ? "" : units[birlik - 1];

        System.out.println(on + bir);
    }
}
