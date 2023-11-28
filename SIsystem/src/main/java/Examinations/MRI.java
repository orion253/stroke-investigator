package Examinations;

import Examinations.Examination;

import java.net.URL;
import java.time.LocalDate;

public class MRI extends Examination {
    //fields
    private URL url;
    private String Surl; // url String
    private String fieldStrength;


    //constructor
    public MRI(URL url, String fieldStrength, LocalDate date) {
        super(date);
        this.url = url;
        this.fieldStrength = fieldStrength;

        Surl = url.toString();
    }


    //methods
}
