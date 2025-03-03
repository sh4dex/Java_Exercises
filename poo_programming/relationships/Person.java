import java.util.Date;

public class Person {
    private int id;
    private String name;
    private Date birthday;
    private VaccinationHistory history; // Single history with multiple events

    public Person(int id, String name, Date birthday) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.history = new VaccinationHistory(); // Initialize with an empty history
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public VaccinationHistory getHistory() {
        return history;
    }

    @Override
    public String toString() {
        return "Person{id=" + id + ", name='" + name + "', birthday=" + birthday + 
            ", history=" + history + "}";
    }
}