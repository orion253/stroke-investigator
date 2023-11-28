package Examinations;

import java.time.LocalDate;

public class Examination {
    protected static LocalDate date;

    public Examination(LocalDate date) {
        this.date = date;
    }

    public String getDate() {
        return date.toString();
    }

    public static String getDisplayText(){
        return "Initial appointment on "+date.toString();
    }
}
