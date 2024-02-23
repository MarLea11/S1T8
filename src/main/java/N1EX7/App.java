package N1EX7;

import java.util.ArrayList;

public class App {

    private App(){}

    public static void runProgram() {

        ArrayList<Object> listObject = new ArrayList<>();

        listObject.add("Raul");
        listObject.add(5);
        listObject.add("Marcelo");
        listObject.add("Julieta");
        listObject.add("Veronica");
        listObject.add(19);
        listObject.add("Xavi");
        listObject.add("Fernando");
        listObject.add(3);
        listObject.add("Oriol");
        listObject.add("Lautaro");
        listObject.add(56);
        listObject.add("Joaquin");

        listObject.sort((o1, o2) -> {
            String s1 = o1 instanceof String ? (String) o1 : String.valueOf(o1);
            String s2 = o2 instanceof String ? (String) o2 : String.valueOf(o2);
            return Integer.compare(s2.length(), s1.length());
        });

        System.out.println(listObject);

    }

}
