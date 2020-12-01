package Arrays;

import java.util.Arrays;

public class Arrays_10 {


    public static void main(String[] args) {

        // What's an array?
        // An array is a container object that holds a fixed number of values of a SINGLE TYPE.
        // The length of an array is established when the array is created.
        // After creation, its length is fixed. ... Each item in an array is called an element,
        // and each element is accessed by its numerical index.
        //https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html#:~:text=An%20array%20is%20a%20container,creation%2C%20its%20length%20is%20fixed.&text=Each%20item%20in%20an%20array,accessed%20by%20its%20numerical%20index.

//        Array
        //1st Method syntax
        // datatype arrayName [] = new datatype[lengthOfArray] //[] can be located after the dataType as well

        int myArray [] = new int[4];
        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 3;
        myArray[3] = 4;

        System.out.println(myArray[0]);
        System.out.println(Arrays.toString(myArray));


        //2nd Method
        int myArray2 [] = new int[] {1,2,3,4,5,6};
        System.out.println(myArray2[3]);
        System.out.println(Arrays.toString(myArray2));


        //3rd Method
        int [] myArray3  = {1000, 2000, 3000};
        System.out.println(myArray3[0]);
        System.out.println(Arrays.toString(myArray3));

        String [] myStringArray = {"Adil", "Burhan", "Akin"};
        System.out.println(Arrays.toString(myStringArray));





    }
}
