public class Main {
    public static void main(String[] args) {
        byte byteMin = -128; // -2^7
        byte byteMax = 127; // 2^7-1
        short shortMin = -32768; // -2^15
        short shortMax = 32767;  // -2^15-1д
        int intMin = -2100000000; // -2^31
        int intMax = 2100000000; // 2^31-1
        long longMin = -9000000000000000000L; // -2^63
        long longMax = 9000000000000000000L; // 2^63-1
        float floatVal = 1.23f; // 32bit
        double doubleVal = -1.234d; // 64bit
        System.out.println(floatVal);

        float piFlValue = (float)Math.PI;
        double piDblValue = Math.PI;
        System.out.println("Float value: " + piFlValue );
        System.out.println("Double value: " + piDblValue );

        boolean trueVal = true;
        boolean falseVal = false;

        char charVal = '\u2242';

        System.out.println(compare(10,5));
    }

    public int method(int a, int b, int c, int d){
        return a * (b + (c /d));
    }

    static public boolean compare(int value1, int value2){
        int summ = value1 + value2;
        return (summ<20 && summ>10);
    }

    private static void Compare(int i1) {
        if (i1>=0) {
            System.out.println("The number is positive");
        }
        else {
            System.out.println("The number is negative");
        }
    }

    private static void printGreeting(String nameGree) {
        System.out.println("Hi, " + nameGree);
    }    private static void isLeapYear(int year){
        if ((year!=0) && (year%4==0) && (year%100 !=0) || (year%400==0)) {
            System.out.println("Current year is " + year + ". It is a leap year");
        }
        else {
            System.out.println("Current year is " + year + ". It is not a leap year");
        }
    }



}
