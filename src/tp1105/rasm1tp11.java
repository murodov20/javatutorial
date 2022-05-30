package tp1105;

import java.util.Scanner;

public class rasm1tp11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt(), n1 = scanner.nextInt(), n2 = scanner.nextInt();

        String []tomonlar = {"Shimol", "G'arb", "Janub", "Sharq"};
        int index = c-1 + n1 + n2;
        if (index > 3) {
            index = index - 4;
        }

        System.out.println(tomonlar[index]);
    }
}
