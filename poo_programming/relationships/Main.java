import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        // Create diseases
        Disease malaria = new Disease( "Malaria");
        Disease measles = new Disease( "Sarampión");
        Disease yellowFever = new Disease( "Fiebre Amarilla");
        Disease covid = new Disease( "COVID-19");

        System.out.println(malaria);
        System.out.println(measles);
        System.out.println(yellowFever);
        System.out.println(covid);

        // Create vaccines
        Vaccine pput = new Vaccine( "PPUT", new ArrayList<Disease> (List.of(malaria, measles)));
        System.out.println(pput);
        System.out.println(malaria);
        System.out.println(measles);
        pput.addDose(3, 100, 3);
        System.out.println(pput);
    }
}
