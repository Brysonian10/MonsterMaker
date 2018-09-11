package controller;

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
	}
}
