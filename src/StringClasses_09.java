public class StringClasses_09 {

    public static void main(String[] args) {
//        //length
//        String name =  "Akin Gumus";
//        System.out.println(name.length());
//        System.out.println("Adil".length());
//
//        //toUpperCase
//        //toLowerCase
//        System.out.println(name.toUpperCase());
//        System.out.println(name.toLowerCase());

        //subString
        String string = "Java Standard Edition";
        System.out.println(string.substring(2));
        System.out.println(string.substring(2, 9));
        System.out.println(string.substring(0, 6));
        System.out.println(string.charAt(0));
        System.out.println(string.charAt(1));

        //equals
        String browser = "chrome";
        System.out.println(browser.equals("Chrome"));
        System.out.println(browser.equalsIgnoreCase("Chrome"));

        //contains
        String locator = "chromoe";
        System.out.println(locator.contains("o"));
        System.out.println(locator.indexOf("p"));

        //replace
        String name1 = "Burhan Burhan Erdem";
        System.out.println(name1.replace("Burhan", "Akin"));
        System.out.println(name1.replaceFirst("Burhan", "Akin"));
        String name2 = "Burhan";
        System.out.println(name2.concat("eddin"));
        String name3 = "Akin";
        String name4 = " ";
        String name5 = "Gumus";
        System.out.println(name3.concat(name5).concat(name5));














    }
}
