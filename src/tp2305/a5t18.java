package tp2305;

import java.util.Scanner;

public class a5t18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 100 || n > 999) {
            System.out.println("Notogri son berildi");
        }
        String[] units = {"bir", "ikki", "uch", "to'rt", "besh", "olti", "yetti", "sakkiz", "to'qqiz"};
        String[] decimals = {"o'n", "yigirma", "o'ttiz", "qirq", "ellik", "oltmish", "yetmish", "sakson", "to'qson"};
        int yuzlik = n / 100, onlik = (n % 100) / 10, birlik = n % 10;

        String yuz = units[yuzlik - 1] + " yuz ";
        String on = onlik == 0 ? "" : decimals[onlik - 1] + " ";
        String bir = birlik == 0 ? "" : units[birlik - 1];

        System.out.println(yuz + on + bir);
    }
}
