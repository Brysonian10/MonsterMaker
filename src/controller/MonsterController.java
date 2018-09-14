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
		
		
		System.out.println(myMonster);
		JOptionPane.showMessageDialog(null, myMonster);
		myMonster.setArmCount(9999);
		System.out.println("My Monster has this many arms: " + myMonster.getArmCount());
		JOptionPane.showMessageDialog(null, myMonster);
		
		//make a new monster and customize from user input
		MarshmallowMonster userMonster;
		
		userInput();
	}
	
	private void userInput()
	{
		//asks for the name and then prints  it
			System.out.println("Welcome to make your Monster! What is your monster's name?");
			JOptionPane.showMessageDialog(null, myMonster);
			Scanner inputScanner = new Scanner(System.in);
			String name = inputScanner.nextLine();
			System.out.println("Your Monster's name is " + name);
			JOptionPane.showMessageDialog(null, myMonster);
			
			//asks how many eyes they want on their monster				System.out.println("How many eyes do you want " + name + " to have?");
			System.out.println("How many eyes does " + name + " have?");
			JOptionPane.showMessageDialog(null, myMonster);
			String eyes = inputScanner.nextLine();
			System.out.println(name + " has " + eyes + " eyes. Wowsies!");
			JOptionPane.showMessageDialog(null, myMonster);
			
				//asks how many arms the monster has
			System.out.println("How many arms do you want " + name + " to have?");
			JOptionPane.showMessageDialog(null, myMonster);
			String arms = inputScanner.nextLine();
			System.out.println(name + "has " + arms + " arms, thats pretty exciting.");		
			JOptionPane.showMessageDialog(null, myMonster);
			
			//asks how many legs the monster has
			System.out.println("How many legs do you want " + name + " to have?");
			JOptionPane.showMessageDialog(null, myMonster);
			//extra stuff
			String legs = inputScanner.nextLine();
			System.out.println(name + " has " +  legs + " legs, thats pretty dang cool if you as me!");
			JOptionPane.showMessageDialog(null, myMonster);
			
			//asks how many noses does your monster have?
			System.out.println("And does your monster have a nose?");
			JOptionPane.showMessageDialog(null, myMonster);
			String noses = inputScanner.nextLine();
			if (noses .equals ("yes"))
			{
				System.out.println("Your monster has a nose!!!");
			} else
				
			{
				System.out.println("Your monster doesn't have a nose.");
			}
			
			JOptionPane.showMessageDialog(null, myMonster);
			
		//conclusion
			System.out.println(name + " has " + eyes + " eyes, " + arms + " arms, and " + legs + " legs!!");
			JOptionPane.showMessageDialog(null, myMonster);
			
		
	}
}
