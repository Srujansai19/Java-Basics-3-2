//public class VariableBug {
//
//    public static void main(String[] args) {
//
//        int age = "20"; //String assigned to int
//
//        int marks;
//        System.out.println(marks); //Variable not initialized
//
//        int a = 10;
//        int b = 0;
//        int result = a / b; //Division by zero
//        System.out.println(result);
//
//        System.out.println(name); //Variable used before declaration
//        String name = "Srujan";
//
//        final int MAX = 100;
//        MAX = 200; //Cannot modify final variable
//    }
//}


public class VariableBug {

    public static void main(String[] args) {

        int age = 20;

        int marks = 0;
        System.out.println(marks);

        int a = 10;
        int b = 2;
        int result = a / b;
        System.out.println(result);

        String name = "Srujan";
        System.out.println(name);

        final int MAX = 100;
        System.out.println("Max value: " + MAX);
    }
}
