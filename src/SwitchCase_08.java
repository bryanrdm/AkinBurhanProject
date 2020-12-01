public class SwitchCase_08 {


    // let's remember how if else blocks were working
    // 1) only one block is going to work
    // 2) first true condition block is going to work
    // if no condition is true, else is going to work
    // else block doesn't have condition

    // Difference between switch case and if-else statements
    // 1 ) i have option to execute the codes in different blocks
    // 2 ) instead of conditions, switch case block use key-value equality
    // key can be int, char or string




    // Let's create a Switch case program,
    // This program will ask the user for number between 1-7
    // Depending on the number, different name of the days will appear in
    // console

    public static void main(String[] args) {

        String  role = "random";

        switch(role){
            case "admin" :
                System.out.println("You're an admin");
                break;
            case "moderator" :
                System.out.println("You're a moderator");
                break;

            default:
                System.out.println("You're a guess");
        }






    }
}
