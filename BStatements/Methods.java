package BStatements;

public class Methods {
    public static void main(String[] args) {
        printVal(true);
        String val = getVal();
        System.out.println(val);
        Methods methods = new Methods();
        String myString2 = methods.getValPublic();
        System.out.println(myString2);
    }

    public static void printVal(boolean toPrint) {
        if (toPrint) {
            System.out.println("Hey from another method");
        }
    }

    public static String getVal() {
        return "Hello Java from pure function :)";
    }

    public String getValPublic() {
        return "This is my public function";
    }

}
