import java.util.List;

public class Vaccine {
    public String name;
    public List<Disease> dieses;
    public List<Dose> doses;

    public Vaccine(List<Disease> diseases) {
        this.setName(name);
        if (diseases.size() > 0) {
            this.dieses = diseases;
        } else {
            throw new IllegalArgumentException("No diseases");
        }  
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Disease> getDieses() {
        return dieses;
    }

    public void setDieses(List<Disease> dieses) {
        this.dieses = dieses;
    }

    public class Dose{
        private int recommendedDoses;
        private float volumeInMl;
        private int timeBetweenDoses;

        public Dose(int recomendedDoses, float volumeInMl, int timeBetweenDoses) {
            this.recommendedDoses = recomendedDoses;
            this.volumeInMl = volumeInMl;
            this.timeBetweenDoses = timeBetweenDoses;
        }

    }

    @Override
    public String toString() {
        return name;
    }
}