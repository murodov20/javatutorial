package tp1105;

import java.util.Scanner;

public class rasm4tp20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float x1 = scanner.nextFloat(), y1 = scanner.nextFloat();
        float x2 = scanner.nextFloat(), y2 = scanner.nextFloat();
        float x3 = scanner.nextFloat(), y3 = scanner.nextFloat();

        float a = (float) Math.sqrt( Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) );
        float b = (float) Math.sqrt( Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2) );
        float c = (float) Math.sqrt( Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2) );

        float P = a + b + c, p = P / 2;
        float S = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println("P:" + P);
        System.out.println("S:" + S);
    }
}
