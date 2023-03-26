import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ResistorColor {

    public String colori[] = new String[]{
            "nero", "marrone", "rosso", "arancione", "giallo", "verde", "blu", "viola", "grigio", "bianco"
    };
    int colorCode(String color) {
        return List.of(colori).indexOf(color);
    }

    String[] colors() {
        return colori;
    }
}
