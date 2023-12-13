import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GUI implements ActionListener{
	
	int count = 0;
	JFrame frame;
	JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16, button17, button18, button19, button20, button21, button22, button23, button24, button25, button26, button27;
	private JPanel panel;
	
	
	public GUI() {
		
		frame = new JFrame();
		
		button1 =  new JButton("Polygon");
		button1.addActionListener(this);
		
		button2 = new JButton("Square");
		button2.addActionListener(this);
		
		button3 = new JButton ("Triangle");
		button3.addActionListener(this);
		
		button4 = new JButton ("Colour");
		button4.addActionListener(this);
	
		button5 = new JButton ("PenColour");
		button5.addActionListener(this);
		
		button6 = new JButton ("Backward");
		button6.addActionListener(this);
		
		button7 = new JButton ("Forward");
		button7.addActionListener(this);
		
		button8 = new JButton ("Turnright");
		button8.addActionListener(this);
		
		button9 = new JButton ("TurnLeft");
		button9.addActionListener(this);
		
		button10 = new JButton ("Clear");
		button10.addActionListener(this);
		
		button11 = new JButton ("Reset");
		button11.addActionListener(this);
		
		button12 = new JButton ("Circle");
		button12.addActionListener(this);
		
		button13 = new JButton ("PenUp");
		button13.addActionListener(this);
		
		button14 = new JButton ("PenDown");
		button14.addActionListener(this);
		
		button15 = new JButton ("About");
		button15.addActionListener(this);
		
		button16 = new JButton ("Width");
		button16.addActionListener(this);
		
		button17 = new JButton ("Circle");
		button17.addActionListener(this);
		
		button18 = new JButton ("Blue");
		button18.addActionListener(this);
		
		button19 = new JButton ("About");
		button19.addActionListener(this);
		
		button20 = new JButton ("Polygon");
		button20.addActionListener(this);
		
		button21 = new JButton ("Save");
		button21.addActionListener(this);
		
		button22 = new JButton ("Load");
		button22.addActionListener(this);
		
		button23 = new JButton ("Person");
		button23.addActionListener(this);
		
		button24 = new JButton ("Star");
		button24.addActionListener(this);
		
		button25 = new JButton ("Smile");
		button25.addActionListener(this);
		
		button26 = new JButton ("Showhistory");
		button26.addActionListener(this);
		
		button27 = new JButton ("Readhistory");
		button27.addActionListener(this);
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(150,150,150,150));
		panel.setLayout(new GridLayout(0,1));
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button10);
		panel.add(button11);
		panel.add(button12);
		panel.add(button13);
		panel.add(button14);
		panel.add(button15);
		panel.add(button16);
		panel.add(button17);
		panel.add(button18);
		panel.add(button19);
		panel.add(button20);
		panel.add(button21);
		panel.add(button22);
		panel.add(button23);
		panel.add(button24);
		panel.add(button25);
		panel.add(button26);
		panel.add(button27);

		
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("My GUI");
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String args[]) {
		new GUI();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == button1){
			JOptionPane.showMessageDialog(frame, "Polygon <number of sides> <length of each side>\n----------------------------------------------------------------\nDraws a polygon with a chosen number \nof sides and a chosen length");
		}
		
		else if (arg0.getSource() == button2){
			JOptionPane.showMessageDialog(frame, "Square <length of each side> \n----------------------------------------------------------------\nDraws a square with a chosen length");
		}		
		
		else if (arg0.getSource() == button3){
			JOptionPane.showMessageDialog(frame, "Triangle <length of each side>\\n----------------------------------------------------------------\ndDraws a triangle with a chosen length");
		}		
		
		else if (arg0.getSource() == button4){
			JOptionPane.showMessageDialog(frame, "<colour>\n----------------------------------------------------------------\nSets the pen colour to the colour\nthat is entered (e.g. \"blue\")");
		}		
		
		else if (arg0.getSource() == button5){
			JOptionPane.showMessageDialog(frame, "Pencolour <RGB value 1> <RGB value 2> <RGB value 3>\n----------------------------------------------------------------\nSets the pen colour to the\n RGB value of inputted numbers");
		}		
		
		else if (arg0.getSource() == button6){
			JOptionPane.showMessageDialog(frame, "Backward <distance>\n----------------------------------------------------------------\nTurtle goes backwards by the chosen distance");
		}		
		
		else if (arg0.getSource() == button7){
			JOptionPane.showMessageDialog(frame, "Forward <distance>\n----------------------------------------------------------------\nTurtle goes forwards by the chosen distance");
		}	
		
		else if (arg0.getSource() == button8){
			JOptionPane.showMessageDialog(frame, "Turnright <angle>\n----------------------------------------------------------------\nTurns right by the inputted angle");
		}		
		
		else if (arg0.getSource() == button9){
			JOptionPane.showMessageDialog(frame, "Turnleft <angle>\n----------------------------------------------------------------\nTurns left by the inputted angle");
		}		
		
		else if (arg0.getSource() == button10){
			JOptionPane.showMessageDialog(frame, "Clear\n----------------------------------------------------------------\nClears all of the pixels from the screen");
		}		
		
		else if (arg0.getSource() == button11){
			JOptionPane.showMessageDialog(frame, "Reset\n----------------------------------------------------------------\nReturns the turtle back to its original position");
		}	
		
		else if (arg0.getSource() == button12){
			JOptionPane.showMessageDialog(frame, "Circle <radius>\n----------------------------------------------------------------\nDraws a circle with the inputted radius");
		}	
		
		else if (arg0.getSource() == button13){
			JOptionPane.showMessageDialog(frame, "Penup\n----------------------------------------------------------------\nStops the turtle from leaving a trail when moving");
		}		
		
		else if (arg0.getSource() == button14){
			JOptionPane.showMessageDialog(frame, "Pendown\n----------------------------------------------------------------\nAllows the turtle to make a trail when moving");
		}		
		
		else if (arg0.getSource() == button15){
			JOptionPane.showMessageDialog(frame, "About\n----------------------------------------------------------------\nDraws a graphic along with a name");
		}		
		
		else if (arg0.getSource() == button16){
			JOptionPane.showMessageDialog(frame, "Width <pixel width>\n-----------------------------------"
					+ "-----------------------------\nSets the width of the turtle trail");
		}	
		
		else if (arg0.getSource() == button17){
			JOptionPane.showMessageDialog(frame, "Circle <radius>\n-----------------------------------"
					+ "-----------------------------\nDraws a cirlce with a given radius");
		}	
		
		else if (arg0.getSource() == button18){
			JOptionPane.showMessageDialog(frame, "about\n-----------------------------------"
					+ "-----------------------------\nDraws a special graphic");
		}
		
		else if (arg0.getSource() == button19){
			JOptionPane.showMessageDialog(frame, "polygon <number of sides> <side length>\n-----------------------------------"
					+ "-----------------------------\nDraws a polygon with a given number of sides\nand a given length");
		}	
		
		else if (arg0.getSource() == button20){
			JOptionPane.showMessageDialog(frame, "Save\n-----------------------------------"
					+ "-----------------------------\nSaves the previous commands to a text file");
		}	
		
		else if (arg0.getSource() == button21){
			JOptionPane.showMessageDialog(frame, "Load\n-----------------------------------"
					+ "-----------------------------\nLoads the contents of the text file into the history");
		}	
		
		else if (arg0.getSource() == button22){
			JOptionPane.showMessageDialog(frame, "person <height>\n-----------------------------------"
					+ "-----------------------------\nDraws a stickman with a given height");
		}	
		
		else if (arg0.getSource() == button23){
			JOptionPane.showMessageDialog(frame, "Star <side length>\n-----------------------------------"
					+ "-----------------------------\nDraws a star with a given side length");
		}	
		
		else if (arg0.getSource() == button24){
			JOptionPane.showMessageDialog(frame, "Smile\n-----------------------------------"
					+ "-----------------------------\nDraws a smiley face :)");
		}	
		
		else if (arg0.getSource() == button25){
			JOptionPane.showMessageDialog(frame, "showhistory\n-----------------------------------"
					+ "-----------------------------\nDisplays a history of commands entered");
		}	
		
		else if (arg0.getSource() == button26){
			JOptionPane.showMessageDialog(frame, "readhistory\n-----------------------------------"
					+ "-----------------------------\nRuns the history of entered commands");
		}	
		
		else if (arg0.getSource() == button27){
			JOptionPane.showMessageDialog(frame, "Customtriangle <length1> <length2> <length3>\n-----------------------------------"
					+ "-----------------------------\nOutputs whether a triangle is drawable or not given three different lengths");
		}	
		

	}
}