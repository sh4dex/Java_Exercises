import java.util.List; 

public class Dose {
    public int recomendedDoses;
    public float volumeInMl;
    public int timeBetweenDoses;

    public Dose(int recomendedDoses, float volumeInMl,
    int timebetweenDoses, List<Vaccine> vacine) {
        this.recomendedDoses = recomendedDoses;
        this.volumeInMl = volumeInMl;
        this.timeBetweenDoses = timebetweenDoses;
    }
}
