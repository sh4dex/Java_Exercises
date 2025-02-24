//Composition of Person for vaccination History

import java.util.List;

public class Person {

    public int id;
    public String name;
    public int age;
    public int birth;
    public VaccinationHistory history;

    public Person(int id) {
        this.id = id;
        this.history = new VaccinationHistory();
    }

    public Person() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public int getBirth() {
        return birth;
    }

    public class VaccinationHistory {
        
        private int vaccinationDate;
        public List<Vaccine> vaccines;
        public int numerOfDoses;
        
        public VaccinationHistory(int vaccinationDate, Vaccine vaccine, int numerOfDoses){
            if (vaccines.size() > 0) {
                this.vaccines = new Vaccine(List<Disease> diseases);
            } else {
                throw new IllegalArgumentException("No vaccines avalible to create a history");
            }
            this.vaccinationDate = vaccinationDate;

        }
    
    }
}
