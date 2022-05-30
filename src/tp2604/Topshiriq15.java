package tp2604;

import java.util.Scanner;

public class Topshiriq15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        String[] gullar = {"toppon", "g'isht", "chillik", "qarg'a"};
        String[] nomerlar = {"6", "7", "8", "9", "10", "valit", "dama", "karol", "tuz"};

        if (n < 6 || n > 14 || m < 1 || m > 4) {
            System.out.println("Notogri raqam berildi");
        }
        else {
            System.out.println(nomerlar[n - 6] + " " + gullar[m - 1]);
        }
    }
}
