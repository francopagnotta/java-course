public class Primitives { // represent values
    public static void main(String[] args) {

        System.out.println("------------- byte ------------------");

        // byte
        byte byteNumber = 127;
        System.out.println("byteNumber = " + byteNumber);
        System.out.println("Byte type in byte: " + Byte.BYTES); // 1
        System.out.println("Byte type in bites: " + Byte.SIZE); // 8
        System.out.println("Max value of a Byte : " + Byte.MAX_VALUE); // 127
        System.out.println("Min value of a Byte : " + Byte.MIN_VALUE); // -128

        
        System.out.println("------------- short ------------------");

        // short
        short shortNumber = 32767;
        System.out.println("shortNumber = " + shortNumber);
        System.out.println("Short type in byte: " + Short.BYTES); // 2
        System.out.println("Short type in bites: " + Short.SIZE); // 16
        System.out.println("Max value of a Short : " + Short.MAX_VALUE); // 32767
        System.out.println("Min value of a Short : " + Short.MIN_VALUE); // -32768


        System.out.println("------------- int ------------------");

        // int
        int intNumber = 2147483647;
        System.out.println("intNumber = " + intNumber);
        System.out.println("Integer type in byte: " + Integer.BYTES); // 4
        System.out.println("Integer type in bites: " + Integer.SIZE); // 32
        System.out.println("Max value of an Integer : " + Integer.MAX_VALUE); // 2147483647
        System.out.println("Min value of an Integer : " + Integer.MIN_VALUE); // -2147483648


        System.out.println("------------- long ------------------");

        // long
        long longNumber = 9223372036854775807L; // add L to convert the literal value type int to type long
        System.out.println("longNumber = " + longNumber);
        System.out.println("Long type in byte: " + Long.BYTES); // 8
        System.out.println("Long type in bites: " + Long.SIZE); // 64
        System.out.println("Max value of a Long : " + Long.MAX_VALUE); // 9223372036854775807
        System.out.println("Min value of a Long : " + Long.MIN_VALUE); // -9223372036854775808


        System.out.println("------------- float ------------------");

        // float
        float floatNumber = 3.4028235E38F; // for values with decimals, add F to convert double type to float type
        System.out.println("floatNumber = " + floatNumber);
        System.out.println("Float type in byte: " + Float.BYTES); // 4
        System.out.println("Float type in bites: " + Float.SIZE); // 32
        System.out.println("Max value of a Float : " + Float.MAX_VALUE); // 3.4028235E38
        System.out.println("Min value of a Float : " + Float.MIN_VALUE); // 1.4E-45

        float floatA = 1;
        System.out.println("floatA = " + floatA); // floatA = 1.0

        float floatB = 1.0F;
        System.out.println("floatB = " + floatB); // floatB = 1.0

//        float floatC = 2120F;
        float floatC = 2.12e3F;
        System.out.println("floatC = " + floatC); // floatC = 2120.0

//        float floatD = 0.00212F;
        float floatD = 2.12e-3F;
        System.out.println("floatD = " + floatD); // floatD = 0.00212


        System.out.println("------------- double ------------------");

        // double
        double doubleNumber = 1.7976931348623157E308; // for values with decimals too, but with more precision
        System.out.println("doubleNumber = " + doubleNumber);
        System.out.println("Double type in byte: " + Double.BYTES); // 8
        System.out.println("Double type in bites: " + Double.SIZE); // 64
        System.out.println("Max value of a Double : " + Double.MAX_VALUE); // 1.7976931348623157E308
        System.out.println("Min value of a Double : " + Double.MIN_VALUE); // 4.9E-324


        System.out.println("------------- var ------------------");

        // var
        var integerValue = 2147483647; // to assign the data type dynamically and automatically depending on the literal value.
        var longValue = 2147483648L;


        System.out.println("------------- char ------------------");

        // char
        char characterA = 'a'; // only one character
        System.out.println("characterA = " + characterA);

        System.out.println("characterA = " + characterA);
        System.out.println("Character type in byte: " + Character.BYTES); // 2
        System.out.println("Character type in bites: " + Character.SIZE); // 16

        char characterB = '7';
        System.out.println("characterB = " + characterB);

//        char characterC = '\u0040'; // UNICODE type, but can be replaced with '@'
        char characterC = '@';
        System.out.println("characterC = " + characterC);

        char characterD = '!';
        System.out.println("characterD = " + characterD);
        
        char space = ' ';
        System.out.println("A" + space + "B" + space + "C");

        char backSpace = '\b';
        System.out.println("ABC with backspace from C to B = ABC" + backSpace);
        System.out.println("ABC with backspace from C to A = ABC" + backSpace + backSpace);

        char tabulator = '\t';
        System.out.println("text with tabulator:" + tabulator + "text" + tabulator + "text");

        char lineBreak = '\n';
        System.out.println("text with linebreaks:" + lineBreak + "text" + lineBreak + "text" + lineBreak + "text");


        System.out.println("------------- boolean ------------------");
        
        // boolean
        boolean logicalA = false;
        System.out.println("logicalA = " + logicalA);

        boolean logicalB = Boolean.FALSE; // returns an instance of Boolean Class that is converted to a primitive value
        System.out.println("logicalB = " + logicalB);

        boolean logicalC = Boolean.TRUE;
        System.out.println("logicalC = " + logicalC);
        
        double numberA = 98765.43e-3;
        float numberB = 1.2345e2F;
        boolean logicalD = numberA > numberB;
        System.out.println("logicalD = " + logicalD);
    }
}
