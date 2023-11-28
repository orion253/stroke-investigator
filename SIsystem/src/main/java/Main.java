import javax.swing.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        // setting up my GUI frame
        JFrame frame = new JFrame("Stroke investigation system");
        frame.setSize(450,400);

        JPanel displayPanel = new JPanel();

        frame.setContentPane(displayPanel);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {// Ends program if close window is clicked
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        // existing patients
        Patient pat1 = new Patient("Daphne von Oram", 62);
        Patient pat2 = new Patient("Sebastian Compton", 31);
    }
}