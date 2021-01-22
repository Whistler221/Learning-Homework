package repeating;

import javax.swing.JOptionPane;

public class PaneExercise{

	public static void main(String[] args) {
		
		String name;
		name = JOptionPane.showInputDialog(" Name ");
		
		String last_name;
		last_name = JOptionPane.showInputDialog(" last_name ");
				
		String full_name;
		full_name = "Inputed Name is: " + name + " " + last_name;
		
		System.out.println(full_name);
		
		
		// One more way 
		// JOptionPane.showMessageDialog(null, full_name);
		// System.exit(0);
		
	}
}
