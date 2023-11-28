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
    public void addExamination(Examination examination){
        examinations.add(examination);
    }

    //3. displaying a patient's details
    public String PatientDetails(){
        String details = new String("<html>");
        details+="Patient: "+name+"<br>";
        details+= Examination.getDisplayText();


        return details;
    }

    /*
    public String getAppointmentsDisplay(){
        // Get a string displaying the appointment information for this patient
        // Surround with <html></html> tags so it can be displayed in a JLabel with <br> to make newlines
        // Note - if printing to the console instead, use \n instead of <br>
        String display=new String("<html>");
        display+="Patient: "+name+"<br>";
        display+=initialAppointment.getDisplayText();
        for(Vaccine vax:vaccines){
            List<Appointment> appts=vax.getAppointments();
            for (Appointment apt:appts){
                display+=apt.getDisplayText();
            }
        }
        return display+"<br></html>";
    }
     */
}
