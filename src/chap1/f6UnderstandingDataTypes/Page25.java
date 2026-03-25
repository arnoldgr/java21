package chap1.f6UnderstandingDataTypes;

//Eight primitive types
public class Page25 {
    public static void main(String[] args) {
        //boolean
        boolean bool = true;

        //byte min -128 max 127  8-bit integral value
        byte b = -128;

        //short min -32,768 max 32,767  16-bit integral value
        short sh = 32767;

        //int min -2,147,483,648 max 2,147,483,647  32-bit integral value
        int i = -2147483648;

        //long  64-bit integral value
        long l = -2147483648999999999L;

        //float  32-bit floating-point value
        float f = -77777777777999999999999999999999999999.999999999F;

        //double  32-bit floating-point value
        double db = -77777777777999999999999999999999999999.9999999999999999999999999999999999999999;

        //char max 65,535 eg 'a'
        char a = 6553;
        char a2 = 'a';
        System.out.println("char " + a);
        System.out.println("char2 " + a2);
    }
}
