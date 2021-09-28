//simple interest using applet

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/* <applet code = "SimpleInt_gui" width="300" height ="200"> </applet> */

public class SimpleInt_gui extends Applet implements ActionListener
{
	Label l1,l2,l3,result;
	TextField t1,t3,t2;
	Button b1,b2;
	
	public void init()
	{
		l1 = new Label("Principal");
		l2 = new Label("Rate");
		l3 = new Label("Time");
		result = new Label("");
		
		t1 =  new TextField("");
		t2 =  new TextField("");
		t3 =  new TextField("");
		b2=new Button("Add");
		b1 = new Button("Calculate");
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b1);
		add(b2);
		add(result);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent obj)
	{
		if(obj.getSource() == b1)
		{
			int p,r,t;
		p= Integer.parseInt(t1.getText());
		r= Integer.parseInt(t2.getText());
		t= Integer.parseInt(t3.getText());
		
		int si = (p*r*t)/100;
		result.setText("Simple Interest is :"+si);
		}
		else
		{
				int p,r,t;
		p= Integer.parseInt(t1.getText());
		r= Integer.parseInt(t2.getText());
		t= Integer.parseInt(t3.getText());
		
		int ad = p+r+t;
		result.setText("Addition is  "+ad);
		}
		
	}
}