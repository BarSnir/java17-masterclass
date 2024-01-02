package BStatements;

public class Overloading {
    public static void main(String[] args) {
        printVal("String");
        printVal(1);
        printVal("1");
        printVal(1,"1");
        printVal();
    }

    public static void printVal(String arg) {
        System.out.println("String arg: "+ arg);
    }

    public static void printVal(Integer arg) {
        System.out.println("Int arg: "+ arg);
    }

    public static void printVal(Integer arg, String arg2) {
        System.out.println("Int arg: "+ arg + " And String arg: " +  arg2);
    }

    public static void printVal() {
        System.out.println("Default...");
    }
}
