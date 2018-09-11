package model;

public class MarshmallowMonster
{
	//-------- Data member sections --------
	//-------- Always Private ---------
	
	private String name;
	private double legCount;
	private boolean hasNoses;
	private int eyeCount;
	private int armCount;
	
	
	public MarshmallowMonster()
	{
		//-------- Default values are 0 or null --------
	}
	
	public MarshmallowMonster(String name)
	{
		
	}
	
	
	public MarshmallowMonster(String name, double legCount, int eyeCount, boolean hasNoses, int armCount)
	{
		this.name = name;
		this.legCount = legCount;
		this.eyeCount = eyeCount;
		this.hasNoses = hasNoses;
		this.armCount = armCount;
	}
	
	public String toString()
	{
		String description = "My monsters name is " + name + " It has " + legCount
				 + " legs" + " and the scary thing is that it just stares at you,"
				 		+ " it literally does nothing but creepily stare at you."
				 		+ "";
		
		return description;
		
	}
}
