package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoDimensionalArrays_15 {

    public static void main(String[] args) {

        int [][] myArray = {{11, 22, 33}, {44,55, 66}, {77,88, 99}};
        int [] myArray2 = {1,2,3};


        ArrayList  myArrayList = new ArrayList(Arrays.asList("Akin", 3.9, false));
        System.out.println("The arrayList size is " + myArrayList.size());

//        ArrayList<String> languages = new ArrayList<>();
//        languages.add("Python");




//        System.out.println(myArray[0][0]);
//        System.out.println(myArray[0][1]);
//        System.out.println(myArray[0][2]);
//        System.out.println(myArray[1][0]);
//        System.out.println(myArray[1][1]);
//        System.out.println(myArray[1][2]);

        System.out.println(Arrays.deepToString(myArray));

        System.out.println("The size of the two-dimensional Array is " +myArray.length);
        System.out.println(myArray.length);
        System.out.println("The size of the 2nd Array is " +myArray2.length);

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j <= myArray.length; j++) {
                System.out.print(" " + myArray[i][j]);
            }

        }

        System.out.println("\n");

        for (int[] i : myArray){
            System.out.println(Arrays.toString(i));
        }

        










    }
}
