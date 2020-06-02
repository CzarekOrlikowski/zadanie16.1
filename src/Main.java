import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Seasons.getSeasons();
        System.out.print("Wybierz porę roku: ");
        String season = scanner.nextLine();
        System.out.println(Seasons.fromDescription(season));
        scanner.close();
    }
}
