package tp2604;

import java.util.Scanner;

public class Topshiriq15_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();

        if (n < 6 || n > 14 || m < 1 || m > 4) {
            System.out.println("Notogri raqam berildi");
        } else {
            if (n <= 10) {
                System.out.print(n);
            } else {
                switch (n) {
                    case 11:
                        System.out.print("valit");
                        break;
                    case 12:
                        System.out.print("dama");
                        break;
                    case 13:
                        System.out.print("karol");
                        break;
                    default:
                        System.out.print("tuz");
                }
            }
            System.out.print(" ");
            switch (m) {
                case 1:
                    System.out.println("toppon");
                    break;
                case 2:
                    System.out.println("g'isht");
                    break;
                case 3:
                    System.out.println("chillik");
                    break;
                default:
                    System.out.println("qarg'a");
            }
        }
    }


}
