package zadatci;

import javax.swing.JOptionPane;

public class Zadatak01 {
	//upogonite smisleno svih 6 razlicitih nacina poziva metode
	//JOptionPane.showInputDialog
	
	public static void main (String[] args) {
		
		//JOptionPane.showInputDialog(message)
		JOptionPane.showInputDialog("Message from the first task");
		
		//JOptionPane.showInputDialog(parentComponent, message)
		JOptionPane.showInputDialog(null, " Test1 ");
		
		//JOptionPane.showInputDialog(message, initialSelectionValue)
		JOptionPane.showInputDialog(" Test2 ", null);
		
		//JOptionPane.showInputDialog(parentComponent, message, initialSelectionValue)
		JOptionPane.showInputDialog(null, " Test3 ", 4);
		
		//JOptionPane.showInputDialog(parentComponent, message, title, messageType);
		JOptionPane.showInputDialog(null, " Test4 ", " Information " , JOptionPane.INFORMATION_MESSAGE);	
		
		// JOptionPane.showInputDialog( parentComponent , message, title, messageType, icon, selectionValues, initialSelectionValue);
		String[] warning = {" defcon1 " , " defcon0 " };
		JOptionPane.showInputDialog(null, " Message ", " WARNING " , JOptionPane.WARNING_MESSAGE , null , warning , warning[1] );
		
	}
}