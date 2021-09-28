
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*  <applet code ="Gui2" width = "300" height="200">  </applet> */

public class Gui2 extends Applet implements ActionListener
{
	Label l1,l2,l3;
	TextField t1,t2;
	Button b1;
	public void init()
	{
		l1 = new Label("1st number");
		l2 = new Label("2nd number");
		t1 = new TextField();
		t2 = new TextField();
		b1 = new Button("Add");
		l3 = new Label(" ");
		
		add(l1);
		add(t1);
		add(l2); 
		add(t2);
		add(b1);
		
		add(l3);
		
	b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent obj)
	{
			int a,b,c;
			a= Integer.parseInt(t1.getText());
			b= Integer.parseInt(t2.getText());
			c=a+b;
			 l3.setText("sum is "+c);
	}
	
}