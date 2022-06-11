package online.dars1;

public class ButunSonlar {

    public static void main(String[] args) {
        byte b = 127; // [-128; 127]
        short s = 32767; // [-32768; 32767]
        int i = 2147483647; // [-2147483648; 2147483647]
        long l = (long) Math.pow(2, 62); // [-2^63; 2^63-1]

    }
}
