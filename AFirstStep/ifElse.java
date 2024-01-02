package AFirstStep;

public class ifElse {
    public static void main(String[] args) {
        Integer myInt = 1;
        if ( myInt > 0 ) {
            System.out.println("Greater than 0");
        }
        else {
          System.out.println("Less than 0");
        }

        Boolean myBoolean = true;
        if (myBoolean == false){
          System.out.println("The boolean is true");            
        } else if (myBoolean) {
            System.out.println("The boolean is true with short hand");
        } else {
            // do something
        }


        if (myBoolean && myInt >= 1) {
            System.out.println("And operator");            
        }

        if (myInt == 0 || myBoolean) {
            System.out.println("Still working with Or operator");            
        }

        if (myInt == 1 || !myBoolean) {
            System.out.println("Look at the Not operator '!' ");            
        }

        // Ternary operator
        myInt = myBoolean ? 1 : 0;
        System.out.println("myInt is 1, actual results = " + myInt + " (bool) ? true : false -> is Ternary ops");


        Double myDouble1 = 20.0;
        Double myDouble2 = 80.0;
        Double myDouble3 = (myDouble1 * myDouble2);
        Double myDouble4 = myDouble3%40.0;
        Boolean isZero =  myDouble4 == 0.00 ? true : false;
        if (isZero) {
            System.out.println("No reminder.");
        } else {
            System.out.println("We got reminder.");
        }
    }
}
