package tp1805;

import java.util.Scanner;

public class A4T5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();

        int manfiy = 0, musbat = 0;
        if (a > 0) {
            musbat++;
        }
        if (a < 0) {
            manfiy++;
        }
        if (b > 0) {
            musbat++;
        }
        if (b < 0) {
            manfiy++;
        }
        if (c > 0) {
            musbat++;
        }
        if (c < 0) {
            manfiy++;
        }
    }
}
