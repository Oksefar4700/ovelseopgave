import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int antalTalIndtastet = 0;

        System.out.println("Hej med dig!");

        while(true) {
            System.out.println("Indtast et tal eller 'Q' for at afslutte");
            String input = scanner.next();

            //hvis brugeren indtaster "q" eller "Q" aflutter vi løkken.
            if(input.equalsIgnoreCase("Q")) {
                break;
            }

            //vi bruger try-catch så vi kan fange, hvis brugeren IKKE indtaster et tal.
            try {
                int brugerIndtastetTal = Integer.parseInt(input);
                total += brugerIndtastetTal;
                antalTalIndtastet++;

                double gennemsnittet = (double) total/antalTalIndtastet;
                System.out.println("Gennemsnittet af talene er: " + gennemsnittet);
            } catch (NumberFormatException e) {
                System.out.println("Indtast et tal.");
            }
        }

        System.out.println("Programmet er afluttet.");

    }
}