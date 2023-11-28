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

    public static String getExamDate(){
        return date.toString();
    }


    public void addExam(){ //not sure if I will keep  abstract method, depending on how I'll add patient exams
    }
}
