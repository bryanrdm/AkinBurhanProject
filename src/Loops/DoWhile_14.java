package Loops;

public class DoWhile_14 {

    // While vs Do While
    /*
     *  Difference : do while block will be executed
     *  at least one time, even if the condition is false
     */
    public static void main(String[] args) {
        boolean test = true;
        while (test){
            System.out.println("We are great!");
//            break;
            test = false;
        }

        boolean test2 = false;
        int a = 4;
        int b =2;
        do {
            System.out.println("We are the champs!"); //statement1
            System.out.println(a + b);
        }
        while (test2);

        int count = 0;
        do {
            System.out.print(count);
            count++;
        } while (count<=24);


    }



}
