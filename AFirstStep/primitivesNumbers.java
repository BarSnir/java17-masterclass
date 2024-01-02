package AFirstStep;

public class primitivesNumbers {
    public static void main(String[] args) {
        Byte myMinByte = Byte.MIN_VALUE;
        Byte myMaxByte = Byte.MAX_VALUE;
        Short myMinShort = Short.MIN_VALUE;
        Short myMaxShort = Short.MAX_VALUE;
        Long myMinLong= Long.MIN_VALUE;
        Long myMaxLong = Long.MAX_VALUE;
        Float myMinFloat = Float.MIN_VALUE;
        Float myMaxFloat = Float.MAX_VALUE;
        Double myMinDouble = Double.MIN_VALUE;
        Double myMaxDouble = Double.MAX_VALUE;
        System.out.println("Byte range is: "+ myMinByte + " - " + myMaxByte);
        System.out.println("Short range is: "+ myMinShort + " - " + myMaxShort);
        System.out.println("Long range is: "+ myMinLong + " - " + myMaxLong);
        System.out.println("Float range is: "+ myMinFloat + " - " + myMaxFloat);
        System.out.println("Double range is: "+ myMinDouble + " - " + myMaxDouble);

        // Shorthand assignment
        Byte custom = 100, custom2 = 50;
        // Casting
        Integer myCustomInt = (int)(custom+custom2);
        System.out.println(myCustomInt);
        // Now it will return "10"  
        int i=10;  
        String s =String.valueOf(i);
        System.out.println(s.getClass());
        Float myFloat = (float) 5.0;
        Double myDouble = 50000.99999999;
        myDouble = 5D;
        System.out.println(myFloat+myDouble);

        // Range examples
        Integer myInt = 5;
        Integer myInt2 = 3;
        Float myTrueFloat = 3f;
        
        System.out.println((myInt/myInt2)+" This is a complete number :(");
        System.out.println((myInt/myTrueFloat)+" This is a true number :)");
    }
}
