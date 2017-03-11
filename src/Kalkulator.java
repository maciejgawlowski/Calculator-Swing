import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;

import javafx.scene.layout.Pane;

public class Kalkulator 
{
	double a, b;
	String działanie ="";
	boolean aUstawiono = false, wynikUstawiono = false;
	JButton bC, b7, b8, b9, bDzielenie, bPierwiastek, b4, b5, b6, bMnożenie, bProcent, b1, b2, b3, bOdejmowanie, bWynik, b0, bKropka, bPlusMinus, bDodawanie;
	JLabel label;
	
public Kalkulator(){
SwingUtilities.invokeLater(() -> {
   JFrame frame = new JFrame("ZDA Kalkulator");
   frame.setSize(400, 400);
   frame.setMinimumSize(new Dimension(300,300));
   frame.setMaximumSize(new Dimension(1000,1000)); // czy to działa?
   frame.setLocationRelativeTo(null); // okienko na środku ekranu po uruchomieniu
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   JPanel pane = new JPanel(new GridBagLayout());
   GridBagConstraints gbc = new GridBagConstraints();
   pane.setBackground(Color.WHITE);
   gbc.weightx = 1;
   gbc.weighty = 1;
   gbc.fill = GridBagConstraints.BOTH; // NONE, HORIZONTAL, VERTICAL
   gbc.insets = new Insets(2,2,2,2);
   
   //Pierwsza linijka
   JLabel label = new JLabel(" ");
   label.setForeground(Color.GRAY);
   label.setFont(new Font("default", Font.BOLD, 14));
   gbc.gridx = 0;
   gbc.gridy = 0;
   gbc.gridwidth = 5;
   gbc.weighty = 5;
   pane.add(label, gbc);
   //Druga linijka
   JTextField textField = new JTextField();
   textField.setForeground(new Color(0,0,150));
   textField.setBorder(new LineBorder(new Color(150,0,0)));
   textField.setFont(new Font("default", Font.BOLD, 20));
   textField.setHorizontalAlignment(JTextField.RIGHT);
   gbc.gridx = 0;
   gbc.gridy = 1;
   gbc.gridwidth = 4;
   gbc.weighty = 20;
   pane.add(textField, gbc);
   
   JButton bC = new JButton("C");
   bC.setForeground(new Color(150,0,0));
   bC.setBorder(new LineBorder(new Color(150,0,0)));
   bC.setBackground(Color.WHITE);
   bC.setFont(new Font("default", Font.BOLD, 18));
   gbc.gridx = 4;
   gbc.gridy = 1;
   gbc.gridwidth = 1;
   pane.add(bC, gbc);
   //Trzecia linijka
   JButton b7 = new JButton("7");
   b7.setForeground(new Color(150,0,0));
   b7.setBorder(new LineBorder(new Color(150,0,0)));
   b7.setBackground(Color.WHITE);
   b7.setFont(new Font("default", Font.BOLD, 18));
   
   gbc.gridx = 0;
   gbc.gridy = 2;
   pane.add(b7, gbc);
   
   JButton b8 = new JButton("8");
   b8.setForeground(new Color(150,0,0));
   b8.setBorder(new LineBorder(new Color(150,0,0)));
   b8.setBackground(Color.WHITE);
   b8.setFont(new Font("default", Font.BOLD, 18));
   gbc.gridx = 1;
   gbc.gridy = 2;
   pane.add(b8, gbc);
   
   JButton b9 = new JButton("9");
   b9.setForeground(new Color(150,0,0));
   b9.setBorder(new LineBorder(new Color(150,0,0)));
   b9.setBackground(Color.WHITE);
   b9.setFont(new Font("default", Font.BOLD, 18));
   gbc.gridx = 2;
   gbc.gridy = 2;
   pane.add(b9, gbc);
   
   JButton bDzielenie = new JButton("/");
   bDzielenie.setForeground(new Color(150,0,0));
   bDzielenie.setBorder(new LineBorder(new Color(150,0,0)));
   bDzielenie.setBackground(Color.WHITE);
   bDzielenie.setFont(new Font("default", Font.BOLD, 18));
   gbc.gridx = 3;
   gbc.gridy = 2;
   pane.add(bDzielenie, gbc);
   
   JButton bPierwiastek = new JButton("√");
   bPierwiastek.setForeground(new Color(150,0,0));
   bPierwiastek.setBorder(new LineBorder(new Color(150,0,0)));
   bPierwiastek.setBackground(Color.WHITE);
   bPierwiastek.setFont(new Font("default", Font.BOLD, 18));
   gbc.gridx = 4;
   gbc.gridy = 2;
   pane.add(bPierwiastek, gbc);
   //Czwarta linijka
   JButton b4 = new JButton("4");
   b4.setForeground(new Color(150,0,0));
   b4.setBorder(new LineBorder(new Color(150,0,0)));
   b4.setBackground(Color.WHITE);
   b4.setFont(new Font("default", Font.BOLD, 18));
   gbc.gridx = 0;
   gbc.gridy = 3;
   pane.add(b4, gbc);
   
   JButton b5 = new JButton("5");
   b5.setForeground(new Color(150,0,0));
   b5.setBorder(new LineBorder(new Color(150,0,0)));
   b5.setBackground(Color.WHITE);
   b5.setFont(new Font("default", Font.BOLD, 18));
   gbc.gridx = 1;
   gbc.gridy = 3;
   pane.add(b5, gbc);
   
   JButton b6 = new JButton("6");
   b6.setForeground(new Color(150,0,0));
   b6.setBorder(new LineBorder(new Color(150,0,0)));
   b6.setBackground(Color.WHITE);
   b6.setFont(new Font("default", Font.BOLD, 18));
   gbc.gridx = 2;
   gbc.gridy = 3;
   pane.add(b6, gbc);
   
   JButton bMnożenie = new JButton("*");
   bMnożenie.setForeground(new Color(150,0,0));
   bMnożenie.setBorder(new LineBorder(new Color(150,0,0)));
   bMnożenie.setBackground(Color.WHITE);
   bMnożenie.setFont(new Font("default", Font.BOLD, 18));
   gbc.gridx = 3;
   gbc.gridy = 3;
   pane.add(bMnożenie, gbc);
   
   JButton bProcent = new JButton("%");
   bProcent.setForeground(new Color(150,0,0));
   bProcent.setBorder(new LineBorder(new Color(150,0,0)));
   bProcent.setBackground(Color.WHITE);
   bProcent.setFont(new Font("default", Font.BOLD, 18));
   gbc.gridx = 4;
   gbc.gridy = 3;
   pane.add(bProcent, gbc);
   //Piąta linijka
   JButton b1 = new JButton("1");
   b1.setForeground(new Color(150,0,0));
   b1.setBorder(new LineBorder(new Color(150,0,0)));
   b1.setBackground(Color.WHITE);
   b1.setFont(new Font("default", Font.BOLD, 18));
   gbc.gridx = 0;
   gbc.gridy = 4;
   pane.add(b1, gbc);
   
   JButton b2 = new JButton("2");
   b2.setForeground(new Color(150,0,0));
   b2.setBorder(new LineBorder(new Color(150,0,0)));
   b2.setBackground(Color.WHITE);
   b2.setFont(new Font("default", Font.BOLD, 18));
   gbc.gridx = 1;
   gbc.gridy = 4;
   pane.add(b2, gbc);
   
   JButton b3 = new JButton("3");
   b3.setForeground(new Color(150,0,0));
   b3.setBorder(new LineBorder(new Color(150,0,0)));
   b3.setBackground(Color.WHITE);
   b3.setFont(new Font("default", Font.BOLD, 18));
   gbc.gridx = 2;
   gbc.gridy = 4;
   pane.add(b3, gbc);
   
   JButton bOdejmowanie = new JButton("-");
   bOdejmowanie.setForeground(new Color(150,0,0));
   bOdejmowanie.setBorder(new LineBorder(new Color(150,0,0)));
   bOdejmowanie.setBackground(Color.WHITE);
   bOdejmowanie.setFont(new Font("default", Font.BOLD, 18));
   gbc.gridx = 3;
   gbc.gridy = 4;
   pane.add(bOdejmowanie, gbc);
   
   JButton bWynik = new JButton("=");
   bWynik.setForeground(new Color(150,0,0));
   bWynik.setBorder(new LineBorder(new Color(150,0,0)));
   bWynik.setBackground(Color.WHITE);
   bWynik.setFont(new Font("default", Font.BOLD, 18));
   gbc.gridx = 4;
   gbc.gridy = 4;
   gbc.gridheight = 2;
   pane.add(bWynik, gbc);	
   //Szósta linijka
   JButton b0 = new JButton("0");
   b0.setForeground(new Color(150,0,0));
   b0.setBorder(new LineBorder(new Color(150,0,0)));
   b0.setBackground(Color.WHITE);
   b0.setFont(new Font("default", Font.BOLD, 18));
   gbc.gridx = 0;
   gbc.gridy = 5;
   gbc.gridheight = 1;
   pane.add(b0, gbc);
   
   JButton bKropka = new JButton(".");
   bKropka.setForeground(new Color(150,0,0));
   bKropka.setBorder(new LineBorder(new Color(150,0,0)));
   bKropka.setBackground(Color.WHITE);
   bKropka.setFont(new Font("default", Font.BOLD, 18));
   gbc.gridx = 1;
   gbc.gridy = 5;
   pane.add(bKropka, gbc);
   
   JButton bPlusMinus = new JButton("+/-");
   bPlusMinus.setForeground(new Color(150,0,0));
   bPlusMinus.setBorder(new LineBorder(new Color(150,0,0)));
   bPlusMinus.setBackground(Color.WHITE);
   bPlusMinus.setFont(new Font("default", Font.BOLD, 18));
   gbc.gridx = 2;
   gbc.gridy = 5;
   pane.add(bPlusMinus, gbc);
   
   JButton bDodawanie = new JButton("+");
   bDodawanie.setForeground(new Color(150,0,0));
   bDodawanie.setBorder(new LineBorder(new Color(150,0,0)));
   bDodawanie.setBackground(Color.WHITE);
   bDodawanie.setFont(new Font("default", Font.BOLD, 18));
   gbc.gridx = 3;
   gbc.gridy = 5;
   pane.add(bDodawanie, gbc);

   bC.addActionListener(e -> {
   	textField.setText("");
		odblokuj(b7, b8, b9, bDzielenie, bPierwiastek, b4, b5, b6, bMnożenie, bProcent, b1, b2, b3, bOdejmowanie, bWynik, b0, bKropka, bPlusMinus, bDodawanie);
		działanie="";
		aUstawiono = false;
		label.setText(" ");});
   b7.addActionListener(e -> {if (wynikUstawiono==false) textField.setText(textField.getText() + "7"); else {textField.setText("7"); wynikUstawiono = false;}});
   b8.addActionListener(e -> {if (wynikUstawiono==false) textField.setText(textField.getText() + "8"); else {textField.setText("8"); wynikUstawiono = false;}});
   b9.addActionListener(e -> {if (wynikUstawiono==false) textField.setText(textField.getText() + "9"); else {textField.setText("9"); wynikUstawiono = false;}});
   b4.addActionListener(e -> {if (wynikUstawiono==false) textField.setText(textField.getText() + "4"); else {textField.setText("4"); wynikUstawiono = false;}});
   b5.addActionListener(e -> {if (wynikUstawiono==false) textField.setText(textField.getText() + "5"); else {textField.setText("5"); wynikUstawiono = false;}});
   b6.addActionListener(e -> {if (wynikUstawiono==false) textField.setText(textField.getText() + "6"); else {textField.setText("6"); wynikUstawiono = false;}});
   b1.addActionListener(e -> {if (wynikUstawiono==false) textField.setText(textField.getText() + "1"); else {textField.setText("1"); wynikUstawiono = false;}});
   b2.addActionListener(e -> {if (wynikUstawiono==false) textField.setText(textField.getText() + "2"); else {textField.setText("2"); wynikUstawiono = false;}});
   b3.addActionListener(e -> {if (wynikUstawiono==false) textField.setText(textField.getText() + "3"); else {textField.setText("3"); wynikUstawiono = false;}});
   b0.addActionListener(e -> {if (wynikUstawiono==false) textField.setText(textField.getText() + "0"); else {textField.setText("0"); wynikUstawiono = false;}});
   bKropka.addActionListener(e -> {if (wynikUstawiono==false) textField.setText(textField.getText() + "."); else {textField.setText("."); wynikUstawiono = false;}});
   bDzielenie.addActionListener(e -> {
   	try
		{
			if (działanie=="")
			{działanie = "dzielenie";
			a = Double.parseDouble(textField.getText());
			textField.setText("");
			label.setText(String.valueOf(a) + " / ");
			aUstawiono = true;}
			else if (działanie!="" && aUstawiono == true)
				{działanie = "dzielenie";
				label.setText(label.getText().substring(0, label.getText().length()-3) + " / ");}
		} catch (Exception e1)
		{
			textField.setText("ERR");
			zablokuj(b7, b8, b9, bDzielenie, bPierwiastek, b4, b5, b6, bMnożenie, bProcent, b1, b2, b3, bOdejmowanie, bWynik, b0, bKropka, bPlusMinus, bDodawanie);
		}});
   bPierwiastek.addActionListener(e -> {
   	try
	{	{działanie = "pierwiastek";
		a = Double.parseDouble(textField.getText());
		if (String.valueOf((Math.sqrt(a)))=="NaN") throw new Exception();
		textField.setText(String.valueOf(Math.sqrt(a)));
		label.setText("√(" + String.valueOf(a) + ")");
		aUstawiono = false;
		wynikUstawiono = true;
		działanie="";}
	} catch (Exception e1)
	{
		textField.setText("ERR");
		zablokuj(b7, b8, b9, bDzielenie, bPierwiastek, b4, b5, b6, bMnożenie, bProcent, b1, b2, b3, bOdejmowanie,bWynik, b0, bKropka, bPlusMinus, bDodawanie);
	}});
   bMnożenie.addActionListener(e -> {
   	try
	{
		if (działanie=="")
		{działanie = "mnożenie";
		a = Double.parseDouble(textField.getText());
		textField.setText("");
		label.setText(String.valueOf(a) + " * ");
		aUstawiono = true;}
		else if (działanie!="" && aUstawiono == true)
			{działanie = "mnożenie";
			label.setText(label.getText().substring(0, label.getText().length()-3) + " * ");}
	} catch (Exception e1)
	{
		textField.setText("ERR");
		zablokuj(b7, b8, b9, bDzielenie, bPierwiastek, b4, b5, b6, bMnożenie, bProcent, b1, b2, b3, bOdejmowanie,bWynik, b0, bKropka, bPlusMinus, bDodawanie);
	}});
   bProcent.addActionListener(e -> {
   	try
	{	{działanie = "procent";
	a = Double.parseDouble(textField.getText());
	textField.setText(String.valueOf(a/100));
	label.setText(String.valueOf(a) + " %");
	aUstawiono = false;
	wynikUstawiono = true;
	działanie="";}
} catch (Exception e1)
{
	textField.setText("ERR");
	zablokuj(b7, b8, b9, bDzielenie, bPierwiastek, b4, b5, b6, bMnożenie, bProcent, b1, b2, b3, bOdejmowanie,bWynik, b0, bKropka, bPlusMinus, bDodawanie);
}});
   bOdejmowanie.addActionListener(e -> {
   	try
		{
			if (działanie=="")
			{działanie = "odejmowanie";
			a = Double.parseDouble(textField.getText());
			textField.setText("");
			label.setText(String.valueOf(a) + " - ");
			aUstawiono = true;}
			else if (działanie!="" && aUstawiono == true)
				{działanie = "odejmowanie";
				label.setText(label.getText().substring(0, label.getText().length()-3) + " - ");}
		} catch (Exception e1)
		{
			textField.setText("ERR");
			zablokuj(b7, b8, b9, bDzielenie, bPierwiastek, b4, b5, b6, bMnożenie, bProcent, b1, b2, b3, bOdejmowanie, bWynik, b0, bKropka, bPlusMinus, bDodawanie);
		}});
   bPlusMinus.addActionListener(e -> {
   	if (textField.getText().startsWith("-"))
   		textField.setText(textField.getText().substring(1, textField.getText().length()));
   	else {wynikUstawiono=false;
   	textField.setText("-" + textField.getText());}
   	
   });
   bDodawanie.addActionListener(e -> {
   	try
		{
			if (działanie=="")
			{działanie = "dodawanie";
			a = Double.parseDouble(textField.getText());
			textField.setText("");
			label.setText(String.valueOf(a) + " + ");
			aUstawiono = true;}
			else if (działanie!="" && aUstawiono == true)
				{działanie = "dodawanie";
				label.setText(label.getText().substring(0, label.getText().length()-3) + " + ");}
		} catch (Exception e1)
		{
			textField.setText("ERR");
			zablokuj(b7, b8, b9, bDzielenie, bPierwiastek, b4, b5, b6, bMnożenie, bProcent, b1, b2, b3, bOdejmowanie,bWynik, b0, bKropka, bPlusMinus, bDodawanie);
		}
   	});	
   bWynik.addActionListener(e -> {
   	try
		{
			if (działanie.equals("dodawanie") && aUstawiono)
				{b = Double.parseDouble(textField.getText());
				textField.setText(String.valueOf(a+b));
				label.setText(label.getText() + String.valueOf(b) + " =");
				działanie="";
				aUstawiono = false;
				wynikUstawiono = true;}
			else if (działanie.equals("odejmowanie") && aUstawiono)
				{b = Double.parseDouble(textField.getText());
				textField.setText(String.valueOf(a-b));
				label.setText(label.getText() + String.valueOf(b) + " =");
				działanie="";
				aUstawiono = false;
				wynikUstawiono = true;}
			else if (działanie.equals("dzielenie") && aUstawiono)
				{b = Double.parseDouble(textField.getText());
				if (String.valueOf((a/b))=="NaN" || String.valueOf((a/b))=="Infinity") throw new Exception();
				textField.setText(String.valueOf(a/b));
				label.setText(label.getText() + String.valueOf(b) + " =");
				działanie="";
				aUstawiono = false;
				wynikUstawiono = true;}
			else if (działanie.equals("mnożenie") && aUstawiono)
				{b = Double.parseDouble(textField.getText());
				textField.setText(String.valueOf(a*b));
				label.setText(label.getText() + String.valueOf(b) + " =");
				działanie="";
				aUstawiono = false;
				wynikUstawiono = true;}
		} catch (Exception e1)
		{
			textField.setText("ERR");
			zablokuj(b7, b8, b9, bDzielenie, bPierwiastek, b4, b5, b6, bMnożenie, bProcent, b1, b2, b3, bOdejmowanie, bWynik, b0, bKropka, bPlusMinus, bDodawanie);
		}
   });
   
   
   frame.getContentPane().add(pane);
   frame.setVisible(true);               
 });
}


private void zablokuj(JButton b7, JButton b8, JButton b9, JButton bDzielenie, JButton bPierwiastek, JButton b4,
		JButton b5, JButton b6, JButton bMnożenie, JButton bProcent, JButton b1, JButton b2, JButton b3,
		JButton bOdejmowanie, JButton bWynik, JButton b0, JButton bKropka, JButton bPlusMinus, JButton bDodawanie)
{
	b7.setEnabled(false);
	b8.setEnabled(false);
	b9.setEnabled(false);
	bDzielenie.setEnabled(false);
	bPierwiastek.setEnabled(false);
	b4.setEnabled(false);
	b5.setEnabled(false);
	b6.setEnabled(false);
	bMnożenie.setEnabled(false);
	bProcent.setEnabled(false);
	b1.setEnabled(false);
	b2.setEnabled(false);
	b3.setEnabled(false);
	bOdejmowanie.setEnabled(false);
	bWynik.setEnabled(false);
	b0.setEnabled(false);
	bKropka.setEnabled(false);
	bPlusMinus.setEnabled(false);
	bDodawanie.setEnabled(false);
}

private void odblokuj(JButton b7, JButton b8, JButton b9, JButton bDzielenie, JButton bPierwiastek, JButton b4,
		JButton b5, JButton b6, JButton bMnożenie, JButton bProcent, JButton b1, JButton b2, JButton b3,
		JButton bOdejmowanie, JButton bWynik, JButton b0, JButton bKropka, JButton bPlusMinus, JButton bDodawanie)
{
	b7.setEnabled(true);
	b8.setEnabled(true);
	b9.setEnabled(true);
	bDzielenie.setEnabled(true);
	bPierwiastek.setEnabled(true);
	b4.setEnabled(true);
	b5.setEnabled(true);
	b6.setEnabled(true);
	bMnożenie.setEnabled(true);
	bProcent.setEnabled(true);
	b1.setEnabled(true);
	b2.setEnabled(true);
	b3.setEnabled(true);
	bOdejmowanie.setEnabled(true);
	bWynik.setEnabled(true);
	b0.setEnabled(true);
	bKropka.setEnabled(true);
	bPlusMinus.setEnabled(true);
	bDodawanie.setEnabled(true);
}


	public static void main(String[] args)
	{
		 Kalkulator kalk = new Kalkulator();
	}
}
