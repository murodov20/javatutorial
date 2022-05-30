package oraliq2505;

import java.util.Scanner;

public class rasm1_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("x, a, y va b ni kiriting");
        int x = scanner.nextInt(), a = scanner.nextInt(), y = scanner.nextInt(), b = scanner.nextInt();

        int choco = a / x, iris = b / y, farq = choco - iris;
        System.out.println(choco + " " + iris + " " + farq);
    }
}
