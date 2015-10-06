package h11;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


@SuppressWarnings("serial")
public class Opdracht6 extends Applet {
int cijfer;



	  public void init() {
		  setSize(250,250);


}
	 
	  public void paint(Graphics g) {
	
		  int x = 10;
		  int y = 10;
		  int hoogte = 100;
		  int laagte = 100;

		  
		 for(int i = 0; i < 8; i++) {
			 
	g.drawRoundRect(hoogte, hoogte, x, y, x, y);
		hoogte -=5;
		x+=10;
		y+=10;
		  
		  	
	  }
	  } 

	  }