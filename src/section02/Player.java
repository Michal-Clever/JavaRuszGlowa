package section02;

public class Player {

    public static void main(String[] args) {
        Player player = new Player();
        player.zgaduj();
    }
    int liczba = 0; // tu jest zapisywana typowana liczba


    public void zgaduj() {
        liczba = (int) (Math.random() * 10);
        System.out.println("Typuję liczbę: " + liczba);
    }

}
