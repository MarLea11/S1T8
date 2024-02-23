package N1EX5;

public class App {

    private App(){}

        public static void runProgram(){
            PiValue piValue = () -> 3.1415;

            System.out.println("The Pi value is: " + piValue.getPiValue());
        }

}
