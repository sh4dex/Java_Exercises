import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //TODO: Upgrade Main example output

        // Create diseases
        /* 
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
        */

        // Create diseases
        Disease covid19 = new Disease("COVID-19");
        Disease flu = new Disease("Flu");

        // Create vaccines
        List<Disease> covidDiseases = new ArrayList<>();
        covidDiseases.add(covid19);
        Vaccine pfizer = new Vaccine("Pfizer", covidDiseases);

        List<Disease> fluDiseases = new ArrayList<>();
        fluDiseases.add(flu);
        Vaccine fluVaccine = new Vaccine("Flu Vaccine", fluDiseases);

        // Add doses to vaccines
        pfizer.addDose(2, 0.3f, 21);
        fluVaccine.addDose(1, 0.5f, 0);

        // Create a person
        Person johnDoe = new Person(1, "John Doe", new Date());

        // Add multiple vaccination events to the person's history
        johnDoe.getHistory().addVaccinationEvent(new Date(), pfizer, pfizer.getDoses().get(0));
        johnDoe.getHistory().addVaccinationEvent(new Date(), fluVaccine, fluVaccine.getDoses().get(0));

        // Print person details
        System.out.println(johnDoe);
    }
}
