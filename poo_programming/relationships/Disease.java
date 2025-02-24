import java.util.ArrayList;
import java.util.List;

public class Disease {

    /* attributes */
    public String name;
    public List<Vaccine> vaccines;

    /* constructor */
    public Disease(String name) {
        this.name = name;
        this.vaccines = new ArrayList<Vaccine>(); //to avoid NullPointerException
    }

    public void addVaccine(Vaccine vaccine){
        if (vaccine != null) {
            vaccines.add(vaccine);
        }
    }

    /*getter and setter methods*/
    public List<Vaccine> getVaccines() {
        return vaccines;
    }
    
    public void setVaccines(ArrayList<Vaccine> vaccines) {
        if (vaccines != null) {
            this.vaccines = vaccines;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /* toString method */
    @Override
    public String toString() {
        return "Disease{name='" + name + "', vaccines=" + getVaccineNames() + "}";
    }

    private String getVaccineNames() {
        List<String> names = new ArrayList<>();
        for (Vaccine v : vaccines) {
            names.add(v.getName()); // Evita llamada a Vaccine.toString()
        }
        return names.toString();
    }
}