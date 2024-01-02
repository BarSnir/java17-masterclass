package AFirstStep;

public class primitivesBooleans {
    public static void main(String[] args) {
        Boolean myBool = true;
        myBool = false;
        System.out.println(myBool);
        // single char
        char myChar = 'D';
        myChar = '\u0044';
        myChar = 68;
        System.out.println(myChar);

        // Memory Mgmt
        int result = 1;
        int prevResult = result;
        result = result -1;
        System.out.println(result);
        System.out.println(prevResult);
    }
}
