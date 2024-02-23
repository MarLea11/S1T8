package N1EX8;

public class App {

    private App(){}

    public static void runProgram(){

        StringBuilder reversed = new StringBuilder();
        ReverseString stringReverse = (String message) -> {

            for(int i = message.length() - 1; i >= 0; i--) {
                reversed.append(message.charAt(i));
            }
            return reversed.toString();
        };

        System.out.println("String reverse: " + stringReverse.reverse("My name is Marcos"));

    }

}
