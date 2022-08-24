package launcher;
import entities.Student;
import gui.SimplePresentationScreen;

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	Student me = new Student(112155, "Villarroel", "Diego Jos�", "thedjv123@gmail.com", "https://github.com/DJVillarroel", null);
            	SimplePresentationScreen presentation = new SimplePresentationScreen(me);
            	presentation.setVisible(true);
            }
        });
    }
}