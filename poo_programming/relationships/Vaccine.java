import java.util.ArrayList;
import java.util.List;

public class Vaccine {
    public String name;
    public List<Disease> diseases;
    public List<Dose> doses; //This List attribute can be empty

    /* Constructor method 
     * The constructor method receives a list of diseases that the vaccine can prevent
     * The vaccine must have at least one disease to be created
     * (You can't create a Vaccine without a disease that it can prevent)
    */
    public Vaccine(String name, List<Disease> diseases) {
        // not null or not empty
        if (diseases == null || diseases.isEmpty()) {
            throw new IllegalArgumentException("A vaccine must be associated with at least one disease.");
        }
        this.name = name;
        this.diseases = new ArrayList<>(diseases); 
        this.doses = new ArrayList<>();
        /*Add this vaccine to every single disease in the list of diseases
        * that this vaccine can prevent (here we ensure the relationship)
        */
        for (Disease disease : diseases) {
            disease.addVaccine(this); // Mantiene la relación bidireccional
        }
    }

    public void addDose(int recommendedDoses, float volumeInMl, int timeBetweenDoses){
        this.doses.add(new Dose(recommendedDoses, volumeInMl, timeBetweenDoses, this.diseases));
    }

    /*Add new disease */
    public void addDisease(Disease disease){
        if (disease != null) {
            diseases.add(disease);
            disease.addVaccine(this);
        }
        
    }

    /* Getters and setters methods */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Disease> getDiseases() {
        return diseases;
    }

    public void setDiseases(List<Disease> diseases) {
        if (diseases != null && !diseases.isEmpty()) {
            this.diseases = diseases;
        } else {
            throw new IllegalArgumentException("A vaccine must be associated with at least one disease.");
        }
    }

    /* toString method */
    @Override
    public String toString() {
        return "Vaccine{name='" + name + 
                "'\n\tdiseases='" + diseases + "'" +
                "\n\tdoses=" + doses +"}";
    }

    /*
     * The inner class Dose represents the recommended doses of a vaccine
     * This programming style is to represent a composition relationship
     * between Vaccine and Dose. (a Dose is part of a Vaccine).
     * A Vaccine has a list of Doses. (Could be one or more doses).
     */
    public class Dose{
        private int recommendedDoses;
        private float volumeInMl;
        private int timeBetweenDoses; //(in Hours)
        public List<Disease> diseases;

        public Dose(int recommendedDoses, float volumeInMl, int timeBetweenDoses, List<Disease> diseases) {
            if(diseases == null || diseases.isEmpty()){
                throw new IllegalArgumentException("The vaccine must be associated with at least one disease.");
            }
            this.diseases = diseases;
            this.recommendedDoses = recommendedDoses;
            this.volumeInMl = volumeInMl;
            this.timeBetweenDoses = timeBetweenDoses;
        }

        public int getRecommendedDoses() {
            return recommendedDoses;
        }

        public void setRecommendedDoses(int recommendedDoses) {
            this.recommendedDoses = recommendedDoses;
        }

        public float getVolumeInMl() {
            return volumeInMl;
        }

        public void setVolumeInMl(float volumeInMl) {
            this.volumeInMl = volumeInMl;
        }

        public int getTimeBetweenDoses() {
            return timeBetweenDoses;
        }

        public void setTimeBetweenDoses(int timeBetweenDoses) {
            this.timeBetweenDoses = timeBetweenDoses;
        }

        @Override
        public String toString() {
            return "Vaccine{recommendedDoses='" + recommendedDoses + 
                "', Time='" + timeBetweenDoses + "'" +
                "', Volume='" + volumeInMl + "'" +
                ", Diseases=" + diseases +"}";
        }
    }

    
}