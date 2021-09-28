import java.util.*;
import java.awt.*;
import java.awt.event.*;

class InvalidEmail extends Exception
{
InvalidEmail()
{
System.out.println("Exception Raised: Invalid Email");
}

}

class CheckException extends Frame implements ActionListener
{
	Label email;

	TextField temail;
	TextField msg;

	Button check,b;

	CheckException()
		{

			email = new Label("Email:");
			email.setBounds(50,100,120,30);
			add(email);


			temail = new TextField("");
			temail.setBounds(200,100,200,30);
			add(temail);


				msg = new TextField("Message");
				msg.setEditable(false);
				msg.setBounds(50,150,400,30);
				add(msg);

				check = new Button("Check");
				check.setBounds(50,200,120,30);
				add(check);
				check.addActionListener(this);

				b = new Button();
				add(b);

				setSize(500,500);
				setVisible(true);

				}

		public void actionPerformed(ActionEvent e)
			{
				String s = temail.getText();

				if(e.getSource()== check)
				{
					try
					{
						if(s.contains("@"))
							{
								msg.setText("Valid");
							}
						else
							{
								msg.setText("Invalid");
								throw new InvalidEmail();
							}
					}
					catch(InvalidEmail ine)
					{
						System.out.println("Please Enter Correct email");
					}
				}
			}
					public static void main(String[] agrs)
					{
						CheckException ce = new CheckException();
					}
	}