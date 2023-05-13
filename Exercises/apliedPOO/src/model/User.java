package model;

public class User {
    
    private int id;
    private String name;
    private String lastName;
    private String email;
    private String phoneNumber;
    
    public User(int id, String name, String lastname, String email, String phoneNumber){
        this.id = id;
        this.name = name;
        this.lastName = lastname;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
