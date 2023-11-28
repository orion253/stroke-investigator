package Examinations;

import Examinations.Examination;

import java.time.LocalDate;

public class BP extends Examination {
    //fields
    private String systolic;
    private String diastolic;
    private String duration;

    //my constructor
    public BP(String systolic, String diastolic, LocalDate date, String duration) {
        super(date);
        this.systolic = systolic;
        this.diastolic = diastolic;
        this.duration = duration;
    }



    // methods
    public static String getDetailsText(){
        return "BP exam was done on "+date.toString();
    }

    // getters
    public String getDiastolic() {
        return diastolic;
    }

    public String getSystolic() {
        return systolic;
    }

    public String getDuration() {
        return duration;
    }

    @Override
    public String getDate() {
        return super.getDate();
    }
}
