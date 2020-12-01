package Loops;

import java.util.ArrayList;
import java.util.Arrays;

public class WhileLoop_13 {



    //syntax
    //as long as boolean condition is true the iteration continues
    // unless use break;

    //counter/s
//    while(boolean){
//        break;
//    }

    public static void main(String[] args) {

//        While loops is being used to iterate statements
        //statement + statement + statement .....
//
//        int i = 0; //counter
//        while (i<=6){
//            System.out.print(i);
//            i = i +1;
//        }
//
//        int j = 6;
//        while (j>=0){
//            System.out.println(j);
//            j--;
//        }

        int [] hasim = {11,22,33,44,55,60};


//        int i = 0;
//        while (i < hasim.length){
//            System.out.print(" " + hasim[i]);
//            i++;
//        }
//        System.out.println(hasim[i]);

//        for (int k = 0; k < hasim.length; k++) {
//            System.out.println(hasim[k]);
//        }


        ArrayList<String> companies = new ArrayList<String>(6);
        companies.add("yahoo");
        companies.add("facebook");
        companies.add( "amazon");
        companies.add("twitter");
        companies.add("google");

        System.out.println(companies);
//        int i = 0;
//        while (i < companies.size()){
//            System.out.println(companies.get(i));
//            i++;
//        }

        // we will create a shape with while loop
        /*
         *
         **
         ***
         ****
         *****
         ******
         */

        // Start a string, and  increase one by one at every line

        String stairs = ""; //counter 1
        int i = 0; //counter 2
        while (i<6){

            stairs = stairs + "*";
            i = i+1;
            System.out.println(stairs);
        }
//        System.out.println(stairs);
        String stairs2 = ""; //counter 1
        int j =6;
        while (j>0){
            stairs2 = stairs2 + "*";
            j--;
            System.out.println(stairs2);
        }

//        int counter = 1;
//        while (counter < 6){
//            System.out.println(counter);
//            break;
//        }

        int counter2 = 1;
        while (counter2 <= 6){

            if (counter2 == 4){
                break;
            }

            counter2++;
            System.out.println(counter2);
        }
        System.out.println(counter2);
    }






}
