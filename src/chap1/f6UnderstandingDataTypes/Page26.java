package chap1.f6UnderstandingDataTypes;

//Understanding data types

public class Page26 {
    public static void main(String[] args) {
        long max = 3123456789L;  // DOES NOT COMPILE needs L for Long

        //octal  (digits 0–7)
        int oct = 017;
        System.out.println("octal: " + oct);

        //hexadecimal (digits 0–9 and letters A–F/a–f)
        int hex = 0Xff99;
        System.out.println("hexadecimal: " + hex);

        //binary (digits 0–1)
        int bin = 0b11000;
        System.out.println("binary: " + bin);
    }
}
