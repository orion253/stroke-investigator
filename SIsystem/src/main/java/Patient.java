import Examinations.*;

public class Patient{
    //fields
    private String name;
    private int age;
    private MRI mri;
    private BP bp;

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


    //2. displaying a patient's details on buttons before clicking
    public String PatientDetails(){
        String details = new String("<html>");
        details+="Patient: "+name+"<br>";
        details+="Age: "+age;

        return details+"<br></html>";
    }

}
