import Examinations.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class patientProfiles extends JPanel {

    //fields
    // existing patients
    Patient pat1 = new Patient("Daphne von Oram", 62);
    MRI mri1 = new MRI("https://martinh.netfirms.com/BIOE60010/mri1.jpg", "2 Tesla", LocalDate.of(2023, 9, 14));
    Patient pat2 = new Patient("Sebastian Compton", 31);
    MRI mri2 = new MRI("https://martinh.netfirms.com/BIOE60010/mri2.jpg", "4 Tesla", LocalDate.of(2023,9,15));

    JButton profile1;
    JButton profile2;

    //constructor

    public patientProfiles() {
        setLayout(new GridLayout(2, 4));
        //c1.setSize(500, 500);
        //add(c1);

        this.profile1 = new JButton(pat1.PatientDetails());
        this.profile2 = new JButton(pat2.PatientDetails());
        add(profile1);
        add(profile2);
        profile1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // when profile is clicked, their details should be printed on console
                System.out.println("Patient: "+pat1.getName()+": MRI: "+ mri1.getFieldStrength()+", "+mri1.getDate());

            }
        });
        profile2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // when profile is clicked, their details should be printed on console
                System.out.println("Patient: "+pat2.getName()+": MRI: "+ mri2.getFieldStrength()+", "+mri2.getDate());

            }
        });
    }


    //methods

}

