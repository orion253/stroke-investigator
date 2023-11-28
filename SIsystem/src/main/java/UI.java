import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class UI {
    static GraphicsConfiguration gc;	// Contains this computer’s graphics configuration
    public static void main(String[] args) {
        JFrame frame= new JFrame(gc);	// Create a new JFrame
        frame.setSize(1200,1000);
        frame.getContentPane().add(new patientProfiles());
        frame.setVisible(true);


        // Closes the program when the frame is closed
        frame.addWindowListener(new WindowAdapter() {	// Close the program if close window clicked
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
        /*
        // Try displaying images
        JLabel profilePic = new JLabel();
        URL imageURL = null;
        try {
            imageURL = new URL();
        }



         */
    }
}
