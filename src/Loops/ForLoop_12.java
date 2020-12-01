package Loops;

import java.util.ArrayList;
import java.util.Arrays;

public class ForLoop_12 {

    public static void main(String[] args) {
        //syntax
        // for(initialization; condition ; increment/decrement)
//		{
//		   statement(s);
//		}

        // this for loop will print out numbers from 0-100

//        for (int i = 100; i >= 0; i--) {
//            System.out.print(" " + i);
//        }
//        System.out.println("****************");
//        for (int j = 0; j < 101; j++) {
//            System.out.print(" " + j);
//        }

        int myArray [] = new int[4];
        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 3;
        myArray[3] = 4;

        String [] myStringArray = {"Adil", "Burhan", "Akin"};

//        System.out.println(myArray[0]);
//        System.out.println(Arrays.toString(myArray));

        System.out.println("The size of the array is " + myArray.length);

//        for (int i = 0; i < myArray.length; i++) {
//            System.out.println(myArray[i]);
//        }
//
//        for (int j = 0; j < myStringArray.length; j++) {
//            System.out.print(j + " ");
//            System.out.print(" " + myStringArray[j] + " ");
//        }

//        int [] myArray3  = {1000, 2000, 3000};
//        for (int i = 0; i < myArray3.length; i++) {
//            System.out.println(myArray3[i] / 100);
//        }

        //initialization can be made outside the loop
//        int k = 0;
//        for (; k < 100; k++) {
//            System.out.print(k);
//        }

//        Create a program to find the even and odd numbers in an array
//        int [] evenNumbers = {12,32,33,44,50,66,75,88,100,102,143};
//
//        // remainder == 0;
//        for (int i = 0; i < evenNumbers.length; i++) {
//            if (evenNumbers[i] % 2 == 0){
//                System.out.println("These are the even numbers " + evenNumbers[i]);
//            } else {
//                System.out.println("These are the odd numbers " + evenNumbers[i]);
//            }
//
//        }

        //create a for loop that increase numbers by 2


        ArrayList<Integer> numbers = new ArrayList<Integer>(6);
        numbers.add(6);
        numbers.add(66);
        numbers.add(666);
        numbers.add(6666);
        numbers.add(66666);
        numbers.add(666666);

        for (Integer i : numbers){
            System.out.println(i);
        }




        System.out.println("******************");

        String  [] myArray2 = { "akin", "adil", "burhan"};

//        System.out.println("        ");
//        System.out.print(Arrays.toString(myArray2));
//
//        for (int i = 0; i < myArray2.length; i++) {
//            System.out.println(myArray2[i]);
//        }

        //enhanced
//        for(String j : myArray2){
//            System.out.print(j);
//        }


        ArrayList<String> companies = new ArrayList<String>(6);
        companies.add("yahoo");
        companies.add("facebook");
        companies.add( "amazon");
        companies.add("twitter");
        companies.add("google");



//        enhanced
        for (String i: companies){
            System.out.print(" " + i);
        }

        //classic
        for (int i = 0; i < companies.size(); i++) {
            System.out.println(companies.get(i));
        }


        System.out.print("\n out of loop " + companies);


    }
}
