import javax.swing.JOptionPane;

class GUIRead 
{
	public static void main(String[] args) 
	{
		String name=null;
		int age=0;

		name=JOptionPane.showInputDialog("Enter ur name:");
		age=Integer.parseInt(JOptionPane.showInputDialog("Enter ur age:"));
		age++;

		JOptionPane.showMessageDialog(null,"Heyy "+name+" By Next Year U will be "+age+" Years old");
	}
}
