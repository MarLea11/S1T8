package N1EX2;

import java.util.ArrayList;

public class App {

    private App(){}

    public static void runProgram() {

        ArrayList<String> names = new ArrayList<>();

        names.add("Raul");
        names.add("Marcelo");
        names.add("Julieta");
        names.add("Veronica");
        names.add("Xavi");
        names.add("Fernando");
        names.add("Oriol");
        names.add("Lautaro");
        names.add("Joaquin");

        System.out.println("Names with letter o: ");
        names.stream().filter(name -> name.contains("o")).forEach(System.out::println);

        System.out.println();

        System.out.println("Names with more than 5 letters: ");
        names.stream().filter(name -> name.length() > 5).forEach(System.out::println);

    }

}
