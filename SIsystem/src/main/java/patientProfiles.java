import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class patientProfiles extends JPanel {

    //fields
    // existing patients
    Patient pat1 = new Patient("Daphne von Oram", 62);
    Patient pat2 = new Patient("Sebastian Compton", 31);

    JButton profile1;
    JButton profile2;
    //Canvas c1 = new Canvas();

    //constructor

    public patientProfiles() {
        setLayout(new GridLayout(2, 2));
        //c1.setSize(500, 500);
        //add(c1);

        this.profile1 = new JButton(pat1.getName());
        this.profile2 = new JButton(pat2.getName());
        add(profile1);
        add(profile2);
        profile1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // when profile is clicked, their details should be printed on console
                System.out.println("Patient: "+pat1.getName()+": MRI:");

            }
        });
    }


    //methods

}

