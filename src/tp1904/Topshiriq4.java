package tp1904;

import java.util.Scanner;

public class Topshiriq4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt(), m = scanner.nextInt();

        String[] burjlar = {
                "suvchi",
                "baliq",
                "qo'y",
                "buzoq",
                "egizaklar",
                "qisqichbaqa",
                "arslon",
                "parizod",
                "tarozi",
                "chayon",
                "yoy",
                "tog' echkisi",
        };
        int index = m;
        if (d > 21) {
            index++;
        }
        if (index == 13) {
            index = 1;
        }
        System.out.println(burjlar[index - 1]);

    }
}
