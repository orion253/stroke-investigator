package Examinations;

import java.time.LocalDate;

public class MRI extends Examination {
    //fields
    private String url;
    private String Surl; // url String
    private String fieldStrength;
    static LocalDate date;


    //constructor
    public MRI(String url, String fieldStrength, LocalDate date) {
        super(date);
        this.url = url;
        this.fieldStrength = fieldStrength;

        Surl = url.toString();
    }


    //methods
    public static String getDetailsText(){ // not sure I need this anymore
        return "MRI was done on "+date.toString();
    }

    public String getFieldStrength() {
        return fieldStrength;
    }

    public String getUrl() {
        return url;
    }
}
