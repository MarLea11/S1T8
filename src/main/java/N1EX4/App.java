package N1EX4;

import java.util.ArrayList;

public class App {

    private App(){}

    public static void runProgram() {

        ArrayList<String> monthsYear = new ArrayList<>();

        monthsYear.add("January");
        monthsYear.add("February");
        monthsYear.add("March");
        monthsYear.add("April");
        monthsYear.add("May");
        monthsYear.add("June");
        monthsYear.add("July");
        monthsYear.add("August");
        monthsYear.add("September");
        monthsYear.add("October");
        monthsYear.add("November");
        monthsYear.add("December");

        monthsYear.forEach(System.out::println); // lambda with method as reference

    }

}
