import uk.ac.leedsbeckett.oop.LBUGraphics;
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.awt.Color;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GraphicsSystem extends LBUGraphics 
{
	
	private ArrayList<String> history = new ArrayList<String>();
	/**
	 * 
	 */
	int count=0;
	private static final long serialVersionUID = 1L;

	public GraphicsSystem()       
	{		
		JFrame MainFrame = new JFrame();
		MainFrame.setLayout(new FlowLayout());
		MainFrame.add(this);
		MainFrame.pack();
		MainFrame.setVisible(true);	
		//about();
		//clear();
		//reset();
	}
	
	public void processCommand(String command) 
	{
		String[] commandArray = new String[]{"forward", "turnleft", "turnright", "penup", "pendown", "black", "green", "red", "white", "reset","clear", "backward", "square", "pencolour", "triangle", "width", "circle", "blue", "about", "polygon", "save", "load", "person", "star", "smile", "showhistory", "readhistory", "customtriangle"};
		List<String> commandList = new ArrayList<>(Arrays.asList(commandArray));
		try 
		{
			String[] splitList = command.split(" ");
			String firstCommand = splitList[0];
			
			
			if (commandList.contains(firstCommand))
			{
				switch (firstCommand) 
				{
				case ("forward"):
					doForwardCommand(splitList);
					break; 
				case ("turnleft"):
					doTurnLeft(splitList);
					break;
				case ("turnright"):
					doTurnRight(splitList);
					break;
				case ("penup"):
					doPenUp(splitList);
					break;
				case ("pendown"):
					doPenDown(splitList);
					break;
				case ("black"):
					doSetPenColourBlack(splitList);
					break;
				case ("green"):
					doSetPenColourGreen(splitList);
					break;
				case ("red"):
					doSetPenColourRed(splitList);
					break;
				case ("white"):
					doSetPenColourWhite(splitList);
					break;
				case ("reset"):
					doReset(splitList);
					break;
				case ("clear"):
					doClear(splitList);
					break;
				case ("backward"):
					doBackward(splitList);
					break;
				case ("square"):
					doSquare(splitList);
					break;
				case ("pencolour"):
					doSetPenColour(splitList);
					break;
				case ("triangle"):
					doTriangle(splitList);
					break;
				case ("width"):
					doWidth(splitList);
					break;
				case ("circle"):
					doDrawCircle(splitList);
					break;
				case ("blue"):
					doSetPenColourBlue(splitList);
					break;
				case ("about"):
					doAbout(splitList);
					break;
				case ("polygon"):
					doPolygon(splitList);
					break;
				case ("save"):
					doSave(splitList);
					break;
				case ("load"):
					doLoad(splitList);
					break;
				case ("person"):
					doPerson(splitList);
					break;
				case ("star"):
					doStar(splitList);
					break;
				case ("smile"):
					soSmile(splitList);
					break;
				case ("showhistory"):
					doShowHistory(splitList);
					break;
				case ("readhistory"):
					doReadHistory(splitList);
					break;
				case ("customtriangle"):
					doCustomTriangle(splitList);
					break;
				default:
					displayMessage("Invalid parameter");
					break;
				}
			}
			else if (commandList.contains(firstCommand) != true)
			{
				displayMessage("Invalid command");
			}
		}
		catch(Exception e)
		{			
			displayMessage("Invalid entry");
		}	
	}
	
private void doCustomTriangle(String[] splitList) {
		if (splitList.length == 4){
			try {
				String stringValue1 = splitList[1];
				String stringValue2 = splitList[2];
				String stringValue3 = splitList[3];
				int a = Integer.parseInt(stringValue1);
				int b = Integer.parseInt(stringValue2);
				int c = Integer.parseInt(stringValue3);
				if (((a+b)>c) && ((a+c)>b) && ((b+c)>a)) {
					displayMessage("These values are able to make a triangle");
				}	
				else {
					displayMessage("These values are unable to form a triangle");
				}
			}
			catch (Exception e) {
				displayMessage("Input must be numeric");
			}
		}
		else {
			displayMessage("Input requires three parameters");
		}
	}

private void doReadHistory(String[] splitList) {
		if (splitList.length == 1) {
			System.out.println(history);
			for (String str : history) {
				processCommand(str);
			}
		}
		else {
			displayMessage("No parameter required");
		}
	}

private void addToHistory(String[] splitList) {	
	String str = String.join(" ", splitList);
	history.add(str);
}
	
private void doShowHistory(String[] splitList) {
		if (splitList.length == 1) {
			String commands = "";
			for	(String str : history) {
				commands += (str + "\n \n \n \n \n \n \n \n \n \n \n \n");
			}
			displayMessage(commands);

		}
		else {
			displayMessage("No parameter required");
		}
	}

private void soSmile(String[] splitList) {
		if (splitList.length==1) {
			circle(100);
			penUp();
			turnLeft(180);
			forward(30);
			turnLeft(90);
			forward(25);
			penDown();
			circle(5);
			penUp();
			turnRight(180);
			forward(50);
			penDown();
			circle(5);
			penUp();
			turnRight(90);
			forward(50);
			penDown();
			forward(10);
			turnRight(90);
			forward(50);
			turnRight(90);
			forward(10);
			addToHistory(splitList);
		}
		else {
			displayMessage("No parameters required");
		}
	}

private void doStar(String[] splitList) {
		if (splitList.length==2) {
			try {
				String stringValue = splitList[1];
				int value = Integer.parseInt(stringValue);
				if (value > 0 && value <= 10000) {
					turnLeft(198);
					
					for (int i = 0; i <= 4; i++) {
						turnLeft(144);
						forward(value);
						turnRight(72);
						forward(value);
					}
					addToHistory(splitList);
				}
				else {
					displayMessage("Parameter(s) out of range");
				}
			}
			catch (Exception e) {
				displayMessage("Invalid parameter - data must be numeric");
			}
		}
		else {
			displayMessage("Input requires two parameters");
		}
	}

private void doPerson(String[] splitList) {
		if (splitList.length == 2) {
			try {
				String stringValue = splitList[1];
				int value = Integer.parseInt(stringValue);
				if (value >= 0 && value <= value) {
					reset();
					penDown();
					
					forward(value);
					
					turnLeft(30);
					forward(50);
					turnLeft(180);
					forward(50);
					
					turnLeft(120);
					forward(50);
					turnLeft(180);
					forward(50);
					turnLeft(30);
					forward(value);
					penUp();
					forward(30);
					penDown();
					
					circle(30);
					turnLeft(180);
					penUp();
					forward(50);
					penDown();
					turnLeft(90);
					forward(value / 2);
					turnLeft(180);
					forward(value);
					addToHistory(splitList);
				}
				else {
					displayMessage("Parameter out of range");
				}
			}
			catch(Exception e) {
				displayMessage("Invalid parameter - data must be numeric");
			}
		}
		else {
			displayMessage("Input requires two parameters");
		}
	}

private void doLoad(String[] splitList) {
	if (splitList.length==2) {
		if (splitList[1].compareTo("image")==0) {
			BufferedImage img = null;
			try {
				img = ImageIO.read(new File("image.png"));
				setBufferedImage(img);
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		else if (splitList[1].compareTo("text")==0) {
			try {
				history.clear();
				FileReader fr = new FileReader ("history.txt");
				BufferedReader br = new BufferedReader(fr);
				String line;
				while ((line = br.readLine()) != null) {
					history.add(line);
				}
				br.close();
			}
			catch(IOException e) {
				displayMessage(e.getMessage());
			}
		}
		else {
			displayMessage("Only images and text can be loaded");
		}
	}
	else {
		displayMessage("Input requires a parameter - image or text");
	}
	}

private void doSave(String[] splitList) {
	if (splitList.length==2) {
		if (splitList[1].compareTo("image")==0) {
			File outputfile = new File("image.png");
			try {
				ImageIO.write(getBufferedImage(), "png", outputfile);
			} catch (IOException e) {
				displayMessage("Error");
				e.printStackTrace();
			}
		}
		else if (splitList[1].compareTo("text")==00) {
			try {
				String filename = "history.txt";
				FileWriter fw = new FileWriter(filename, false);
				String toWrite = "";
				for (String str : history) {
					toWrite += (str + "\n");
				}
				fw.write(toWrite);
				fw.close();
			}
			catch (Exception e) {
				displayMessage("error");
			}
		}
		else {
			displayMessage("Only images and text can be saved");
		}
	}
	else {
		displayMessage("Input requires a parameter - image or text");
	}
	}
	

private void doPolygon(String[] splitList) {
		if (splitList.length==3) {
			try {
				String stringValue1 = splitList[1];
				int n = Integer.parseInt(stringValue1);
				String stringValue2 = splitList[2];
				int length = Integer.parseInt(stringValue2);
				if (n >= 3 && n <= 20) {
					if (length <= 10000 && length >= 0) {
						int totalIntAngle = ((n-2) * 180);
						int intAngle = 180 - (totalIntAngle / n);
						System.out.println(intAngle);
						reset();
						penDown();
						turnRight(90);
						for (int i = 0; i < n; i++) {
							forward(length);
							turnLeft(intAngle);
						}	
						addToHistory(splitList);
					}
					else {
						displayMessage("Length parameter value out of range");
					}
				}
				else {
					displayMessage("Number of sides must be between 3-20");
				}
			}
			catch (Exception e) {
				displayMessage("Parameter values must be numeric");
			}
		}
		else {
			
			System.out.println("Input requires two parameters: number of sides, length of sides");
		}
	}

private void doAbout(String[] splitList) {
		about();
		forward(90);
		turnRight(90);
		forward(90);
		penDown();
		forward(30);
		turnLeft(90);
		forward(30);
		turnLeft(90);
		forward(30);
		turnRight(90);
		forward(30);
		turnRight(90);
		forward(30);
		turnRight(180);
		penUp();
		forward(60);
		turnLeft(90);
		penDown();
		forward(60);
		turnRight(90);
		forward(30);
		turnRight(90);
		forward(30);
		turnRight(90);
		forward(30);
		turnRight(180);
		forward(30);
		turnRight(90);
		forward(30);
		turnLeft(90);
		penUp();
		forward(30);
		turnLeft(90);
		penDown();
		forward(60);
		turnRight(90);
		forward(20);
		turnRight(90);
		forward(25);
		turnRight(180);
		forward(25);
		turnRight(90);
		forward(20);
		turnRight(90);
		forward(60);
		reset();
		addToHistory(splitList);
	}

private void doSetPenColourBlue(String[] splitList) {
		if (splitList.length==1)
		{
			setPenColour(Color.BLACK);
			addToHistory(splitList);
		}
		else
		{
			displayMessage("Too many values passed");
		}
	}

private void doDrawCircle(String[] splitList) {
		if (splitList.length==2) {
			try {
				String stringValue = splitList[1];
				int value = Integer.parseInt(stringValue);
				if (value > 0 && value <= 10000) {
					circle(value);
					addToHistory(splitList);
				}
				else {
					displayMessage("Parameter(s) out of range");
				}
			}
			catch(Exception e) {
				displayMessage("Invalid parameter - data must be numeric");
			}
		}
		else {
			displayMessage("Input requires two parameters");
		}
	}

private void doWidth(String[] splitList) {
		if (splitList.length==2) {
			try {
				String stringValue = splitList[1];
				int value = Integer.parseInt(stringValue);
				if (value >= 0 && value <= 500) {
					setStroke(value);
					addToHistory(splitList);
				}
				else {
					displayMessage("Parameter value out of range");
				}
			}
			catch (Exception e){
				displayMessage("Invalid parameter - data must be numeric");
			}
		}
		else {
			displayMessage("Input requires one parameter");
		}
	}

private void doTriangle(String[] splitList) {
		if (splitList.length==2) {
			try {
				String stringValue = splitList[1];
				int value = Integer.parseInt(stringValue);
				if (value >= 0 && value <= 100000) {
					turnRight(30);
					forward(value);
					turnLeft(120);
					forward(value);
					turnLeft(120);
					forward(value);
					reset();
					addToHistory(splitList);
				}
				else {
					displayMessage("Parameter value out of range");
				}
			}
			catch(Exception e) {
				displayMessage("Invalid parameter - data must be numeric");
			}
		}
		else {
			displayMessage("Input requires one parameter");
		}
	}

	private void doSetPenColour(String[] splitList) {
		if (splitList.length==4) 
		{
			try 
			{
				String stringValue1 = splitList[1];
				int value1 = Integer.parseInt(stringValue1);
				String stringValue2 = splitList[2];
				int value2 = Integer.parseInt(stringValue2);
				String stringValue3 = splitList[3];
				int value3 = Integer.parseInt(stringValue3);
				
				if (value1 >= 0 && value1 <= 255 && value2 >= 0 && value2 <= 255 && value3 >= 0 && value3 <= 255) 
				{
						Color col = new Color(value1,value2,value3);
						penDown();
						setPenColour(col);
						addToHistory(splitList);
				}
				else {
					displayMessage("Parameter values must be between 0 and 255");
				}
			}
			catch(Exception e)
			{
				displayMessage("Parameter values must be numeric");
			}
		}
		
		else {
			displayMessage("3 RGB parameters required ");
		}
	} 

	private void doSquare(String[] splitList) {
		if (splitList.length==2)
		{
			try {
				String stringValue = splitList[1];
				int value = Integer.parseInt(stringValue);
				if (value >= 0 && value <= 100000)
				{
					turnLeft(90);
					for (int i=0; i<=3; i++) {
						forward(value);
						turnLeft(90);
					}
					addToHistory(splitList);
				}
				else {
					displayMessage("Parameter value out of range");
				}
			}
			catch(Exception e)
			{
				displayMessage("Invalid parameter - data must be numeric");
			}
		}
		else {
			displayMessage("Input requires one paramter");
		}
	}

	private void doBackward(String[] splitList) {
		if (splitList.length == 2)
		{
			try {
				String stringValue = splitList[1];
				int value = Integer.parseInt(stringValue);			
				if (value >=  0 && value <= 100000)
				{
					turnLeft(180);
					forward(value);
					turnLeft(180);
					addToHistory(splitList);
				}
				else {
					displayMessage("Parameter value out of range");
				}
			}
			catch (Exception e)
			{
				displayMessage("Invalid parameter - data must be numeric");
			}
		}
		else {
			displayMessage("Input requires one parameter");
		}		
	}

	private void doClear(String[] splitList) {
		if (splitList.length==1)
		{
			clear();
			addToHistory(splitList);
		}
		else
		{
			displayMessage("Too many values passed");
		}
	}

	private void doReset(String[] splitList) {
		if (splitList.length==1)
		{
			reset();
			setStroke(1);
			setPenColour(Color.GREEN);
			addToHistory(splitList);
		}
		else
		{
			displayMessage("Too many values passed");
		}
	}

	private void doSetPenColourWhite(String[] splitList) {
		if (splitList.length==1)
		{
			setPenColour(Color.WHITE);	
			addToHistory(splitList);
		}
		else
		{
			displayMessage("Too many values passed");
		}
	}

	private void doSetPenColourRed(String[] splitList) {
		if (splitList.length==1)
		{
			setPenColour(Color.RED);
			addToHistory(splitList);
		}	
		else
		{
			displayMessage("Too many values passed");
		}
	}

	private void doSetPenColourGreen(String[] splitList) {
		if (splitList.length==1)
		{
			setPenColour(Color.GREEN);
			addToHistory(splitList);
		}
		else
		{
			displayMessage("Too many values passed");
		}
	}

	private void doSetPenColourBlack(String[] splitList) {
		if (splitList.length==1)
		{
			setPenColour(Color.BLACK);
			addToHistory(splitList);
		}
		else
		{
			displayMessage("Too many values passed");
		}
	}

	private void doPenDown(String[] splitList) {
		if (splitList.length==1)
		{
			penDown();
			addToHistory(splitList);
		}	
		else
		{
			displayMessage("Too many values passed");
		}
	}

	private void doPenUp(String[] splitList) {
		if (splitList.length==1)
		{
			penUp();
			addToHistory(splitList);
		}
		else
		{
			displayMessage("Too many values passed");
		}
	}

	private void doTurnRight(String[] splitList) {
		if (splitList.length == 2)
		{
			try {
				String stringValue = splitList[1];
				try {
					int value = Integer.parseInt(stringValue);
					if (value >=  0 && value <= 100000)
					{
						turnRight(value);
						addToHistory(splitList);
					}
					else {
						displayMessage("Parameter value out of range");
					}
				}
				catch (Exception e) {
					displayMessage("Parameter must be numeric");
				}
			}
			catch (Exception e)
			{
				displayMessage("Invalid parameter - data must be numeric");
			}
		}
		else {
			displayMessage("Input requires one parameter");
		}
	}

	private void doTurnLeft(String[] splitList) {
		if (splitList.length == 2)
		{
			try {
				String stringValue = splitList[1];
				int value = Integer.parseInt(stringValue);
				if (value >=  0 && value <= 100000)
				{
					turnLeft(value);
					addToHistory(splitList);
				}
				else {
					displayMessage("Parameter value out of range");
				}
			}
			catch (Exception e)
			{
				displayMessage("Invalid parameter - data must be numeric");
			}
		}
		else {
			displayMessage("Input requires one parameter");
		}
	}

	private void doForwardCommand(String[] splitList) {
		if (splitList.length == 2)
		{
			try {
				
				String stringValue = splitList[1];
				int value = Integer.parseInt(stringValue);
				if (value >=  0 && value <= 100000)
				{
					forward(value);
					addToHistory(splitList);
				}
				else {
					displayMessage("Parameter value out of range");
				}
			}
			catch (Exception e)
			{
				displayMessage("Invalid parameter - data must be numeric");
			}
		}
		else {
			displayMessage("Input requires one parameter");
		}		
	}	
}