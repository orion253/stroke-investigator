import javax.swing.*;
import java.awt.*;

public class patientProfiles extends JPanel {

    //fields
    // existing patients
    Patient pat1 = new Patient("Daphne von Oram", 62);
    Patient pat2 = new Patient("Sebastian Compton", 31);

    JButton profile;
    Canvas c1 = new Canvas();

    //constructor

    public patientProfiles() {
        setLayout(new GridLayout(5, 5));
        c1.setSize(50, 50);
        add(c1);
    }


    //methods

}

