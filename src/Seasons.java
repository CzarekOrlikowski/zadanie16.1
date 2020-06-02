import java.util.Arrays;

public enum Seasons {
    WINTER("zima", new String[]{"grudzień", "styczeń", "luty"}),
    SPRING("wiosna", new String[]{"marzec", "kwiecień", "maj"}),
    SUMMER("lato", new String[]{"czerwiec", "lipiec", "sierpień"}),
    AUTUMN("jesień", new String[]{"wrzesień", "październik", "listopad"});

    private final String description;
    private final String[] months;

    Seasons(String description, String[] months) {
        this.description = description;
        this.months = months;
    }

    public String getDescription() {
        return description;
    }

    public String[] getMonths() {
        return months;
    }

    public static Seasons fromDescription(String description) {
        Seasons[] values = Seasons.values();
        for (Seasons season : values) {
            if (season.getDescription().equals(description))
                return season;
        }
        System.out.print("Brak odpowiadającej pory roku! ");
        return null;
    }

    public static void getSeasons() {
        System.out.print("Pory roku do wyboru: ");
        for (Seasons season : Seasons.values()) {
            System.out.print(season.getDescription() + " ");
        } System.out.println();
    }

    @Override
    public String toString() {
        return super.toString() + " {" +
                "description='" + description + '\'' +
                ", months=" + Arrays.toString(months) +
                "} ";
    }
}
