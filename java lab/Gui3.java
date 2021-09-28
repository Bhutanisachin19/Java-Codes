import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.net.*;
import javax.swing.*;

class Gui3 extends JFrame implements ActionListener
{
	JLabel lb1;
	JButton btn;
	
	Gui3()
	{
		lb1 = new JLabel("Click to get Address");
		btn = new JButton("Get Ip");
		add(lb1);
		add(btn);
		//setSize(300,150);
		btn.addActionListener(this);
		setLayout(new FlowLayout()); 
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent obj)
	{
		try
		{
			InetAddress ip = InetAddress.getLocalHost();
			JOptionPane.showMessageDialog(btn,ip.getLocalHost());
		}catch(UnknownHostException ex)
		{
			System.out.println("Error Occurred");
		}
	}
	
  public static void main(String[] args) {
    new Gui3();
  }

}