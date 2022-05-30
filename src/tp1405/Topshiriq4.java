package tp1405;

import java.util.Scanner;

public class Topshiriq4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 4) {
            System.out.println("n noto'g'ri");
        }
        double []v = new double[n];

        v[0] = 0;
        v[1] = 0;
        v[2] = 1.5;

        int i = 4;
        do {
            int index = i - 1;
            v[index] = (i + 1) * v[index - 1] / (i * i + 1) - v[index - 2] * v[index - 3];
            i++;
        } while (i <= n);

        System.out.println(v[n - 1]);
    }
}
