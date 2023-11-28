package Examinations;

import java.time.LocalDate;

public class Examination {
    private LocalDate date;

    public Examination(LocalDate date) {
        this.date = date;
    }

    public String getDate() {
        return date.toString();
    }
}
