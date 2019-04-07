package section01;

public class ASongAboutBeer {
    public static void main(String[] args) {
        int amountBottles = 99;
        String word = "bottles";

        while (amountBottles > 0) {

            if (amountBottles == 1) {
                word = "bottle";
            }
            System.out.println(amountBottles + " " + word + " of beer on the wall");
            System.out.println(amountBottles + " " + word + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            amountBottles = amountBottles - 1;

            if (amountBottles > 0) {
                System.out.println(amountBottles + " " + word + " of beer on the wall");
            } else {
                System.out.println("No more bottles of beer on the wall");
            } // koniec else
        } // koniec while
    } // koniec metody main
}
