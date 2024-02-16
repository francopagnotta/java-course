public class StringClass {
    public static void main(String[] args) {
        String course = "Programming with Java";
        String course2 = new String("Programming with Java"); // this new creates a new instance of String class.
        String course3 = "Programming with Java";

        boolean isEqual = course == course2; // to compare by reference, the output is false because course and course2 are different objects.
        System.out.println("comparing with == " + isEqual);

        isEqual = course.equals(course2); // to compare with the values. The result is true if and only if the argument is not null and is a String object that represents the same sequence of characters as this object.
        System.out.println("comparing with equals() " + isEqual);

        course2 = "PROGRAMMING WITH JAVA";
        isEqual = course.equalsIgnoreCase(course2);
        System.out.println("comparing with equalsIgnoreCase() " + isEqual);

        isEqual = course == course3; // is true because
        System.out.println("comparing literal with literal " + isEqual);
    }
}