import Examinations.Examination;

import java.util.ArrayList;

public class Patient{
    //fields
    private String name;
    private int age;
    private ArrayList<Examination> examinations = new ArrayList<>();

    //constructor
    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //methods
    // 1. getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    //2. adding an examination
    public void addVaccine(Examination examination){
        examinations.add(examination);
    }
}
