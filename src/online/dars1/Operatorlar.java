package online.dars1;

public class Operatorlar {

    public static void main(String[] args) {
        int a = 100;
        boolean b = false;
        // unar amallar
//        System.out.println(a++);
//        System.out.println(a);
//        System.out.println(++a);
//        System.out.println(~a);
//        System.out.println(!b);

        // Arifmetik amallar */%=-


        // Shift amallari yoki o'tkazish(surish) amallari
        System.out.println(a << 3); //100*2^3=10*8=80
        System.out.println(a >> 2); // 100/2^2
        System.out.println(a >>> 2); // 100/2^2 deyarli bir xil lekin manfiylar uchun boshqacha


        // qiyoslash operatorlari: == != < > <= >= instanceof

        //bit bilan ishlash operatorlari & | ^


        // logik operatorlar:   && 	||
//        System.out.println(a > 200 && b);

        // Ternar operatori ? :
//        System.out.println(a > 200 ? "200dan katta" : "200dan kichik");

        // tenglashtirish operatorlari = += -= *= /= %= &= ^= |= <<= >>= >>>=
//        a = a + 20;
//        a = a - 20;
//        a *= 2;
    }
}
