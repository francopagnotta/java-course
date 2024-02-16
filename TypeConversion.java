public class TypeConversion {
    public static void main(String[] args) {
        String numberString = "100";
        String logicalString = "true";

        System.out.println("-------- string number to other primitive types --------" + '\n');

        int integerNumber = Integer.parseInt(numberString);
        byte byteNumber = Byte.parseByte(numberString);
        short shortNumber = Short.parseShort(numberString);
        long longNumber = Long.parseLong(numberString);
        double doubleNumber = Double.parseDouble(numberString);
        boolean logicalBoolean = Boolean.parseBoolean(logicalString);



        System.out.println('\n' +"-------- integer to string --------" + '\n');

        String integerToString = Integer.toString(integerNumber); // Returns a String object representing the specified integer.
        System.out.println("otherNumberString = " + integerToString);

        integerToString = String.valueOf(integerNumber); // Returns the string representation of the argument (int, boolean, double, float, long, char, etc)
        System.out.println("otherNumberString = " + integerToString);

        integerToString = String.valueOf(integerNumber + 10);
        System.out.println("otherNumberString + 10 = " + integerToString);

        integerToString = String.valueOf(integerNumber + "10"); // trying to plus a string with a number results in a concatenation, no matter the order.
        // Unnecessary 'String.valueOf()' call because integerNumber + "10" results in a string concatenation so valueOf() return a string value but our variable is already a string.
        System.out.println("otherNumberString + string = " + integerToString);



        System.out.println('\n' +"-------- byte to string --------" + '\n');

        String byteToString = Byte.toString(byteNumber);
        System.out.println("byteToString = " + byteToString);

        byteToString = String.valueOf(byteNumber);
        System.out.println("byteToString = " + byteToString);



        System.out.println('\n' +"-------- short to string --------" + '\n');

        String shortToString = Short.toString(shortNumber);
        System.out.println("shortToString = " + shortToString);

        shortToString = String.valueOf(shortNumber);
        System.out.println("shortToString = " + shortToString);



        System.out.println('\n' +"-------- long to string --------" + '\n');

        String longToString = Long.toString(longNumber);
        System.out.println("longToString = " + longToString);

        longToString = String.valueOf(longNumber);
        System.out.println("longToString = " + longToString);



        System.out.println('\n' + "-------- double to string --------" + '\n');
        
        String doubleToString = Double.toString(doubleNumber);
        System.out.println("doubleToString = " + doubleToString);

        doubleToString = String.valueOf(doubleNumber);
        System.out.println("doubleToString = " + doubleToString);

        System.out.println('\n' + "-------- convert primitive types using casting --------" + '\n');

        int integerValue = 10000;
        short shortValue = (short) integerValue;
        System.out.println("casting int to short = " + shortValue);

        integerValue = 32768; // we will lose information if we try to cast an integer max value to short.
        shortValue = (short) integerValue;
        System.out.println("casting int to short exceeding the max allowed value of integer = " + shortValue);

        long longValue = integerValue; // there is no need to cast the integer value because the long type is bigger than the integer type.
        System.out.println("casting int to long = " + longValue);

        float floatValue = (float) integerValue;
        System.out.println("casting int to float = " + floatValue);
    }
}
