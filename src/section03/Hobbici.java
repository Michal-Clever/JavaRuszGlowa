package section03;

public class Hobbici {

    String imie;

    public static void main(String[] args) {

        Hobbici[] hobbicis = new Hobbici[3];
        int z = -1;

        while (z < 2) {
            z = z + 1;
            hobbicis[z] = new Hobbici();
            hobbicis[z].imie = "Bilbo";

            if (z == 1) {
                hobbicis[z].imie = "Frodo";
            }
            if (z == 2) {
                hobbicis[z].imie = "Sam";
            }
            System.out.print(hobbicis[z].imie + " jest ");
            System.out.println("dobrym imieniem dla hobbita");
        }
    }
}
