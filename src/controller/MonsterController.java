package controller;
import java.util.Scanner;

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
		System.out.println(myMonster);
		myMonster.setArmCount(9999);
		System.out.println("My Monster has this many arms: " + myMonster.getArmCount());
		
		//make a new monster and customize from user input
		MarshmallowMonster userMonster;
		
		userInput();
	}
	
	private void userInput()
	{
		//asks for the name and then prints  it
			System.out.println("Welcome to make your Monster! What is your monster's name?");
			Scanner inputScanner = new Scanner(System.in);
			String name = inputScanner.nextLine();
			System.out.println("Your Monster's name is " + name);
			
			//asks how many eyes they want on their monster				System.out.println("How many eyes do you want " + name + " to have?");
			System.out.println("How many eyes does " + name + " have?");
			String eyes = inputScanner.nextLine();
			eyes = inputScanner.nextLine();
			System.out.println(name + " has " + eyes + " eyes. Wowsies!");
			
				//asks how many arms the monster has
			System.out.println("How many arms do you want " + name + " to have?");
			String arms = inputScanner.nextLine();
			arms = inputScanner.nextLine();
			System.out.println(name + "has " + arms + "arms, thats pretty exciting.");				
			
			//asks how many legs the monster has
			System.out.println("How many legs do you want " + name + " to have?");
			//extra stuff
			String legs = inputScanner.nextLine();
			legs = inputScanner.nextLine();
			System.out.println(name + " has " +  legs + " legs, thats pretty dang cool if you as me!");
			
			//asks how many noses does your monster have?
			System.out.println("And does your monster have a nose?");
			String noses = inputScanner.nextLine();
			noses = inputScanner.nextLine();
			if (noses .equals ("yes"))
			{
				System.out.println("Your monster has a nose!!!");
			} else
				
			{
				System.out.println("Your monster doesn't have a nose.");
			}
			
		
		
	}
}
