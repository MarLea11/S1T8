package N1EX1;

import java.util.ArrayList;

public class App {

    private App() {}

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

        names.stream().filter(name -> name.contains("o")).forEach(System.out::println);


    }

}
