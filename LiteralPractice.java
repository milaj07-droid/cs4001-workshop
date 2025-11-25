public class LiteralPractice {
    public static void main(String[] args) {
        //integral literal
        int speed=200;
        // Long literal (needs 'L' suffix to specify it is a long literal)
        long bigNumber = 9876543210L;

        // Float literal (needs 'f' suffix to specify it is a float literal)
        float floatValue = 12.34f;

        // Char literal using Unicode escape sequence
        char copyrightSymbol = '\u00A9'; // Unicode for char
        
        //boolean literal
        boolean isSpringSession = true;

        // Printing the values
        System.out.println("Integer Value: " + speed);
        System.out.println("Long value: " + bigNumber);
        System.out.println("Float value: " + floatValue);
        System.out.println("Unicode char value: " + copyrightSymbol);
        System.out.println("Boolean value: " +isSpringSession );
    }
}