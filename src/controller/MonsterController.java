package controller;
import java.util.Scanner;
import javax.swing.JOptionPane;

import model.MarshmallowMonster;

public class MonsterController
{
	//Data member section
	private MarshmallowMonster myMonster;

	//Constructor section
	public MonsterController()
	{
		//Job 1: Initialize data members!
		myMonster = new MarshmallowMonster("PentaClops", 2, 5, true, 2);
	}
	
	
	
	//method section
	public void start()
	{
		JOptionPane.showMessageDialog(null, "Why hello there");
		//Use this  method instead of "System.out.println("words")
		
		
		//System.out.println(myMonster);
		JOptionPane.showMessageDialog(null, myMonster);
		myMonster.setArmCount(9999);
		//System.out.println("My Monster has this many arms: " + myMonster.getArmCount());
		JOptionPane.showMessageDialog(null, "My Monster has this many arms: " + myMonster.getArmCount());
		
		JOptionPane.showMessageDialog(null, "lets make your monster!");
		
		//make a new monster and customize from user input
		MarshmallowMonster userMonster = new MarshmallowMonster();
		
		userInput();
		
		String userNumber = JOptionPane.showInputDialog(null, "How many arms?");
		
		if(validInt(userNumber))
		{
			int arms = Integer.parseInt(userNumber);
			userMonster.setArmCount(arms);
			
		}
	}
	
	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch(NumberFormatException error) 
		{
			JOptionPane.showMessageDialog(null, "Your should type an interger value like -989087");
			
		}
		
		
		return isValid;
	}
	
	
	public boolean validDouble(String maybeDouble)
	{
		boolean isValid = false;
		
		try
		{
			Double.parseDouble(maybeDouble);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "This requires a double value aka something with a . >");
		}
		
		
		
		return isValid;
	}
	
	
	
	private void userInput()
	{
		//asks for the name and then prints  it
			//System.out.println("Welcome to make your Monster! What is your monster's name?");
			String userMonsterName = JOptionPane.showInputDialog(null, "Welcome to make your Monster! What is your monster's name?");
			//Scanner inputScanner = new Scanner(System.in);
			//String name = inputScanner.nextLine();
			//System.out.println("Your Monster's name is " + name);
			JOptionPane.showMessageDialog(null, "Your Monster's name is " + userMonsterName);
			
			//asks how many eyes they want on their monster				System.out.println("How many eyes do you want " + name + " to have?");
			//System.out.println("How many eyes does " + name + " have?");
			String eyes = JOptionPane.showInputDialog(null, "How many eyes does " + userMonsterName + " have?");
		//	String eyes = inputScanner.nextLine();
			//System.out.println(name + " has " + eyes + " eyes. Wowsies!");
			JOptionPane.showMessageDialog(null, userMonsterName + " has " + eyes + " eyes. Wowsies!");
			
				//asks how many arms the monster has
			//System.out.println("How many arms do you want " + name + " to have?");
			String arms = JOptionPane.showInputDialog(null, "How many arms do you want " + userMonsterName + " to have?");
			//String arms = inputScanner.nextLine();
			//System.out.println(name + "has " + arms + " arms, thats pretty exciting.");		
			JOptionPane.showMessageDialog(null, userMonsterName + "has " + arms + " arms, thats pretty exciting.");
			
			//asks how many legs the monster has
			//System.out.println("How many legs do you want " + name + " to have?");
			String legs = JOptionPane.showInputDialog(null, "How many legs do you want " + userMonsterName + " to have?");
			//extra stuff
			//String legs = inputScanner.nextLine();
			//System.out.println(name + " has " +  legs + " legs, thats pretty dang cool if you as me!");
			JOptionPane.showMessageDialog(null, userMonsterName + " has " +  legs + " legs, thats pretty dang cool if you ask me!");
			
			//asks how many noses does your monster have?
			System.out.println("And does your monster have a nose?");
			String noses = JOptionPane.showInputDialog(null, "And does your monster have a nose?");
			//String noses = inputScanner.nextLine();
			if (noses .equals ("yes"))
			{
				//System.out.println("Your monster has a nose!!!");
				JOptionPane.showMessageDialog(null, "Your monster has a nose!!!");
			} else
				
			{
				//System.out.println("Your monster doesn't have a nose.");
				JOptionPane.showMessageDialog(null, "Your monster doesn't have a nose.");
			}
			
			
		//conclusion
			//System.out.println(userMonsterName + " has " + eyes + " eyes, " + arms + " arms, and " + legs + " legs!!");
			JOptionPane.showMessageDialog(null, userMonsterName + " has " + eyes + " eyes, " + arms + " arms, and " + legs + " legs!!");
			
		
	}
}
