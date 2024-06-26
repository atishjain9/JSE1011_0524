import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class LoginDemo extends JFrame implements ActionListener
{
	JLabel l1,l2;
	JTextField t1,t2;
	JButton b1,b2,b3;
	Container c;

	public LoginDemo()
	{
		l1=new JLabel("User Name:");
		l2=new JLabel("Password:");

		t1=new JTextField(20);
		t2=new JTextField(20);

		b1=new JButton("Submit");
		b2=new JButton("Reset");
		b3=new JButton("Exit");

		c=getContentPane();

		c.setLayout(new FlowLayout());

		c.add(l1); c.add(t1);
		c.add(l2); c.add(t2);
		c.add(b1); c.add(b2); c.add(b3);

		setTitle("Login Demo");
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);


	}

	public void actionPerformed(ActionEvent ae)
	{
		String str=ae.getActionCommand();

		String un=t1.getText();
		String pwd=t2.getText();

		if(str.equals("Submit"))
		{
			if(un.equals("atish") && pwd.equals("jain"))
				System.out.println("Ur Valid user...");
			else
				System.out.println("Pls Check ur user name and password");

		}
		else
			if(str.equals("Reset"))
			{
				t1.setText("");
				t2.setText("");
			}
			else
				if(str.equals("Exit"))
					System.exit(0);

	}

	public static void main(String[] args) 
	{

		LoginDemo login=new LoginDemo();

	}
}
