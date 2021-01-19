package zadatci;

import javax.swing.JOptionPane;

public class Zadatak01 {
	//upogonite smisleno svih 6 razlicitih nacina poziva metode
	//JOptionPane.showInputDialog
	
	public static void main (String[] args) {

		JOptionPane.showInputDialog("Message from the first task");
		JOptionPane.showInputDialog(null, " Test1 ");
		JOptionPane.showInputDialog(" Test2 ", null);
		JOptionPane.showInputDialog(null, " Test3 ", 4);
		//JOptionPane.showInputDialog(null, " Test4 ", " Title1 " , " Type1 ");
		//JOptionPane.showInputDialog(null, " Test5 ", " Title2 " , " Type2 ", 0 , 0, 0);
		
	}
}