package N1EX8;

public class App {

    private App(){}

    public static void runProgram(){

        ReverseString stringReverse = (String message) -> new StringBuilder(message).reverse().toString();

        System.out.println("String reverse: " + stringReverse.reverse("My name is Marcos"));

    }

}
