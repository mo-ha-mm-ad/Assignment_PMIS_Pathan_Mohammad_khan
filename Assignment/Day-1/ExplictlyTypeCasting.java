public class ExplictlyTypeCasting {

    public static void main(String[] args) {

        double originalDouble = 123.456;
        int castedInt = (int) originalDouble; 
        System.out.println("Explicit Casting (double to int): " + castedInt);

        long longVal = 300L;
        short shortVal = (short) longVal;
        System.out.println("Explicit Casting (long to short): " + shortVal);

        int bigInt = 130;
        byte byteVal = (byte) bigInt;
        System.out.println("Explicit Casting (int to byte with overflow): " + byteVal);
    }


}