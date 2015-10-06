package h8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class opdracht8_1 extends Applet {
    TextField tekstvak;				
    Button knop;
    Button knop2;
    String s;
    public void init() {
        tekstvak = new TextField("", 30);
        knop = new Button("Ok");
        knop.addActionListener( new KnopListener() ); 
        knop2 = new Button("reset");
        knop2.addActionListener( new KnopListener2() );
        add(tekstvak);
        add(knop);
        add(knop2); 
       
        s=("");
         
      
    }

    public void paint(Graphics g) {
        g.drawString(s, 50, 60 );
    }
	
    class KnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
        	s = tekstvak.getText();
            repaint();
        }
    }
    class KnopListener2 implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
        	tekstvak.setText(" ");
        	 s=("");
            repaint();
        }
    }
}
