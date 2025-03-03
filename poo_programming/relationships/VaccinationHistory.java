import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VaccinationHistory {
    private List<VaccinationEvent> events; // List of vaccination events

    public VaccinationHistory() {
        this.events = new ArrayList<>();
    }

    // Add a new vaccination event
    public void addVaccinationEvent(Date vaccinationDate, Vaccine vaccine, Vaccine.Dose dose) {
        if (vaccinationDate == null || vaccine == null || dose == null) {
            throw new IllegalArgumentException("Vaccination date, vaccine, and dose cannot be null.");
        }
        events.add(new VaccinationEvent(vaccinationDate, vaccine, dose));
    }

    // Get all vaccination events
    public List<VaccinationEvent> getEvents() {
        return events;
    }

    // Inner class to represent a single vaccination event
    public static class VaccinationEvent {
        private Date vaccinationDate;
        private Vaccine vaccine;
        private Vaccine.Dose dose;

        public VaccinationEvent(Date vaccinationDate, Vaccine vaccine, Vaccine.Dose dose) {
            this.vaccinationDate = vaccinationDate;
            this.vaccine = vaccine;
            this.dose = dose;
        }

        public Date getVaccinationDate() {
            return vaccinationDate;
        }

        public Vaccine getVaccine() {
            return vaccine;
        }

        public Vaccine.Dose getDose() {
            return dose;
        }

        @Override
        public String toString() {
            return "VaccinationEvent{vaccinationDate=" + vaccinationDate + 
                ", vaccine=" + vaccine.getName() + 
                ", dose=" + dose.getRecommendedDoses() + "}";
        }
    }

    @Override
    public String toString() {
        return "VaccinationHistory{events=" + events + "}";
    }
}