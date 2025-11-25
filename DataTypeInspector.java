
public class DataTypeInspector
{
    public static void main(String[] args){
      
        byte byteValue = 10;              // byte
        short shortValue = 200;           // short
        int intValue = 50000;             // int
        long longValue = 10000000000L;    // long (must add L)

        float floatValue = 5.75f;         // float (must end with f)
        double doubleValue = 19.999;      // double

        char charValue = 'A';             // char
        boolean boolValue = true;         // boolean

        System.out.println("Byte value: " + byteValue);
        System.out.println("Short value: " + shortValue);
        System.out.println("Int value: " + intValue);
        System.out.println("Long value: " + longValue);
        System.out.println("Float value: " + floatValue);
        System.out.println("Double value: " + doubleValue);
        System.out.println("Char value: " + charValue);
        System.out.println("Boolean value: " + boolValue);
        
    }
    
}