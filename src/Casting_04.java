import Loops.test;

public class Casting_04 {

    public static void main(String[] args) {
        // 1) Implicit casting (int is converted to long, casting is not needed).
        int  i = 65;
        long l = i;

        // 2) Explicit casting (long is converted to int, casting is needed).
        long j = 656666L;
        int  k = (int) j;


//        Downcasting: If you have a reference variable that refers to a subtype object,
//        you can assign it to a reference variable of the subtype.
//        You must make an explicit cast to do this, and the result is that
//        you can access the subtype's members with this new reference variable.
//
//        Upcasting: You can assign a reference variable to a supertype reference variable explicitly or implicitly.
//        This is an inherently safe operation
//        because the assignment restricts the access capabilities of the new variable.


        //Narrowing
        double GPA = 3.8;
        System.out.println(GPA);
        int GPA1 = (int) GPA;
        System.out.println(GPA1);

        //Widening
        double myInt = 90;
        double myDouble = myInt; // System.out.println((double) myInt);
        System.out.println((int) myInt); //no need to down/upcasting direct casting
//        System.out.println(myDouble);

        int num1 = 6;
        int num2 = 3;

        System.out.println((double)num2/num1);

        //test 123456

    }


}
