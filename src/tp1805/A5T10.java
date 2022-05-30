package tp1805;

import java.util.Scanner;

public class A5T10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt(), n = scanner.nextInt();

        String []tomonlar = {"Shimol", "G'arb", "Janub", "Sharq"};
        int index = c-1 + n;
        if (index > 3) {
            index = index - 4;
        }

        System.out.println(tomonlar[index]);
    }
}
