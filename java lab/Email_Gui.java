import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;

class My_mail extends Exception
{
	My_mail()
	{
		System.out.println("Please Enter Correct Email Id");
	}
}


class Email_Gui extends Frame implements ActionListener
{
	Label l1;
	TextField t1,t2;
	Button b1;
	
		Email_Gui()
		{
			 l1 = new Label("Email Id");
			 t1 =  new TextField("");
			 t2 =  new TextField("hello");
			 b1 = new Button("Log In");
			add(l1);
			add(t1);
			add(b1);
			add(t2);
			b1.addActionListener(this);
			setSize(300,150);
			setLayout(new FlowLayout());
			setSize(500,500);
			setVisible(true);
			show();
		}
		
		public void actionPerformed(ActionEvent obj)
			{
				String l = t1.getText();
				
				if(obj.getSource() == b1)
				{
				try
				{
					if(l.contains("@"))
					{
						t2.setText("SUCCESSFULLY LOGGED IN");	
						JOptionPane.showMessageDialog(b1,"Welcome");
					}
					else
					{
						t2.setText("Invalid id");
						throw new My_mail();
						
					}
				}catch(My_mail ex)
					{
						System.out.println("Error Occurred");
					}
				}				
			}
	
		public static void main(String[] args)
		{
			Email_Gui obj = new Email_Gui();
		}
}

