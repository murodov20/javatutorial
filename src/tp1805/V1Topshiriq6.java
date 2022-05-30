package tp1805;

import java.util.Scanner;

public class V1Topshiriq6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double uzunlik = scanner.nextDouble();
        int birlik = scanner.nextInt();
        if (birlik < 0 || birlik > 5) {
            System.out.println("Notog'ri birlik");
        }

        switch (birlik) {
            case 1:
                System.out.printf("%.2f\n", uzunlik * 1000);
                break;
            case 2:
                System.out.println(uzunlik);
                break;
            case 3:
                System.out.printf("%.2f\n", uzunlik / 10);
                break;
            case 4:
                System.out.printf("%.2f\n", uzunlik / 100);
                break;
            default:
                System.out.printf("%.2f\n", uzunlik / 1000);
        }
    }
}
