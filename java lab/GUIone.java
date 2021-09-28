import java.awt.*;
import java.applet.*;

/*  <applet code ="GUIone" width = "300" height="200">  </applet> */

public class GUIone extends Applet
{
	Label l1;
	TextField t1;
	Button b1;
	
	public void init()
	{
		 l1= new Label("Name");
		 t1 = new TextField();
		 b1 = new Button("Login");
		
		 
		setLayout(null);
		
		l1.setBounds(30,50,100,20);
		t1.setBounds(150,50,100,20);
		b1.setBounds(100,150,80,20);
		
		add(l1);
		add(t1);
		add(b1);
	}
}