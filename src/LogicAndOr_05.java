public class LogicAndOr_05 {


    // Boolean Logic : and / or
    // && - and If left side and right sides are both true, expression is true
    // || - or If one of the sides are true, expression is true

    public static void main(String[] args) {
        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(false && true); // false
        System.out.println(false && false); // false

        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || true); // true
        System.out.println(false || false); // false

        boolean username = true;
        boolean password = false;

        System.out.println(username && password);
        System.out.println(username || password);

        System.out.println(true && (false || username) && password);

    }


}
