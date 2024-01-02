package BStatements;

public class Methods {
    public static void main(String[] args) {
        get_variable(true);
    }

    public static void get_variable(boolean toPrint) {
        if (toPrint) {
            System.out.println("Hey from another method");
        }
    }

}
