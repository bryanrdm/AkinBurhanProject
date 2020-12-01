package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_11 {
    // Arraylists are dynamic arrays in Java
    // First difference : Arraylists can hold DIFFERENT data types
    // Second difference : Arrays are fixed size, but arraylists are not.
    // we are adding value with add method


    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(900);
        arrayList.add("Akin");
        arrayList.add(true);
        arrayList.add(3.8);

        System.out.println(arrayList);
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.size());
        arrayList.remove(2);
        System.out.println(arrayList);
        arrayList.clear();
        System.out.println(arrayList);

        // Declaring the Arraylist in one statement

        ArrayList arrayList2 = new ArrayList(Arrays.asList("Burhan", 3.9, false));
        System.out.println(arrayList2);
        arrayList2.add("Adil");
        System.out.println(arrayList2);

        //
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("JS");
        languages.add("Python");
        languages.add("Ruby");
//        languages.add(true);
        //        System.out.println(Arrays.toString(languages)); //Does not work, explicit to Arrays only
        System.out.println(languages);

        languages.set(1, "C#");
        System.out.println(languages);






    }



}
