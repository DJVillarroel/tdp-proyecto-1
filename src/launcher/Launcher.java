package launcher;

import entities.Student;
import gui.SimplePresentationScreen;

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	Student estudiante = new Student(112155, "Villarroel", "Diego", "thedjv123@gmail.com", "https://github.com/DJVillarroel", "");
            	SimplePresentationScreen gui = new SimplePresentationScreen(estudiante);
            	gui.setVisible(true);
            }
        });
    }
}