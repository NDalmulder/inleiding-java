package h8;


import java.applet.Applet;

import java.awt.Button;

import java.awt.Graphics;

import java.awt.event.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

public class opdracht1 extends Applet {
	

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
Button FrisButton;
Button BierButton;
Button KoffieButton;
Button WijnButton;
Button BindistButton;
Button BuitdistButton;
Button Nieuwebestelling;

double fris;
double bier;
double wijn;
double koffie;
double bindist;
double buitdist;
double totaal;
double bedrag;

 
public void init(){
setSize(500, 400);
bedrag = 0.00;
FrisButton = new Button("Fris");
add(FrisButton);
FrisButton.addActionListener(new FrisKnopLuisteraar());

BierButton = new Button("Bier");
add(BierButton);
BierButton.addActionListener(new BierKnopLuisteraar());

WijnButton = new Button("Wijn");
add(WijnButton);
WijnButton.addActionListener(new WijnKnopLuisteraar());

KoffieButton = new Button("Koffie");
add(KoffieButton);
KoffieButton.addActionListener(new KoffieKnopLuisteraar());

BindistButton = new Button("Bindist");
add(BindistButton);
BindistButton.addActionListener(new BinDistKnopLuisteraar());

BuitdistButton = new Button("Buitdist");
add(BuitdistButton);
BuitdistButton.addActionListener(new BuitDistKnopLuisteraar());

Button NieuwebestellingButton = new Button("Nieuwe bestelling");
add(NieuwebestellingButton);
NieuwebestellingButton.addActionListener(new NieuwebestellingKnopLuisteraar());


fris = 2.00;
bier = 2.25;
wijn = 2.50;
koffie = 1.75;
bindist = 2.75;
buitdist = 3.50;
totaal = 0.00;


}

public void paint(Graphics g) {
int x = 50;
int y = 100;
g.drawString("Bedrag bestelling: " + bedrag , x, y);
y += 20;
g.drawString("Totaal dagomzet: " + totaal, x, y);



}



 /********** Event Handlers ************/
 class FrisKnopLuisteraar implements ActionListener {

@Override

public void actionPerformed(ActionEvent e) {
       bedrag = (bedrag + fris);
       totaal = (totaal + fris);
       repaint();
       
}
 }

class BierKnopLuisteraar implements ActionListener {

@Override

public void actionPerformed(ActionEvent e) {
      bedrag = (bedrag + bier);
      totaal = (totaal + bier);
      repaint();
}
}
class WijnKnopLuisteraar implements ActionListener {

@Override

public void actionPerformed(ActionEvent e) {
      bedrag = (bedrag + wijn);
      bedrag = (totaal + wijn);
      repaint();
}
}
class KoffieKnopLuisteraar implements ActionListener {

@Override

public void actionPerformed(ActionEvent e) {
      bedrag = (bedrag + koffie);
      totaal = (totaal + koffie);
      repaint();


}
}
class BinDistKnopLuisteraar implements ActionListener {

@Override

public void actionPerformed(ActionEvent e) {
      bedrag = (bedrag + bindist);
      totaal = (totaal + bindist);
      repaint();

}
}
class BuitDistKnopLuisteraar implements ActionListener {

@Override

public void actionPerformed(ActionEvent e) {
      bedrag = (bedrag + buitdist);
      totaal = (totaal + buitdist);
      repaint();

}
}
class NieuwebestellingKnopLuisteraar implements ActionListener {

@Override

public void actionPerformed(ActionEvent e) {
      bedrag = 0;
      repaint();

}
}
}
     



       

    	          
    	          